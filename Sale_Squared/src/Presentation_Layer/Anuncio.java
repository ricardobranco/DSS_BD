package Presentation_Layer;

import java.awt.CardLayout;
import java.awt.Font;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.LayoutStyle.ComponentPlacement;

public class Anuncio extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public Anuncio(final Sale_Squared root) {
		
		JLabel lblNewLabel = new JLabel("Titulo do Neg\u00F3cio");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.BOLD, 35));
		
		JPanel panel = new JPanel();
		
		JPanel panel_1 = new JPanel();
		
		JPanel panel_2 = new JPanel();
		
		JPanel panel_3 = new JPanel();
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(22)
							.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 903, Short.MAX_VALUE))
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(panel_3, GroupLayout.DEFAULT_SIZE, 496, Short.MAX_VALUE)
								.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(panel, GroupLayout.PREFERRED_SIZE, 436, Short.MAX_VALUE)
								.addComponent(panel_2, GroupLayout.DEFAULT_SIZE, 423, Short.MAX_VALUE))))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(24)
					.addComponent(lblNewLabel)
					.addGap(6)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(panel_3, GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 408, Short.MAX_VALUE))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(panel, GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(panel_2, GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)))
					.addGap(15))
		);
		panel_2.setLayout(new CardLayout(0, 0));
		panel_2.add(new Tabbed_Sugestoes(root),"Mais sugestoes");
		
		panel_3.setLayout(new CardLayout(0, 0));
		panel_3.add(new Imagem_Panel(),"Imagem");
		panel_1.setLayout(new CardLayout(0, 0));
		panel_1.add(new Tabbed_Anuncio(),"Info");
		panel.setLayout(new CardLayout(0, 0));
		panel.add(new Anuncio_Compra(),"Compra");
		setLayout(groupLayout);

	}
}
