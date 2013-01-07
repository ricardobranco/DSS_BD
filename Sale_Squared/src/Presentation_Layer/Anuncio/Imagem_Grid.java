package Presentation_Layer.Anuncio;

import Business_Layer.Imagem;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JPanel;
import javax.swing.LayoutStyle.ComponentPlacement;

public class Imagem_Grid extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public Imagem_Grid(List<Imagem> imagens, ImagePanel ip) {

		List<JPanel> jpanels = new ArrayList<>();
                
            
                JPanel panel = new JPanel();
                JPanel panel_1 = new JPanel();
                JPanel panel_2 = new JPanel();
                JPanel panel_3 = new JPanel();
                JPanel panel_4 = new JPanel();
                JPanel panel_5 = new JPanel();
                JPanel panel_6 = new JPanel();
                JPanel panel_7 = new JPanel();
                JPanel panel_8 = new JPanel();
		
                jpanels.add(panel);
                jpanels.add(panel_1);
                jpanels.add(panel_2);
                jpanels.add(panel_3);
                jpanels.add(panel_4);
                jpanels.add(panel_5);
                jpanels.add(panel_6);
                jpanels.add(panel_7);
                jpanels.add(panel_8);
                
                
                for(JPanel j : jpanels)
                    j.setVisible(false);
                
                
                
                
                
                
                GroupLayout groupLayout = new GroupLayout(this);
		groupLayout
				.setHorizontalGroup(groupLayout
						.createParallelGroup(Alignment.LEADING)
						.addGroup(
								groupLayout
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												groupLayout
														.createParallelGroup(
																Alignment.LEADING)
														.addGroup(
																groupLayout
																		.createSequentialGroup()
																		.addGroup(
																				groupLayout
																						.createParallelGroup(
																								Alignment.TRAILING)
																						.addComponent(
																								panel_3,
																								GroupLayout.DEFAULT_SIZE,
																								111,
																								Short.MAX_VALUE)
																						.addComponent(
																								panel,
																								GroupLayout.DEFAULT_SIZE,
																								111,
																								Short.MAX_VALUE))
																		.addPreferredGap(
																				ComponentPlacement.UNRELATED)
																		.addGroup(
																				groupLayout
																						.createParallelGroup(
																								Alignment.LEADING)
																						.addComponent(
																								panel_4,
																								GroupLayout.DEFAULT_SIZE,
																								111,
																								Short.MAX_VALUE)
																						.addComponent(
																								panel_1,
																								GroupLayout.DEFAULT_SIZE,
																								111,
																								Short.MAX_VALUE))
																		.addPreferredGap(
																				ComponentPlacement.UNRELATED)
																		.addGroup(
																				groupLayout
																						.createParallelGroup(
																								Alignment.LEADING)
																						.addComponent(
																								panel_5,
																								GroupLayout.PREFERRED_SIZE,
																								0,
																								Short.MAX_VALUE)
																						.addComponent(
																								panel_2,
																								GroupLayout.DEFAULT_SIZE,
																								112,
																								Short.MAX_VALUE)))
														.addGroup(
																groupLayout
																		.createSequentialGroup()
																		.addComponent(
																				panel_6,
																				GroupLayout.DEFAULT_SIZE,
																				112,
																				Short.MAX_VALUE)
																		.addPreferredGap(
																				ComponentPlacement.UNRELATED)
																		.addComponent(
																				panel_7,
																				GroupLayout.DEFAULT_SIZE,
																				112,
																				Short.MAX_VALUE)
																		.addPreferredGap(
																				ComponentPlacement.UNRELATED)
																		.addComponent(
																				panel_8,
																				GroupLayout.PREFERRED_SIZE,
																				110,
																				Short.MAX_VALUE)))
										.addGap(4)));
		groupLayout
				.setVerticalGroup(groupLayout
						.createParallelGroup(Alignment.LEADING)
						.addGroup(
								groupLayout
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												groupLayout
														.createParallelGroup(
																Alignment.TRAILING)
														.addComponent(
																panel_2,
																Alignment.LEADING,
																GroupLayout.DEFAULT_SIZE,
																107,
																Short.MAX_VALUE)
														.addComponent(
																panel_1,
																Alignment.LEADING,
																GroupLayout.DEFAULT_SIZE,
																107,
																Short.MAX_VALUE)
														.addComponent(
																panel,
																Alignment.LEADING,
																GroupLayout.DEFAULT_SIZE,
																107,
																Short.MAX_VALUE))
										.addPreferredGap(
												ComponentPlacement.UNRELATED)
										.addGroup(
												groupLayout
														.createParallelGroup(
																Alignment.LEADING)
														.addComponent(
																panel_5,
																GroupLayout.PREFERRED_SIZE,
																104,
																Short.MAX_VALUE)
														.addComponent(panel_3,
																0, 0,
																Short.MAX_VALUE)
														.addComponent(panel_4,
																0, 0,
																Short.MAX_VALUE))
										.addPreferredGap(
												ComponentPlacement.UNRELATED)
										.addGroup(
												groupLayout
														.createParallelGroup(
																Alignment.LEADING)
														.addComponent(
																panel_8,
																GroupLayout.PREFERRED_SIZE,
																104,
																Short.MAX_VALUE)
														.addComponent(
																panel_7,
																GroupLayout.PREFERRED_SIZE,
																104,
																Short.MAX_VALUE)
														.addComponent(
																panel_6,
																Alignment.TRAILING,
																GroupLayout.PREFERRED_SIZE,
																104,
																Short.MAX_VALUE))
										.addGap(5)));
		for(int i = 0;i<imagens.size();i++){
                 jpanels.get(i).add(new Imagem_Label(imagens.get(i), ip),""+i);
                 jpanels.get(i).setVisible(true);
                }

		setLayout(groupLayout);

	}

    
}
