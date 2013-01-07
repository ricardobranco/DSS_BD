package Presentation_Layer.Anuncio;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

import Business_Layer.Imagem;
import Presentation_Layer.Componentes.Avatar;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Imagem_Label extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public Imagem_Label(Imagem i, final ImagePanel ip) {

		JButton button = new JButton("");
		ImageIcon icon = new ImageIcon(i.getPath());
                final Image img = icon.getImage();
                
                button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                            ip.setImage(img);
			}
		});
		Avatar av = new Avatar(img);
		av.setHeight(button.getHeight());
                av.setWidth(button.getWidth());
		button.setIcon(av);
                
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(button, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(9, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(button, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(9, Short.MAX_VALUE))
		);
		setLayout(groupLayout);

	}

}
