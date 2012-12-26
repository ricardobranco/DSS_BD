package Presentation_Layer;

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;
import java.awt.Color;

public class Resultado_Label extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public Resultado_Label() {
		
		JButton btnNewButton = new JButton("\n");
		btnNewButton.setIcon(new ImageIcon(Resultado_Label.class.getResource("/Imagens/Sem_Imagem.png")));
		
		JLabel lblNewLabel = new JLabel("Titulo do Neg\u00F3cio");
		lblNewLabel.setForeground(new Color(0, 102, 204));
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		Mouse_S2.mouseINOUT(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\n");
		lblNewLabel_1.setIcon(new ImageIcon(Resultado_Label.class.getResource("/Imagens/top_cliente.png")));
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(btnNewButton)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 239, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(lblNewLabel_1)
					.addContainerGap(195, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_1)
						.addComponent(lblNewLabel)
						.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 89, Short.MAX_VALUE))
					.addContainerGap())
		);
		setLayout(groupLayout);

	}

}
