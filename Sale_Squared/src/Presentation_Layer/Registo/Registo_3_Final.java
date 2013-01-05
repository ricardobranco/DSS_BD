package Presentation_Layer.Registo;

import java.awt.CardLayout;
import java.util.HashMap;
import java.util.Map;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JPanel;
import javax.swing.LayoutStyle.ComponentPlacement;

import Presentation_Layer.Sale_Squared;

public class Registo_3_Final extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static final int CATEGORIAS = 3;
	public static final int TERMS = 4;
	
	
	private Map<Integer,JPanel> jpanels;


	/**
	 * Create the panel.
	 */
	public Registo_3_Final(final Sale_Squared root) {

		
		
		jpanels = new HashMap<>();
		Registo_3 r3 = new Registo_3();
		Registo_Final rf = new Registo_Final(root);
		
		jpanels.put(new Integer(CATEGORIAS),r3);
		jpanels.put(new Integer(TERMS),rf);
		
		
		
		JPanel panel = new JPanel();

		JPanel panel_1 = new JPanel();
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout
				.setHorizontalGroup(groupLayout
						.createParallelGroup(Alignment.TRAILING)
						.addGroup(
								groupLayout
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												groupLayout
														.createParallelGroup(
																Alignment.TRAILING)
														.addComponent(
																panel_1,
																Alignment.LEADING,
																GroupLayout.DEFAULT_SIZE,
																635,
																Short.MAX_VALUE)
														.addComponent(
																panel,
																Alignment.LEADING,
																GroupLayout.DEFAULT_SIZE,
																635,
																Short.MAX_VALUE))
										.addContainerGap()));
		groupLayout.setVerticalGroup(groupLayout.createParallelGroup(
				Alignment.LEADING).addGroup(
				groupLayout
						.createSequentialGroup()
						.addContainerGap()
						.addComponent(panel, GroupLayout.PREFERRED_SIZE, 170,
								GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 112,
								GroupLayout.PREFERRED_SIZE)
						.addContainerGap(GroupLayout.DEFAULT_SIZE,
								Short.MAX_VALUE)));
		panel_1.setLayout(new CardLayout(0, 0));
		panel.setLayout(new CardLayout(0, 0));
		panel.add(jpanels.get(new Integer(CATEGORIAS)), "Favoritos");
		panel_1.add(jpanels.get(new Integer(TERMS)), "Final");
		setLayout(groupLayout);

	}


	public JPanel get(int key) {
		return jpanels.get(key);
	}
	
	

}
