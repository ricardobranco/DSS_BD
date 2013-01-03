package Presentation_Layer.Pesquisa;

import java.awt.Font;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;

public class Pesquisa_Ferramentas extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Create the panel.
	 */
	public Pesquisa_Ferramentas() {
		
		JLabel lblNewLabel = new JLabel("Refinar Pesquisa");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		
		JLabel lblNewLabel_1 = new JLabel("\u20AC");
		
		textField = new JTextField();
		textField.setText("0");
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("at\u00E9 \u20AC");
		
		textField_1 = new JTextField();
		textField_1.setText("10000");
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("Filtrar");
		
		JSeparator separator = new JSeparator();
		
		JLabel lblNewLabel_3 = new JLabel("Prefer\u00EAncias");
		lblNewLabel_3.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		
		JPanel panel = new JPanel();
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
							.addGap(33)
							.addComponent(lblNewLabel_1)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblNewLabel_2)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(separator, GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(76)
							.addComponent(panel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap(191, Short.MAX_VALUE)
							.addComponent(btnNewButton))
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblNewLabel_3))
						.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblNewLabel)))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_1)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_2)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addComponent(separator, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lblNewLabel_3)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 497, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnNewButton)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		
		JLabel lblNewLabel_4 = new JLabel("Portes de Envio");
		lblNewLabel_4.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Pagos Gr\u00E1tis");
		chckbxNewCheckBox.setSelected(true);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Portes Pagos");
		chckbxNewCheckBox_1.setSelected(true);
		
		JLabel lblNewLabel_5 = new JLabel("Modos de Pagamento");
		lblNewLabel_5.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("Transfer\u00EAncia Banc\u00E1ria");
		chckbxNewCheckBox_2.setSelected(true);
		
		JCheckBox chckbxNewCheckBox_3 = new JCheckBox("PayPal");
		chckbxNewCheckBox_3.setSelected(true);
		
		JCheckBox chckbxNewCheckBox_4 = new JCheckBox("Dinheiro");
		chckbxNewCheckBox_4.setSelected(true);
		
		JCheckBox chckbxNewCheckBox_5 = new JCheckBox("Envia \u00E0 Cobran\u00E7a");
		chckbxNewCheckBox_5.setSelected(true);
		
		JCheckBox chckbxNewCheckBox_6 = new JCheckBox("Cheque");
		chckbxNewCheckBox_6.setSelected(true);
		
		JLabel lblNewLabel_6 = new JLabel("Modo de Envio");
		lblNewLabel_6.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		
		JCheckBox chckbxNewCheckBox_7 = new JCheckBox("Normal");
		chckbxNewCheckBox_7.setSelected(true);
		
		JCheckBox chckbxNewCheckBox_8 = new JCheckBox("Registado");
		chckbxNewCheckBox_8.setSelected(true);
		
		JCheckBox chckbxNewCheckBox_9 = new JCheckBox("Transportadora");
		chckbxNewCheckBox_9.setSelected(true);
		
		JCheckBox chckbxNewCheckBox_10 = new JCheckBox("Entrega em m\u00E3o");
		chckbxNewCheckBox_10.setSelected(true);
		
		JCheckBox chckbxNewCheckBox_11 = new JCheckBox("Registado com Seguro");
		chckbxNewCheckBox_11.setSelected(true);
		
		JLabel lblNewLabel_7 = new JLabel("Estado");
		lblNewLabel_7.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		
		JCheckBox chckbxNewCheckBox_12 = new JCheckBox("Novo");
		chckbxNewCheckBox_12.setSelected(true);
		
		JCheckBox chckbxNewCheckBox_13 = new JCheckBox("Usado");
		chckbxNewCheckBox_13.setSelected(true);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblNewLabel_4))
						.addGroup(gl_panel.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblNewLabel_5))
						.addGroup(gl_panel.createSequentialGroup()
							.addContainerGap()
							.addComponent(chckbxNewCheckBox))
						.addGroup(gl_panel.createSequentialGroup()
							.addContainerGap()
							.addComponent(chckbxNewCheckBox_1))
						.addGroup(gl_panel.createSequentialGroup()
							.addContainerGap()
							.addComponent(chckbxNewCheckBox_2))
						.addGroup(gl_panel.createSequentialGroup()
							.addContainerGap()
							.addComponent(chckbxNewCheckBox_3))
						.addGroup(gl_panel.createSequentialGroup()
							.addContainerGap()
							.addComponent(chckbxNewCheckBox_4))
						.addGroup(gl_panel.createSequentialGroup()
							.addContainerGap()
							.addComponent(chckbxNewCheckBox_5))
						.addGroup(gl_panel.createSequentialGroup()
							.addContainerGap()
							.addComponent(chckbxNewCheckBox_6))
						.addGroup(gl_panel.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblNewLabel_6))
						.addGroup(gl_panel.createSequentialGroup()
							.addContainerGap()
							.addComponent(chckbxNewCheckBox_7))
						.addGroup(gl_panel.createSequentialGroup()
							.addContainerGap()
							.addComponent(chckbxNewCheckBox_8))
						.addGroup(gl_panel.createSequentialGroup()
							.addContainerGap()
							.addComponent(chckbxNewCheckBox_9))
						.addGroup(gl_panel.createSequentialGroup()
							.addContainerGap()
							.addComponent(chckbxNewCheckBox_10))
						.addGroup(gl_panel.createSequentialGroup()
							.addContainerGap()
							.addComponent(chckbxNewCheckBox_11))
						.addGroup(gl_panel.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblNewLabel_7))
						.addGroup(gl_panel.createSequentialGroup()
							.addContainerGap()
							.addComponent(chckbxNewCheckBox_12))
						.addGroup(gl_panel.createSequentialGroup()
							.addContainerGap()
							.addComponent(chckbxNewCheckBox_13)))
					.addContainerGap(17, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel_4)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(chckbxNewCheckBox)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(chckbxNewCheckBox_1)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel_5)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(chckbxNewCheckBox_2)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(chckbxNewCheckBox_3)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(chckbxNewCheckBox_4)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(chckbxNewCheckBox_5)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(chckbxNewCheckBox_6)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel_6)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(chckbxNewCheckBox_7)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(chckbxNewCheckBox_8)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(chckbxNewCheckBox_9)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(chckbxNewCheckBox_10)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(chckbxNewCheckBox_11)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel_7)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(chckbxNewCheckBox_12)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(chckbxNewCheckBox_13)
					.addContainerGap(58, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		setLayout(groupLayout);

	}
}
