package Interface;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Produtos_Coluna extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public Produtos_Coluna(JFrame jf) {
		
		JPanel panel = new Produto_Base(jf);
		
		JPanel panel_1 = new Produto_Base(jf);
		
		JPanel panel_2 = new Produto_Base(jf);
		
		JPanel panel_3 = new Produto_Base(jf);
		
		JPanel panel_4 = new Produto_Base(jf);
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(panel_4, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 455, Short.MAX_VALUE)
						.addComponent(panel_3, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 455, Short.MAX_VALUE)
						.addComponent(panel_2, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 455, Short.MAX_VALUE)
						.addComponent(panel_1, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 455, Short.MAX_VALUE)
						.addComponent(panel, GroupLayout.DEFAULT_SIZE, 455, Short.MAX_VALUE))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(3)
					.addComponent(panel, GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
					.addGap(7)
					.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
					.addGap(7)
					.addComponent(panel_2, GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
					.addGap(7)
					.addComponent(panel_3, GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
					.addGap(7)
					.addComponent(panel_4, GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
					.addGap(4))
		);
		setLayout(groupLayout);

	}
}
