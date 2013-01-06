package Presentation_Layer.Inserir;

import java.awt.Font;

import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;

public class Inserir_3 extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JCheckBox chckbxNewCheckBox;
	private JCheckBox chckbxMostrarTelemvel;

	/**
	 * Create the panel.
	 */
	public Inserir_3() {

		JLabel lblFinalizar = new JLabel("3 - Finalizar");
		lblFinalizar.setFont(new Font("Lucida Grande", Font.BOLD, 15));

		chckbxNewCheckBox = new JCheckBox("Permitir trocas");
		chckbxNewCheckBox.setFont(new Font("Lucida Grande", Font.BOLD, 13));

		chckbxMostrarTelemvel = new JCheckBox("Mostrar contacto");
		chckbxMostrarTelemvel.setFont(new Font("Lucida Grande", Font.BOLD, 13));
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
																				lblFinalizar))
														.addGroup(
																groupLayout
																		.createSequentialGroup()
																		.addGap(109)
																		.addGroup(
																				groupLayout
																						.createParallelGroup(
																								Alignment.LEADING)
																						.addComponent(
																								chckbxNewCheckBox)
																						.addComponent(
																								chckbxMostrarTelemvel))))
										.addContainerGap(242, Short.MAX_VALUE)));
		groupLayout.setVerticalGroup(groupLayout.createParallelGroup(
				Alignment.LEADING).addGroup(
				groupLayout.createSequentialGroup().addContainerGap()
						.addComponent(lblFinalizar)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(chckbxNewCheckBox).addGap(18)
						.addComponent(chckbxMostrarTelemvel)
						.addContainerGap(205, Short.MAX_VALUE)));
		setLayout(groupLayout);

	}

	public boolean trocas() {
		return chckbxNewCheckBox.isSelected();
	}

	public boolean contacto() {
		return chckbxMostrarTelemvel.isSelected();
	}
}
