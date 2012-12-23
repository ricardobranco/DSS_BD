package Interface;

import java.awt.Color;
import java.awt.Font;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.UIManager;

public class Categorias extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public Categorias() {
		
		JLayeredPane layeredPane = new JLayeredPane();
		
		JLabel label = new JLabel("Moda");
		label.setForeground(new Color(0, 102, 204));
		label.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		Mouse_S2.mouseINOUT(label);
		
		JLabel label_1 = new JLabel("    Vestuário");
		label_1.setForeground(new Color(0, 102, 204));
		Mouse_S2.mouseINOUT(label_1);

		
		JLabel label_2 = new JLabel("    Acessórios");
		label_2.setForeground(new Color(0, 102, 204));
		Mouse_S2.mouseINOUT(label_2);
		
		JLayeredPane layeredPane_1 = new JLayeredPane();
		
		JLabel label_8 = new JLabel("Coleccion\u00E1veis e Arte");
		label_8.setForeground(new Color(0, 102, 204));
		label_8.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		Mouse_S2.mouseINOUT(label_8);

		
		JLabel label_10 = new JLabel("    Selos");
		label_10.setForeground(new Color(0, 102, 204));
		Mouse_S2.mouseINOUT(label_10);

		
		JLabel label_9 = new JLabel("    Moedas e Notas");
		label_9.setForeground(new Color(0, 102, 204));
		Mouse_S2.mouseINOUT(label_9);
		
		
		JLabel lblNewLabel = new JLabel("    Medalhas");
		lblNewLabel.setForeground(UIManager.getColor("Button.light"));
		Mouse_S2.mouseINOUT(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("    Antiguidades");
		lblNewLabel_1.setForeground(UIManager.getColor("Button.light"));
		Mouse_S2.mouseINOUT(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("    Arte");
		lblNewLabel_2.setForeground(UIManager.getColor("Button.light"));
		lblNewLabel_2.setFont(new Font("Lucida Grande", Font.PLAIN, 13));
		Mouse_S2.mouseINOUT(lblNewLabel_2);
		
		GroupLayout gl_layeredPane_1 = new GroupLayout(layeredPane_1);
		gl_layeredPane_1.setHorizontalGroup(
			gl_layeredPane_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_layeredPane_1.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_layeredPane_1.createParallelGroup(Alignment.LEADING)
						.addComponent(label_8, GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
						.addGroup(gl_layeredPane_1.createSequentialGroup()
							.addGroup(gl_layeredPane_1.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_layeredPane_1.createSequentialGroup()
									.addGroup(gl_layeredPane_1.createParallelGroup(Alignment.LEADING, false)
										.addComponent(lblNewLabel_2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(lblNewLabel_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(label_9, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(label_10, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
									.addPreferredGap(ComponentPlacement.RELATED, 1, GroupLayout.PREFERRED_SIZE))
								.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE))
							.addGap(7))))
		);
		gl_layeredPane_1.setVerticalGroup(
			gl_layeredPane_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_layeredPane_1.createSequentialGroup()
					.addContainerGap()
					.addComponent(label_8, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(label_10, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(label_9, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(35, Short.MAX_VALUE))
		);
		layeredPane_1.setLayout(gl_layeredPane_1);
		
		JLayeredPane layeredPane_2 = new JLayeredPane();
		
		JLabel lblAuto = new JLabel("Auto");
		lblAuto.setForeground(new Color(0, 102, 204));
		lblAuto.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		Mouse_S2.mouseINOUT(lblAuto);
		
		JLabel lblPeasAuto = new JLabel("    Pe\u00E7as auto");
		lblPeasAuto.setForeground(new Color(0, 102, 204));
		Mouse_S2.mouseINOUT(lblPeasAuto);
		
		JLabel lblNewLabel_3 = new JLabel("    Ve\u00EDculos");
		lblNewLabel_3.setForeground(UIManager.getColor("Button.light"));
		Mouse_S2.mouseINOUT(lblNewLabel_3);
		GroupLayout gl_layeredPane = new GroupLayout(layeredPane);
		gl_layeredPane.setHorizontalGroup(
			gl_layeredPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_layeredPane.createSequentialGroup()
					.addGap(6)
					.addGroup(gl_layeredPane.createParallelGroup(Alignment.LEADING)
						.addComponent(label, GroupLayout.PREFERRED_SIZE, 138, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_1, GroupLayout.PREFERRED_SIZE, 138, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_2, GroupLayout.PREFERRED_SIZE, 138, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(26, Short.MAX_VALUE))
				.addGroup(gl_layeredPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_layeredPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lblAuto, GroupLayout.PREFERRED_SIZE, 161, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblPeasAuto, GroupLayout.PREFERRED_SIZE, 161, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_3, GroupLayout.PREFERRED_SIZE, 161, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_layeredPane.setVerticalGroup(
			gl_layeredPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_layeredPane.createSequentialGroup()
					.addGap(6)
					.addComponent(label)
					.addGap(6)
					.addComponent(label_1)
					.addGap(6)
					.addComponent(label_2)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblAuto)
					.addGap(6)
					.addComponent(lblPeasAuto)
					.addGap(6)
					.addComponent(lblNewLabel_3, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
					.addGap(142))
		);
		layeredPane.setLayout(gl_layeredPane);
		
		JLabel lblNewLabel_4 = new JLabel("Tecnologia e Electrónica");
		lblNewLabel_4.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblNewLabel_4.setForeground(UIManager.getColor("Button.light"));
		Mouse_S2.mouseINOUT(lblNewLabel_4);

		
		
		JLabel lbludioTvE = new JLabel("    Áudio, TV e Vídeo");
		lbludioTvE.setForeground(new Color(0, 102, 204));
		Mouse_S2.mouseINOUT(lbludioTvE);

		JLabel lblConsolas = new JLabel("    Consolas");
		lblConsolas.setForeground(new Color(0, 102, 204));
		Mouse_S2.mouseINOUT(lblConsolas);

		
		JLabel lblFotografia = new JLabel("    Fotografia");
		lblFotografia.setForeground(new Color(0, 102, 204));
		Mouse_S2.mouseINOUT(lblFotografia);

		JLabel lblInformtica = new JLabel("    Informática");
		lblInformtica.setForeground(new Color(0, 102, 204));
		Mouse_S2.mouseINOUT(lblInformtica);

		JLabel lblTelemveisETelefones = new JLabel("    Telemóveis e Telefones");
		lblTelemveisETelefones.setForeground(new Color(0, 102, 204));
		Mouse_S2.mouseINOUT(lblTelemveisETelefones);

		JLabel lblOutros = new JLabel("Outros");
		lblOutros.setForeground(new Color(0, 102, 204));
		lblOutros.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		Mouse_S2.mouseINOUT(lblOutros);

		GroupLayout gl_layeredPane_2 = new GroupLayout(layeredPane_2);
		gl_layeredPane_2.setHorizontalGroup(
			gl_layeredPane_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_layeredPane_2.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_layeredPane_2.createParallelGroup(Alignment.LEADING)
						.addComponent(lbludioTvE, GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
						.addGroup(gl_layeredPane_2.createSequentialGroup()
							.addGroup(gl_layeredPane_2.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_4, GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
								.addComponent(lblFotografia, GroupLayout.PREFERRED_SIZE, 188, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblInformtica, GroupLayout.PREFERRED_SIZE, 188, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblTelemveisETelefones, GroupLayout.PREFERRED_SIZE, 188, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblConsolas, GroupLayout.PREFERRED_SIZE, 149, GroupLayout.PREFERRED_SIZE))
							.addContainerGap())
						.addGroup(gl_layeredPane_2.createSequentialGroup()
							.addComponent(lblOutros, GroupLayout.PREFERRED_SIZE, 188, GroupLayout.PREFERRED_SIZE)
							.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
		);
		gl_layeredPane_2.setVerticalGroup(
			gl_layeredPane_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_layeredPane_2.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel_4)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lbludioTvE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblConsolas, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblFotografia, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblInformtica, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblTelemveisETelefones, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblOutros, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(276, Short.MAX_VALUE))
		);
		layeredPane_2.setLayout(gl_layeredPane_2);
		
		JLayeredPane layeredPane_3 = new JLayeredPane();
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(layeredPane, GroupLayout.PREFERRED_SIZE, 114, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(layeredPane_3, GroupLayout.PREFERRED_SIZE, 150, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(layeredPane_1, GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(layeredPane_2, GroupLayout.PREFERRED_SIZE, 190, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(layeredPane_2, Alignment.LEADING, 0, 0, Short.MAX_VALUE)
						.addComponent(layeredPane, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 170, Short.MAX_VALUE)
						.addComponent(layeredPane_3, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
						.addComponent(layeredPane_1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE))
					.addGap(1))
		);
		
				
				JLabel label_3 = new JLabel("Casa e Jardim");
				label_3.setForeground(new Color(0, 102, 204));
				label_3.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
				Mouse_S2.mouseINOUT(label_3);
		
				
				JLabel label_4 = new JLabel("    Animais");
				label_4.setForeground(new Color(0, 102, 204));
				Mouse_S2.mouseINOUT(label_4);
		
				
				JLabel label_5 = new JLabel("    Artigos de Jardim");
				label_5.setForeground(new Color(0, 102, 204));
				Mouse_S2.mouseINOUT(label_5);
		
				
				JLabel label_6 = new JLabel("    Imóveis");
				label_6.setForeground(new Color(0, 102, 204));
				Mouse_S2.mouseINOUT(label_6);
		
				JLabel label_7 = new JLabel("    Móveis");
				label_7.setForeground(new Color(0, 102, 204));
				Mouse_S2.mouseINOUT(label_7);
		
				
				JLabel lblNewLabel_5 = new JLabel("Saúde");
				lblNewLabel_5.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
				lblNewLabel_5.setForeground(UIManager.getColor("Button.light"));
				Mouse_S2.mouseINOUT(lblNewLabel_5);
		
		JLabel lblCosmticos = new JLabel("    Cosméticos");
		lblCosmticos.setForeground(new Color(0, 102, 204));
		Mouse_S2.mouseINOUT(lblCosmticos);
		GroupLayout gl_layeredPane_3 = new GroupLayout(layeredPane_3);
		gl_layeredPane_3.setHorizontalGroup(
			gl_layeredPane_3.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_layeredPane_3.createSequentialGroup()
					.addGroup(gl_layeredPane_3.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_layeredPane_3.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_layeredPane_3.createParallelGroup(Alignment.LEADING)
								.addComponent(label_4, GroupLayout.PREFERRED_SIZE, 138, GroupLayout.PREFERRED_SIZE)
								.addComponent(label_5, GroupLayout.PREFERRED_SIZE, 138, GroupLayout.PREFERRED_SIZE)
								.addComponent(label_6, GroupLayout.PREFERRED_SIZE, 138, GroupLayout.PREFERRED_SIZE)
								.addComponent(label_7, GroupLayout.PREFERRED_SIZE, 138, GroupLayout.PREFERRED_SIZE)))
						.addComponent(lblCosmticos, GroupLayout.PREFERRED_SIZE, 188, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_layeredPane_3.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblNewLabel_5, GroupLayout.PREFERRED_SIZE, 254, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_layeredPane_3.createSequentialGroup()
							.addContainerGap()
							.addComponent(label_3, GroupLayout.PREFERRED_SIZE, 138, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_layeredPane_3.setVerticalGroup(
			gl_layeredPane_3.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_layeredPane_3.createSequentialGroup()
					.addContainerGap()
					.addComponent(label_3)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(label_4)
					.addGap(6)
					.addComponent(label_5)
					.addGap(6)
					.addComponent(label_6)
					.addGap(6)
					.addComponent(label_7)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel_5)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblCosmticos)
					.addContainerGap(10, Short.MAX_VALUE))
		);
		layeredPane_3.setLayout(gl_layeredPane_3);
		setLayout(groupLayout);

	}
}
