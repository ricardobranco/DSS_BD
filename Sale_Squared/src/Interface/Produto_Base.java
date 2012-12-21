package Interface;

import javax.swing.Icon;
import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;
import javax.swing.JButton;

public class Produto_Base extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public static final Icon THUMB_SEM_TITULO = new ImageIcon(
			Produto_Base.class.getResource("/Imagens/Sem_Imagem.png"));


	/**
	 * Create the panel.
	 */
	public Produto_Base() {
		
		JLabel lblNewLabel = new JLabel("Produto");
		Mouse_S2.mouseINOUT(lblNewLabel);
		
		
		JLabel lblNewLabel_1 = new JLabel("min:");
		lblNewLabel_1.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		
		JLabel lblNewLabel_2 = new JLabel("50€");
		lblNewLabel_2.setFont(new Font("Lucida Grande", Font.BOLD, 10));
		
		JLabel lblNewLabel_3 = new JLabel("100€");
		
		JButton button = new JButton("");
		button.setBorderPainted(false);
		button.setIcon(new ImageIcon(Produto_Base.class.getResource("/Imagens/Sem_Imagem.png")));
		
		JLabel label = new JLabel("00:00:00");
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(button)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblNewLabel)
							.addContainerGap())
						.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
							.addComponent(lblNewLabel_1)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblNewLabel_2)
							.addGap(18)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(label)
								.addComponent(lblNewLabel_3))
							.addGap(58))))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(button, GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
							.addContainerGap())
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblNewLabel)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 13, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_2)
								.addComponent(lblNewLabel_3))
							.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(label)
							.addGap(9))))
		);
		setLayout(groupLayout);

	}
}
