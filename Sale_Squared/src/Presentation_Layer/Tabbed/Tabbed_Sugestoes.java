package Presentation_Layer.Tabbed;

import java.awt.CardLayout;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

import Presentation_Layer.Sale_Squared;
import Presentation_Layer.Componentes.Produtos_Coluna;


public class Tabbed_Sugestoes extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public Tabbed_Sugestoes(final Sale_Squared root) {

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(
				Alignment.LEADING).addGroup(
				groupLayout
						.createSequentialGroup()
						.addContainerGap()
						.addComponent(tabbedPane, GroupLayout.DEFAULT_SIZE,
								438, Short.MAX_VALUE).addContainerGap()));
		groupLayout.setVerticalGroup(groupLayout.createParallelGroup(
				Alignment.LEADING).addGroup(
				Alignment.TRAILING,
				groupLayout
						.createSequentialGroup()
						.addContainerGap()
						.addComponent(tabbedPane, GroupLayout.DEFAULT_SIZE,
								288, Short.MAX_VALUE).addContainerGap()));

		JPanel panel = new JPanel();
		tabbedPane.addTab("Do Vendedor", null, panel, null);
		panel.setLayout(new CardLayout(0, 0));
		panel.add(new Produtos_Coluna(root), "Do vendedor");

		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Veja tamb�m", null, panel_1, null);
		panel_1.setLayout(new CardLayout(0, 0));
		panel_1.add(new Produtos_Coluna(root), "Veja tambem");
		setLayout(groupLayout);

	}
}
