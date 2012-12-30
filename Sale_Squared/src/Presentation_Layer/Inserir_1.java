package Presentation_Layer;

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JCheckBox;
import javax.swing.JTextArea;
import javax.swing.UIManager;
import java.awt.CardLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

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
		
		JLabel lblNewLabel_2 = new JLabel("Categoria");
		lblNewLabel_2.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		
		JCheckBox chckbxModa = new JCheckBox("Moda");
		
		JCheckBox chckbxVesturio = new JCheckBox("Vestu\u00E1rio");
		
		JCheckBox chckbxAcessrios = new JCheckBox("Acess\u00F3rios");
		
		JCheckBox chckbxAuto = new JCheckBox("Auto");
		
		JCheckBox chckbxPeasAuto = new JCheckBox("Pe\u00E7as Auto");
		
		JCheckBox chckbxVeculos = new JCheckBox("Ve\u00EDculos");
		
		JCheckBox chckbxCasaEJardim = new JCheckBox("Casa e Jardim");
		
		JCheckBox chckbxAnimais = new JCheckBox("Animais");
		
		JCheckBox chckbxArtigosDeJardim = new JCheckBox("Artigos de Jardim");
		
		JCheckBox chckbxImveis = new JCheckBox("Im\u00F3veis");
		
		JCheckBox chckbxMveis = new JCheckBox("M\u00F3veis");
		
		JCheckBox chckbxSade = new JCheckBox("Sa\u00FAde");
		
		JCheckBox chckbxCosmticos = new JCheckBox("Cosm\u00E9ticos");
		
		JCheckBox chckbxColeccionveis = new JCheckBox("Coleccion\u00E1veis e Arte");
		
		JCheckBox chckbxSelos = new JCheckBox("Selos");
		
		JCheckBox chckbxMoedaENotas = new JCheckBox("Moeda e Notas");
		
		JCheckBox chckbxMedalhas = new JCheckBox("Medalhas");
		
		JCheckBox chckbxAntiguidades = new JCheckBox("Antiguidades");
		
		JCheckBox chckbxArte = new JCheckBox("Arte");
		
		JCheckBox chckbxTecnologiaEElectrnica = new JCheckBox("Tecnologia e Electr\u00F3nica");
		
		JCheckBox chckbxudioTvE = new JCheckBox("\u00C1udio, TV e V\u00EDdeo");
		
		JCheckBox chckbxConsolas = new JCheckBox("Consolas");
		
		JCheckBox chckbxFotografia = new JCheckBox("Fotografia");
		
		JCheckBox chckbxTelemveisETelefones = new JCheckBox("Telem\u00F3veis e Telefones");
		
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
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblNewLabel))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(160)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
								.addComponent(lblNewLabel_2)
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(lblNewLabel_1)
										.addComponent(lblTags))
									.addGap(32)
									.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
										.addComponent(chckbxAuto)
										.addGroup(groupLayout.createSequentialGroup()
											.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
												.addComponent(chckbxModa)
												.addGroup(groupLayout.createSequentialGroup()
													.addGap(29)
													.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
														.addComponent(chckbxAcessrios)
														.addComponent(chckbxVesturio)))
												.addGroup(groupLayout.createSequentialGroup()
													.addGap(29)
													.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
														.addComponent(chckbxVeculos)
														.addComponent(chckbxPeasAuto))))
											.addGap(16)
											.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
												.addComponent(chckbxSade, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
												.addGroup(groupLayout.createSequentialGroup()
													.addGap(29)
													.addComponent(chckbxCosmticos))
												.addGroup(groupLayout.createSequentialGroup()
													.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
														.addComponent(chckbxCasaEJardim)
														.addGroup(groupLayout.createSequentialGroup()
															.addGap(29)
															.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
																.addComponent(chckbxArtigosDeJardim)
																.addComponent(chckbxAnimais)
																.addComponent(chckbxImveis)
																.addComponent(chckbxMveis))))
													.addGap(4)
													.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
														.addComponent(chckbxColeccionveis)
														.addGroup(groupLayout.createSequentialGroup()
															.addGap(29)
															.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
																.addComponent(chckbxMoedaENotas)
																.addComponent(chckbxSelos)
																.addComponent(chckbxMedalhas)
																.addComponent(chckbxAntiguidades)
																.addComponent(chckbxArte))))
													.addGap(34)
													.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
														.addComponent(chckbxTecnologiaEElectrnica)
														.addGroup(groupLayout.createSequentialGroup()
															.addGap(29)
															.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
																.addComponent(chckbxConsolas)
																.addComponent(chckbxudioTvE)
																.addComponent(chckbxFotografia)
																.addComponent(chckbxTelemveisETelefones)))))))
										.addGroup(groupLayout.createSequentialGroup()
											.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
												.addComponent(textField)
												.addComponent(textField_1, GroupLayout.DEFAULT_SIZE, 505, Short.MAX_VALUE)
												.addComponent(textArea, GroupLayout.DEFAULT_SIZE, 645, Short.MAX_VALUE)
												.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
													.addComponent(btnAdicionarFoto)
													.addComponent(panel, GroupLayout.PREFERRED_SIZE, 466, GroupLayout.PREFERRED_SIZE)))
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(lblSepararPor)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(label))))
								.addComponent(lblNewLabel_3)
								.addComponent(lblImagens))))
					.addGap(88))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel)
					.addGap(34)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblNewLabel_1)
							.addGap(30)
							.addComponent(lblNewLabel_2))
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(chckbxModa)
						.addComponent(chckbxCasaEJardim)
						.addComponent(chckbxColeccionveis)
						.addComponent(chckbxTecnologiaEElectrnica))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(chckbxVesturio)
						.addComponent(chckbxAnimais)
						.addComponent(chckbxSelos)
						.addComponent(chckbxudioTvE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(chckbxAcessrios)
						.addComponent(chckbxArtigosDeJardim)
						.addComponent(chckbxMoedaENotas)
						.addComponent(chckbxConsolas))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(chckbxAuto)
						.addComponent(chckbxImveis)
						.addComponent(chckbxMedalhas)
						.addComponent(chckbxFotografia))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(chckbxPeasAuto)
						.addComponent(chckbxMveis)
						.addComponent(chckbxAntiguidades)
						.addComponent(chckbxTelemveisETelefones))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(chckbxVeculos)
						.addComponent(chckbxSade, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
						.addComponent(chckbxArte))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(chckbxCosmticos)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblTags)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblSepararPor)
						.addComponent(label))
					.addGap(18)
					.addComponent(lblNewLabel_3)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(textArea, GroupLayout.PREFERRED_SIZE, 235, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(lblImagens)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 192, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnAdicionarFoto)
					.addContainerGap(47, Short.MAX_VALUE))
		);
		panel.setLayout(new CardLayout(0, 0));
		panel.add(imagens,"imagens");

		setLayout(groupLayout);
		
	}
}
