package Presentation_Layer;

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Cursor;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.CardLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

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
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(pesquisa, GroupLayout.DEFAULT_SIZE, 612, Short.MAX_VALUE)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(button)
							.addPreferredGap(ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
							.addComponent(panel, GroupLayout.PREFERRED_SIZE, 309, GroupLayout.PREFERRED_SIZE)))
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
					.addComponent(pesquisa, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(10, Short.MAX_VALUE))
		);
		panel.setLayout(new CardLayout(0, 0));
		pesquisa.setLayout(new CardLayout(0, 0));
		JPanel pesquisa_bar = new Barra_Pesquisa();
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
