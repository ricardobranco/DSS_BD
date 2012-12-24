package Interface;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.ImageIcon;
import java.awt.Cursor;
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
	public Header(final JFrame jf) {
		
		
		JPanel panel = new JPanel();
		if(Sale_Squared.ESTADO==Sale_Squared.REGISTADO)
			panel = new Registado_Panel();
		else
			panel = new Visitante_Panel(jf);
		
		JPanel panel_1 = new Pesquisa_Bar();
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				((Sale_Squared) jf).setBody(new Home(jf),"Home");
			}
		});
		btnNewButton.setBorderPainted(false);
		btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.setIcon(new ImageIcon(Header.class.getResource("/Imagens/header.png")));
			
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(btnNewButton)
							.addPreferredGap(ComponentPlacement.RELATED, 123, Short.MAX_VALUE)
							.addComponent(panel, GroupLayout.PREFERRED_SIZE, 526, GroupLayout.PREFERRED_SIZE))
						.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
							.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 919, Short.MAX_VALUE)
							.addGap(6))))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(panel, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE))
		);
		setLayout(groupLayout);

	}
}
