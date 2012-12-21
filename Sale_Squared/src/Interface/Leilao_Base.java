package Interface;

import javax.swing.Icon;
import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;

public class Leilao_Base extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public static final Icon THUMB_SEM_TITULO = new ImageIcon(
			Sale_Squared.class.getResource("/Imagens/Sem_Imagem.png"));


	/**
	 * Create the panel.
	 */
	public Leilao_Base() {
		
		JLabel label = new JLabel("");
		label.setIcon(THUMB_SEM_TITULO);
		
		JLabel lblNewLabel = new JLabel("Produto");
		Mouse_S2.mouseINOUT(lblNewLabel);
		
		
		JLabel lblNewLabel_1 = new JLabel("min:");
		lblNewLabel_1.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		
		JLabel lblNewLabel_2 = new JLabel("50€");
		lblNewLabel_2.setFont(new Font("Lucida Grande", Font.BOLD, 10));
		
		JLabel lblNewLabel_3 = new JLabel("100€");
		
		JLabel lblNewLabel_4 = new JLabel("00:00:00");
		lblNewLabel_4.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(label, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel)
						.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
							.addComponent(lblNewLabel_4)
							.addGroup(groupLayout.createSequentialGroup()
								.addComponent(lblNewLabel_1)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(lblNewLabel_2)
								.addGap(18)
								.addComponent(lblNewLabel_3))))
					.addContainerGap(64, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(label, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblNewLabel)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel_1)
								.addComponent(lblNewLabel_2)
								.addComponent(lblNewLabel_3))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblNewLabel_4)))
					.addContainerGap(12, Short.MAX_VALUE))
		);
		setLayout(groupLayout);

	}

}
