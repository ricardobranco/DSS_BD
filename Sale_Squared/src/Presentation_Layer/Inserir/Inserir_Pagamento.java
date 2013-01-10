package Presentation_Layer.Inserir;

import java.awt.Font;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.LayoutStyle.ComponentPlacement;

public class Inserir_Pagamento extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */

	private List<JCheckBox> metodos;

	public Inserir_Pagamento() {

		metodos = new ArrayList<>();

		JLabel lblNewLabel = new JLabel("3 - Pagamento");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.BOLD, 15));

		JCheckBox chckbxPaypal = new JCheckBox("PayPal");
		metodos.add(chckbxPaypal);
		JCheckBox chckbxTransfernciaBancria = new JCheckBox(
				"Transferência Bancária");
		metodos.add(chckbxTransfernciaBancria);
		JCheckBox chckbxNewCheckBox = new JCheckBox("Dinheiro");
		metodos.add(chckbxNewCheckBox);
		JCheckBox chckbxEnvio = new JCheckBox("Envio à cobranca");
		metodos.add(chckbxEnvio);
		JCheckBox chckbxCheque = new JCheckBox("Cheque");
		metodos.add(chckbxCheque);
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Descrição");
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout
				.setHorizontalGroup(groupLayout
						.createParallelGroup(Alignment.LEADING)
						.addGroup(
								groupLayout.createSequentialGroup()
										.addContainerGap()
										.addComponent(lblNewLabel)
										.addContainerGap(76, Short.MAX_VALUE))
						.addGroup(
								Alignment.TRAILING,
								groupLayout
										.createSequentialGroup()
										.addContainerGap(145, Short.MAX_VALUE)
										.addGroup(
												groupLayout
														.createParallelGroup(
																Alignment.LEADING)
														.addGroup(
																groupLayout
																		.createSequentialGroup()
																		.addComponent(
																				chckbxPaypal)
																		.addGap(120)
																		.addComponent(
																				chckbxEnvio))
														.addGroup(
																groupLayout
																		.createSequentialGroup()
																		.addGroup(
																				groupLayout
																						.createParallelGroup(
																								Alignment.LEADING)
																						.addComponent(
																								chckbxTransfernciaBancria)
																						.addComponent(
																								chckbxNewCheckBox))
																		.addGap(18)
																		.addGroup(
																				groupLayout
																						.createParallelGroup(
																								Alignment.LEADING)
																						.addComponent(
																								chckbxNewCheckBox_1)
																						.addComponent(
																								chckbxCheque))))
										.addGap(88)));
		groupLayout
				.setVerticalGroup(groupLayout
						.createParallelGroup(Alignment.LEADING)
						.addGroup(
								groupLayout
										.createSequentialGroup()
										.addContainerGap()
										.addComponent(lblNewLabel)
										.addGap(18)
										.addGroup(
												groupLayout
														.createParallelGroup(
																Alignment.BASELINE)
														.addComponent(
																chckbxPaypal)
														.addComponent(
																chckbxEnvio))
										.addPreferredGap(
												ComponentPlacement.RELATED)
										.addGroup(
												groupLayout
														.createParallelGroup(
																Alignment.BASELINE)
														.addComponent(
																chckbxTransfernciaBancria)
														.addComponent(
																chckbxCheque))
										.addPreferredGap(
												ComponentPlacement.RELATED)
										.addGroup(
												groupLayout
														.createParallelGroup(
																Alignment.BASELINE)
														.addComponent(
																chckbxNewCheckBox)
														.addComponent(
																chckbxNewCheckBox_1))
										.addContainerGap(20, Short.MAX_VALUE)));
		setLayout(groupLayout);

	}

	public Set<String> getModosPagamento() throws Exception {
		Set<String> res = new HashSet<>();
		for (JCheckBox jcb : metodos) {
			if (jcb.isSelected())
				res.add(jcb.getText());
		}
		if (res.isEmpty())
			throw new Exception("Insira pelo menos um método de pagamento");
		return res;

	}

}
