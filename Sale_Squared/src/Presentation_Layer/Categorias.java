package Presentation_Layer;

import java.awt.Color;
import java.awt.Font;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.LayoutStyle.ComponentPlacement;

public class Categorias extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public Categorias() {
		
		JLayeredPane layeredPane = new JLayeredPane();
		
		JLayeredPane layeredPane_1 = new JLayeredPane();
		
		JLabel label_8 = new JLabel("Coleccionáveis e Arte");
		label_8.setForeground(new Color(0, 102, 204));
		label_8.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		Mouse_S2.mouseINOUT(label_8);

		
		JLabel label_10 = new JLabel("    Selos");
		label_10.setForeground(new Color(0, 102, 204));
		Mouse_S2.mouseINOUT(label_10);

		
		JLabel label_9 = new JLabel("    Moedas e Notas");
		label_9.setForeground(new Color(0, 102, 204));
		Mouse_S2.mouseINOUT(label_9);
		
		
		JLabel lblNewLabel = new JLabel("    Medalhas");
		lblNewLabel.setForeground(new Color(0, 102, 204));
		Mouse_S2.mouseINOUT(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("    Antiguidades");
		lblNewLabel_1.setForeground(new Color(0, 102, 204));
		Mouse_S2.mouseINOUT(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("    Arte");
		lblNewLabel_2.setForeground(new Color(0, 102, 204));
		lblNewLabel_2.setFont(new Font("Lucida Grande", Font.PLAIN, 13));
		Mouse_S2.mouseINOUT(lblNewLabel_2);
		
		JLabel label = new JLabel("Moda");
		label.setForeground(new Color(0, 102, 204));
		label.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		Mouse_S2.mouseINOUT(label);
		
		JLabel label_1 = new JLabel("    Vestuário");
		label_1.setForeground(new Color(0, 102, 204));
		Mouse_S2.mouseINOUT(label_1);
		
				
				JLabel label_2 = new JLabel("    Acessórios");
				label_2.setForeground(new Color(0, 102, 204));
				Mouse_S2.mouseINOUT(label_2);
		
		GroupLayout gl_layeredPane_1 = new GroupLayout(layeredPane_1);
		gl_layeredPane_1.setHorizontalGroup(
			gl_layeredPane_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_layeredPane_1.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_layeredPane_1.createParallelGroup(Alignment.LEADING)
						.addComponent(label_8, GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
						.addGroup(gl_layeredPane_1.createSequentialGroup()
							.addGroup(gl_layeredPane_1.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_layeredPane_1.createSequentialGroup()
									.addGroup(gl_layeredPane_1.createParallelGroup(Alignment.LEADING, false)
										.addComponent(lblNewLabel_2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(lblNewLabel_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(label_9, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(label_10, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
									.addPreferredGap(ComponentPlacement.RELATED, 48, GroupLayout.PREFERRED_SIZE))
								.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE))
							.addGap(7))
						.addGroup(gl_layeredPane_1.createSequentialGroup()
							.addComponent(label, GroupLayout.PREFERRED_SIZE, 138, GroupLayout.PREFERRED_SIZE)
							.addContainerGap(33, Short.MAX_VALUE))
						.addGroup(gl_layeredPane_1.createSequentialGroup()
							.addComponent(label_1, GroupLayout.PREFERRED_SIZE, 138, GroupLayout.PREFERRED_SIZE)
							.addContainerGap(33, Short.MAX_VALUE))
						.addGroup(gl_layeredPane_1.createSequentialGroup()
							.addComponent(label_2, GroupLayout.PREFERRED_SIZE, 138, GroupLayout.PREFERRED_SIZE)
							.addContainerGap(33, Short.MAX_VALUE))))
		);
		gl_layeredPane_1.setVerticalGroup(
			gl_layeredPane_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_layeredPane_1.createSequentialGroup()
					.addContainerGap()
					.addComponent(label_8, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(label_10, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(label_9, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(label)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(label_1)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(label_2)
					.addContainerGap(22, Short.MAX_VALUE))
		);
		layeredPane_1.setLayout(gl_layeredPane_1);
		
		JLayeredPane layeredPane_2 = new JLayeredPane();
		
		JLabel lblAuto = new JLabel("Auto");
		lblAuto.setForeground(new Color(0, 102, 204));
		lblAuto.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		Mouse_S2.mouseINOUT(lblAuto);
		
		JLabel lblPeasAuto = new JLabel("    Pe\u00E7as auto");
		lblPeasAuto.setForeground(new Color(0, 102, 204));
		Mouse_S2.mouseINOUT(lblPeasAuto);
		
		JLabel lblNewLabel_3 = new JLabel("    Ve\u00EDculos");
		lblNewLabel_3.setForeground(new Color(0, 102, 204));
		Mouse_S2.mouseINOUT(lblNewLabel_3);
		
		JLabel lblLivrosERevistas = new JLabel("Livros e Revistas");
		lblLivrosERevistas.setForeground(new Color(0, 102, 204));
		lblLivrosERevistas.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		Mouse_S2.mouseINOUT(lblLivrosERevistas);
		
		JLabel lblRevistas = new JLabel("    Revistas");
		lblRevistas.setForeground(new Color(0, 102, 204));
		Mouse_S2.mouseINOUT(lblRevistas);
		
		JLabel lblNewLabel_6 = new JLabel("    Manuais Escolares");
		lblNewLabel_6.setForeground(new Color(0, 102, 204));
		lblNewLabel_6.setFont(new Font("Lucida Grande", Font.PLAIN, 13));
		Mouse_S2.mouseINOUT(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("    Literatura Infantil");
		lblNewLabel_7.setForeground(new Color(0, 102, 204));
		Mouse_S2.mouseINOUT(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("    Literatura");
		lblNewLabel_8.setForeground(new Color(0, 102, 204));
		Mouse_S2.mouseINOUT(lblNewLabel_8);
		
		JLabel lblNewLabel_11 = new JLabel("    Banda Desenhada");
		lblNewLabel_11.setForeground(new Color(0, 102, 204));
		Mouse_S2.mouseINOUT(lblNewLabel_11);
		GroupLayout gl_layeredPane = new GroupLayout(layeredPane);
		gl_layeredPane.setHorizontalGroup(
			gl_layeredPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_layeredPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_layeredPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lblAuto, GroupLayout.PREFERRED_SIZE, 161, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblPeasAuto, GroupLayout.PREFERRED_SIZE, 145, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_layeredPane.createParallelGroup(Alignment.TRAILING, false)
							.addComponent(lblNewLabel_3, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(lblLivrosERevistas, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(lblRevistas, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(lblNewLabel_6, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(lblNewLabel_7, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(lblNewLabel_8, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(lblNewLabel_11, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_layeredPane.setVerticalGroup(
			gl_layeredPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_layeredPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblAuto)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblPeasAuto)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel_3, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblLivrosERevistas)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblRevistas)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel_6)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel_7)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel_8)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel_11)
					.addGap(190))
		);
		layeredPane.setLayout(gl_layeredPane);
		
		JLabel lblNewLabel_4 = new JLabel("Tecnologia e Electrónica");
		lblNewLabel_4.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblNewLabel_4.setForeground(new Color(0, 102, 204));
		Mouse_S2.mouseINOUT(lblNewLabel_4);

		
		
		JLabel lbludioTvE = new JLabel("    Áudio, TV e Vídeo");
		lbludioTvE.setForeground(new Color(0, 102, 204));
		Mouse_S2.mouseINOUT(lbludioTvE);

		JLabel lblConsolas = new JLabel("    Consolas");
		lblConsolas.setForeground(new Color(0, 102, 204));
		Mouse_S2.mouseINOUT(lblConsolas);

		
		JLabel lblFotografia = new JLabel("    Fotografia");
		lblFotografia.setForeground(new Color(0, 102, 204));
		Mouse_S2.mouseINOUT(lblFotografia);

		JLabel lblInformtica = new JLabel("    Informática");
		lblInformtica.setForeground(new Color(0, 102, 204));
		Mouse_S2.mouseINOUT(lblInformtica);

		JLabel lblTelemveisETelefones = new JLabel("    Telemóveis e Telefones");
		lblTelemveisETelefones.setForeground(new Color(0, 102, 204));
		Mouse_S2.mouseINOUT(lblTelemveisETelefones);

		JLabel lblOutros = new JLabel("Outros");
		lblOutros.setForeground(new Color(0, 102, 204));
		lblOutros.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		Mouse_S2.mouseINOUT(lblOutros);
		
		JLabel lblNewLabel_12 = new JLabel("    Gadgets");
		lblNewLabel_12.setForeground(new Color(0, 102, 204));
		Mouse_S2.mouseINOUT(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("    Circuitos");
		lblNewLabel_13.setForeground(new Color(0, 102, 204));
		Mouse_S2.mouseINOUT(lblNewLabel_13);

		GroupLayout gl_layeredPane_2 = new GroupLayout(layeredPane_2);
		gl_layeredPane_2.setHorizontalGroup(
			gl_layeredPane_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_layeredPane_2.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_layeredPane_2.createParallelGroup(Alignment.LEADING)
						.addComponent(lbludioTvE, GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
						.addGroup(gl_layeredPane_2.createSequentialGroup()
							.addGroup(gl_layeredPane_2.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_4, GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
								.addComponent(lblFotografia, GroupLayout.PREFERRED_SIZE, 188, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblInformtica, GroupLayout.PREFERRED_SIZE, 188, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblTelemveisETelefones, GroupLayout.PREFERRED_SIZE, 188, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblConsolas, GroupLayout.PREFERRED_SIZE, 149, GroupLayout.PREFERRED_SIZE))
							.addContainerGap())
						.addGroup(gl_layeredPane_2.createSequentialGroup()
							.addComponent(lblNewLabel_12)
							.addContainerGap(133, Short.MAX_VALUE))
						.addGroup(gl_layeredPane_2.createSequentialGroup()
							.addComponent(lblNewLabel_13)
							.addContainerGap(133, Short.MAX_VALUE))
						.addGroup(gl_layeredPane_2.createSequentialGroup()
							.addComponent(lblOutros, GroupLayout.PREFERRED_SIZE, 188, GroupLayout.PREFERRED_SIZE)
							.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
		);
		gl_layeredPane_2.setVerticalGroup(
			gl_layeredPane_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_layeredPane_2.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel_4)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lbludioTvE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblConsolas, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblFotografia, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblInformtica, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblTelemveisETelefones, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel_12)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel_13)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblOutros, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(191, Short.MAX_VALUE))
		);
		layeredPane_2.setLayout(gl_layeredPane_2);
		
		JLayeredPane layeredPane_3 = new JLayeredPane();
		
		JPanel panel = new JPanel();
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(layeredPane, GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(layeredPane_3, GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(layeredPane_1, GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel, GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(layeredPane_2, GroupLayout.PREFERRED_SIZE, 198, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(layeredPane_3, Alignment.LEADING, 0, 0, Short.MAX_VALUE)
						.addGroup(Alignment.LEADING, groupLayout.createParallelGroup(Alignment.TRAILING, false)
							.addComponent(layeredPane, Alignment.LEADING, 0, 0, Short.MAX_VALUE)
							.addComponent(layeredPane_2, Alignment.LEADING, 0, 0, Short.MAX_VALUE)
							.addComponent(layeredPane_1, Alignment.LEADING, 0, 0, Short.MAX_VALUE)
							.addComponent(panel, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)))
					.addContainerGap(17, Short.MAX_VALUE))
		);
		
		JLabel lblNewLabel_14 = new JLabel("Desporto e Entretenimento");
		lblNewLabel_14.setForeground(new Color(0, 102, 204));
		lblNewLabel_14.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		Mouse_S2.mouseINOUT(lblNewLabel_14);

		
		JLabel lblNewLabel_15 = new JLabel("    Brinquedos");
		lblNewLabel_15.setForeground(new Color(0, 102, 204));
		Mouse_S2.mouseINOUT(lblNewLabel_15);
		
		JLabel lblArtigosDeDesporto = new JLabel("    Fitness e Musculação");
		lblArtigosDeDesporto.setForeground(new Color(0, 102, 204));
		Mouse_S2.mouseINOUT(lblArtigosDeDesporto);
		
		JLabel lblFilmesECinema = new JLabel("    Filmes e Cinema");
		lblFilmesECinema.setForeground(new Color(0, 102, 204));
		Mouse_S2.mouseINOUT(lblFilmesECinema);
		
		JLabel lblMsica = new JLabel("    Música");
		lblMsica.setForeground(new Color(0, 102, 204));
		Mouse_S2.mouseINOUT(lblMsica);
		
		JLabel lblCaaEPesca = new JLabel("    Caça e Pesca");
		lblCaaEPesca.setForeground(new Color(0, 102, 204));
		Mouse_S2.mouseINOUT(lblCaaEPesca);
		
		JLabel lblNewLabel_16 = new JLabel("    Campismo");
		lblNewLabel_16.setForeground(new Color(0, 102, 204));
		Mouse_S2.mouseINOUT(lblNewLabel_16);
		
		JLabel lblFutebol = new JLabel("    Futebol");
		lblFutebol.setForeground(new Color(0, 102, 204));
		Mouse_S2.mouseINOUT(lblFutebol);
		
		JLabel lblNatao = new JLabel("    Natação");
		lblNatao.setForeground(new Color(0, 102, 204));
		Mouse_S2.mouseINOUT(lblNatao);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_14)
						.addComponent(lblNewLabel_15)
						.addComponent(lblArtigosDeDesporto)
						.addComponent(lblFilmesECinema)
						.addComponent(lblMsica)
						.addComponent(lblCaaEPesca)
						.addComponent(lblNewLabel_16)
						.addComponent(lblFutebol)
						.addComponent(lblNatao))
					.addContainerGap(14, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel_14)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel_15)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblArtigosDeDesporto)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblFilmesECinema)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblMsica)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblCaaEPesca)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel_16)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblFutebol)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNatao)
					.addContainerGap(25, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		
				
				JLabel label_3 = new JLabel("Casa e Jardim");
				label_3.setForeground(new Color(0, 102, 204));
				label_3.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
				Mouse_S2.mouseINOUT(label_3);
		
				
				JLabel label_4 = new JLabel("    Animais");
				label_4.setForeground(new Color(0, 102, 204));
				Mouse_S2.mouseINOUT(label_4);
		
				
				JLabel lblJardinagem = new JLabel("    Jardinagem");
				lblJardinagem.setForeground(new Color(0, 102, 204));
				Mouse_S2.mouseINOUT(lblJardinagem);
		
				
				JLabel label_6 = new JLabel("    Imóveis");
				label_6.setForeground(new Color(0, 102, 204));
				Mouse_S2.mouseINOUT(label_6);
		
				JLabel label_7 = new JLabel("    Móveis");
				label_7.setForeground(new Color(0, 102, 204));
				Mouse_S2.mouseINOUT(label_7);
		
				
				JLabel lblNewLabel_5 = new JLabel("Saúde");
				lblNewLabel_5.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
				lblNewLabel_5.setForeground(new Color(0, 102, 204));
				Mouse_S2.mouseINOUT(lblNewLabel_5);
		
		JLabel lblCosmticos = new JLabel("    Cosméticos");
		lblCosmticos.setForeground(new Color(0, 102, 204));
		Mouse_S2.mouseINOUT(lblCosmticos);
		
		JLabel lblNewLabel_9 = new JLabel("    Plantas e Flores");
		lblNewLabel_9.setForeground(new Color(0, 102, 204));
		Mouse_S2.mouseINOUT(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("    Higiene");
		lblNewLabel_10.setForeground(new Color(0, 102, 204));
		Mouse_S2.mouseINOUT(lblNewLabel_10);
		GroupLayout gl_layeredPane_3 = new GroupLayout(layeredPane_3);
		gl_layeredPane_3.setHorizontalGroup(
			gl_layeredPane_3.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_layeredPane_3.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_layeredPane_3.createParallelGroup(Alignment.LEADING, false)
						.addComponent(lblJardinagem, GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
						.addComponent(label_6, GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
						.addComponent(lblNewLabel_9)
						.addComponent(lblNewLabel_10)
						.addComponent(label_3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(label_4, GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
						.addComponent(lblNewLabel_5, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(label_7, GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
						.addComponent(lblCosmticos, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addContainerGap(76, Short.MAX_VALUE))
		);
		gl_layeredPane_3.setVerticalGroup(
			gl_layeredPane_3.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_layeredPane_3.createSequentialGroup()
					.addContainerGap()
					.addComponent(label_3)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(label_4)
					.addGap(6)
					.addComponent(lblJardinagem)
					.addGap(6)
					.addComponent(label_6)
					.addGap(6)
					.addComponent(label_7)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel_9)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel_5)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblCosmticos)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel_10)
					.addContainerGap(22, Short.MAX_VALUE))
		);
		layeredPane_3.setLayout(gl_layeredPane_3);
		setLayout(groupLayout);

	}
}
