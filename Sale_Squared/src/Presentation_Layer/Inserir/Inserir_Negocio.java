package Presentation_Layer.Inserir;

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

	int i = 0;
	JPanel[] inserir = new JPanel[3];

	public Inserir_Negocio() {

		inserir[0] = new Inserir_1();
		inserir[1] = new Inserir_2();
		inserir[2] = new Inserir_3();

		JLabel lblNewLabel = new JLabel("Inserir Neg\u00F3cio");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.BOLD, 20));

		final JPanel panel = new JPanel();

		final JButton btnSeguinte = new JButton("Seguinte");
		final JButton btnVoltar = new JButton("Voltar");
		btnSeguinte.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.removeAll();
				i++;
				panel.add(inserir[i], "inserir");
				panel.updateUI();
				panel.validate();
				if (i == 2)
					btnSeguinte.setVisible(false);
				btnVoltar.setVisible(true);

			}
		});

		btnVoltar.setVisible(false);

		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.removeAll();
				i--;
				panel.add(inserir[i], "inserir");
				panel.updateUI();
				panel.validate();
				if (i == 0)
					btnVoltar.setVisible(false);
				btnSeguinte.setVisible(true);

			}
		});
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout
				.setHorizontalGroup(groupLayout
						.createParallelGroup(Alignment.TRAILING)
						.addGroup(
								groupLayout
										.createSequentialGroup()
										.addGroup(
												groupLayout
														.createParallelGroup(
																Alignment.TRAILING)
														.addGroup(
																Alignment.LEADING,
																groupLayout
																		.createSequentialGroup()
																		.addContainerGap()
																		.addComponent(
																				lblNewLabel))
														.addGroup(
																Alignment.LEADING,
																groupLayout
																		.createSequentialGroup()
																		.addGap(45)
																		.addGroup(
																				groupLayout
																						.createParallelGroup(
																								Alignment.LEADING)
																						.addGroup(
																								Alignment.TRAILING,
																								groupLayout
																										.createSequentialGroup()
																										.addComponent(
																												btnVoltar)
																										.addPreferredGap(
																												ComponentPlacement.RELATED,
																												206,
																												Short.MAX_VALUE)
																										.addComponent(
																												btnSeguinte))
																						.addComponent(
																								panel,
																								GroupLayout.DEFAULT_SIZE,
																								421,
																								Short.MAX_VALUE))))
										.addGap(26)));
		groupLayout.setVerticalGroup(groupLayout.createParallelGroup(
				Alignment.LEADING)
				.addGroup(
						groupLayout
								.createSequentialGroup()
								.addContainerGap()
								.addComponent(lblNewLabel)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(panel, GroupLayout.DEFAULT_SIZE,
										50, Short.MAX_VALUE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addGroup(
										groupLayout
												.createParallelGroup(
														Alignment.BASELINE)
												.addComponent(btnSeguinte)
												.addComponent(btnVoltar))
								.addGap(6)));
		panel.setLayout(new CardLayout(0, 0));
		panel.add(inserir[0], "Inserir 1");
		setLayout(groupLayout);

	}
}
