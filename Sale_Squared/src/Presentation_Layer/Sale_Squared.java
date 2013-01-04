package Presentation_Layer;

import java.awt.CardLayout;
import java.awt.EventQueue;
import java.awt.Window;
import java.lang.reflect.Method;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.UIManager;

import Business_Layer.SaleSquared;
import Business_Layer.Utilizador;
import Presentation_Layer.Header.Header;
import Presentation_Layer.Home.Home;

public class Sale_Squared extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static boolean REGISTADO = false;
	public static final String OS = System.getProperty("os.name").toLowerCase();

	private final JPanel panel = new JPanel();
	private final JPanel panel_1 = new JPanel();
	private final JScrollPane scrollPane = new JScrollPane();
	
	
	
	
	private SaleSquared sistema;
	private Utilizador user;    

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					final Sale_Squared frame = new Sale_Squared();
					UIManager.setLookAndFeel(UIManager
							.getSystemLookAndFeelClassName());
					if (isMac()) {
						enableOSXFullscreen(frame);
					}
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
			Class<?> params[] = new Class[] { Window.class, Boolean.TYPE };
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
		this.sistema = new SaleSquared();
		this.user = new Utilizador();
		setTitle("Sale Squared - Home");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1020, 765);

		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout
				.setHorizontalGroup(groupLayout
						.createParallelGroup(Alignment.TRAILING)
						.addGroup(
								groupLayout
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												groupLayout
														.createParallelGroup(
																Alignment.TRAILING)
														.addComponent(
																panel,
																Alignment.LEADING,
																GroupLayout.DEFAULT_SIZE,
																GroupLayout.DEFAULT_SIZE,
																Short.MAX_VALUE)
														.addComponent(
																scrollPane,
																Alignment.LEADING,
																GroupLayout.DEFAULT_SIZE,
																1008,
																Short.MAX_VALUE))
										.addContainerGap()));
		groupLayout.setVerticalGroup(groupLayout.createParallelGroup(
				Alignment.LEADING).addGroup(
				groupLayout
						.createSequentialGroup()
						.addContainerGap()
						.addComponent(panel, GroupLayout.PREFERRED_SIZE, 190,
								GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE,
								344, Short.MAX_VALUE).addContainerGap()));

		scrollPane.setViewportView(panel_1);
		panel_1.setLayout(new CardLayout(0, 0));
		panel.setLayout(new CardLayout(0, 0));
		reloadHeader();
		setBody(new Home(this), "Home");
		getContentPane().setLayout(groupLayout);

	}

	public void reloadHeader() {
		this.panel.removeAll();
		this.panel.add(new Header(this), "Header");
		this.panel.updateUI();
		this.panel.validate();
	}

	public void setBody(JPanel jp, String nome) {
		this.panel_1.removeAll();
		this.panel_1.add(jp, nome);

		this.panel_1.updateUI();
		this.panel_1.validate();
	}
	
	public SaleSquared getSistema(){return sistema;}
	public void setUser(Utilizador user){this.user=user;}
	public Utilizador getUser(){return this.user.clone();}
}
