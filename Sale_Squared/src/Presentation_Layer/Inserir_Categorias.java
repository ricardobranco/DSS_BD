package Presentation_Layer;

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;

public class Inserir_Categorias extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public Inserir_Categorias() {
		
		JCheckBox checkBox = new JCheckBox("Auto");
		
		JCheckBox checkBox_1 = new JCheckBox("Moda");
		
		JCheckBox checkBox_2 = new JCheckBox("Acess\u00F3rios");
		
		JCheckBox checkBox_3 = new JCheckBox("Vestu\u00E1rio");
		
		JCheckBox checkBox_4 = new JCheckBox("Ve\u00EDculos");
		
		JCheckBox checkBox_5 = new JCheckBox("Pe\u00E7as Auto");
		
		JCheckBox checkBox_6 = new JCheckBox("Sa\u00FAde");
		
		JCheckBox checkBox_7 = new JCheckBox("Cosm\u00E9ticos");
		
		JCheckBox checkBox_8 = new JCheckBox("Casa e Jardim");
		
		JCheckBox checkBox_9 = new JCheckBox("Artigos de Jardim");
		
		JCheckBox checkBox_10 = new JCheckBox("Animais");
		
		JCheckBox checkBox_11 = new JCheckBox("Im\u00F3veis");
		
		JCheckBox checkBox_12 = new JCheckBox("M\u00F3veis");
		
		JCheckBox checkBox_13 = new JCheckBox("Coleccion\u00E1veis e Arte");
		
		JCheckBox checkBox_14 = new JCheckBox("Moeda e Notas");
		
		JCheckBox checkBox_15 = new JCheckBox("Selos");
		
		JCheckBox checkBox_16 = new JCheckBox("Medalhas");
		
		JCheckBox checkBox_17 = new JCheckBox("Antiguidades");
		
		JCheckBox checkBox_18 = new JCheckBox("Arte");
		
		JCheckBox checkBox_19 = new JCheckBox("Tecnologia e Electr\u00F3nica");
		
		JCheckBox checkBox_20 = new JCheckBox("Consolas");
		
		JCheckBox checkBox_21 = new JCheckBox("\u00C1udio, TV e V\u00EDdeo");
		
		JCheckBox checkBox_22 = new JCheckBox("Fotografia");
		
		JCheckBox checkBox_23 = new JCheckBox("Telem\u00F3veis e Telefones");
		
		JLabel label = new JLabel("Categoria");
		label.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Livros e Revistas");
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Revistas");
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("Manuais Escolares");
		
		JCheckBox chckbxNewCheckBox_3 = new JCheckBox("Literatura Infantil");
		
		JCheckBox chckbxNewCheckBox_4 = new JCheckBox("Literatura");
		
		JCheckBox chckbxNewCheckBox_5 = new JCheckBox("Banda Desenhada");
		
		JCheckBox chckbxNewCheckBox_6 = new JCheckBox("Plantas e Flores");
		
		JCheckBox chckbxHigiene = new JCheckBox("Higiene");
		
		JCheckBox chckbxNewCheckBox_7 = new JCheckBox("Inform\u00E1tica");
		
		JCheckBox chckbxGadgets = new JCheckBox("Gadgets");
		
		JCheckBox chckbxNewCheckBox_8 = new JCheckBox("Circuitos");
		
		JCheckBox chckbxNewCheckBox_9 = new JCheckBox("Desporto e Entretenimento");
		
		JCheckBox chckbxNewCheckBox_10 = new JCheckBox("Brinquedos");
		
		JCheckBox chckbxNewCheckBox_11 = new JCheckBox("Fitness e Muscula\u00E7\u00E3o");
		
		JCheckBox chckbxNewCheckBox_12 = new JCheckBox("Filmes e Cinema");
		
		JCheckBox chckbxNewCheckBox_13 = new JCheckBox("M\u00FAsica");
		
		JCheckBox chckbxNewCheckBox_14 = new JCheckBox("Ca\u00E7a e Pesca");
		
		JCheckBox chckbxNewCheckBox_15 = new JCheckBox("Campismo");
		
		JCheckBox chckbxNewCheckBox_16 = new JCheckBox("Futebol");
		
