package Presentation_Layer;

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.JSeparator;

public class Registo_1 extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JPasswordField passwordField;
	private JTextField textField_1;
	private JPasswordField passwordField_1;
	private JTextField textField_2;

	/**
	 * Create the panel.
	 */
	public Registo_1() {
		
		JLabel lblNewLabel = new JLabel("1 - Dados B\u00E1sicos");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		
		JLabel lblNewLabel_1 = new JLabel("Username");
		lblNewLabel_1.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		
		textField = new JTextField();
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Verificar Username");
		
		JLabel lblNewLabel_2 = new JLabel("Password");
		lblNewLabel_2.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		
		passwordField = new JPasswordField();
		
		JLabel lblNewLabel_3 = new JLabel("Email");
		lblNewLabel_3.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Confirmar Password");
		lblNewLabel_4.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		
		passwordField_1 = new JPasswordField();
		
		JLabel lblConfirmarEmail = new JLabel("Confirmar Email");
		lblConfirmarEmail.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		
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
							.addGap(42)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_2)
								.addComponent(lblNewLabel_1)
								.addComponent(lblNewLabel_4)
								.addComponent(lblNewLabel_3)
								.addComponent(lblConfirmarEmail, GroupLayout.PREFERRED_SIZE, 136, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
								.addComponent(textField_2)
								.addComponent(textField_1)
								.addComponent(passwordField_1)
								.addComponent(passwordField)
								.addComponent(textField, GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(btnNewButton))
						.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(separator, GroupLayout.DEFAULT_SIZE, 569, Short.MAX_VALUE)))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel)
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_1)
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
							.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(btnNewButton)))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(passwordField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_2))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_4)
						.addComponent(passwordField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_3)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblConfirmarEmail)
						.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
					.addComponent(separator, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		setLayout(groupLayout);

	}
}
