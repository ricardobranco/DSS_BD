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
import javax.swing.ScrollPaneConstants;
import javax.swing.border.EmptyBorder;

public class Sale_Squared extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	
	private JPanel contentPane;

	ImageIcon header = new ImageIcon(
			Sale_Squared.class.getResource("/Imagens/header.png"));

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
					enableOSXFullscreen(frame);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
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
		setBounds(100, 100, 946, 621);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
					.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 946, Short.MAX_VALUE)
					.addGap(0))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 596, Short.MAX_VALUE)
					.addGap(0))
		);
		
		JPanel panel = new Header(this);
		scrollPane.setColumnHeaderView(panel);
		
		JPanel panel_1 = new Home();
		scrollPane.setViewportView(panel_1);
		contentPane.setLayout(gl_contentPane);
	}
}
