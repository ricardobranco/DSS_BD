package Presentation_Layer;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;

public class Image_Resize {
	
	int width, height;    
    Image image;    

    public Image_Resize(Image image,int h, int w) {    
        this.image = image;    
        
        	this.height = h;
        	this.width = w;
         
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
