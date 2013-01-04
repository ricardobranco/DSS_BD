package Presentation_Layer.Componentes;

import java.awt.CardLayout;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JPanel;
import javax.swing.LayoutStyle.ComponentPlacement;

public class Utilizadores_Coluna extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public Utilizadores_Coluna() {

		JPanel panel = new JPanel();

		JPanel panel_1 = new JPanel();

		JPanel panel_2 = new JPanel();

		JPanel panel_3 = new JPanel();

		JPanel panel_4 = new JPanel();
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout
				.setHorizontalGroup(groupLayout
						.createParallelGroup(Alignment.TRAILING)
						.addGroup(
								groupLayout
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												groupLayout
														.createParallelGroup(
																Alignment.TRAILING)
														.addComponent(
																panel,
																Alignment.LEADING,
																GroupLayout.PREFERRED_SIZE,
																322,
																Short.MAX_VALUE)
														.addComponent(
																panel_1,
																Alignment.LEADING,
																GroupLayout.PREFERRED_SIZE,
																322,
																Short.MAX_VALUE)
														.addComponent(
																panel_4,
																Alignment.LEADING,
																GroupLayout.DEFAULT_SIZE,
																322,
																Short.MAX_VALUE)
														.addComponent(
																panel_3,
																Alignment.LEADING,
																GroupLayout.DEFAULT_SIZE,
																322,
																Short.MAX_VALUE)
														.addComponent(
																panel_2,
																Alignment.LEADING,
																GroupLayout.DEFAULT_SIZE,
																322,
																Short.MAX_VALUE))
										.addContainerGap()));
		groupLayout.setVerticalGroup(groupLayout.createParallelGroup(
				Alignment.TRAILING).addGroup(
				groupLayout
						.createSequentialGroup()
						.addContainerGap()
						.addComponent(panel, GroupLayout.DEFAULT_SIZE, 81,
								Short.MAX_VALUE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 81,
								Short.MAX_VALUE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(panel_2, GroupLayout.DEFAULT_SIZE, 81,
								Short.MAX_VALUE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(panel_3, GroupLayout.DEFAULT_SIZE, 81,
								Short.MAX_VALUE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(panel_4, GroupLayout.DEFAULT_SIZE, 81,
								Short.MAX_VALUE).addGap(2)));
		panel_4.setLayout(new CardLayout(0, 0));
		panel_4.add(new Utilizador_Base(), "User5");
		panel_3.setLayout(new CardLayout(0, 0));
		panel_3.add(new Utilizador_Base(), "User4");
		panel_2.setLayout(new CardLayout(0, 0));
		panel_2.add(new Utilizador_Base(), "User3");
		panel_1.setLayout(new CardLayout(0, 0));
		panel_1.add(new Utilizador_Base(), "User2");
		panel.setLayout(new CardLayout(0, 0));
		panel.add(new Utilizador_Base(), "User1");
		setLayout(groupLayout);

	}
}
