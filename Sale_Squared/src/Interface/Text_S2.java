package Interface;

import java.awt.Font;

import javax.swing.JLabel;

public class Text_S2 {
	
	
	
	public static Font fontBold(JLabel jl){
		return new Font(jl.getFont().getName(),Font.BOLD,jl.getFont().getSize());
	}
	
	
	public static Font fontNormal(JLabel jl){
		return new Font(jl.getFont().getName(),Font.PLAIN,jl.getFont().getSize());
	}

}
