package Presentation_Layer.Inserir;

import java.awt.CardLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.UIManager;

import Presentation_Layer.Tabelas.Tabela_Imagens;

public class Inserir_1 extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Create the panel.
	 */
	public Inserir_1() {
		
		final Tabela_Imagens imagens = new Tabela_Imagens();
		
		JLabel lblNewLabel = new JLabel("1 - Defini\u00E7\u00F5es");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		
		textField = new JTextField();
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("T\u00EDtulo");
		lblNewLabel_1.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		
		JLabel lblTags = new JLabel("Tags");
		lblTags.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		
		JLabel lblSepararPor = new JLabel("Separar por");
		lblSepararPor.setFont(new Font("Lucida Grande", Font.ITALIC, 12));
		
		JLabel lblNewLabel_3 = new JLabel("Descri\u00E7\u00E3o");
		lblNewLabel_3.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		
		JTextArea textArea = new JTextArea();
		textArea.setLineWrap(true);
		textArea.setBorder(UIManager.getBorder("TextField.border"));
		
		JLabel label = new JLabel(";");
		label.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		
		JLabel lblImagens = new JLabel("Fotos");
		lblImagens.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		
		JPanel panel = new JPanel();
		
		final JButton btnAdicionarFoto = new JButton("Adicionar Foto");
		btnAdicionarFoto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				imagens.adiciona();
				btnAdicionarFoto.setEnabled(!imagens.isFull());
			}
		});
		
		JPanel panel_1 = new JPanel();
		
		JPanel panel_2 = new JPanel();
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblNewLabel))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(160)
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(lblNewLabel_1)
										.addComponent(lblTags))
									.addGap(32)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(textField)
										.addComponent(textArea, GroupLayout.PREFERRED_SIZE, 645, Short.MAX_VALUE)
										.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
											.addComponent(btnAdicionarFoto)
											.addComponent(panel, GroupLayout.PREFERRED_SIZE, 466, GroupLayout.PREFERRED_SIZE))
										.addGroup(groupLayout.createSequentialGroup()
											.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 411, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(lblSepararPor)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(label, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE)))
									.addGap(218))
								.addComponent(panel_1, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_3, Alignment.LEADING)
								.addComponent(lblImagens, Alignment.LEADING)
								.addComponent(panel_2, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 772, GroupLayout.PREFERRED_SIZE))))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel)
					.addGap(34)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_1)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblTags)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblSepararPor)
						.addComponent(label))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel_3)
					.addGap(18)
					.addComponent(textArea, GroupLayout.PREFERRED_SIZE, 235, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblImagens)
					.addGap(18)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 192, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnAdicionarFoto)
					.addGap(18)
					.addComponent(panel_2, GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
					.addContainerGap())
		);
		panel_2.setLayout(new CardLayout(0, 0));
		panel_1.setLayout(new CardLayout(0, 0));
		panel.setLayout(new CardLayout(0, 0));
		panel.add(imagens,"imagens");
		panel_1.add(new Inserir_Categorias(),"Categorias");
		panel_2.add(new Inserir_preco(),"Def_Preço");

		setLayout(groupLayout);
		
	}
}
