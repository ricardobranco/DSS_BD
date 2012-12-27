package Presentation_Layer;

import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JCheckBox;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Registo_Final extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public Registo_Final(final Sale_Squared root) {
		
		JLabel lblNewLabel = new JLabel("4 - Condi\u00E7\u00F5es de Servi\u00E7o");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Ao assinar esta op\u00E7\u00E3o confirma que leu e concorda com as nossas");
		
		JLabel lblNewLabel_1 = new JLabel("Condi\u00E7\u00F5es de Servi\u00E7o");
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				JDialog frame = new Terms(root);
				frame.setLocationRelativeTo(null);
				frame.setVisible(true);
			}
		});
		Mouse_S2.mouseINOUT(lblNewLabel_1);
		lblNewLabel_1.setForeground(new Color(0, 102, 204));
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblNewLabel))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(39)
							.addComponent(chckbxNewCheckBox)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblNewLabel_1)))
					.addContainerGap(133, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(chckbxNewCheckBox)
						.addComponent(lblNewLabel_1))
					.addContainerGap(246, Short.MAX_VALUE))
		);
		setLayout(groupLayout);

	}

}
