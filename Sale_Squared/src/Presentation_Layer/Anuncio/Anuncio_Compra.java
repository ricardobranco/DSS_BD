package Presentation_Layer.Anuncio;

import Business_Layer.Anuncio;
import Business_Layer.AnuncioVenda;
import Business_Layer.VendaDirecta;
import Presentation_Layer.Sale_Squared;
import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;

public class Anuncio_Compra extends JPanel {

	/**
	 * Create the panel.
	 */
	public Anuncio_Compra(final Sale_Squared root, AnuncioVenda anuncio) {
		
            
            
                VendaDirecta vd = (VendaDirecta) anuncio.getTipoVenda();
		JLabel label = new JLabel("Preço:");
		label.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		
		JLabel label_1 = new JLabel("€ "+vd.getPreco());
		label_1.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		
		JButton button = new JButton("Comprar");
		
		JLabel label_2 = new JLabel("Este utilizador "+(anuncio.getPossivelTrocar()?"":"não ")+"aceita trocas");
		label_2.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(label, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(label_1, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(button, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(58)
							.addComponent(label_2, GroupLayout.PREFERRED_SIZE, 136, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(201, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(5)
							.addComponent(label))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(3)
							.addComponent(label_1, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE))
						.addComponent(button))
					.addGap(3)
					.addComponent(label_2, GroupLayout.PREFERRED_SIZE, 13, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(249, Short.MAX_VALUE))
		);
		setLayout(groupLayout);

	}
}
