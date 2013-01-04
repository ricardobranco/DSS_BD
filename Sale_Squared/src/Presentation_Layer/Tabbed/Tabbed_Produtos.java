package Presentation_Layer.Tabbed;

import java.awt.CardLayout;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

import Presentation_Layer.Sale_Squared;
import Presentation_Layer.Componentes.Produtos_Coluna;

public class Tabbed_Produtos extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public Tabbed_Produtos(final Sale_Squared root) {

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);

		JPanel panel = new JPanel();
		tabbedPane.addTab("Últimos Negócios", null, panel, null);
		panel.add(new Produtos_Coluna(root), "Ultimos Negócios");
		panel.setLayout(new CardLayout(0, 0));

		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Negócios a Fechar", null, panel_1, null);
		panel_1.add(new Produtos_Coluna(root), "Ultimos Negócios");
		panel_1.setLayout(new CardLayout(0, 0));

		if (Sale_Squared.REGISTADO) {
			JPanel panel_2 = new JPanel();
			tabbedPane.addTab("Sugestões", null, panel_2, null);
			panel_2.add(new Produtos_Coluna(root), "Ultimos Negócios");
			panel_2.setLayout(new CardLayout(0, 0));
		}

		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(
				Alignment.LEADING).addComponent(tabbedPane,
				GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE));
		groupLayout.setVerticalGroup(groupLayout.createParallelGroup(
				Alignment.LEADING).addGroup(
				groupLayout
						.createSequentialGroup()
						.addComponent(tabbedPane, GroupLayout.PREFERRED_SIZE,
								485, Short.MAX_VALUE).addContainerGap()));
		setLayout(groupLayout);

	}
}
