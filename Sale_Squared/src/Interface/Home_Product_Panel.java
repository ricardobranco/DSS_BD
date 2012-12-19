package Interface;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JLayeredPane;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;

public class Home_Product_Panel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static final Icon THUMB_SEM_TITULO = new ImageIcon(
			Home.class.getResource("/Imagens/Sem_Imagem.png"));

	/**
	 * Create the panel.
	 */
	public Home_Product_Panel() {
		
		JPanel panel = new JPanel();
		
		JLayeredPane layeredPane = new JLayeredPane();
		JLayeredPane layeredPane_1 = new JLayeredPane();
		JLayeredPane layeredPane_2 = new JLayeredPane();
		
		
		//ICONS
		JLabel label = new JLabel("");
		label.setIcon(THUMB_SEM_TITULO);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(THUMB_SEM_TITULO);
		
		JLabel label_2 = new JLabel("");
		label_2.setIcon(THUMB_SEM_TITULO);
		
		JLabel label_3 = new JLabel("");
		label_3.setIcon(THUMB_SEM_TITULO);
		
		JLabel label_4 = new JLabel("");
		label_4.setIcon(THUMB_SEM_TITULO);
		
		JLabel label_10 = new JLabel("");
		label_10.setIcon(THUMB_SEM_TITULO);
		
		JLabel label_11 = new JLabel("");
		label_11.setIcon(THUMB_SEM_TITULO);
		
		JLabel label_12 = new JLabel("");
		label_12.setIcon(THUMB_SEM_TITULO);
		
		JLabel label_13 = new JLabel("");
		label_13.setIcon(THUMB_SEM_TITULO);
		
		JLabel label_14 = new JLabel("");
		label_14.setIcon(THUMB_SEM_TITULO);
		
		JLabel label_20 = new JLabel("");
		label_20.setIcon(THUMB_SEM_TITULO);
		
		JLabel label_22 = new JLabel("");
		label_22.setIcon(THUMB_SEM_TITULO);
		
		JLabel label_24 = new JLabel("");
		label_24.setIcon(THUMB_SEM_TITULO);
		
		JLabel label_26 = new JLabel("");
		label_26.setIcon(THUMB_SEM_TITULO);
		
		JLabel label_28 = new JLabel("");
		label_28.setIcon(THUMB_SEM_TITULO);
		
		
		//NOME DOS ANUNCIOS
		JLabel label_5 = new JLabel("Produto 1");
		Mouse_S2.mouseINOUT(label_5);
		
		JLabel label_6 = new JLabel("Produto 2");
		Mouse_S2.mouseINOUT(label_6);
		
		JLabel label_7 = new JLabel("Produto 3");
		Mouse_S2.mouseINOUT(label_7);
		
		JLabel label_8 = new JLabel("Produto 4");
		Mouse_S2.mouseINOUT(label_8);
		
		JLabel label_9 = new JLabel("Produto 5");
		Mouse_S2.mouseINOUT(label_9);
		
		JLabel label_15 = new JLabel("Produto 6");
		Mouse_S2.mouseINOUT(label_15);
		
		JLabel label_16 = new JLabel("Produto 7");
		Mouse_S2.mouseINOUT(label_16);
		
		JLabel label_17 = new JLabel("Produto 8");
		Mouse_S2.mouseINOUT(label_17);
		
		JLabel label_18 = new JLabel("Produto 9");
		Mouse_S2.mouseINOUT(label_18);
		
		JLabel label_19 = new JLabel("Produto 10");
		Mouse_S2.mouseINOUT(label_19);
		
		JLabel label_29 = new JLabel("Produto 11");
		Mouse_S2.mouseINOUT(label_29);
		
		JLabel label_27 = new JLabel("Produto 12");
		Mouse_S2.mouseINOUT(label_27);
		
		JLabel label_25 = new JLabel("Produto 13");
		Mouse_S2.mouseINOUT(label_25);
		
		JLabel label_23 = new JLabel("Produto 14");
		Mouse_S2.mouseINOUT(label_23);
		
		JLabel label_21 = new JLabel("Produto 15");
		Mouse_S2.mouseINOUT(label_21);
		
		
		
		
		JButton button = new JButton("Ver todos");
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(1)
					.addComponent(layeredPane, GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(layeredPane_1, GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(layeredPane_2, GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
						.addGroup(Alignment.LEADING, gl_panel.createSequentialGroup()
							.addGap(1)
							.addComponent(layeredPane_1, GroupLayout.DEFAULT_SIZE, 364, Short.MAX_VALUE))
						.addComponent(layeredPane, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(layeredPane_2, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 365, Short.MAX_VALUE))
					.addGap(0))
		);
		GroupLayout gl_layeredPane = new GroupLayout(layeredPane);
		gl_layeredPane.setHorizontalGroup(
			gl_layeredPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_layeredPane.createSequentialGroup()
					.addGap(6)
					.addGroup(gl_layeredPane.createParallelGroup(Alignment.LEADING, false)
						.addGroup(gl_layeredPane.createSequentialGroup()
							.addComponent(label)
							.addPreferredGap(ComponentPlacement.RELATED, 12, Short.MAX_VALUE))
						.addGroup(gl_layeredPane.createSequentialGroup()
							.addComponent(label_1, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addGroup(gl_layeredPane.createSequentialGroup()
							.addComponent(label_2, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addGroup(gl_layeredPane.createSequentialGroup()
							.addComponent(label_3, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addGroup(gl_layeredPane.createSequentialGroup()
							.addComponent(label_4, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
					.addGroup(gl_layeredPane.createParallelGroup(Alignment.LEADING, false)
						.addComponent(label_9, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 163, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_8, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 163, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_6, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
						.addComponent(label_7, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 163, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_5, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 163, GroupLayout.PREFERRED_SIZE))
					.addGap(0))
		);
		gl_layeredPane.setVerticalGroup(
			gl_layeredPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_layeredPane.createSequentialGroup()
					.addGap(25)
					.addGroup(gl_layeredPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_layeredPane.createSequentialGroup()
							.addComponent(label_5, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addGap(34))
						.addComponent(label, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addGap(12)
					.addGroup(gl_layeredPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_layeredPane.createSequentialGroup()
							.addComponent(label_6, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addGap(40))
						.addComponent(label_1, GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE))
					.addGap(12)
					.addGroup(gl_layeredPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_layeredPane.createSequentialGroup()
							.addComponent(label_7, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addGap(34))
						.addComponent(label_2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addGap(12)
					.addGroup(gl_layeredPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_layeredPane.createSequentialGroup()
							.addComponent(label_8, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addGap(34))
						.addComponent(label_3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addGap(12)
					.addGroup(gl_layeredPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_layeredPane.createSequentialGroup()
							.addComponent(label_9, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addGap(34))
						.addComponent(label_4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addGap(36))
		);
		layeredPane.setLayout(gl_layeredPane);
		GroupLayout gl_layeredPane_1 = new GroupLayout(layeredPane_1);
		gl_layeredPane_1.setHorizontalGroup(
			gl_layeredPane_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_layeredPane_1.createSequentialGroup()
					.addGap(6)
					.addGroup(gl_layeredPane_1.createParallelGroup(Alignment.LEADING, false)
						.addGroup(gl_layeredPane_1.createSequentialGroup()
							.addComponent(label_10)
							.addPreferredGap(ComponentPlacement.RELATED, 12, Short.MAX_VALUE))
						.addGroup(gl_layeredPane_1.createSequentialGroup()
							.addComponent(label_11, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addGroup(gl_layeredPane_1.createSequentialGroup()
							.addComponent(label_12, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addGroup(gl_layeredPane_1.createSequentialGroup()
							.addComponent(label_13, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addGroup(gl_layeredPane_1.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(label_14, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
					.addGroup(gl_layeredPane_1.createParallelGroup(Alignment.LEADING, false)
						.addComponent(label_19, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 157, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_17, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 157, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_15, GroupLayout.PREFERRED_SIZE, 157, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_16, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 157, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_18, GroupLayout.PREFERRED_SIZE, 157, GroupLayout.PREFERRED_SIZE))
					.addGap(0))
		);
		gl_layeredPane_1.setVerticalGroup(
			gl_layeredPane_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_layeredPane_1.createSequentialGroup()
					.addGap(25)
					.addGroup(gl_layeredPane_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_layeredPane_1.createSequentialGroup()
							.addComponent(label_15, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addGap(34))
						.addComponent(label_10, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addGap(12)
					.addGroup(gl_layeredPane_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_layeredPane_1.createSequentialGroup()
							.addComponent(label_16, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addGap(34))
						.addComponent(label_11, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addGap(12)
					.addGroup(gl_layeredPane_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_layeredPane_1.createSequentialGroup()
							.addComponent(label_17, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addGap(34))
						.addComponent(label_12, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addGap(12)
					.addGroup(gl_layeredPane_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_layeredPane_1.createSequentialGroup()
							.addComponent(label_18, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addGap(34))
						.addComponent(label_13, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addGap(12)
					.addGroup(gl_layeredPane_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_layeredPane_1.createSequentialGroup()
							.addComponent(label_19, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addGap(34))
						.addComponent(label_14, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addGap(41))
		);
		layeredPane_1.setLayout(gl_layeredPane_1);
		GroupLayout gl_layeredPane_2 = new GroupLayout(layeredPane_2);
		gl_layeredPane_2.setHorizontalGroup(
			gl_layeredPane_2.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_layeredPane_2.createSequentialGroup()
					.addComponent(label_28, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(label_29, GroupLayout.PREFERRED_SIZE, 161, GroupLayout.PREFERRED_SIZE)
					.addGap(0, 6, Short.MAX_VALUE))
				.addGroup(gl_layeredPane_2.createSequentialGroup()
					.addComponent(label_26, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(label_27, GroupLayout.PREFERRED_SIZE, 161, GroupLayout.PREFERRED_SIZE)
					.addGap(0, 6, Short.MAX_VALUE))
				.addGroup(gl_layeredPane_2.createSequentialGroup()
					.addComponent(label_24, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(label_25, GroupLayout.PREFERRED_SIZE, 161, GroupLayout.PREFERRED_SIZE)
					.addGap(0, 6, Short.MAX_VALUE))
				.addGroup(gl_layeredPane_2.createSequentialGroup()
					.addComponent(label_22, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(label_23, GroupLayout.PREFERRED_SIZE, 161, GroupLayout.PREFERRED_SIZE)
					.addGap(0, 6, Short.MAX_VALUE))
				.addGroup(Alignment.LEADING, gl_layeredPane_2.createSequentialGroup()
					.addComponent(label_20, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(label_21, GroupLayout.PREFERRED_SIZE, 167, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				.addGroup(gl_layeredPane_2.createSequentialGroup()
					.addContainerGap(128, Short.MAX_VALUE)
					.addComponent(button))
		);
		gl_layeredPane_2.setVerticalGroup(
			gl_layeredPane_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_layeredPane_2.createSequentialGroup()
					.addGap(18)
					.addGroup(gl_layeredPane_2.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_layeredPane_2.createSequentialGroup()
							.addGap(6)
							.addComponent(label_29, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addGap(28))
						.addComponent(label_28, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addGap(18)
					.addGroup(gl_layeredPane_2.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_layeredPane_2.createSequentialGroup()
							.addComponent(label_27, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addGap(34))
						.addComponent(label_26, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addGap(12)
					.addGroup(gl_layeredPane_2.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_layeredPane_2.createSequentialGroup()
							.addComponent(label_25, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addGap(34))
						.addComponent(label_24, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addGap(12)
					.addGroup(gl_layeredPane_2.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_layeredPane_2.createSequentialGroup()
							.addComponent(label_23, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addGap(34))
						.addComponent(label_22, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addGap(12)
					.addGroup(gl_layeredPane_2.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_layeredPane_2.createSequentialGroup()
							.addComponent(label_21, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addGap(34))
						.addComponent(label_20, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addGap(14)
					.addComponent(button))
		);
		layeredPane_2.setLayout(gl_layeredPane_2);
		panel.setLayout(gl_panel);
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(panel, GroupLayout.DEFAULT_SIZE, 707, Short.MAX_VALUE)
					.addGap(0))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(panel, GroupLayout.DEFAULT_SIZE, 371, Short.MAX_VALUE)
					.addGap(0))
		);
		setLayout(groupLayout);

	}
}
