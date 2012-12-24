package Interface;

import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.Window;
import java.lang.reflect.Method;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.CardLayout;

public class Sale_Squared extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static final int VISITANTE = 0;
	public static final int REGISTADO = 1;
	public static int ESTADO = VISITANTE;
	
	private static final String OS = System.getProperty("os.name").toLowerCase();

	private final JPanel panel_1 = new JPanel();
	

	

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
		setBounds(100, 100, 806, 621);
		
		JPanel panel = new Header(this);
		
		JScrollPane scrollPane = new JScrollPane();
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addGap(6)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(scrollPane, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 794, Short.MAX_VALUE)
						.addComponent(panel, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 794, Short.MAX_VALUE))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 195, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 385, Short.MAX_VALUE)
					.addGap(7))
		);
		
		JPanel home = new Home(this);
		setBody(home,"Home");
		
	
		
		
		scrollPane.setViewportView(panel_1);
		panel_1.setLayout(new CardLayout(0, 0));
		panel_1.add(home, "Home");
		getContentPane().setLayout(groupLayout);
		
		
		
	}
	
	public JPanel getJpanel_1() {
		return panel_1;
	}
	
	public void setBody(JPanel jp , String nome){
		panel_1.removeAll();
		panel_1.add(jp,nome);
		panel_1.updateUI();
		panel_1.validate();
		
		
	}
}
