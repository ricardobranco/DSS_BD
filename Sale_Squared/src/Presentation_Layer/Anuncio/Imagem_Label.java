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
        
        private Imagem imagem;
        private ImagePanel ip;
	public Imagem_Label(final Imagem i, final ImagePanel ip) {
               this.imagem = i;
               this.ip = ip;
		JButton button = new JButton("");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                            setImagem();
			}
		});
                
		Avatar av = new Avatar(new ImageIcon(i.getPath()).getImage());
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
        
        public void setImagem(){
            this.ip.setImage(this.imagem);
        }

}
