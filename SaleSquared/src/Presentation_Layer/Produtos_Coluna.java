package Presentation_Layer;

import java.awt.CardLayout;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JPanel;
import javax.swing.LayoutStyle.ComponentPlacement;

public class Produtos_Coluna extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	

	/**
	 * Create the panel.
	 */
	public Produtos_Coluna(final Sale_Squared root) {
		
		
		
		JPanel panel = new JPanel();
		panel.add(new Produto_Base(root,"Produto",true,100,true,50,"2 dias - 14h:34m:23s"), "Produto");
		
		JPanel panel_1 = new JPanel();
		panel_1.add(new Produto_Base(root,"Produto",true,100,true,50,"2 dias - 14h:34m:23s"), "Produto");
		
		JPanel panel_2 = new JPanel();
		panel_2.add(new Produto_Base(root,"Produto",true,100,true,50,"2 dias - 14h:34m:23s"), "Produto");
		
		JPanel panel_3 = new JPanel();
		panel_3.add(new Produto_Base(root,"Produto",true,100,true,50,"2 dias - 14h:34m:23s"), "Produto");
		
		JPanel panel_4 = new JPanel();
		panel_4.add(new Produto_Base(root,"Produto",true,100,true,50,"2 dias - 14h:34m:23s"), "Produto");
		
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(panel_4, GroupLayout.DEFAULT_SIZE, 334, Short.MAX_VALUE)
						.addComponent(panel, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 334, Short.MAX_VALUE)
						.addComponent(panel_1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 334, Short.MAX_VALUE)
						.addComponent(panel_2, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 334, Short.MAX_VALUE)
						.addComponent(panel_3, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 334, Short.MAX_VALUE))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel, GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_2, GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_3, GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_4, GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
					.addContainerGap())
		);
		panel_4.setLayout(new CardLayout(0, 0));
		panel_3.setLayout(new CardLayout(0, 0));
		panel_2.setLayout(new CardLayout(0, 0));
		panel_1.setLayout(new CardLayout(0, 0));
		panel.setLayout(new CardLayout(0, 0));
		
		setLayout(groupLayout);

	}
}
