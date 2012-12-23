package Interface;

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTabbedPane;

public class Tabbed_Produtos extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public Tabbed_Produtos() {
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(tabbedPane, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 743, Short.MAX_VALUE)
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(tabbedPane, GroupLayout.DEFAULT_SIZE, 560, Short.MAX_VALUE)
		);
		
		JPanel panel = new Produtos_Coluna();
		tabbedPane.addTab("Últimos Anúncios", null, panel, null);
		
		JPanel panel_1 = new Produtos_Coluna();
		tabbedPane.addTab("Negócios a Fechar", null, panel_1, null);
		
		JPanel panel_2 = new Produtos_Coluna();
		tabbedPane.addTab("Sugestões", null, panel_2, null);
		setLayout(groupLayout);

	}

}
