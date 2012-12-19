package Interface;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JLabel;

public class Mouse_S2 {
	
	
	public static void mouseINOUT(final JLabel jl){
		jl.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				jl.setFont(Text_S2.fontBold(jl));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				jl.setFont(Text_S2.fontNormal(jl));

			}
		});
		
	}
	
	
	

}
