package Presentation_Layer;

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.CardLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Registo extends JPanel {
	
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public Registo(final Sale_Squared root) {
		
		
		
		final JPanel registo_1_2 = new Registo_1_2();
		final JPanel registo_3_Final = new Registo_3_Final(root);
		
		JLabel lblNewLabel = new JLabel("Registo");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.BOLD, 20));
		
		final JPanel panel = new JPanel();
		final JButton btnNewButton_1 = new JButton("Voltar");
		final JButton btnNewButton = new JButton("Seguinte");
		
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton.setText("Seguinte");
				panel.removeAll();
				panel.add(registo_1_2,"1_2");
				panel.updateUI();
				panel.validate();
				btnNewButton_1.setVisible(false);
				
			}
		});

		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
					btnNewButton.setText("Concluir");
					panel.removeAll();
					panel.add(registo_3_Final,"3 e Fim");
					panel.updateUI();
					panel.validate();
					btnNewButton_1.setVisible(true);
				
			}
		});
		
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(101)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(panel, GroupLayout.DEFAULT_SIZE, 620, Short.MAX_VALUE)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(btnNewButton_1)
									.addPreferredGap(ComponentPlacement.RELATED, 421, Short.MAX_VALUE)
									.addComponent(btnNewButton)
									.addGap(20)))))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel)
					.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 781, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnNewButton_1)
						.addComponent(btnNewButton))
					.addGap(18))
		);
		panel.setLayout(new CardLayout(0, 0));
		panel.add(registo_1_2,"1 e 2");
		setLayout(groupLayout);
		btnNewButton_1.setVisible(false);


	}
}