		JCheckBox chckbxNewCheckBox_17 = new JCheckBox("Nata\u00E7\u00E3o");
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(77)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(checkBox, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
								.addComponent(chckbxNewCheckBox)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(29)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(checkBox_4, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE)
										.addComponent(checkBox_5, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE)))
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(29)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(chckbxNewCheckBox_2)
										.addComponent(chckbxNewCheckBox_1)
										.addComponent(chckbxNewCheckBox_3)
										.addComponent(chckbxNewCheckBox_4)
										.addComponent(chckbxNewCheckBox_5))))
							.addGap(18)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(29)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(checkBox_9, GroupLayout.PREFERRED_SIZE, 141, GroupLayout.PREFERRED_SIZE)
										.addComponent(checkBox_11, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE)
										.addComponent(checkBox_12, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
										.addComponent(chckbxNewCheckBox_6)))
								.addComponent(checkBox_6, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(29)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(chckbxHigiene)
										.addComponent(checkBox_7, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE)))
								.addComponent(checkBox_8, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(29)
									.addComponent(checkBox_10, GroupLayout.PREFERRED_SIZE, 83, GroupLayout.PREFERRED_SIZE)))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(checkBox_13, GroupLayout.PREFERRED_SIZE, 167, GroupLayout.PREFERRED_SIZE)
										.addGroup(groupLayout.createSequentialGroup()
											.addGap(29)
											.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
												.addComponent(checkBox_14, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE)
												.addComponent(checkBox_15, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
												.addComponent(checkBox_16, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE)
												.addComponent(checkBox_17, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE)
												.addComponent(checkBox_18, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)))
										.addGroup(groupLayout.createSequentialGroup()
											.addGap(29)
											.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
												.addComponent(checkBox_2, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE)
												.addComponent(checkBox_3, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE))))
									.addGap(18)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(chckbxNewCheckBox_9)
										.addGroup(groupLayout.createSequentialGroup()
											.addGap(29)
											.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
												.addComponent(chckbxNewCheckBox_11)
												.addComponent(chckbxNewCheckBox_10)
												.addComponent(chckbxNewCheckBox_12)
												.addComponent(chckbxNewCheckBox_13)
												.addComponent(chckbxNewCheckBox_14)
												.addComponent(chckbxNewCheckBox_15)
												.addComponent(chckbxNewCheckBox_16)
												.addComponent(chckbxNewCheckBox_17))))
									.addGap(18)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(checkBox_19, GroupLayout.PREFERRED_SIZE, 185, GroupLayout.PREFERRED_SIZE)
										.addGroup(groupLayout.createSequentialGroup()
											.addGap(29)
											.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
												.addComponent(checkBox_21, GroupLayout.PREFERRED_SIZE, 143, GroupLayout.PREFERRED_SIZE)
												.addComponent(chckbxNewCheckBox_7)
												.addComponent(checkBox_22, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE)
												.addComponent(checkBox_23, GroupLayout.PREFERRED_SIZE, 179, GroupLayout.PREFERRED_SIZE)
												.addComponent(chckbxGadgets)
												.addComponent(chckbxNewCheckBox_8)
												.addComponent(checkBox_20, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)))))
								.addComponent(checkBox_1, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE)))
						.addComponent(label, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(139, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(label)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
										.addComponent(checkBox_13)
										.addComponent(chckbxNewCheckBox_9)
										.addComponent(checkBox_19)
										.addComponent(checkBox_8))
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addGroup(groupLayout.createSequentialGroup()
											.addGap(6)
											.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
												.addComponent(checkBox_15)
												.addComponent(chckbxNewCheckBox_10)
												.addComponent(checkBox_21)))
										.addGroup(groupLayout.createSequentialGroup()
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(checkBox_10)))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(checkBox_9)
										.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
											.addComponent(checkBox_14)
											.addComponent(chckbxNewCheckBox_11)
											.addComponent(checkBox_20))))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(checkBox)
									.addGap(6)
									.addComponent(checkBox_5)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(checkBox_4)))
							.addGap(6)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(chckbxNewCheckBox_12)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(chckbxNewCheckBox_13)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(chckbxNewCheckBox_14)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(chckbxNewCheckBox_15)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(chckbxNewCheckBox_16))
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(chckbxNewCheckBox)
										.addComponent(checkBox_11)
										.addComponent(checkBox_16))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
										.addGroup(groupLayout.createSequentialGroup()
											.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
												.addComponent(checkBox_17)
												.addComponent(checkBox_12))
											.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
											.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
												.addComponent(chckbxNewCheckBox_6)
												.addComponent(checkBox_18))
											.addGap(6))
										.addGroup(groupLayout.createSequentialGroup()
											.addComponent(chckbxNewCheckBox_1)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(chckbxNewCheckBox_2)
											.addPreferredGap(ComponentPlacement.RELATED)))
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
											.addComponent(chckbxNewCheckBox_3)
											.addComponent(checkBox_6, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE))
										.addGroup(groupLayout.createSequentialGroup()
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(checkBox_1)))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(chckbxNewCheckBox_4)
										.addComponent(checkBox_7)))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(checkBox_22)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(chckbxNewCheckBox_7)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(checkBox_23)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(chckbxGadgets)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(chckbxNewCheckBox_8))))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(231)
							.addComponent(checkBox_3)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(chckbxHigiene)
						.addComponent(checkBox_2)
						.addComponent(chckbxNewCheckBox_5)
						.addComponent(chckbxNewCheckBox_17))
					.addGap(17))
		);
		setLayout(groupLayout);

	}
}
