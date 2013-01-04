package Presentation_Layer.Pesquisa;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.LayoutStyle.ComponentPlacement;

import org.jdesktop.swingx.JXHyperlink;

import Presentation_Layer.Sale_Squared;
import Presentation_Layer.Negocio.Anuncio;
import Presentation_Layer.Perfil.Perfil;

public class Resultado_Label extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public Resultado_Label(final Sale_Squared root) {
		setBorder(null);

		JPanel panel = new JPanel();

		JPanel panel_1 = new JPanel();

		JPanel panel_2 = new JPanel();

		JPanel panel_3 = new JPanel();

		JPanel panel_4 = new JPanel();
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout
				.setHorizontalGroup(groupLayout
						.createParallelGroup(Alignment.LEADING)
						.addGroup(
								groupLayout
										.createSequentialGroup()
										.addContainerGap()
										.addComponent(panel,
												GroupLayout.PREFERRED_SIZE,
												105, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												ComponentPlacement.UNRELATED)
										.addGroup(
												groupLayout
														.createParallelGroup(
																Alignment.LEADING)
														.addComponent(
																panel_1,
																GroupLayout.DEFAULT_SIZE,
																496,
																Short.MAX_VALUE)
														.addGroup(
																groupLayout
																		.createSequentialGroup()
																		.addComponent(
																				panel_2,
																				GroupLayout.PREFERRED_SIZE,
																				GroupLayout.DEFAULT_SIZE,
																				GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				ComponentPlacement.RELATED,
																				160,
																				Short.MAX_VALUE)
																		.addComponent(
																				panel_4,
																				GroupLayout.PREFERRED_SIZE,
																				185,
																				GroupLayout.PREFERRED_SIZE))
														.addGroup(
																Alignment.TRAILING,
																groupLayout
																		.createSequentialGroup()
																		.addGap(159)
																		.addComponent(
																				panel_3,
																				GroupLayout.PREFERRED_SIZE,
																				337,
																				GroupLayout.PREFERRED_SIZE)))
										.addContainerGap()));
		groupLayout
				.setVerticalGroup(groupLayout
						.createParallelGroup(Alignment.LEADING)
						.addGroup(
								groupLayout
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												groupLayout
														.createParallelGroup(
																Alignment.LEADING,
																false)
														.addGroup(
																groupLayout
																		.createSequentialGroup()
																		.addComponent(
																				panel_1,
																				GroupLayout.PREFERRED_SIZE,
																				25,
																				GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				ComponentPlacement.RELATED)
																		.addGroup(
																				groupLayout
																						.createParallelGroup(
																								Alignment.TRAILING)
																						.addGroup(
																								Alignment.LEADING,
																								groupLayout
																										.createSequentialGroup()
																										.addComponent(
																												panel_3,
																												GroupLayout.PREFERRED_SIZE,
																												44,
																												GroupLayout.PREFERRED_SIZE)
																										.addPreferredGap(
																												ComponentPlacement.RELATED)
																										.addComponent(
																												panel_4,
																												GroupLayout.PREFERRED_SIZE,
																												18,
																												Short.MAX_VALUE))
																						.addComponent(
																								panel_2,
																								GroupLayout.PREFERRED_SIZE,
																								18,
																								GroupLayout.PREFERRED_SIZE)))
														.addComponent(
																panel,
																GroupLayout.PREFERRED_SIZE,
																99,
																GroupLayout.PREFERRED_SIZE))
										.addContainerGap()));

		JLabel lblNewLabel_5 = new JLabel("2 Dias - 14h23m46s");
		lblNewLabel_5.setForeground(new Color(0, 0, 51));
		lblNewLabel_5.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		GroupLayout gl_panel_4 = new GroupLayout(panel_4);
		gl_panel_4.setHorizontalGroup(gl_panel_4.createParallelGroup(
				Alignment.LEADING).addGroup(
				gl_panel_4.createSequentialGroup().addContainerGap()
						.addComponent(lblNewLabel_5)
						.addContainerGap(38, Short.MAX_VALUE)));
		gl_panel_4.setVerticalGroup(gl_panel_4.createParallelGroup(
				Alignment.LEADING).addGroup(
				gl_panel_4
						.createSequentialGroup()
						.addComponent(lblNewLabel_5)
						.addContainerGap(GroupLayout.DEFAULT_SIZE,
								Short.MAX_VALUE)));
		panel_4.setLayout(gl_panel_4);

		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(Resultado_Label.class
				.getResource("/Imagens/top_cliente.png")));
		lblNewLabel_2.setFont(new Font("Lucida Grande", Font.PLAIN, 13));

		JButton btnNewButton_1 = new JButton("Comprar J\u00E1");

		JLabel lblNewLabel_3 = new JLabel("\u20AC 500.28");
		lblNewLabel_3.setFont(new Font("Lucida Grande", Font.BOLD, 13));

		JLabel lblNewLabel_4 = new JLabel("Portes Gr\u00E1tis");
		lblNewLabel_4.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
		GroupLayout gl_panel_3 = new GroupLayout(panel_3);
		gl_panel_3.setHorizontalGroup(gl_panel_3.createParallelGroup(
				Alignment.LEADING).addGroup(
				gl_panel_3
						.createSequentialGroup()
						.addContainerGap()
						.addComponent(lblNewLabel_2)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(btnNewButton_1)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(
								gl_panel_3
										.createParallelGroup(Alignment.LEADING)
										.addComponent(lblNewLabel_3)
										.addComponent(lblNewLabel_4))
						.addContainerGap(107, Short.MAX_VALUE)));
		gl_panel_3
				.setVerticalGroup(gl_panel_3
						.createParallelGroup(Alignment.LEADING)
						.addGroup(
								gl_panel_3
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												gl_panel_3
														.createParallelGroup(
																Alignment.LEADING)
														.addGroup(
																gl_panel_3
																		.createSequentialGroup()
																		.addComponent(
																				lblNewLabel_3)
																		.addPreferredGap(
																				ComponentPlacement.RELATED)
																		.addComponent(
																				lblNewLabel_4))
														.addComponent(
																btnNewButton_1)
														.addComponent(
																lblNewLabel_2))
										.addContainerGap(13, Short.MAX_VALUE)));
		panel_3.setLayout(gl_panel_3);

		JXHyperlink hprlnkAutor = new JXHyperlink();
		hprlnkAutor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				root.setBody(new Perfil(root), "Perfil");
			}
		});
		hprlnkAutor.setForeground(new Color(0, 0, 0));
		hprlnkAutor.setText("autor123");
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(gl_panel_2.createParallelGroup(
				Alignment.LEADING).addGroup(
				gl_panel_2
						.createSequentialGroup()
						.addContainerGap()
						.addComponent(hprlnkAutor, GroupLayout.PREFERRED_SIZE,
								81, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(64, Short.MAX_VALUE)));
		gl_panel_2.setVerticalGroup(gl_panel_2.createParallelGroup(
				Alignment.LEADING).addGroup(
				gl_panel_2
						.createSequentialGroup()
						.addComponent(hprlnkAutor, GroupLayout.PREFERRED_SIZE,
								17, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(GroupLayout.DEFAULT_SIZE,
								Short.MAX_VALUE)));
		panel_2.setLayout(gl_panel_2);

		JXHyperlink hprlnkTituloDoNegcio = new JXHyperlink();
		hprlnkTituloDoNegcio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				root.setBody(new Anuncio(root), "anuncio");
			}
		});
		hprlnkTituloDoNegcio.setForeground(new Color(0, 102, 204));
		hprlnkTituloDoNegcio.setText("Titulo do Neg\u00F3cio");
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(gl_panel_1.createParallelGroup(
				Alignment.LEADING).addGroup(
				gl_panel_1
						.createSequentialGroup()
						.addContainerGap()
						.addComponent(hprlnkTituloDoNegcio,
								GroupLayout.PREFERRED_SIZE, 128,
								GroupLayout.PREFERRED_SIZE)
						.addContainerGap(362, Short.MAX_VALUE)));
		gl_panel_1.setVerticalGroup(gl_panel_1.createParallelGroup(
				Alignment.LEADING).addGroup(
				Alignment.TRAILING,
				gl_panel_1
						.createSequentialGroup()
						.addContainerGap(8, Short.MAX_VALUE)
						.addComponent(hprlnkTituloDoNegcio,
								GroupLayout.PREFERRED_SIZE, 17,
								GroupLayout.PREFERRED_SIZE)));
		panel_1.setLayout(gl_panel_1);

		JButton btnNewButton = new JButton("\n");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				root.setBody(new Anuncio(root), "Anuncio");
			}
		});
		btnNewButton.setIcon(new ImageIcon(Resultado_Label.class
				.getResource("/Imagens/Sem_Imagem.png")));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(gl_panel.createParallelGroup(
				Alignment.LEADING).addGroup(
				gl_panel.createSequentialGroup()
						.addComponent(btnNewButton)
						.addContainerGap(GroupLayout.DEFAULT_SIZE,
								Short.MAX_VALUE)));
		gl_panel.setVerticalGroup(gl_panel.createParallelGroup(
				Alignment.LEADING).addGroup(
				gl_panel.createSequentialGroup()
						.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE,
								96, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(3, Short.MAX_VALUE)));
		panel.setLayout(gl_panel);
		setLayout(groupLayout);

	}
}
