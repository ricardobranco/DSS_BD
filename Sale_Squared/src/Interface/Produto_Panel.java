package Interface;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JPanel;
import javax.swing.LayoutStyle.ComponentPlacement;

public class Produto_Panel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Create the panel.
	 */
	public Produto_Panel() {
		
		JPanel panel = new Produtos_Coluna();
		
		Produtos_Coluna produtos_Coluna = new Produtos_Coluna();
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(2)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 224, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(produtos_Coluna, GroupLayout.PREFERRED_SIZE, 222, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(panel, GroupLayout.PREFERRED_SIZE, 481, Short.MAX_VALUE)
						.addComponent(produtos_Coluna, GroupLayout.PREFERRED_SIZE, 481, Short.MAX_VALUE))
					.addGap(1))
		);
		setLayout(groupLayout);

	}
}
