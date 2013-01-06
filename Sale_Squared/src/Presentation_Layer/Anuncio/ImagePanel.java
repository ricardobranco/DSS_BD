package Presentation_Layer.Anuncio;

import java.awt.Toolkit;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JPanel;

import org.jdesktop.swingx.JXImageView;

public class ImagePanel extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/** Creates a new instance of ImagePanel */
	public ImagePanel() {

		JXImageView imageView = new JXImageView();
		imageView.setImage(Toolkit.getDefaultToolkit().getImage(
				ImagePanel.class.getResource("/Imagens/header.png")));
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
}