package Presentation_Layer.Registo;

import java.awt.Font;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.LayoutStyle.ComponentPlacement;

public class Registo_3 extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public Registo_3() {
		
		JLabel lblNewLabel = new JLabel("3 - Favoritos");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Moda");
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Casa e Jardim");
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("Auto");
		
		JCheckBox chckbxNewCheckBox_3 = new JCheckBox("Coleccion\u00E1veis e Arte");
		
		JCheckBox chckbxNewCheckBox_4 = new JCheckBox("Tecnologia e Electr\u00F3nica");
		
		JCheckBox chckbxNewCheckBox_5 = new JCheckBox("Sa\u00FAde");
		
		JSeparator separator = new JSeparator();
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblNewLabel))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(49)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(chckbxNewCheckBox_1)
								.addComponent(chckbxNewCheckBox)
								.addComponent(chckbxNewCheckBox_2))
							.addGap(18)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(chckbxNewCheckBox_5)
								.addComponent(chckbxNewCheckBox_3)
								.addComponent(chckbxNewCheckBox_4)))
						.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(separator, GroupLayout.DEFAULT_SIZE, 438, Short.MAX_VALUE)))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel)
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(chckbxNewCheckBox)
						.addComponent(chckbxNewCheckBox_3))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(chckbxNewCheckBox_1)
						.addComponent(chckbxNewCheckBox_4))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(chckbxNewCheckBox_2)
						.addComponent(chckbxNewCheckBox_5))
					.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(separator, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
					.addGap(123))
		);
		setLayout(groupLayout);

	}
}
