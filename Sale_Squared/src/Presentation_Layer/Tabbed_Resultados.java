package Presentation_Layer;

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTabbedPane;
import java.awt.CardLayout;

public class Tabbed_Resultados extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public Tabbed_Resultados(final Sale_Squared root) {
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(tabbedPane, GroupLayout.DEFAULT_SIZE, 438, Short.MAX_VALUE)
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(tabbedPane, GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
					.addContainerGap())
		);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Todos", null, panel, null);
		panel.setLayout(new CardLayout(0, 0));
		panel.add(new Resultados_Panel(root),"Todos");
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Leil›es", null, panel_1, null);
		panel_1.setLayout(new CardLayout(0, 0));
		panel_1.add(new Resultados_Panel(root),"Leil›es");
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("Comprar J‡", null, panel_2, null);
		panel_2.setLayout(new CardLayout(0, 0));
		panel_2.add(new Resultados_Panel(root),"Comprar");
		setLayout(groupLayout);

	}

}
