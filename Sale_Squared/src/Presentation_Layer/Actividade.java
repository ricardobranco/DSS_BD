package Presentation_Layer;

import java.awt.CardLayout;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JPanel;
import javax.swing.LayoutStyle.ComponentPlacement;

import org.jdesktop.swingx.JXTaskPane;

public class Actividade extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public Actividade() {
		
		JXTaskPane taskPane = new JXTaskPane();
		taskPane.setCollapsed(true);
		taskPane.setTitle("Licitações");
		
		JXTaskPane taskPane_1 = new JXTaskPane();
		taskPane_1.setCollapsed(true);
		taskPane_1.setTitle("Vendas");
		
		JXTaskPane taskPane_2 = new JXTaskPane();
		taskPane_2.setCollapsed(true);
		taskPane_2.setTitle("Compras");
		
		JXTaskPane taskPane_3 = new JXTaskPane();
		taskPane_3.setCollapsed(true);
		taskPane_3.setTitle("Negócios Seguidos");
		
		JXTaskPane taskPane_4 = new JXTaskPane();
		taskPane_4.setCollapsed(true);
		taskPane_4.setTitle("Utilizadores Seguidos");
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(taskPane_1, GroupLayout.DEFAULT_SIZE, 741, Short.MAX_VALUE)
						.addComponent(taskPane, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(taskPane_2, GroupLayout.DEFAULT_SIZE, 741, Short.MAX_VALUE)
						.addComponent(taskPane_3, GroupLayout.DEFAULT_SIZE, 741, Short.MAX_VALUE)
						.addComponent(taskPane_4, GroupLayout.DEFAULT_SIZE, 741, Short.MAX_VALUE))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(taskPane, GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(taskPane_1, GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(taskPane_2, GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(taskPane_3, GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(taskPane_4, GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
					.addGap(7))
		);
		taskPane_2.getContentPane().setLayout(new CardLayout(0, 0));
		taskPane_1.getContentPane().setLayout(new CardLayout(0, 0));
		taskPane_4.getContentPane().setLayout(new CardLayout(0, 0));
		taskPane_3.getContentPane().setLayout(new CardLayout(0, 0));
		taskPane.getContentPane().setLayout(new CardLayout(0, 0));
		setLayout(groupLayout);
		}
	
}
