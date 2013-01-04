package Presentation_Layer.Componentes;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.Icon;

public class Avatar implements Icon {
	int width, height;
	Image image;

	public Avatar(Image image) {
		this.image = image;

		this.height = 100;
		this.width = 100;

	}

	public int getIconHeight() {
		return height;
	}

	public int getIconWidth() {
		return width;
	}

	public void paintIcon(Component c, Graphics g, int x, int y) {
		g.drawImage(image, x, y, width, height, c);
	}
	
	public Image getImage(){return image;}
}