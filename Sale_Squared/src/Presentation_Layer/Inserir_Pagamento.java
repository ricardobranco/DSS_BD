package Presentation_Layer;

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JCheckBox;
import javax.swing.LayoutStyle.ComponentPlacement;

public class Inserir_Pagamento extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public Inserir_Pagamento() {
		
		JLabel lblNewLabel = new JLabel("3 - Pagamento");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		
		JCheckBox chckbxPaypal = new JCheckBox("PayPal");
		
		JCheckBox chckbxTransfernciaBancria = new JCheckBox("Transfer\u00EAncia Banc\u00E1ria");
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Dinheiro");
		
		JCheckBox chckbxEnvio = new JCheckBox("Envio \u00E0 Cobran\u00E7a");
		
		JCheckBox chckbxCheque = new JCheckBox("Cheque");
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Descri\u00E7\u00E3o");
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel)
					.addContainerGap(76, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap(145, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(chckbxPaypal)
							.addGap(120)
							.addComponent(chckbxEnvio))
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(chckbxTransfernciaBancria)
								.addComponent(chckbxNewCheckBox))
							.addGap(18)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(chckbxNewCheckBox_1)
								.addComponent(chckbxCheque))))
					.addGap(88))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel)
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(chckbxPaypal)
						.addComponent(chckbxEnvio))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(chckbxTransfernciaBancria)
						.addComponent(chckbxCheque))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(chckbxNewCheckBox)
						.addComponent(chckbxNewCheckBox_1))
					.addContainerGap(20, Short.MAX_VALUE))
		);
		setLayout(groupLayout);

	}

}
