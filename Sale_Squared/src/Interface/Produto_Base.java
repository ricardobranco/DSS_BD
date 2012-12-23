package Interface;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.LayoutStyle.ComponentPlacement;

public class Produto_Base extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public Produto_Base() {
		
		JButton button = new JButton("");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button.setIcon(new ImageIcon(Produto_Base.class.getResource("/Imagens/Sem_Imagem.png")));
		
		JLabel lblNewLabel = new JLabel("Produto");
		Mouse_S2.mouseINOUT(lblNewLabel);
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		lblNewLabel.setForeground(new Color(0, 102, 204));
		
		JLabel lblMin = new JLabel("\u20AC 50");
		
		JLabel label = new JLabel("\u20AC 100");
		label.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		
		JLabel label_1 = new JLabel("00:00:00");
		label_1.setFont(new Font("Lucida Grande", Font.BOLD | Font.ITALIC, 13));
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(button)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblMin)
							.addContainerGap())
						.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
							.addGap(6)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 342, Short.MAX_VALUE)
									.addContainerGap())
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(label_1)
									.addPreferredGap(ComponentPlacement.RELATED, 242, Short.MAX_VALUE)
									.addComponent(label)
									.addGap(6))))))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(button, GroupLayout.PREFERRED_SIZE, 79, GroupLayout.PREFERRED_SIZE)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 17, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblMin, GroupLayout.DEFAULT_SIZE, 16, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(label, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addGap(12))
		);
		setLayout(groupLayout);

	}
}
