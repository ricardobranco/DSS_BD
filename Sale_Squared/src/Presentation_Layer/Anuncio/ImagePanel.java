package Presentation_Layer.Anuncio;

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
        
        public void setImage(Image image){
            Avatar av = new Avatar(image);
            av.setHeight(imageView.getHeight());
            av.setWidth(imageView.getWidth());
            imageView.setImage(av.getImage());    
        } 
        
        
}