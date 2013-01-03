package Presentation_Layer.Header;

import java.awt.CardLayout;
import java.awt.Cursor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.LayoutStyle.ComponentPlacement;

import Presentation_Layer.Sale_Squared;
import Presentation_Layer.Home.Home;

public class Header extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public Header(final Sale_Squared root) {
		setBorder(null);
		
		JButton button = new JButton("");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				root.reloadHeader();
				root.setBody(new Home(root),"Home");
			}
		});
		button.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button.setBorderPainted(false);
		button.setBorder(null);
		button.setIcon(new ImageIcon(Header.class.getResource("/Imagens/header.png")));
		
		JPanel panel = new JPanel();
		
		JPanel pesquisa = new JPanel();
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(pesquisa, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 591, Short.MAX_VALUE)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(button)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(panel, GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE)))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(button)
						.addComponent(panel, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(pesquisa, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(98, Short.MAX_VALUE))
		);
		panel.setLayout(new CardLayout(0, 0));
		pesquisa.setLayout(new CardLayout(0, 0));
		JPanel pesquisa_bar = new Barra_Pesquisa(root);
		if(Sale_Squared.REGISTADO){
			Registado_Panel rp = new Registado_Panel(root);
			panel.add(rp,"Registado Panel");
			}
		else
		{
			Visitante_Panel vp = new Visitante_Panel(root);
			panel.add(vp,"Visitante Panel");
			
		}
		pesquisa.add(pesquisa_bar,"Barra de Pesquisa");
		setLayout(groupLayout);
		}
	
}
