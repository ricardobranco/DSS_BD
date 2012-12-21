package Interface;

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLayeredPane;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.SystemColor;
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
		label.setForeground(SystemColor.controlHighlight);
		label.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		Mouse_S2.mouseINOUT(label);
		
		JLabel label_1 = new JLabel("    Vestuário");
		label_1.setForeground(SystemColor.controlHighlight);
		Mouse_S2.mouseINOUT(label_1);

		
		JLabel label_2 = new JLabel("    Acessórios");
		label_2.setForeground(SystemColor.controlHighlight);
		Mouse_S2.mouseINOUT(label_2);

		
		JLabel label_3 = new JLabel("Casa e Jardim");
		label_3.setForeground(SystemColor.controlHighlight);
		label_3.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		Mouse_S2.mouseINOUT(label_3);

		
		JLabel label_4 = new JLabel("    Animais");
		label_4.setForeground(SystemColor.controlHighlight);
		Mouse_S2.mouseINOUT(label_4);

		
		JLabel label_5 = new JLabel("    Artigos de Jardim");
		label_5.setForeground(SystemColor.controlHighlight);
		Mouse_S2.mouseINOUT(label_5);

		
		JLabel label_6 = new JLabel("    Imóveis");
		label_6.setForeground(SystemColor.controlHighlight);
		Mouse_S2.mouseINOUT(label_6);

		JLabel label_7 = new JLabel("    Móveis");
		label_7.setForeground(SystemColor.controlHighlight);
		Mouse_S2.mouseINOUT(label_7);
		
		JLayeredPane layeredPane_1 = new JLayeredPane();
		
		JLabel label_8 = new JLabel("Coleccion\u00E1veis e Arte");
		label_8.setForeground(SystemColor.controlHighlight);
		label_8.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		Mouse_S2.mouseINOUT(label_8);

		
		JLabel label_10 = new JLabel("    Selos");
		label_10.setForeground(SystemColor.controlHighlight);
		Mouse_S2.mouseINOUT(label_10);

		
		JLabel label_9 = new JLabel("    Moedas e Notas");
		label_9.setForeground(SystemColor.controlHighlight);
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
		
		JLabel lblAuto = new JLabel("Auto");
		lblAuto.setForeground(SystemColor.controlHighlight);
		lblAuto.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		Mouse_S2.mouseINOUT(lblAuto);
		
		JLabel lblPeasAuto = new JLabel("    Pe\u00E7as auto");
		lblPeasAuto.setForeground(SystemColor.controlHighlight);
		Mouse_S2.mouseINOUT(lblPeasAuto);
		
		JLabel lblNewLabel_3 = new JLabel("    Ve\u00EDculos");
		lblNewLabel_3.setForeground(UIManager.getColor("Button.light"));
		Mouse_S2.mouseINOUT(lblNewLabel_3);
		
		GroupLayout gl_layeredPane_1 = new GroupLayout(layeredPane_1);
		gl_layeredPane_1.setHorizontalGroup(
			gl_layeredPane_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_layeredPane_1.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_layeredPane_1.createParallelGroup(Alignment.LEADING, false)
						.addComponent(lblNewLabel_2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(lblNewLabel_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(label_9, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(label_10, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(label_8, GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
						.addComponent(lblAuto, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(lblPeasAuto, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(lblNewLabel_3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addContainerGap(24, Short.MAX_VALUE))
		);
		gl_layeredPane_1.setVerticalGroup(
			gl_layeredPane_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_layeredPane_1.createSequentialGroup()
					.addContainerGap()
					.addComponent(label_8, GroupLayout.DEFAULT_SIZE, 19, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(label_10, GroupLayout.DEFAULT_SIZE, 16, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(label_9, GroupLayout.DEFAULT_SIZE, 16, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 16, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel_1, GroupLayout.DEFAULT_SIZE, 16, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel_2, GroupLayout.DEFAULT_SIZE, 16, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblAuto, GroupLayout.DEFAULT_SIZE, 19, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblPeasAuto, GroupLayout.DEFAULT_SIZE, 16, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel_3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGap(11))
		);
		layeredPane_1.setLayout(gl_layeredPane_1);
		
		JLayeredPane layeredPane_2 = new JLayeredPane();
		GroupLayout gl_layeredPane = new GroupLayout(layeredPane);
		gl_layeredPane.setHorizontalGroup(
			gl_layeredPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_layeredPane.createSequentialGroup()
					.addGap(6)
					.addGroup(gl_layeredPane.createParallelGroup(Alignment.LEADING)
						.addComponent(label, GroupLayout.PREFERRED_SIZE, 138, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_1, GroupLayout.PREFERRED_SIZE, 138, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_2, GroupLayout.PREFERRED_SIZE, 138, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_3, GroupLayout.PREFERRED_SIZE, 138, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_4, GroupLayout.PREFERRED_SIZE, 138, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_5, GroupLayout.PREFERRED_SIZE, 138, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_6, GroupLayout.PREFERRED_SIZE, 138, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_7, GroupLayout.PREFERRED_SIZE, 138, GroupLayout.PREFERRED_SIZE)))
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
					.addGap(18)
					.addComponent(label_3)
					.addGap(6)
					.addComponent(label_4)
					.addGap(6)
					.addComponent(label_5)
					.addGap(6)
					.addComponent(label_6)
					.addGap(6)
					.addComponent(label_7))
		);
		layeredPane.setLayout(gl_layeredPane);
		
		JLabel lblNewLabel_4 = new JLabel("Tecnologia e Electrónica");
		lblNewLabel_4.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblNewLabel_4.setForeground(UIManager.getColor("Button.light"));
		Mouse_S2.mouseINOUT(lblNewLabel_4);

		
		
		JLabel lbludioTvE = new JLabel("    Áudio, TV e Vídeo");
		lbludioTvE.setForeground(SystemColor.controlHighlight);
		Mouse_S2.mouseINOUT(lbludioTvE);

		JLabel lblConsolas = new JLabel("    Consolas");
		lblConsolas.setForeground(SystemColor.controlHighlight);
		Mouse_S2.mouseINOUT(lblConsolas);

		
		JLabel lblFotografia = new JLabel("    Fotografia");
		lblFotografia.setForeground(SystemColor.controlHighlight);
		Mouse_S2.mouseINOUT(lblFotografia);

		JLabel lblInformtica = new JLabel("    Informática");
		lblInformtica.setForeground(SystemColor.controlHighlight);
		Mouse_S2.mouseINOUT(lblInformtica);

		JLabel lblTelemveisETelefones = new JLabel("    Telemóveis e Telefones");
		lblTelemveisETelefones.setForeground(SystemColor.controlHighlight);
		Mouse_S2.mouseINOUT(lblTelemveisETelefones);

		
		JLabel lblNewLabel_5 = new JLabel("Saúde");
		lblNewLabel_5.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblNewLabel_5.setForeground(UIManager.getColor("Button.light"));
		Mouse_S2.mouseINOUT(lblNewLabel_5);
		
		JLabel lblCosmticos = new JLabel("    Cosméticos");
		lblCosmticos.setForeground(SystemColor.controlHighlight);
		Mouse_S2.mouseINOUT(lblCosmticos);

		JLabel lblOutros = new JLabel("Outros");
		lblOutros.setForeground(SystemColor.controlHighlight);
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
								.addComponent(lblNewLabel_4, GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
								.addComponent(lblConsolas, GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
								.addComponent(lblFotografia, GroupLayout.PREFERRED_SIZE, 188, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblInformtica, GroupLayout.PREFERRED_SIZE, 188, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblTelemveisETelefones, GroupLayout.PREFERRED_SIZE, 188, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_5, GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
								.addComponent(lblCosmticos, GroupLayout.PREFERRED_SIZE, 188, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblOutros, GroupLayout.PREFERRED_SIZE, 188, GroupLayout.PREFERRED_SIZE))
							.addContainerGap())))
		);
		gl_layeredPane_2.setVerticalGroup(
			gl_layeredPane_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_layeredPane_2.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel_4)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lbludioTvE, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblConsolas, GroupLayout.DEFAULT_SIZE, 16, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblFotografia, GroupLayout.DEFAULT_SIZE, 16, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblInformtica, GroupLayout.DEFAULT_SIZE, 16, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblTelemveisETelefones, GroupLayout.DEFAULT_SIZE, 16, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel_5, GroupLayout.DEFAULT_SIZE, 19, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblCosmticos, GroupLayout.DEFAULT_SIZE, 16, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblOutros, GroupLayout.DEFAULT_SIZE, 19, Short.MAX_VALUE)
					.addGap(8))
		);
		layeredPane_2.setLayout(gl_layeredPane_2);
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addComponent(layeredPane, GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(layeredPane_1, GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(layeredPane_2, GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
					.addGap(0))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(1)
							.addComponent(layeredPane_1, GroupLayout.PREFERRED_SIZE, 216, GroupLayout.PREFERRED_SIZE))
						.addComponent(layeredPane, GroupLayout.PREFERRED_SIZE, 218, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(1)
							.addComponent(layeredPane_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		setLayout(groupLayout);

	}
}
