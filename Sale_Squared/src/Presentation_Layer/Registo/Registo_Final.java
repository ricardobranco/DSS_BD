package Presentation_Layer.Registo;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.LayoutStyle.ComponentPlacement;

import org.jdesktop.swingx.JXHyperlink;

import Presentation_Layer.Sale_Squared;

public class Registo_Final extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */

	JCheckBox chckbxNewCheckBox;

	public Registo_Final(final Sale_Squared root) {

		JLabel lblNewLabel = new JLabel("4 - Condições de Serviço");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.BOLD, 15));

		chckbxNewCheckBox = new JCheckBox(
				"Ao assinar esta opção confirma que leu e concorda com as nossas");

		JXHyperlink hprlnkCondiesDeServio = new JXHyperlink();
		hprlnkCondiesDeServio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Terms terms = new Terms(root);
				terms.setVisible(true);
			}
		});
		hprlnkCondiesDeServio.setForeground(new Color(0, 102, 204));
		hprlnkCondiesDeServio.setText("Condições de Serviço");
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout
				.setHorizontalGroup(groupLayout
						.createParallelGroup(Alignment.LEADING)
						.addGroup(
								groupLayout
										.createSequentialGroup()
										.addGroup(
												groupLayout
														.createParallelGroup(
																Alignment.LEADING)
														.addGroup(
																groupLayout
																		.createSequentialGroup()
																		.addContainerGap()
																		.addComponent(
																				lblNewLabel))
														.addGroup(
																groupLayout
																		.createSequentialGroup()
																		.addGap(39)
																		.addComponent(
																				chckbxNewCheckBox)
																		.addGap(6)
																		.addComponent(
																				hprlnkCondiesDeServio,
																				GroupLayout.PREFERRED_SIZE,
																				GroupLayout.DEFAULT_SIZE,
																				GroupLayout.PREFERRED_SIZE)))
										.addContainerGap(50, Short.MAX_VALUE)));
		groupLayout
				.setVerticalGroup(groupLayout
						.createParallelGroup(Alignment.LEADING)
						.addGroup(
								groupLayout
										.createSequentialGroup()
										.addContainerGap()
										.addComponent(lblNewLabel)
										.addPreferredGap(
												ComponentPlacement.RELATED)
										.addGroup(
												groupLayout
														.createParallelGroup(
																Alignment.BASELINE)
														.addComponent(
																chckbxNewCheckBox)
														.addComponent(
																hprlnkCondiesDeServio,
																GroupLayout.PREFERRED_SIZE,
																18,
																GroupLayout.PREFERRED_SIZE))
										.addContainerGap(19, Short.MAX_VALUE)));
		setLayout(groupLayout);

	}

	public void termosaceites() throws Exception {
		if (!chckbxNewCheckBox.isSelected())
			throw new Exception("Tem que aceitar as Condições de Serviço");
		}
}
