package Interface;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.JLayeredPane;

public class Home extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static final int VISITANTE = 0;
	public static final int REGISTADO = 1;
	public static int ESTADO = Home.VISITANTE;

	public static final Icon THUMB_SEM_TITULO = new ImageIcon(
			Home.class.getResource("/Imagens/Sem_Imagem.png"));

	private JPanel contentPane;
	private JTextField textField;

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
		setBounds(100, 100, 800, 750);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		// contentPane.add

		JLabel lblNewLabel = new JLabel("\n");

		lblNewLabel.setIcon(header);

		JPanel panel = new JPanel();

		JPanel panel_6 = new Visintante_Panel();
		// JPanel panel_6 = new Registado_Panel();

		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane
				.setHorizontalGroup(gl_contentPane
						.createParallelGroup(Alignment.TRAILING)
						.addGroup(
								gl_contentPane
										.createSequentialGroup()
										.addGroup(
												gl_contentPane
														.createParallelGroup(
																Alignment.LEADING)
														.addComponent(
																panel,
																GroupLayout.DEFAULT_SIZE,
																784,
																Short.MAX_VALUE)
														.addGroup(
																gl_contentPane
																		.createSequentialGroup()
																		.addGap(58)
																		.addComponent(
																				lblNewLabel)
																		.addPreferredGap(
																				ComponentPlacement.RELATED,
																				170,
																				Short.MAX_VALUE)
																		.addComponent(
																				panel_6,
																				GroupLayout.PREFERRED_SIZE,
																				288,
																				GroupLayout.PREFERRED_SIZE)))
										.addContainerGap()));
		gl_contentPane.setVerticalGroup(gl_contentPane.createParallelGroup(
				Alignment.LEADING).addGroup(
				gl_contentPane
						.createSequentialGroup()
						.addGroup(
								gl_contentPane
										.createParallelGroup(Alignment.LEADING)
										.addComponent(lblNewLabel)
										.addComponent(panel_6,
												GroupLayout.PREFERRED_SIZE, 26,
												GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(panel, GroupLayout.PREFERRED_SIZE,
								GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addGap(11)));

		textField = new JTextField();
		textField.setColumns(10);

		JComboBox<String> comboBox = new JComboBox<String>();
		comboBox.setModel(new DefaultComboBoxModel<String>(new String[] {
				"Moda", "Casa e Jardim", "Carros",
				"Tecnologia e Electr\u00F3nica", "Desporto e Entrenimento",
				"Pe\u00E7as Auto", "Coleccion\u00E1veis e Arte", "Sa\u00FAde",
				"Outros" }));

		JPanel panel_1 = new JPanel();

		final JLabel lblNewLabel_7 = new JLabel("Carros");
		lblNewLabel_7.setForeground(UIManager.getColor("Button.light"));
		lblNewLabel_7.setFont(new Font(lblNewLabel_7.getFont().getName(),
				Font.BOLD, lblNewLabel_7.getFont().getSize() + 2));
		lblNewLabel_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// lblNewLabel_1.setText("EXITO");

			}
		});

		final JLabel lblNewLabel_4 = new JLabel("Casa e Jardim");
		lblNewLabel_4.setForeground(UIManager.getColor("Button.light"));
		lblNewLabel_4.setFont(new Font(lblNewLabel_4.getFont().getName(),
				Font.BOLD, lblNewLabel_4.getFont().getSize() + 2));
		lblNewLabel_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// lblNewLabel_1.setText("EXITO");

			}
		});

		final JLabel lblNewLabel_1 = new JLabel("Moda");
		lblNewLabel_1.setForeground(UIManager.getColor("Button.light"));
		lblNewLabel_1.setFont(new Font(lblNewLabel_1.getFont().getName(),
				Font.BOLD, lblNewLabel_1.getFont().getSize() + 2));
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// lblNewLabel_1.setText("EXITO");

			}
		});

		final JLabel lblNewLabel_5 = new JLabel("Coleccion\u00E1veis e Arte");
		lblNewLabel_5.setForeground(UIManager.getColor("Button.light"));
		lblNewLabel_5.setFont(new Font(lblNewLabel_5.getFont().getName(),
				Font.BOLD, lblNewLabel_5.getFont().getSize() + 2));
		lblNewLabel_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// lblNewLabel_1.setText("EXITO");

			}
		});

		final JLabel lblNewLabel_8 = new JLabel("Sa\u00FAde");
		lblNewLabel_8.setForeground(UIManager.getColor("Button.light"));
		lblNewLabel_8.setFont(new Font(lblNewLabel_8.getFont().getName(),
				Font.BOLD, lblNewLabel_8.getFont().getSize() + 2));
		lblNewLabel_8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// lblNewLabel_1.setText("EXITO");

			}
		});

		final JLabel lblNewLabel_2 = new JLabel("Tecnologia e Electr\u00F3nica");
		lblNewLabel_2.setForeground(UIManager.getColor("Button.light"));
		lblNewLabel_2.setFont(new Font(lblNewLabel_2.getFont().getName(),
				Font.BOLD, lblNewLabel_2.getFont().getSize() + 2));
		lblNewLabel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// lblNewLabel_1.setText("EXITO");

			}
		});

		final JLabel lblNewLabel_9 = new JLabel("Outros");
		lblNewLabel_9.setForeground(UIManager.getColor("Button.light"));
		lblNewLabel_9.setFont(new Font(lblNewLabel_9.getFont().getName(),
				Font.BOLD, lblNewLabel_9.getFont().getSize() + 2));
		lblNewLabel_9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// lblNewLabel_1.setText("EXITO");

			}
		});

		final JLabel lblNewLabel_6 = new JLabel("Pe\u00E7as Auto");
		lblNewLabel_6.setForeground(UIManager.getColor("Button.light"));
		lblNewLabel_6.setFont(new Font(lblNewLabel_6.getFont().getName(),
				Font.BOLD, lblNewLabel_6.getFont().getSize() + 2));
		lblNewLabel_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// lblNewLabel_1.setText("EXITO");

			}
		});

		final JLabel lblNewLabel_3 = new JLabel("Desporto e Entretenimento");
		lblNewLabel_3.setForeground(UIManager.getColor("Button.light"));
		lblNewLabel_3.setFont(new Font(lblNewLabel_3.getFont().getName(),
				Font.BOLD, lblNewLabel_3.getFont().getSize() + 2));
		lblNewLabel_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// lblNewLabel_1.setText("EXITO");

			}
		});

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

		JPanel panel_3 = new JPanel();

		JButton btnNewButton_2 = new JButton("Pesquisa");

		JButton btnNewButton_3 = new JButton("Pesquisa Avan\u00E7ada");
		GroupLayout gl_panel_3 = new GroupLayout(panel_3);
		gl_panel_3.setHorizontalGroup(gl_panel_3.createParallelGroup(
				Alignment.LEADING).addGroup(
				gl_panel_3
						.createSequentialGroup()
						.addContainerGap()
						.addGroup(
								gl_panel_3
										.createParallelGroup(Alignment.LEADING)
										.addComponent(btnNewButton_2,
												GroupLayout.DEFAULT_SIZE, 218,
												Short.MAX_VALUE)
										.addComponent(btnNewButton_3,
												GroupLayout.DEFAULT_SIZE, 218,
												Short.MAX_VALUE))
						.addContainerGap()));
		gl_panel_3.setVerticalGroup(gl_panel_3.createParallelGroup(
				Alignment.LEADING).addGroup(
				gl_panel_3.createSequentialGroup().addComponent(btnNewButton_2)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(btnNewButton_3)
						.addContainerGap(12, Short.MAX_VALUE)));
		panel_3.setLayout(gl_panel_3);

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(gl_panel
				.createParallelGroup(Alignment.LEADING)
				.addGroup(
						gl_panel.createSequentialGroup()
								.addGap(43)
								.addGroup(
										gl_panel.createParallelGroup(
												Alignment.LEADING)
												.addGroup(
														gl_panel.createSequentialGroup()
																.addComponent(
																		textField,
																		GroupLayout.DEFAULT_SIZE,
																		262,
																		Short.MAX_VALUE)
																.addGap(18)
																.addComponent(
																		comboBox,
																		0,
																		199,
																		Short.MAX_VALUE)
																.addGap(6)
																.addComponent(
																		panel_3,
																		GroupLayout.PREFERRED_SIZE,
																		250,
																		GroupLayout.PREFERRED_SIZE))
												.addComponent(
														panel_1,
														GroupLayout.DEFAULT_SIZE,
														GroupLayout.DEFAULT_SIZE,
														Short.MAX_VALUE)
												.addComponent(
														tabbedPane,
														GroupLayout.PREFERRED_SIZE,
														735, Short.MAX_VALUE))
								.addContainerGap()));
		gl_panel.setVerticalGroup(gl_panel
				.createParallelGroup(Alignment.LEADING)
				.addGroup(
						gl_panel.createSequentialGroup()
								.addGap(6)
								.addGroup(
										gl_panel.createParallelGroup(
												Alignment.LEADING)
												.addComponent(
														textField,
														GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE,
														GroupLayout.PREFERRED_SIZE)
												.addGroup(
														gl_panel.createSequentialGroup()
																.addGap(2)
																.addComponent(
																		comboBox,
																		GroupLayout.PREFERRED_SIZE,
																		GroupLayout.DEFAULT_SIZE,
																		GroupLayout.PREFERRED_SIZE))
												.addComponent(
														panel_3,
														GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE,
														GroupLayout.PREFERRED_SIZE))
								.addGap(6)
								.addComponent(panel_1,
										GroupLayout.PREFERRED_SIZE, 79,
										GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED,
										17, Short.MAX_VALUE)
								.addComponent(tabbedPane,
										GroupLayout.PREFERRED_SIZE, 411,
										GroupLayout.PREFERRED_SIZE)
								.addContainerGap()));

		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("Últimos Produtos", null, panel_2, null);

		JLayeredPane layeredPane = new JLayeredPane();

		JLayeredPane layeredPane_1 = new JLayeredPane();

		JLayeredPane layeredPane_2 = new JLayeredPane();

		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(gl_panel_2.createParallelGroup(
				Alignment.LEADING).addGroup(
				gl_panel_2
						.createSequentialGroup()
						.addGap(1)
						.addComponent(layeredPane_2, GroupLayout.DEFAULT_SIZE,
								225, Short.MAX_VALUE)
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addComponent(layeredPane_1, GroupLayout.DEFAULT_SIZE,
								227, Short.MAX_VALUE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(layeredPane, GroupLayout.DEFAULT_SIZE,
								243, Short.MAX_VALUE).addContainerGap()));
		gl_panel_2
				.setVerticalGroup(gl_panel_2
						.createParallelGroup(Alignment.TRAILING)
						.addGroup(
								gl_panel_2
										.createSequentialGroup()
										.addGroup(
												gl_panel_2
														.createParallelGroup(
																Alignment.TRAILING)
														.addComponent(
																layeredPane,
																GroupLayout.DEFAULT_SIZE,
																368,
																Short.MAX_VALUE)
														.addComponent(
																layeredPane_2,
																GroupLayout.DEFAULT_SIZE,
																364,
																Short.MAX_VALUE)
														.addGroup(
																Alignment.LEADING,
																gl_panel_2
																		.createSequentialGroup()
																		.addGap(1)
																		.addComponent(
																				layeredPane_1,
																				GroupLayout.DEFAULT_SIZE,
																				363,
																				Short.MAX_VALUE)))
										.addContainerGap()));

		JLabel lblNewLabel_10 = new JLabel("");
		lblNewLabel_10.setBounds(6, 25, 50, 50);
		layeredPane_2.add(lblNewLabel_10);
		lblNewLabel_10.setIcon(Home.THUMB_SEM_TITULO);

		JLabel label_1 = new JLabel("");
		label_1.setBounds(6, 87, 50, 56);
		layeredPane_2.add(label_1);
		label_1.setIcon(Home.THUMB_SEM_TITULO);

		JLabel label_11 = new JLabel("");
		label_11.setBounds(6, 155, 50, 50);
		layeredPane_2.add(label_11);
		label_11.setIcon(Home.THUMB_SEM_TITULO);

		JLabel label_6 = new JLabel("");
		label_6.setBounds(6, 217, 50, 50);
		layeredPane_2.add(label_6);
		label_6.setIcon(Home.THUMB_SEM_TITULO);

		JLabel label_4 = new JLabel("");
		label_4.setBounds(6, 279, 56, 50);
		layeredPane_2.add(label_4);
		label_4.setIcon(Home.THUMB_SEM_TITULO);

		final JLabel lblProduto = new JLabel("Produto 1");
		lblProduto.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lblProduto.setFont(Text_S2.fontBold(lblProduto));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				lblProduto.setFont(Text_S2.fontNormal(lblProduto));

			}
		});
		lblProduto.setBounds(68, 25, 109, 16);
		layeredPane_2.add(lblProduto);

		JLabel lblProduto_1 = new JLabel("Produto 2");
		lblProduto_1.setBounds(68, 87, 109, 16);
		layeredPane_2.add(lblProduto_1);

		JLabel lblProduto_2 = new JLabel("Produto 3");
		lblProduto_2.setBounds(68, 155, 61, 16);
		layeredPane_2.add(lblProduto_2);

		JLabel lblProduto_3 = new JLabel("Produto 4");
		lblProduto_3.setBounds(68, 217, 61, 16);
		layeredPane_2.add(lblProduto_3);

		JLabel lblProduto_4 = new JLabel("Produto 5");
		lblProduto_4.setBounds(68, 279, 61, 16);
		layeredPane_2.add(lblProduto_4);

		JLabel label_3 = new JLabel("");
		label_3.setBounds(6, 25, 50, 50);
		layeredPane_1.add(label_3);
		label_3.setIcon(Home.THUMB_SEM_TITULO);

		JLabel label_8 = new JLabel("");
		label_8.setBounds(6, 87, 50, 50);
		layeredPane_1.add(label_8);
		label_8.setIcon(Home.THUMB_SEM_TITULO);

		JLabel label_5 = new JLabel("");
		label_5.setBounds(6, 149, 50, 50);
		layeredPane_1.add(label_5);
		label_5.setIcon(Home.THUMB_SEM_TITULO);

		JLabel label_12 = new JLabel("");
		label_12.setBounds(6, 211, 50, 50);
		layeredPane_1.add(label_12);
		label_12.setIcon(Home.THUMB_SEM_TITULO);

		JLabel label_7 = new JLabel("");
		label_7.setBounds(6, 273, 50, 50);
		layeredPane_1.add(label_7);
		label_7.setIcon(Home.THUMB_SEM_TITULO);

		JLabel lblProduto_5 = new JLabel("Produto 6");
		lblProduto_5.setBounds(68, 25, 61, 16);
		layeredPane_1.add(lblProduto_5);

		JLabel lblProduto_6 = new JLabel("Produto 7");
		lblProduto_6.setBounds(68, 87, 61, 16);
		layeredPane_1.add(lblProduto_6);

		JLabel lblProduto_7 = new JLabel("Produto 8");
		lblProduto_7.setBounds(68, 149, 61, 16);
		layeredPane_1.add(lblProduto_7);

		JLabel lblProduto_8 = new JLabel("Produto 9");
		lblProduto_8.setBounds(68, 211, 61, 16);
		layeredPane_1.add(lblProduto_8);

		JLabel lblProduto_9 = new JLabel("Produto 10");
		lblProduto_9.setBounds(68, 273, 69, 16);
		layeredPane_1.add(lblProduto_9);

		JLabel lblNewLabel_11 = new JLabel("");
		lblNewLabel_11.setIcon(Home.THUMB_SEM_TITULO);

		JLabel label = new JLabel("");
		label.setIcon(Home.THUMB_SEM_TITULO);

		JLabel label_2 = new JLabel("");
		label_2.setIcon(Home.THUMB_SEM_TITULO);

		JLabel label_10 = new JLabel("");
		label_10.setIcon(Home.THUMB_SEM_TITULO);

		JLabel label_9 = new JLabel("");
		label_9.setIcon(Home.THUMB_SEM_TITULO);

		JButton btnNewButton_4 = new JButton("Ver todos");

		JLabel lblProduto_10 = new JLabel("Produto 11");

		JLabel lblProduto_11 = new JLabel("Produto 12");

		JLabel lblProduto_12 = new JLabel("Produto 13");

		JLabel lblProduto_13 = new JLabel("Produto 14");

		JLabel lblProduto_14 = new JLabel("Produto 15");
		GroupLayout gl_layeredPane = new GroupLayout(layeredPane);
		gl_layeredPane
				.setHorizontalGroup(gl_layeredPane
						.createParallelGroup(Alignment.TRAILING)
						.addGroup(
								gl_layeredPane
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												gl_layeredPane
														.createParallelGroup(
																Alignment.LEADING)
														.addGroup(
																gl_layeredPane
																		.createSequentialGroup()
																		.addGroup(
																				gl_layeredPane
																						.createParallelGroup(
																								Alignment.LEADING)
																						.addGroup(
																								gl_layeredPane
																										.createSequentialGroup()
																										.addComponent(
																												label_10)
																										.addPreferredGap(
																												ComponentPlacement.RELATED)
																										.addComponent(
																												lblProduto_14))
																						.addGroup(
																								gl_layeredPane
																										.createSequentialGroup()
																										.addComponent(
																												label_2)
																										.addPreferredGap(
																												ComponentPlacement.RELATED)
																										.addComponent(
																												lblProduto_13))
																						.addGroup(
																								gl_layeredPane
																										.createSequentialGroup()
																										.addComponent(
																												label)
																										.addPreferredGap(
																												ComponentPlacement.RELATED)
																										.addComponent(
																												lblProduto_12))
																						.addGroup(
																								gl_layeredPane
																										.createSequentialGroup()
																										.addComponent(
																												lblNewLabel_11)
																										.addPreferredGap(
																												ComponentPlacement.RELATED)
																										.addComponent(
																												lblProduto_11))
																						.addGroup(
																								gl_layeredPane
																										.createSequentialGroup()
																										.addComponent(
																												label_9)
																										.addPreferredGap(
																												ComponentPlacement.RELATED)
																										.addComponent(
																												lblProduto_10)))
																		.addContainerGap(
																				116,
																				Short.MAX_VALUE))
														.addComponent(
																btnNewButton_4,
																Alignment.TRAILING))));
		gl_layeredPane
				.setVerticalGroup(gl_layeredPane
						.createParallelGroup(Alignment.LEADING)
						.addGroup(
								gl_layeredPane
										.createSequentialGroup()
										.addGap(24)
										.addGroup(
												gl_layeredPane
														.createParallelGroup(
																Alignment.LEADING)
														.addComponent(label_9)
														.addComponent(
																lblProduto_10))
										.addPreferredGap(
												ComponentPlacement.UNRELATED)
										.addGroup(
												gl_layeredPane
														.createParallelGroup(
																Alignment.LEADING)
														.addComponent(
																lblNewLabel_11)
														.addComponent(
																lblProduto_11))
										.addGap(12)
										.addGroup(
												gl_layeredPane
														.createParallelGroup(
																Alignment.LEADING)
														.addComponent(label)
														.addComponent(
																lblProduto_12))
										.addPreferredGap(
												ComponentPlacement.UNRELATED)
										.addGroup(
												gl_layeredPane
														.createParallelGroup(
																Alignment.LEADING)
														.addComponent(label_2)
														.addComponent(
																lblProduto_13))
										.addGap(12)
										.addGroup(
												gl_layeredPane
														.createParallelGroup(
																Alignment.LEADING)
														.addGroup(
																gl_layeredPane
																		.createSequentialGroup()
																		.addComponent(
																				label_10)
																		.addPreferredGap(
																				ComponentPlacement.UNRELATED)
																		.addComponent(
																				btnNewButton_4))
														.addComponent(
																lblProduto_14))
										.addContainerGap(
												GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)));
		layeredPane.setLayout(gl_layeredPane);
		panel_2.setLayout(gl_panel_2);
		panel.setLayout(gl_panel);
		contentPane.setLayout(gl_contentPane);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}
}
