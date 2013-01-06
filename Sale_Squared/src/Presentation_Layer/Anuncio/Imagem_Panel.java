package Presentation_Layer.Anuncio;

import java.awt.CardLayout;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JPanel;
import javax.swing.LayoutStyle.ComponentPlacement;

public class Imagem_Panel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public Imagem_Panel() {

		JPanel panel = new JPanel();

		JPanel panel_1 = new JPanel();

		JPanel panel_2 = new JPanel();

		JPanel panel_3 = new JPanel();

		JPanel panel_4 = new JPanel();

		JPanel panel_5 = new JPanel();

		JPanel panel_6 = new JPanel();

		JPanel panel_7 = new JPanel();

		JPanel panel_8 = new JPanel();
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout
				.setHorizontalGroup(groupLayout
						.createParallelGroup(Alignment.LEADING)
						.addGroup(
								groupLayout
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												groupLayout
														.createParallelGroup(
																Alignment.LEADING)
														.addGroup(
																groupLayout
																		.createSequentialGroup()
																		.addGroup(
																				groupLayout
																						.createParallelGroup(
																								Alignment.TRAILING)
																						.addComponent(
																								panel_3,
																								GroupLayout.DEFAULT_SIZE,
																								111,
																								Short.MAX_VALUE)
																						.addComponent(
																								panel,
																								GroupLayout.DEFAULT_SIZE,
																								111,
																								Short.MAX_VALUE))
																		.addPreferredGap(
																				ComponentPlacement.UNRELATED)
																		.addGroup(
																				groupLayout
																						.createParallelGroup(
																								Alignment.LEADING)
																						.addComponent(
																								panel_4,
																								GroupLayout.DEFAULT_SIZE,
																								111,
																								Short.MAX_VALUE)
																						.addComponent(
																								panel_1,
																								GroupLayout.DEFAULT_SIZE,
																								111,
																								Short.MAX_VALUE))
																		.addPreferredGap(
																				ComponentPlacement.UNRELATED)
																		.addGroup(
																				groupLayout
																						.createParallelGroup(
																								Alignment.LEADING)
																						.addComponent(
																								panel_5,
																								GroupLayout.PREFERRED_SIZE,
																								0,
																								Short.MAX_VALUE)
																						.addComponent(
																								panel_2,
																								GroupLayout.DEFAULT_SIZE,
																								112,
																								Short.MAX_VALUE)))
														.addGroup(
																groupLayout
																		.createSequentialGroup()
																		.addComponent(
																				panel_6,
																				GroupLayout.DEFAULT_SIZE,
																				112,
																				Short.MAX_VALUE)
																		.addPreferredGap(
																				ComponentPlacement.UNRELATED)
																		.addComponent(
																				panel_7,
																				GroupLayout.DEFAULT_SIZE,
																				112,
																				Short.MAX_VALUE)
																		.addPreferredGap(
																				ComponentPlacement.UNRELATED)
																		.addComponent(
																				panel_8,
																				GroupLayout.PREFERRED_SIZE,
																				110,
																				Short.MAX_VALUE)))
										.addGap(4)));
		groupLayout
				.setVerticalGroup(groupLayout
						.createParallelGroup(Alignment.LEADING)
						.addGroup(
								groupLayout
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												groupLayout
														.createParallelGroup(
																Alignment.TRAILING)
														.addComponent(
																panel_2,
																Alignment.LEADING,
																GroupLayout.DEFAULT_SIZE,
																107,
																Short.MAX_VALUE)
														.addComponent(
																panel_1,
																Alignment.LEADING,
																GroupLayout.DEFAULT_SIZE,
																107,
																Short.MAX_VALUE)
														.addComponent(
																panel,
																Alignment.LEADING,
																GroupLayout.DEFAULT_SIZE,
																107,
																Short.MAX_VALUE))
										.addPreferredGap(
												ComponentPlacement.UNRELATED)
										.addGroup(
												groupLayout
														.createParallelGroup(
																Alignment.LEADING)
														.addComponent(
																panel_5,
																GroupLayout.PREFERRED_SIZE,
																104,
																Short.MAX_VALUE)
														.addComponent(panel_3,
																0, 0,
																Short.MAX_VALUE)
														.addComponent(panel_4,
																0, 0,
																Short.MAX_VALUE))
										.addPreferredGap(
												ComponentPlacement.UNRELATED)
										.addGroup(
												groupLayout
														.createParallelGroup(
																Alignment.LEADING)
														.addComponent(
																panel_8,
																GroupLayout.PREFERRED_SIZE,
																104,
																Short.MAX_VALUE)
														.addComponent(
																panel_7,
																GroupLayout.PREFERRED_SIZE,
																104,
																Short.MAX_VALUE)
														.addComponent(
																panel_6,
																Alignment.TRAILING,
																GroupLayout.PREFERRED_SIZE,
																104,
																Short.MAX_VALUE))
										.addGap(5)));
		panel_6.setLayout(new CardLayout(0, 0));
		panel_6.add(new Imagem_Label(), "Imagem");
		panel_7.setLayout(new CardLayout(0, 0));
		panel_7.add(new Imagem_Label(), "Imagem");
		panel_8.setLayout(new CardLayout(0, 0));
		panel_8.add(new Imagem_Label(), "Imagem");
		panel_5.setLayout(new CardLayout(0, 0));
		panel_5.add(new Imagem_Label(), "Imagem");
		panel_4.setLayout(new CardLayout(0, 0));
		panel_4.add(new Imagem_Label(), "Imagem");
		panel_3.setLayout(new CardLayout(0, 0));
		panel_3.add(new Imagem_Label(), "Imagem");

		panel_2.setLayout(new CardLayout(0, 0));
		panel_2.add(new Imagem_Label(), "Imagem");

		panel_1.setLayout(new CardLayout(0, 0));
		panel_1.add(new Imagem_Label(), "Imagem");

		panel.setLayout(new CardLayout(0, 0));
		panel.add(new Imagem_Label(), "Imagem");

		setLayout(groupLayout);

	}
}
