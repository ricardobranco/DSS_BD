package Presentation_Layer.Componentes;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.Icon;

public class ThumbnailIcon implements Icon {    
    int width, height;    
    Image image;    

    public ThumbnailIcon(Image image, int width) {    
        this.image = image;    
        if(image.getWidth(null) < width){
        	this.height = image.getHeight(null);
        	this.width = image.getWidth(null);
        }
        else{
        	this.width = width;    
        	this.height = (width * image.getHeight(null)) / image.getWidth(null);
        	}    
    }  
      
    public int getIconHeight () {  
        return height;  
    }  
      
    public int getIconWidth () {  
        return width;  
    }  

    public void paintIcon (Component c, Graphics g, int x, int y) {    
        g.drawImage(image, x, y, width, height, c);    
    }    
}    