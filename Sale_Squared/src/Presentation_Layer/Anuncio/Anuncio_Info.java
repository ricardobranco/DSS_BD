package Presentation_Layer.Anuncio;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;

public class Anuncio_Info extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField textField;

	/**
	 * Create the panel.
	 */
	public Anuncio_Info() {

		JLabel lblNewLabel = new JLabel("Início:");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.BOLD, 13));

		JLabel lblNewLabel_1 = new JLabel("24/12/2012 - 06:30");

		JLabel lblNewLabel_2 = new JLabel("Fim:");
		lblNewLabel_2.setFont(new Font("Lucida Grande", Font.BOLD, 13));

		JLabel lblNewLabel_3 = new JLabel(
				"2 dias, 12h 48m (26.12.2012 19:17:02)");

		JLabel lblNewLabel_4 = new JLabel("Quantidade:");
		lblNewLabel_4.setFont(new Font("Lucida Grande", Font.BOLD, 13));

		JLabel lblNewLabel_5 = new JLabel("10 Unidades");

		JLabel lblNewLabel_6 = new JLabel("Preço:");
		lblNewLabel_6.setFont(new Font("Lucida Grande", Font.BOLD, 13));

		JLabel lblNewLabel_7 = new JLabel("\u20AC 200,00");
		lblNewLabel_7.setFont(new Font("Lucida Grande", Font.BOLD, 15));

		JButton btnNewButton = new JButton("Comprar");

		JLabel lblNewLabel_8 = new JLabel("Licitação m\u00E1xima:");
		lblNewLabel_8.setFont(new Font("Lucida Grande", Font.BOLD, 13));

		JLabel lblNewLabel_9 = new JLabel("\u20AC");
		lblNewLabel_9.setFont(new Font("Lucida Grande", Font.BOLD, 13));

		textField = new JTextField();
		textField.setColumns(10);

		JButton btnNewButton_1 = new JButton("Licitar");

		JLabel lblNewLabel_10 = new JLabel(
				"(Tem que licitar \u20AC 24,00 para cima)");
		lblNewLabel_10.setFont(new Font("Lucida Grande", Font.PLAIN, 10));

		JLabel lblNewLabel_11 = new JLabel("Licitação actual:");
		lblNewLabel_11.setFont(new Font("Lucida Grande", Font.BOLD, 13));

		JLabel lblNewLabel_12 = new JLabel("\u20AC 23,50");
		lblNewLabel_12.setFont(new Font("Lucida Grande", Font.BOLD, 13));

		JSeparator separator = new JSeparator();

		JLabel lblLocalizo = new JLabel("Localizão:");
		lblLocalizo.setFont(new Font("Lucida Grande", Font.BOLD, 13));

		JLabel lblNewLabel_13 = new JLabel("4705-652, Braga, Portugal");

		JLabel lblNewLabel_14 = new JLabel(
				"(Envio para o estrangeiro: Não)");
		lblNewLabel_14.setFont(new Font("Lucida Grande", Font.PLAIN, 11));

		final JButton btnNewButton_2 = new JButton("Seguir Negócio");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (btnNewButton_2.getText().equals("Seguir Negócio"))
					btnNewButton_2.setText("Deixar Negócio");
				else
					btnNewButton_2.setText("Seguir Negócio");
			}
		});

		JButton btnNewButton_3 = new JButton("Reportar");

		JLabel lblNewLabel_15 = new JLabel("Utilizador:");
		lblNewLabel_15.setFont(new Font("Lucida Grande", Font.BOLD, 13));

		JLabel lblNewLabel_16 = new JLabel("Sale_Squared");

		JButton btnNewButton_4 = new JButton("Ver Perfil");

		JLabel lblNewLabel_17 = new JLabel("Este utilizador aceita trocas");
		lblNewLabel_17.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
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
																		.addGroup(
																				groupLayout
																						.createParallelGroup(
																								Alignment.LEADING)
																						.addComponent(
																								separator,
																								GroupLayout.DEFAULT_SIZE,
																								460,
																								Short.MAX_VALUE)
																						.addGroup(
																								groupLayout
																										.createSequentialGroup()
																										.addGroup(
																												groupLayout
																														.createParallelGroup(
																																Alignment.TRAILING)
																														.addComponent(
																																lblNewLabel)
																														.addComponent(
																																lblNewLabel_2)
																														.addComponent(
																																lblNewLabel_4)
																														.addComponent(
																																lblNewLabel_6)
																														.addComponent(
																																lblNewLabel_8)
																														.addComponent(
																																lblNewLabel_11))
																										.addGap(18)
																										.addGroup(
																												groupLayout
																														.createParallelGroup(
																																Alignment.LEADING)
																														.addComponent(
																																lblNewLabel_3)
																														.addComponent(
																																lblNewLabel_1)
																														.addComponent(
																																lblNewLabel_5)
																														.addGroup(
																																groupLayout
																																		.createSequentialGroup()
																																		.addComponent(
																																				lblNewLabel_7)
																																		.addGap(18)
																																		.addComponent(
																																				btnNewButton))
																														.addComponent(
																																lblNewLabel_12)
																														.addGroup(
																																groupLayout
																																		.createSequentialGroup()
																																		.addComponent(
																																				lblNewLabel_9)
																																		.addPreferredGap(
																																				ComponentPlacement.RELATED)
																																		.addGroup(
																																				groupLayout
																																						.createParallelGroup(
																																								Alignment.LEADING)
																																						.addComponent(
																																								lblNewLabel_10)
																																						.addGroup(
																																								groupLayout
																																										.createSequentialGroup()
																																										.addComponent(
																																												textField,
																																												GroupLayout.PREFERRED_SIZE,
																																												GroupLayout.DEFAULT_SIZE,
																																												GroupLayout.PREFERRED_SIZE)
																																										.addPreferredGap(
																																												ComponentPlacement.RELATED)
																																										.addComponent(
																																												btnNewButton_1))))
																														.addComponent(
																																lblNewLabel_17))
																										.addGap(68))))
														.addGroup(
																groupLayout
																		.createSequentialGroup()
																		.addGap(44)
																		.addGroup(
																				groupLayout
																						.createParallelGroup(
																								Alignment.LEADING)
																						.addGroup(
																								groupLayout
																										.createSequentialGroup()
																										.addComponent(
																												lblNewLabel_15)
																										.addGap(18)
																										.addComponent(
																												lblNewLabel_16)
																										.addPreferredGap(
																												ComponentPlacement.RELATED)
																										.addComponent(
																												btnNewButton_4))
																						.addGroup(
																								groupLayout
																										.createSequentialGroup()
																										.addComponent(
																												lblLocalizo)
																										.addGap(18)
																										.addGroup(
																												groupLayout
																														.createParallelGroup(
																																Alignment.LEADING,
																																false)
																														.addComponent(
																																lblNewLabel_13)
																														.addGroup(
																																groupLayout
																																		.createSequentialGroup()
																																		.addGap(6)
																																		.addGroup(
																																				groupLayout
																																						.createParallelGroup(
																																								Alignment.TRAILING,
																																								false)
																																						.addComponent(
																																								lblNewLabel_14,
																																								Alignment.LEADING,
																																								GroupLayout.DEFAULT_SIZE,
																																								GroupLayout.DEFAULT_SIZE,
																																								Short.MAX_VALUE)
																																						.addComponent(
																																								btnNewButton_3,
																																								Alignment.LEADING,
																																								GroupLayout.DEFAULT_SIZE,
																																								GroupLayout.DEFAULT_SIZE,
																																								Short.MAX_VALUE)
																																						.addComponent(
																																								btnNewButton_2,
																																								Alignment.LEADING,
																																								GroupLayout.DEFAULT_SIZE,
																																								GroupLayout.DEFAULT_SIZE,
																																								Short.MAX_VALUE))))))
																		.addGap(147)))
										.addContainerGap()));
		groupLayout
				.setVerticalGroup(groupLayout
						.createParallelGroup(Alignment.LEADING)
						.addGroup(
								groupLayout
										.createSequentialGroup()
										.addGap(28)
										.addGroup(
												groupLayout
														.createParallelGroup(
																Alignment.BASELINE)
														.addComponent(
																lblNewLabel_1)
														.addComponent(
																lblNewLabel))
										.addPreferredGap(
												ComponentPlacement.RELATED)
										.addGroup(
												groupLayout
														.createParallelGroup(
																Alignment.BASELINE)
														.addComponent(
																lblNewLabel_2)
														.addComponent(
																lblNewLabel_3))
										.addPreferredGap(
												ComponentPlacement.RELATED)
										.addGroup(
												groupLayout
														.createParallelGroup(
																Alignment.BASELINE)
														.addComponent(
																lblNewLabel_4)
														.addComponent(
																lblNewLabel_5))
										.addPreferredGap(
												ComponentPlacement.RELATED)
										.addGroup(
												groupLayout
														.createParallelGroup(
																Alignment.BASELINE)
														.addComponent(
																lblNewLabel_6)
														.addComponent(
																lblNewLabel_7)
														.addComponent(
																btnNewButton))
										.addGap(3)
										.addComponent(lblNewLabel_17)
										.addPreferredGap(
												ComponentPlacement.UNRELATED)
										.addGroup(
												groupLayout
														.createParallelGroup(
																Alignment.BASELINE)
														.addComponent(
																lblNewLabel_11)
														.addComponent(
																lblNewLabel_12))
										.addPreferredGap(
												ComponentPlacement.RELATED)
										.addGroup(
												groupLayout
														.createParallelGroup(
																Alignment.BASELINE)
														.addComponent(
																lblNewLabel_8)
														.addComponent(
																lblNewLabel_9)
														.addComponent(
																textField,
																GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE,
																GroupLayout.PREFERRED_SIZE)
														.addComponent(
																btnNewButton_1))
										.addPreferredGap(
												ComponentPlacement.RELATED)
										.addComponent(lblNewLabel_10)
										.addPreferredGap(
												ComponentPlacement.UNRELATED)
										.addComponent(separator,
												GroupLayout.PREFERRED_SIZE,
												GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												ComponentPlacement.RELATED)
										.addGroup(
												groupLayout
														.createParallelGroup(
																Alignment.BASELINE)
														.addComponent(
																lblNewLabel_15)
														.addComponent(
																lblNewLabel_16)
														.addComponent(
																btnNewButton_4))
										.addPreferredGap(
												ComponentPlacement.UNRELATED)
										.addGroup(
												groupLayout
														.createParallelGroup(
																Alignment.BASELINE)
														.addComponent(
																lblLocalizo)
														.addComponent(
																lblNewLabel_13))
										.addPreferredGap(
												ComponentPlacement.RELATED)
										.addComponent(lblNewLabel_14)
										.addGap(62)
										.addComponent(btnNewButton_2)
										.addPreferredGap(
												ComponentPlacement.RELATED)
										.addComponent(btnNewButton_3)
										.addContainerGap(53, Short.MAX_VALUE)));
		setLayout(groupLayout);

	}
}
