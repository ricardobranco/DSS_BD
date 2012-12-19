package Interface;

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.LayoutStyle.ComponentPlacement;

public class Header extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	public static final int VISITANTE = 0;
	public static final int REGISTADO = 1;
	public static int ESTADO = Header.VISITANTE;


	/**
	 * Create the panel.
	 */
	public Header() {
		
		JLabel lblNewLabel = new JLabel("\n");
		lblNewLabel.setIcon(new ImageIcon(Header.class.getResource("/Imagens/header.png")));
		
		JPanel panel;
		if(ESTADO==VISITANTE)
			panel = new Visintante_Panel();
		else
			panel = new Registado_Panel();
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(lblNewLabel)
					.addPreferredGap(ComponentPlacement.RELATED, 389, Short.MAX_VALUE)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 264, GroupLayout.PREFERRED_SIZE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel)
						.addComponent(panel, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(7, Short.MAX_VALUE))
		);
		setLayout(groupLayout);

	}
}
