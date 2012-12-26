package Presentation_Layer;

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;

public class Barra_Pesquisa extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField textField;

	/**
	 * Create the panel.
	 */
	public Barra_Pesquisa() {
		
		textField = new JTextField();
		textField.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Todos", "    Moda", "        Vestu\u00E1rio", "        Acess\u00F3rios", "    Casa e Jardim", "        Animais", "        Artigos de Jardim", "        Im\u00F3veis", "        M\u00F3veis", "    Tecnologia e Electr\u00F3nica", "        \u00C1udio,Tv e V\u00EDdeo", "        Consolas", "        Fotografia", "        Inform\u00E1tica", "        Telem\u00F3veis e Telefones", "    Coleccion\u00E1veis e Arte", "        Selos", "        Moeda e Notas", "        Medalhas", "        Antiguidades", "        Arte", "    Sa\u00FAde", "        Cosm\u00E9ticos", "    Desporto e Entretenimento", "        Brinquedos", "        Artigos de Desporto", "        Filmes e Cinema", "        Livros e Revistas", "        M\u00FAsica", "    Auto    ", "        Ve\u00EDculos", "        Pe\u00E7as auto", "    Outros    \t"}));
		
		JPanel panel = new JPanel();
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(textField, GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(comboBox, 0, 247, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(panel, GroupLayout.PREFERRED_SIZE, 66, Short.MAX_VALUE)
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
							.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap())
		);
		
		JButton btnPesquisa = new JButton("Pesquisa");
		btnPesquisa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		
		JButton btnPesquisaAvanada = new JButton("Pesquisa Avan\u00E7ada");
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
					.addComponent(btnPesquisa, GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
					.addGap(2))
				.addComponent(btnPesquisaAvanada, GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addComponent(btnPesquisa)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnPesquisaAvanada)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		setLayout(groupLayout);

	}
}
