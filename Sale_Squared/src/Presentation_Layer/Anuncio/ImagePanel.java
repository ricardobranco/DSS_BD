package Presentation_Layer.Anuncio;

import Business_Layer.Imagem;
import Presentation_Layer.Componentes.Avatar;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

import org.jdesktop.swingx.JXImageView;

public class ImagePanel extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
        private JXImageView imageView;
	/** Creates a new instance of ImagePanel */
	public ImagePanel() {

		imageView = new JXImageView();
		imageView.setImage(Toolkit.getDefaultToolkit().getImage(ImagePanel.class.getResource("/Imagens/header.png")));
                
                GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(
				Alignment.LEADING).addGroup(
				groupLayout
						.createSequentialGroup()
						.addContainerGap()
						.addComponent(imageView, GroupLayout.DEFAULT_SIZE, 243,
								Short.MAX_VALUE).addContainerGap()));
		groupLayout.setVerticalGroup(groupLayout.createParallelGroup(
				Alignment.LEADING).addGroup(
				groupLayout
						.createSequentialGroup()
						.addContainerGap()
						.addComponent(imageView, GroupLayout.DEFAULT_SIZE, 109,
								Short.MAX_VALUE).addContainerGap()));
		setLayout(groupLayout);

	}
        
        public void setImage(Imagem imagem){
            
            Avatar av = new Avatar(new ImageIcon(imagem.getPath()).getImage());
            av.setHeight(imageView.getHeight());
            av.setWidth(imageView.getWidth());
            imageView.setImage(av.getImage());    
        }
        
        
        
        
        
}