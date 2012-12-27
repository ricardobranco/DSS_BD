package Presentation_Layer;

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.CardLayout;

public class Registo_1_2 extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public Registo_1_2() {
		
		JPanel panel = new JPanel();
		
		JPanel panel_1 = new JPanel();
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(panel_1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 723, Short.MAX_VALUE)
						.addComponent(panel, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 723, Short.MAX_VALUE))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 357, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(40, Short.MAX_VALUE))
		);
		panel_1.setLayout(new CardLayout(0, 0));
		panel.setLayout(new CardLayout(0, 0));
		panel.add(new Registo_1(),"Dados Base");
		panel_1.add(new Registo_2(),"Dados Pessoais");
		setLayout(groupLayout);

	}

}
