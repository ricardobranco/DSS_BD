package Presentation_Layer;

import java.awt.Color;
import java.awt.Font;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.LineBorder;

public class Envio_Pagamento extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public Envio_Pagamento() {
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		
		JSeparator separator = new JSeparator();
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(panel_1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 552, Short.MAX_VALUE)
						.addComponent(panel, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
						.addComponent(separator, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 439, Short.MAX_VALUE))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel, GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
					.addGap(3)
					.addComponent(separator, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
					.addContainerGap())
		);
		
		JLabel lblNewLabel_1 = new JLabel("Envio");
		lblNewLabel_1.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		
		JLabel lblNewLabel_2 = new JLabel("Envia para o estrangeiro");
		
		JLabel lblNewLabel_3 = new JLabel("N\u00E3o");
		
		JLabel lblCondiesDeEnvio = new JLabel("Condi\u00E7\u00F5es de envio\t");
		
		JLabel lblNewLabel_4 = new JLabel("Comprador paga custos de envio");
		
		JLabel lblNewLabel_5 = new JLabel("Envio");
		
		JLabel lblNewLabel_6 = new JLabel("\u20AC 7.90");
		
		JLabel lblNewLabel_7 = new JLabel("Seguro");
		
		JLabel lblNewLabel_8 = new JLabel("\u20AC 8.50");
		
		JLabel lblNewLabel_9 = new JLabel("M\u00E9todo de Envio");
		
		JLabel lblNewLabel_10 = new JLabel("Correio registado");
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING, false)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblNewLabel_1))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(61)
							.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
								.addComponent(lblCondiesDeEnvio)
								.addComponent(lblNewLabel_2)
								.addComponent(lblNewLabel_5)
								.addComponent(lblNewLabel_7)
								.addComponent(lblNewLabel_9))
							.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_1.createSequentialGroup()
									.addGap(18)
									.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
										.addComponent(lblNewLabel_6)
										.addComponent(lblNewLabel_4)
										.addComponent(lblNewLabel_3)))
								.addGroup(gl_panel_1.createSequentialGroup()
									.addGap(18)
									.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
										.addComponent(lblNewLabel_10)
										.addComponent(lblNewLabel_8))))))
					.addContainerGap(33, Short.MAX_VALUE))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel_1)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_2)
						.addComponent(lblNewLabel_3))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblCondiesDeEnvio)
						.addComponent(lblNewLabel_4))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_5)
						.addComponent(lblNewLabel_6))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_7)
						.addComponent(lblNewLabel_8))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_9)
						.addComponent(lblNewLabel_10))
					.addContainerGap())
		);
		panel_1.setLayout(gl_panel_1);
		
		JLabel lblNewLabel = new JLabel("Pagamento");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("PayPal");
		chckbxNewCheckBox.setEnabled(false);
		chckbxNewCheckBox.setForeground(Color.BLACK);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Transfer\u00EAncia Banc\u00E1ria");
		chckbxNewCheckBox_1.setSelected(true);
		chckbxNewCheckBox_1.setEnabled(false);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("Dinheiro");
		chckbxNewCheckBox_2.setEnabled(false);
		chckbxNewCheckBox_2.setSelected(true);
		
		JCheckBox chckbxNewCheckBox_3 = new JCheckBox("Envio \u00E0 Cobran\u00E7a");
		chckbxNewCheckBox_3.setSelected(true);
		chckbxNewCheckBox_3.setEnabled(false);
		
		JCheckBox chckbxNewCheckBox_4 = new JCheckBox("Cheque");
		chckbxNewCheckBox_4.setSelected(true);
		chckbxNewCheckBox_4.setEnabled(false);
		
		JCheckBox chckbxNewCheckBox_5 = new JCheckBox("Descri\u00E7\u00E3o");
		chckbxNewCheckBox_5.setToolTipText("O autor d\u00E1 mais informa\u00E7\u00F5es de pagamento na Descri\u00E7\u00E3o");
		chckbxNewCheckBox_5.setEnabled(false);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblNewLabel))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(52)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(chckbxNewCheckBox_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(chckbxNewCheckBox, GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
								.addComponent(chckbxNewCheckBox_2, GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE))))
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(chckbxNewCheckBox_3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(chckbxNewCheckBox_4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addGap(73))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(chckbxNewCheckBox_5, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addGap(46)))
					.addGap(53))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(chckbxNewCheckBox, GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
						.addComponent(chckbxNewCheckBox_3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(chckbxNewCheckBox_1, GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
						.addComponent(chckbxNewCheckBox_4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(chckbxNewCheckBox_2, GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
						.addComponent(chckbxNewCheckBox_5, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addContainerGap())
		);
		panel.setLayout(gl_panel);
		setLayout(groupLayout);

	}
}