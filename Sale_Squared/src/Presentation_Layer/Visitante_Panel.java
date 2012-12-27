package Presentation_Layer;

import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;


import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Visitante_Panel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public Visitante_Panel(final Sale_Squared root) {
		
		JButton btnRegistar = new JButton("Registar");
		btnRegistar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				root.setBody(new Registo(root), "Registo");
				
			}
		});
		
		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JDialog frame =new Login(root);
				frame.setLocationRelativeTo(null);
				frame.setVisible(true);
			}
		});
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(btnEntrar)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnRegistar)
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnRegistar)
						.addComponent(btnEntrar))
					.addContainerGap(265, Short.MAX_VALUE))
		);
		setLayout(groupLayout);

	}

}
