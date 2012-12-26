package Presentation_Layer;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Imagem_Main extends JPanel {
	
	private static final long serialVersionUID = 1L;
	public static ImageIcon IMAGEM = new ImageIcon(Imagem_Main.class.getResource("/Imagens/header.png"));

	/**
	 * Create the panel.
	 */
	
	
	public Imagem_Main() {
		
		JLabel lblNewLabel = new JLabel("\n");
		lblNewLabel.setIcon(new ImageIcon(Imagem_Main.class.getResource("/Imagens/header.png")));
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 287, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(211, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
					.addContainerGap())
		);
		setLayout(groupLayout);
		}
	
	
	

}

