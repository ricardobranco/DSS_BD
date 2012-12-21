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
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.ScrollPaneConstants;

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
		setBounds(100, 100, 949, 753);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		

		JPanel panel_6 = new Header(this);
		
		JPanel panel = new JPanel();
		
		JPanel panel_1 = new Pesquisa_Bar();
		
		
		JPanel panel_2 = new Home_Categorias();
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		
		JPanel panel_3 = new Home_Product_Panel();
		tabbedPane.addTab("New tab", null, panel_3, null);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(30)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(tabbedPane, GroupLayout.DEFAULT_SIZE, 843, Short.MAX_VALUE)
							.addGap(36))
						.addGroup(gl_panel.createSequentialGroup()
							.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
								.addComponent(panel_2, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 873, Short.MAX_VALUE)
								.addComponent(panel_1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 873, Short.MAX_VALUE))
							.addGap(36))))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 212, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(tabbedPane, GroupLayout.DEFAULT_SIZE, 357, Short.MAX_VALUE)
					.addGap(0))
		);
		panel.setLayout(gl_panel);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addComponent(panel, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 939, Short.MAX_VALUE)
						.addComponent(panel_6, GroupLayout.DEFAULT_SIZE, 939, Short.MAX_VALUE))
					.addGap(0))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(panel_6, GroupLayout.PREFERRED_SIZE, 107, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 610, GroupLayout.PREFERRED_SIZE)
					.addGap(43))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
