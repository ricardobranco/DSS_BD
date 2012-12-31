package Presentation_Layer;

import java.awt.CardLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.LayoutStyle.ComponentPlacement;

public class Inserir_Negocio extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	
	int i = 1;
	JPanel[] inserir = new JPanel[3];
	
	
	
	public Inserir_Negocio() {
		
		inserir[0] = new Inserir_1();
		inserir[1] = new Inserir_2();
		
		JLabel lblNewLabel = new JLabel("Inserir Neg\u00F3cio");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.BOLD, 20));
		
		final JPanel panel = new JPanel();
		
		JButton btnSeguinte = new JButton("Seguinte");
		btnSeguinte.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.removeAll();
				panel.add(inserir[i++],"inserir");
				panel.updateUI();
				panel.validate();
				
			}
		});
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblNewLabel))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(45)
							.addComponent(panel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
					.addGap(26))
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap(1304, Short.MAX_VALUE)
					.addComponent(btnSeguinte)
					.addGap(28))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnSeguinte)
					.addGap(9))
		);
		panel.setLayout(new CardLayout(0, 0));
		panel.add(inserir[0],"Inserir 1");
		setLayout(groupLayout);

	}
}
