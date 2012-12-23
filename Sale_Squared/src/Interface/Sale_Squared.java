package Interface;

import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.Window;
import java.lang.reflect.Method;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.ScrollPaneConstants;

public class Sale_Squared extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	ImageIcon header = new ImageIcon(
			Sale_Squared.class.getResource("/Imagens/header.png"));
	private static final String OS = System.getProperty("os.name").toLowerCase();


	double x = 0.3;
	double y = 0.3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sale_Squared frame = new Sale_Squared();
					if(isMac())
						enableOSXFullscreen(frame);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public static boolean isMac() {
		 
		return (OS.indexOf("mac") >= 0);
 
	}

	 public static void enableOSXFullscreen(Window window) {
	        try {
	            Class<?> util = Class.forName("com.apple.eawt.FullScreenUtilities");
	            Class<?> params[] = new Class[]{Window.class, Boolean.TYPE};
	            Method method = util.getMethod("setWindowCanFullScreen", params);
	            method.invoke(util, window, true);
	        } catch (ClassNotFoundException exp) {
	            exp.printStackTrace();
	        } catch (Exception exp) {
	            exp.printStackTrace();
	        }
	    }
	/**
	 * Create the frame.
	 */
	public Sale_Squared() {
		setTitle("Sale Squared - Home");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Sale_Squared.class.getResource("/Imagens/header.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1023, 621);
		
		JPanel panel = new Header(this);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(scrollPane, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 934, Short.MAX_VALUE)
						.addComponent(panel, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 934, Short.MAX_VALUE))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 177, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE)
					.addContainerGap())
		);
		
		JPanel panel_1 = new Home();
		scrollPane.setViewportView(panel_1);
		getContentPane().setLayout(groupLayout);
	}
}
