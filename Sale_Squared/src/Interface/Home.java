package Interface;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

public class Home extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	
	private JPanel contentPane;

	ImageIcon header = new ImageIcon(
			Home.class.getResource("/Imagens/header.png"));

	double x = 0.3;
	double y = 0.3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home frame = new Home();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Home() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 843, 750);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JPanel panel = new JPanel();
		

		JPanel panel_6 = new Header();
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addComponent(panel, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 833, Short.MAX_VALUE)
				.addComponent(panel_6, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 833, Short.MAX_VALUE)
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(panel_6, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGap(11))
		);

		JPanel panel_1 = new JPanel();

		final JLabel lblNewLabel_7 = new JLabel("Carros");
		lblNewLabel_7.setForeground(UIManager.getColor("Button.light"));
		lblNewLabel_7.setFont(new Font(lblNewLabel_7.getFont().getName(),
				lblNewLabel_7.getFont().getStyle(), lblNewLabel_7.getFont().getSize() + 2));
		Mouse_S2.mouseINOUT(lblNewLabel_7);
		
		
		final JLabel lblNewLabel_4 = new JLabel("Casa e Jardim");
		lblNewLabel_4.setForeground(UIManager.getColor("Button.light"));
		lblNewLabel_4.setFont(new Font(lblNewLabel_4.getFont().getName(),
				lblNewLabel_7.getFont().getStyle(), lblNewLabel_4.getFont().getSize() + 2));
		Mouse_S2.mouseINOUT(lblNewLabel_4);
		
		
		final JLabel lblNewLabel_1 = new JLabel("Moda");
		lblNewLabel_1.setForeground(UIManager.getColor("Button.light"));
		lblNewLabel_1.setFont(new Font(lblNewLabel_1.getFont().getName(),
				lblNewLabel_1.getFont().getStyle(), lblNewLabel_1.getFont().getSize() + 2));
		Mouse_S2.mouseINOUT(lblNewLabel_1);
		
		
		final JLabel lblNewLabel_5 = new JLabel("Coleccion\u00E1veis e Arte");
		lblNewLabel_5.setForeground(UIManager.getColor("Button.light"));
		lblNewLabel_5.setFont(new Font(lblNewLabel_5.getFont().getName(),
				lblNewLabel_5.getFont().getStyle(), lblNewLabel_5.getFont().getSize() + 2));
		Mouse_S2.mouseINOUT(lblNewLabel_5);
		
		
		final JLabel lblNewLabel_8 = new JLabel("Sa\u00FAde");
		lblNewLabel_8.setForeground(UIManager.getColor("Button.light"));
		lblNewLabel_8.setFont(new Font(lblNewLabel_8.getFont().getName(),
				lblNewLabel_8.getFont().getStyle(), lblNewLabel_8.getFont().getSize() + 2));
		Mouse_S2.mouseINOUT(lblNewLabel_8);
		

		final JLabel lblNewLabel_2 = new JLabel("Tecnologia e Electr\u00F3nica");
		lblNewLabel_2.setForeground(UIManager.getColor("Button.light"));
		lblNewLabel_2.setFont(new Font(lblNewLabel_2.getFont().getName(),
				lblNewLabel_2.getFont().getStyle(), lblNewLabel_2.getFont().getSize() + 2));
		Mouse_S2.mouseINOUT(lblNewLabel_2);
		
		final JLabel lblNewLabel_9 = new JLabel("Outros");
		lblNewLabel_9.setForeground(UIManager.getColor("Button.light"));
		lblNewLabel_9.setFont(new Font(lblNewLabel_9.getFont().getName(),
				lblNewLabel_9.getFont().getStyle(), lblNewLabel_9.getFont().getSize() + 2));
		Mouse_S2.mouseINOUT(lblNewLabel_9);
		
		final JLabel lblNewLabel_6 = new JLabel("Pe\u00E7as Auto");
		lblNewLabel_6.setForeground(UIManager.getColor("Button.light"));
		lblNewLabel_6.setFont(new Font(lblNewLabel_6.getFont().getName(),
				lblNewLabel_6.getFont().getStyle(), lblNewLabel_6.getFont().getSize() + 2));
		Mouse_S2.mouseINOUT(lblNewLabel_6);
		
		final JLabel lblNewLabel_3 = new JLabel("Desporto e Entretenimento");
		lblNewLabel_3.setForeground(UIManager.getColor("Button.light"));
		lblNewLabel_3.setFont(new Font(lblNewLabel_3.getFont().getName(),
				lblNewLabel_3.getFont().getStyle(), lblNewLabel_3.getFont().getSize() + 2));
		Mouse_S2.mouseINOUT(lblNewLabel_3);
		
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1
				.setHorizontalGroup(gl_panel_1
						.createParallelGroup(Alignment.LEADING)
						.addGroup(
								gl_panel_1
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												gl_panel_1
														.createParallelGroup(
																Alignment.LEADING)
														.addComponent(
																lblNewLabel_1,
																GroupLayout.DEFAULT_SIZE,
																202,
																Short.MAX_VALUE)
														.addComponent(
																lblNewLabel_4,
																GroupLayout.DEFAULT_SIZE,
																202,
																Short.MAX_VALUE)
														.addComponent(
																lblNewLabel_7,
																GroupLayout.DEFAULT_SIZE,
																202,
																Short.MAX_VALUE))
										.addPreferredGap(
												ComponentPlacement.RELATED)
										.addGroup(
												gl_panel_1
														.createParallelGroup(
																Alignment.LEADING)
														.addGroup(
																gl_panel_1
																		.createParallelGroup(
																				Alignment.LEADING)
																		.addComponent(
																				lblNewLabel_5,
																				Alignment.TRAILING,
																				GroupLayout.DEFAULT_SIZE,
																				GroupLayout.DEFAULT_SIZE,
																				Short.MAX_VALUE)
																		.addComponent(
																				lblNewLabel_2,
																				Alignment.TRAILING,
																				GroupLayout.DEFAULT_SIZE,
																				242,
																				Short.MAX_VALUE))
														.addGroup(
																gl_panel_1
																		.createSequentialGroup()
																		.addComponent(
																				lblNewLabel_8,
																				GroupLayout.DEFAULT_SIZE,
																				179,
																				Short.MAX_VALUE)
																		.addGap(63)))
										.addPreferredGap(
												ComponentPlacement.UNRELATED)
										.addGroup(
												gl_panel_1
														.createParallelGroup(
																Alignment.TRAILING,
																false)
														.addComponent(
																lblNewLabel_9,
																GroupLayout.DEFAULT_SIZE,
																GroupLayout.DEFAULT_SIZE,
																Short.MAX_VALUE)
														.addComponent(
																lblNewLabel_6,
																GroupLayout.DEFAULT_SIZE,
																GroupLayout.DEFAULT_SIZE,
																Short.MAX_VALUE)
														.addComponent(
																lblNewLabel_3,
																GroupLayout.DEFAULT_SIZE,
																261,
																Short.MAX_VALUE))
										.addContainerGap()));
		gl_panel_1
				.setVerticalGroup(gl_panel_1
						.createParallelGroup(Alignment.LEADING)
						.addGroup(
								gl_panel_1
										.createSequentialGroup()
										.addGroup(
												gl_panel_1
														.createParallelGroup(
																Alignment.BASELINE)
														.addComponent(
																lblNewLabel_3)
														.addComponent(
																lblNewLabel_1)
														.addComponent(
																lblNewLabel_2))
										.addGap(11)
										.addGroup(
												gl_panel_1
														.createParallelGroup(
																Alignment.LEADING)
														.addComponent(
																lblNewLabel_4,
																GroupLayout.DEFAULT_SIZE,
																24,
																Short.MAX_VALUE)
														.addGroup(
																gl_panel_1
																		.createParallelGroup(
																				Alignment.BASELINE)
																		.addComponent(
																				lblNewLabel_6,
																				GroupLayout.DEFAULT_SIZE,
																				GroupLayout.DEFAULT_SIZE,
																				Short.MAX_VALUE)
																		.addComponent(
																				lblNewLabel_5,
																				GroupLayout.DEFAULT_SIZE,
																				24,
																				Short.MAX_VALUE)))
										.addPreferredGap(
												ComponentPlacement.RELATED)
										.addGroup(
												gl_panel_1
														.createParallelGroup(
																Alignment.BASELINE)
														.addComponent(
																lblNewLabel_8)
														.addComponent(
																lblNewLabel_9)
														.addComponent(
																lblNewLabel_7))
										.addGap(5)));
		panel_1.setLayout(gl_panel_1);

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		
		JPanel panel_3 = new Pesquisa_Bar();
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, gl_panel.createSequentialGroup()
					.addGap(43)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(panel_3, GroupLayout.DEFAULT_SIZE, 790, Short.MAX_VALUE)
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 790, Short.MAX_VALUE)
							.addContainerGap())
						.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
							.addComponent(tabbedPane, GroupLayout.DEFAULT_SIZE, 784, Short.MAX_VALUE)
							.addContainerGap())))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(tabbedPane, GroupLayout.PREFERRED_SIZE, 411, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		
		JPanel panel_2 = new Home_Product_Panel();
		
		tabbedPane.addTab("Últimos Produtos", null, panel_2, null);
		
		JPanel panel_4 = new Home_Product_Panel();
		tabbedPane.addTab("Sugestões", null, panel_4, null);
				panel.setLayout(gl_panel);
		contentPane.setLayout(gl_contentPane);
	}
}
