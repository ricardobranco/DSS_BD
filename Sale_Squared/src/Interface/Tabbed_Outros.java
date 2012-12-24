package Interface;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTabbedPane;

public class Tabbed_Outros extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public Tabbed_Outros(JFrame jf) {
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(tabbedPane, GroupLayout.DEFAULT_SIZE, 454, Short.MAX_VALUE)
					.addGap(1))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(tabbedPane, GroupLayout.DEFAULT_SIZE, 304, Short.MAX_VALUE)
					.addGap(1))
		);
		
		JPanel panel = new Top_Produtos();
		tabbedPane.addTab("Mais Procurados", null, panel, null);
		
		JPanel panel_1 = new Utilizadores_Coluna();
		JPanel panel_2 = new Produtos_Coluna(jf);
		if(Sale_Squared.ESTADO == Sale_Squared.REGISTADO){
			tabbedPane.addTab("Utilizadores Vigiados", null, panel_1, null);
			tabbedPane.addTab("Negócios Vigiados", null, panel_2, null);
			}
		setLayout(groupLayout);

	}
}
