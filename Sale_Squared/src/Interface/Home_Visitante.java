package Interface;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;
import java.awt.event.MouseAdapter;
import javax.swing.UIManager;

public class Home_Visitante extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home_Visitante frame = new Home_Visitante();
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
	public Home_Visitante() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 375);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("\n");
		lblNewLabel.setIcon(new ImageIcon(Home_Visitante.class.getResource("/Imagens/header.png")));
		
		JButton btnNewButton = new JButton("Registar\n");
		
		JButton btnNewButton_1 = new JButton("Entrar");
		
		JPanel panel = new JPanel();
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(58)
							.addComponent(lblNewLabel)
							.addPreferredGap(ComponentPlacement.RELATED, 272, Short.MAX_VALUE)
							.addComponent(btnNewButton_1)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnNewButton))
						.addComponent(panel, GroupLayout.DEFAULT_SIZE, 784, Short.MAX_VALUE))
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
							.addComponent(btnNewButton)
							.addComponent(btnNewButton_1)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 230, Short.MAX_VALUE)
					.addGap(11))
		);
		
		textField = new JTextField();
		textField.setColumns(10);
		
		JComboBox<String> comboBox = new JComboBox<String>();
		
		JButton btnNewButton_2 = new JButton("Pesquisar");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JButton btnPesquisaAvanada = new JButton("Pesquisa Avan\u00E7ada");
		
		JPanel panel_1 = new JPanel();
		
		JScrollPane scrollPane = new JScrollPane();
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(43)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(textField, GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE)
							.addGap(18)
							.addComponent(comboBox, 0, 201, Short.MAX_VALUE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(btnNewButton_2, GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
								.addComponent(btnPesquisaAvanada, GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
						.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 685, Short.MAX_VALUE))
					.addGap(42)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(6)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton_2))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnPesquisaAvanada)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(45, Short.MAX_VALUE))
				.addComponent(scrollPane, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
		);
		
		final JLabel lblNewLabel_1 = new JLabel("Moda");
		lblNewLabel_1.setForeground(UIManager.getColor("Button.light"));
		lblNewLabel_1.setFont(new Font(lblNewLabel_1.getFont().getName(), Font.BOLD, lblNewLabel_1.getFont().getSize()+2));
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//lblNewLabel_1.setText("EXITO");
				
			}
		});
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel_1)
					.addContainerGap(645, Short.MAX_VALUE))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addComponent(lblNewLabel_1)
					.addContainerGap(92, Short.MAX_VALUE))
		);
		panel_1.setLayout(gl_panel_1);
		panel.setLayout(gl_panel);
		contentPane.setLayout(gl_contentPane);
	}
}
