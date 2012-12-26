package Presentation_Layer;

import java.awt.Font;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.ImageIcon;
import java.awt.CardLayout;

public class Anuncio extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public Anuncio() {
		
		JLabel lblNewLabel = new JLabel("Titulo do Neg\u00F3cio");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.BOLD, 35));
		
		JLabel lblNewLabel_1 = new JLabel("\n");
		lblNewLabel_1.setIcon(new ImageIcon(Anuncio.class.getResource("/Imagens/header.png")));
		
		JPanel panel = new JPanel();
		
		JPanel panel_1 = new JPanel();
		
		JPanel panel_2 = new JPanel();
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
							.addGap(22)
							.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 796, Short.MAX_VALUE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
									.addGap(41)
									.addComponent(lblNewLabel_1))
								.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
									.addContainerGap()
									.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(panel, GroupLayout.PREFERRED_SIZE, 414, Short.MAX_VALUE)
								.addComponent(panel_2, GroupLayout.DEFAULT_SIZE, 414, Short.MAX_VALUE))))
					.addGap(20))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addGap(24)
					.addComponent(lblNewLabel)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(67)
							.addComponent(lblNewLabel_1, GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
							.addGap(63)
							.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(6)
							.addComponent(panel, GroupLayout.DEFAULT_SIZE, 417, Short.MAX_VALUE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(panel_2, GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)))
					.addGap(21))
		);
		panel_2.setLayout(new CardLayout(0, 0));
		panel_1.setLayout(new CardLayout(0, 0));
		panel_1.add(new Tabbed_Anuncio(),"Info");
		panel.setLayout(new CardLayout(0, 0));
		panel.add(new Anuncio_Compra(),"Compra");
		setLayout(groupLayout);

	}
}
