package Presentation_Layer.Home;

import java.awt.Color;
import java.awt.Font;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.LayoutStyle.ComponentPlacement;

import org.jdesktop.swingx.JXHyperlink;

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

		JXHyperlink hprlnkColleccionveisEArte = new JXHyperlink();
		hprlnkColleccionveisEArte.setText("Colecionáveis e Arte");
		hprlnkColleccionveisEArte.setForeground(new Color(0, 102, 204));
		hprlnkColleccionveisEArte.setFont(new Font("Lucida Grande", Font.BOLD,
				15));

		JXHyperlink hprlnkModa = new JXHyperlink();
		hprlnkModa.setText("Moda");
		hprlnkModa.setForeground(new Color(0, 102, 204));
		hprlnkModa.setFont(new Font("Lucida Grande", Font.BOLD, 15));

		JXHyperlink hprlnkSelos = new JXHyperlink();
		hprlnkSelos.setText("Selos");
		hprlnkSelos.setForeground(new Color(0, 102, 204));

		JXHyperlink hprlnkMoedasENotas = new JXHyperlink();
		hprlnkMoedasENotas.setText("Moedas e Notas");
		hprlnkMoedasENotas.setForeground(new Color(0, 102, 204));

		JXHyperlink hprlnkMedalhas = new JXHyperlink();
		hprlnkMedalhas.setText("Medalhas");
		hprlnkMedalhas.setForeground(new Color(0, 102, 204));

		JXHyperlink hprlnkAntiguidades = new JXHyperlink();
		hprlnkAntiguidades.setText("Antiguidades");
		hprlnkAntiguidades.setForeground(new Color(0, 102, 204));

		JXHyperlink hprlnkArte = new JXHyperlink();
		hprlnkArte.setText("Arte");
		hprlnkArte.setForeground(new Color(0, 102, 204));

		JXHyperlink hprlnkVesturio = new JXHyperlink();
		hprlnkVesturio.setText("Vestuário");
		hprlnkVesturio.setForeground(new Color(0, 102, 204));

		JXHyperlink hprlnkAcessrios = new JXHyperlink();
		hprlnkAcessrios.setText("Acessórios");
		hprlnkAcessrios.setForeground(new Color(0, 102, 204));

		GroupLayout gl_layeredPane_1 = new GroupLayout(layeredPane_1);
		gl_layeredPane_1
				.setHorizontalGroup(gl_layeredPane_1
						.createParallelGroup(Alignment.LEADING)
						.addGroup(
								gl_layeredPane_1
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												gl_layeredPane_1
														.createParallelGroup(
																Alignment.LEADING)
														.addGroup(
																gl_layeredPane_1
																		.createParallelGroup(
																				Alignment.LEADING)
																		.addGroup(
																				gl_layeredPane_1
																						.createParallelGroup(
																								Alignment.LEADING)
																						.addGroup(
																								Alignment.TRAILING,
																								gl_layeredPane_1
																										.createSequentialGroup()
																										.addComponent(
																												hprlnkColleccionveisEArte,
																												GroupLayout.DEFAULT_SIZE,
																												164,
																												Short.MAX_VALUE)
																										.addGap(7))
																						.addGroup(
																								gl_layeredPane_1
																										.createSequentialGroup()
																										.addComponent(
																												hprlnkModa,
																												GroupLayout.PREFERRED_SIZE,
																												164,
																												GroupLayout.PREFERRED_SIZE)
																										.addContainerGap(
																												7,
																												Short.MAX_VALUE)))
																		.addGroup(
																				gl_layeredPane_1
																						.createSequentialGroup()
																						.addGap(6)
																						.addGroup(
																								gl_layeredPane_1
																										.createParallelGroup(
																												Alignment.LEADING)
																										.addComponent(
																												hprlnkSelos,
																												GroupLayout.PREFERRED_SIZE,
																												GroupLayout.DEFAULT_SIZE,
																												GroupLayout.PREFERRED_SIZE)
																										.addComponent(
																												hprlnkMoedasENotas,
																												GroupLayout.PREFERRED_SIZE,
																												GroupLayout.DEFAULT_SIZE,
																												GroupLayout.PREFERRED_SIZE)
																										.addComponent(
																												hprlnkMedalhas,
																												GroupLayout.PREFERRED_SIZE,
																												GroupLayout.DEFAULT_SIZE,
																												GroupLayout.PREFERRED_SIZE)
																										.addComponent(
																												hprlnkAntiguidades,
																												GroupLayout.PREFERRED_SIZE,
																												GroupLayout.DEFAULT_SIZE,
																												GroupLayout.PREFERRED_SIZE)
																										.addComponent(
																												hprlnkArte,
																												GroupLayout.PREFERRED_SIZE,
																												GroupLayout.DEFAULT_SIZE,
																												GroupLayout.PREFERRED_SIZE))
																						.addGap(64)))
														.addGroup(
																gl_layeredPane_1
																		.createSequentialGroup()
																		.addGap(6)
																		.addGroup(
																				gl_layeredPane_1
																						.createParallelGroup(
																								Alignment.LEADING)
																						.addComponent(
																								hprlnkAcessrios,
																								GroupLayout.PREFERRED_SIZE,
																								GroupLayout.DEFAULT_SIZE,
																								GroupLayout.PREFERRED_SIZE)
																						.addComponent(
																								hprlnkVesturio,
																								GroupLayout.PREFERRED_SIZE,
																								89,
																								GroupLayout.PREFERRED_SIZE))
																		.addGap(76)))));
		gl_layeredPane_1.setVerticalGroup(gl_layeredPane_1.createParallelGroup(
				Alignment.LEADING).addGroup(
				gl_layeredPane_1
						.createSequentialGroup()
						.addContainerGap()
						.addComponent(hprlnkColleccionveisEArte,
								GroupLayout.PREFERRED_SIZE, 19,
								GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(hprlnkSelos, GroupLayout.PREFERRED_SIZE,
								16, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(hprlnkMoedasENotas,
								GroupLayout.PREFERRED_SIZE, 16,
								GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(hprlnkMedalhas,
								GroupLayout.PREFERRED_SIZE, 16,
								GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(hprlnkAntiguidades,
								GroupLayout.PREFERRED_SIZE, 16,
								GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(hprlnkArte, GroupLayout.PREFERRED_SIZE,
								16, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(hprlnkModa, GroupLayout.PREFERRED_SIZE,
								19, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(hprlnkVesturio,
								GroupLayout.PREFERRED_SIZE, 16,
								GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(hprlnkAcessrios,
								GroupLayout.PREFERRED_SIZE, 16,
								GroupLayout.PREFERRED_SIZE)
						.addContainerGap(GroupLayout.DEFAULT_SIZE,
								Short.MAX_VALUE)));
		layeredPane_1.setLayout(gl_layeredPane_1);

		JLayeredPane layeredPane_2 = new JLayeredPane();

		JXHyperlink hprlnkAuto = new JXHyperlink();
		hprlnkAuto.setForeground(new Color(0, 102, 204));
		hprlnkAuto.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		hprlnkAuto.setText("Auto");

		JXHyperlink hprlnkPeasAuto = new JXHyperlink();
		hprlnkPeasAuto.setForeground(new Color(0, 102, 204));
		hprlnkPeasAuto.setText("Peças Auto");

		JXHyperlink hprlnkVeculos = new JXHyperlink();
		hprlnkVeculos.setForeground(new Color(0, 102, 204));
		hprlnkVeculos.setText("Veículos");

		JXHyperlink hprlnkLivrosERevistas = new JXHyperlink();
		hprlnkLivrosERevistas.setText("Livros e Revistas\n");
		hprlnkLivrosERevistas.setForeground(new Color(0, 102, 204));
		hprlnkLivrosERevistas.setFont(new Font("Lucida Grande", Font.BOLD, 15));

		JXHyperlink hprlnkRevistas = new JXHyperlink();
		hprlnkRevistas.setText("Revistas");
		hprlnkRevistas.setForeground(new Color(0, 102, 204));

		JXHyperlink hprlnkManuaisEscolares = new JXHyperlink();
		hprlnkManuaisEscolares.setText("Manuais Escolares");
		hprlnkManuaisEscolares.setForeground(new Color(0, 102, 204));

		JXHyperlink hprlnkLiteratura = new JXHyperlink();
		hprlnkLiteratura.setText("Literatura");
		hprlnkLiteratura.setForeground(new Color(0, 102, 204));

		JXHyperlink hprlnkLiteraturaInfantil = new JXHyperlink();
		hprlnkLiteraturaInfantil.setText("Literatura Infantil");
		hprlnkLiteraturaInfantil.setForeground(new Color(0, 102, 204));

		JXHyperlink hprlnkBandaDesenhada = new JXHyperlink();
		hprlnkBandaDesenhada.setText("Banda Desenhada");
		hprlnkBandaDesenhada.setForeground(new Color(0, 102, 204));
		GroupLayout gl_layeredPane = new GroupLayout(layeredPane);
		gl_layeredPane
				.setHorizontalGroup(gl_layeredPane
						.createParallelGroup(Alignment.TRAILING)
						.addGroup(
								Alignment.LEADING,
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
																		.addGap(6)
																		.addGroup(
																				gl_layeredPane
																						.createParallelGroup(
																								Alignment.LEADING)
																						.addComponent(
																								hprlnkManuaisEscolares,
																								GroupLayout.PREFERRED_SIZE,
																								GroupLayout.DEFAULT_SIZE,
																								GroupLayout.PREFERRED_SIZE)
																						.addComponent(
																								hprlnkRevistas,
																								GroupLayout.PREFERRED_SIZE,
																								89,
																								GroupLayout.PREFERRED_SIZE)
																						.addComponent(
																								hprlnkLiteratura,
																								GroupLayout.PREFERRED_SIZE,
																								GroupLayout.DEFAULT_SIZE,
																								GroupLayout.PREFERRED_SIZE)
																						.addComponent(
																								hprlnkLiteraturaInfantil,
																								GroupLayout.PREFERRED_SIZE,
																								GroupLayout.DEFAULT_SIZE,
																								GroupLayout.PREFERRED_SIZE)
																						.addComponent(
																								hprlnkBandaDesenhada,
																								GroupLayout.PREFERRED_SIZE,
																								GroupLayout.DEFAULT_SIZE,
																								GroupLayout.PREFERRED_SIZE)))
														.addComponent(
																hprlnkAuto,
																GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE,
																GroupLayout.PREFERRED_SIZE)
														.addGroup(
																gl_layeredPane
																		.createSequentialGroup()
																		.addGap(6)
																		.addGroup(
																				gl_layeredPane
																						.createParallelGroup(
																								Alignment.LEADING)
																						.addComponent(
																								hprlnkVeculos,
																								GroupLayout.PREFERRED_SIZE,
																								GroupLayout.DEFAULT_SIZE,
																								GroupLayout.PREFERRED_SIZE)
																						.addComponent(
																								hprlnkPeasAuto,
																								GroupLayout.PREFERRED_SIZE,
																								GroupLayout.DEFAULT_SIZE,
																								GroupLayout.PREFERRED_SIZE)))
														.addComponent(
																hprlnkLivrosERevistas,
																GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE,
																GroupLayout.PREFERRED_SIZE))
										.addContainerGap(7, Short.MAX_VALUE)));
		gl_layeredPane.setVerticalGroup(gl_layeredPane.createParallelGroup(
				Alignment.LEADING).addGroup(
				gl_layeredPane
						.createSequentialGroup()
						.addGap(8)
						.addComponent(hprlnkAuto, GroupLayout.PREFERRED_SIZE,
								GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(hprlnkPeasAuto,
								GroupLayout.PREFERRED_SIZE,
								GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(hprlnkVeculos,
								GroupLayout.PREFERRED_SIZE,
								GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(hprlnkLivrosERevistas,
								GroupLayout.PREFERRED_SIZE, 19,
								GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(hprlnkRevistas,
								GroupLayout.PREFERRED_SIZE, 16,
								GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(hprlnkManuaisEscolares,
								GroupLayout.PREFERRED_SIZE, 16,
								GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(hprlnkLiteratura,
								GroupLayout.PREFERRED_SIZE, 16,
								GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(hprlnkLiteraturaInfantil,
								GroupLayout.PREFERRED_SIZE, 16,
								GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(hprlnkBandaDesenhada,
								GroupLayout.PREFERRED_SIZE, 16,
								GroupLayout.PREFERRED_SIZE).addGap(4)));
		layeredPane.setLayout(gl_layeredPane);

		JXHyperlink hprlnkTecnologiaEElectrnica = new JXHyperlink();
		hprlnkTecnologiaEElectrnica.setText("Tecnologia e Electrónica");
		hprlnkTecnologiaEElectrnica.setForeground(new Color(0, 102, 204));
		hprlnkTecnologiaEElectrnica.setFont(new Font("Lucida Grande",
				Font.BOLD, 15));

		JXHyperlink hprlnkOutros = new JXHyperlink();
		hprlnkOutros.setText("Outros");
		hprlnkOutros.setForeground(new Color(0, 102, 204));
		hprlnkOutros.setFont(new Font("Lucida Grande", Font.BOLD, 15));

		JXHyperlink hprlnkudioTvE = new JXHyperlink();
		hprlnkudioTvE.setText("Áudio Tv e Vídeo");
		hprlnkudioTvE.setForeground(new Color(0, 102, 204));

		JXHyperlink hprlnkConsolas = new JXHyperlink();
		hprlnkConsolas.setText("Consolas");
		hprlnkConsolas.setForeground(new Color(0, 102, 204));

		JXHyperlink hprlnkFotografia = new JXHyperlink();
		hprlnkFotografia.setText("Fotografia");
		hprlnkFotografia.setForeground(new Color(0, 102, 204));

		JXHyperlink hprlnkInformtica = new JXHyperlink();
		hprlnkInformtica.setText("Informática");
		hprlnkInformtica.setForeground(new Color(0, 102, 204));

		JXHyperlink hprlnkTelemveisETelefones = new JXHyperlink();
		hprlnkTelemveisETelefones.setText("Telemóveis e Telefones");
		hprlnkTelemveisETelefones.setForeground(new Color(0, 102, 204));

		JXHyperlink hprlnkGadgets = new JXHyperlink();
		hprlnkGadgets.setText("Gadgets");
		hprlnkGadgets.setForeground(new Color(0, 102, 204));

		JXHyperlink hprlnkCircuitos = new JXHyperlink();
		hprlnkCircuitos.setText("Circuitos");
		hprlnkCircuitos.setForeground(new Color(0, 102, 204));

		GroupLayout gl_layeredPane_2 = new GroupLayout(layeredPane_2);
		gl_layeredPane_2
				.setHorizontalGroup(gl_layeredPane_2
						.createParallelGroup(Alignment.LEADING)
						.addGroup(
								gl_layeredPane_2
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												gl_layeredPane_2
														.createParallelGroup(
																Alignment.LEADING)
														.addGroup(
																gl_layeredPane_2
																		.createParallelGroup(
																				Alignment.LEADING)
																		.addComponent(
																				hprlnkTecnologiaEElectrnica,
																				GroupLayout.DEFAULT_SIZE,
																				194,
																				Short.MAX_VALUE)
																		.addGroup(
																				gl_layeredPane_2
																						.createSequentialGroup()
																						.addComponent(
																								hprlnkOutros,
																								GroupLayout.PREFERRED_SIZE,
																								164,
																								GroupLayout.PREFERRED_SIZE)
																						.addContainerGap(
																								30,
																								Short.MAX_VALUE)))
														.addGroup(
																gl_layeredPane_2
																		.createSequentialGroup()
																		.addGap(6)
																		.addGroup(
																				gl_layeredPane_2
																						.createParallelGroup(
																								Alignment.LEADING)
																						.addComponent(
																								hprlnkConsolas,
																								GroupLayout.PREFERRED_SIZE,
																								89,
																								GroupLayout.PREFERRED_SIZE)
																						.addComponent(
																								hprlnkFotografia,
																								GroupLayout.PREFERRED_SIZE,
																								89,
																								GroupLayout.PREFERRED_SIZE)
																						.addComponent(
																								hprlnkInformtica,
																								GroupLayout.PREFERRED_SIZE,
																								89,
																								GroupLayout.PREFERRED_SIZE)
																						.addComponent(
																								hprlnkGadgets,
																								GroupLayout.PREFERRED_SIZE,
																								89,
																								GroupLayout.PREFERRED_SIZE)
																						.addComponent(
																								hprlnkCircuitos,
																								GroupLayout.PREFERRED_SIZE,
																								89,
																								GroupLayout.PREFERRED_SIZE)
																						.addComponent(
																								hprlnkudioTvE,
																								GroupLayout.PREFERRED_SIZE,
																								GroupLayout.DEFAULT_SIZE,
																								GroupLayout.PREFERRED_SIZE)
																						.addComponent(
																								hprlnkTelemveisETelefones,
																								GroupLayout.PREFERRED_SIZE,
																								GroupLayout.DEFAULT_SIZE,
																								GroupLayout.PREFERRED_SIZE))
																		.addGap(38)))));
		gl_layeredPane_2.setVerticalGroup(gl_layeredPane_2.createParallelGroup(
				Alignment.LEADING).addGroup(
				gl_layeredPane_2
						.createSequentialGroup()
						.addContainerGap()
						.addComponent(hprlnkTecnologiaEElectrnica,
								GroupLayout.PREFERRED_SIZE, 19,
								GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(hprlnkudioTvE,
								GroupLayout.PREFERRED_SIZE, 16,
								GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(hprlnkConsolas,
								GroupLayout.PREFERRED_SIZE, 16,
								GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(hprlnkFotografia,
								GroupLayout.PREFERRED_SIZE, 16,
								GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(hprlnkInformtica,
								GroupLayout.PREFERRED_SIZE, 16,
								GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(hprlnkTelemveisETelefones,
								GroupLayout.PREFERRED_SIZE, 16,
								GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(hprlnkGadgets,
								GroupLayout.PREFERRED_SIZE, 16,
								GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(hprlnkCircuitos,
								GroupLayout.PREFERRED_SIZE, 16,
								GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(hprlnkOutros, GroupLayout.PREFERRED_SIZE,
								19, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(GroupLayout.DEFAULT_SIZE,
								Short.MAX_VALUE)));
		layeredPane_2.setLayout(gl_layeredPane_2);

		JLayeredPane layeredPane_3 = new JLayeredPane();

		JPanel panel = new JPanel();
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(
				Alignment.LEADING).addGroup(
				Alignment.TRAILING,
				groupLayout
						.createSequentialGroup()
						.addContainerGap()
						.addComponent(layeredPane, GroupLayout.DEFAULT_SIZE,
								152, Short.MAX_VALUE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(layeredPane_3, GroupLayout.DEFAULT_SIZE,
								127, Short.MAX_VALUE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(layeredPane_1,
								GroupLayout.PREFERRED_SIZE, 175,
								Short.MAX_VALUE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(panel, GroupLayout.PREFERRED_SIZE, 223,
								Short.MAX_VALUE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(layeredPane_2, GroupLayout.DEFAULT_SIZE,
								203, Short.MAX_VALUE).addGap(12)));
		groupLayout
				.setVerticalGroup(groupLayout
						.createParallelGroup(Alignment.LEADING)
						.addGroup(
								Alignment.TRAILING,
								groupLayout
										.createSequentialGroup()
										.addGroup(
												groupLayout
														.createParallelGroup(
																Alignment.TRAILING)
														.addGroup(
																Alignment.LEADING,
																groupLayout
																		.createSequentialGroup()
																		.addContainerGap()
																		.addGroup(
																				groupLayout
																						.createParallelGroup(
																								Alignment.LEADING)
																						.addComponent(
																								layeredPane_3,
																								Alignment.TRAILING,
																								GroupLayout.PREFERRED_SIZE,
																								204,
																								Short.MAX_VALUE)
																						.addComponent(
																								layeredPane,
																								GroupLayout.PREFERRED_SIZE,
																								204,
																								Short.MAX_VALUE)
																						.addComponent(
																								layeredPane_1,
																								0,
																								0,
																								Short.MAX_VALUE)))
														.addGroup(
																Alignment.LEADING,
																groupLayout
																		.createSequentialGroup()
																		.addContainerGap()
																		.addGroup(
																				groupLayout
																						.createParallelGroup(
																								Alignment.LEADING)
																						.addComponent(
																								layeredPane_2,
																								Alignment.TRAILING,
																								GroupLayout.PREFERRED_SIZE,
																								204,
																								Short.MAX_VALUE)
																						.addComponent(
																								panel,
																								GroupLayout.PREFERRED_SIZE,
																								204,
																								Short.MAX_VALUE))))
										.addContainerGap()));

		JXHyperlink hprlnkDesportoEEntretenimento = new JXHyperlink();
		hprlnkDesportoEEntretenimento.setText("Desporto e Entretenimento");
		hprlnkDesportoEEntretenimento.setForeground(new Color(0, 102, 204));
		hprlnkDesportoEEntretenimento.setFont(new Font("Lucida Grande",
				Font.BOLD, 15));

		JXHyperlink hprlnkBrinquedos = new JXHyperlink();
		hprlnkBrinquedos.setText("Brinquedos");
		hprlnkBrinquedos.setForeground(new Color(0, 102, 204));

		JXHyperlink hprlnkFitnessEMusculao = new JXHyperlink();
		hprlnkFitnessEMusculao.setText("Fitness e Musculação");
		hprlnkFitnessEMusculao.setForeground(new Color(0, 102, 204));

		JXHyperlink hprlnkFilmesECinema = new JXHyperlink();
		hprlnkFilmesECinema.setText("Filmes e Cinema");
		hprlnkFilmesECinema.setForeground(new Color(0, 102, 204));

		JXHyperlink hprlnkMsica = new JXHyperlink();
		hprlnkMsica.setText("Música");
		hprlnkMsica.setForeground(new Color(0, 102, 204));

		JXHyperlink hprlnkCaaEPesca = new JXHyperlink();
		hprlnkCaaEPesca.setText("Caça e Pesca");
		hprlnkCaaEPesca.setForeground(new Color(0, 102, 204));

		JXHyperlink hprlnkCampismo = new JXHyperlink();
		hprlnkCampismo.setText("Campismo");
		hprlnkCampismo.setForeground(new Color(0, 102, 204));

		JXHyperlink hprlnkFutebol = new JXHyperlink();
		hprlnkFutebol.setText("Futebol");
		hprlnkFutebol.setForeground(new Color(0, 102, 204));

		JXHyperlink hprlnkNatao = new JXHyperlink();
		hprlnkNatao.setText("Natação");
		hprlnkNatao.setForeground(new Color(0, 102, 204));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(gl_panel
				.createParallelGroup(Alignment.LEADING)
				.addGroup(
						gl_panel.createSequentialGroup()
								.addContainerGap()
								.addGroup(
										gl_panel.createParallelGroup(
												Alignment.LEADING)
												.addComponent(
														hprlnkDesportoEEntretenimento,
														GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE,
														GroupLayout.PREFERRED_SIZE)
												.addGroup(
														gl_panel.createSequentialGroup()
																.addGap(6)
																.addGroup(
																		gl_panel.createParallelGroup(
																				Alignment.LEADING)
																				.addComponent(
																						hprlnkBrinquedos,
																						GroupLayout.PREFERRED_SIZE,
																						89,
																						GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						hprlnkMsica,
																						GroupLayout.PREFERRED_SIZE,
																						89,
																						GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						hprlnkCaaEPesca,
																						GroupLayout.PREFERRED_SIZE,
																						89,
																						GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						hprlnkCampismo,
																						GroupLayout.PREFERRED_SIZE,
																						89,
																						GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						hprlnkFutebol,
																						GroupLayout.PREFERRED_SIZE,
																						89,
																						GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						hprlnkNatao,
																						GroupLayout.PREFERRED_SIZE,
																						89,
																						GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						hprlnkFitnessEMusculao,
																						GroupLayout.PREFERRED_SIZE,
																						GroupLayout.DEFAULT_SIZE,
																						GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						hprlnkFilmesECinema,
																						GroupLayout.PREFERRED_SIZE,
																						GroupLayout.DEFAULT_SIZE,
																						GroupLayout.PREFERRED_SIZE))))
								.addContainerGap(GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)));
		gl_panel.setVerticalGroup(gl_panel.createParallelGroup(
				Alignment.LEADING).addGroup(
				gl_panel.createSequentialGroup()
						.addContainerGap()
						.addComponent(hprlnkDesportoEEntretenimento,
								GroupLayout.PREFERRED_SIZE, 19,
								GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(hprlnkBrinquedos,
								GroupLayout.PREFERRED_SIZE, 16,
								GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(hprlnkFitnessEMusculao,
								GroupLayout.PREFERRED_SIZE, 16,
								GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(hprlnkFilmesECinema,
								GroupLayout.PREFERRED_SIZE, 16,
								GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(hprlnkMsica, GroupLayout.PREFERRED_SIZE,
								16, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(hprlnkCaaEPesca,
								GroupLayout.PREFERRED_SIZE, 16,
								GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(hprlnkCampismo,
								GroupLayout.PREFERRED_SIZE, 16,
								GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(hprlnkFutebol,
								GroupLayout.PREFERRED_SIZE, 16,
								GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(hprlnkNatao, GroupLayout.PREFERRED_SIZE,
								16, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(9, Short.MAX_VALUE)));
		panel.setLayout(gl_panel);

		JXHyperlink hprlnkCasaEJardim = new JXHyperlink();
		hprlnkCasaEJardim.setText("Casa e Jardim");
		hprlnkCasaEJardim.setForeground(new Color(0, 102, 204));
		hprlnkCasaEJardim.setFont(new Font("Lucida Grande", Font.BOLD, 15));

		JXHyperlink hprlnkSade = new JXHyperlink();
		hprlnkSade.setText("Saúde");
		hprlnkSade.setForeground(new Color(0, 102, 204));
		hprlnkSade.setFont(new Font("Lucida Grande", Font.BOLD, 15));

		JXHyperlink hprlnkAnimais = new JXHyperlink();
		hprlnkAnimais.setText("Animais");
		hprlnkAnimais.setForeground(new Color(0, 102, 204));

		JXHyperlink hprlnkJardinagem = new JXHyperlink();
		hprlnkJardinagem.setText("Jardinagem");
		hprlnkJardinagem.setForeground(new Color(0, 102, 204));

		JXHyperlink hprlnkImveis = new JXHyperlink();
		hprlnkImveis.setText("Imóveis");
		hprlnkImveis.setForeground(new Color(0, 102, 204));

		JXHyperlink hprlnkMoblia = new JXHyperlink();
		hprlnkMoblia.setText("Mobília");
		hprlnkMoblia.setForeground(new Color(0, 102, 204));

		JXHyperlink hprlnkPlantasEFlores = new JXHyperlink();
		hprlnkPlantasEFlores.setText("Plantas e Flores");
		hprlnkPlantasEFlores.setForeground(new Color(0, 102, 204));

		JXHyperlink hprlnkHigiene = new JXHyperlink();
		hprlnkHigiene.setText("Higiene");
		hprlnkHigiene.setForeground(new Color(0, 102, 204));

		JXHyperlink hprlnkCosmticos = new JXHyperlink();
		hprlnkCosmticos.setText("Cosméticos");
		hprlnkCosmticos.setForeground(new Color(0, 102, 204));
		GroupLayout gl_layeredPane_3 = new GroupLayout(layeredPane_3);
		gl_layeredPane_3
				.setHorizontalGroup(gl_layeredPane_3
						.createParallelGroup(Alignment.LEADING)
						.addGroup(
								gl_layeredPane_3
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												gl_layeredPane_3
														.createParallelGroup(
																Alignment.LEADING)
														.addComponent(
																hprlnkCasaEJardim,
																GroupLayout.PREFERRED_SIZE,
																112,
																GroupLayout.PREFERRED_SIZE)
														.addComponent(
																hprlnkSade,
																GroupLayout.PREFERRED_SIZE,
																112,
																GroupLayout.PREFERRED_SIZE)
														.addGroup(
																gl_layeredPane_3
																		.createSequentialGroup()
																		.addGap(6)
																		.addGroup(
																				gl_layeredPane_3
																						.createParallelGroup(
																								Alignment.LEADING)
																						.addComponent(
																								hprlnkMoblia,
																								GroupLayout.PREFERRED_SIZE,
																								89,
																								GroupLayout.PREFERRED_SIZE)
																						.addComponent(
																								hprlnkImveis,
																								GroupLayout.PREFERRED_SIZE,
																								GroupLayout.DEFAULT_SIZE,
																								GroupLayout.PREFERRED_SIZE)
																						.addComponent(
																								hprlnkJardinagem,
																								GroupLayout.PREFERRED_SIZE,
																								GroupLayout.DEFAULT_SIZE,
																								GroupLayout.PREFERRED_SIZE)
																						.addComponent(
																								hprlnkAnimais,
																								GroupLayout.PREFERRED_SIZE,
																								GroupLayout.DEFAULT_SIZE,
																								GroupLayout.PREFERRED_SIZE)
																						.addComponent(
																								hprlnkPlantasEFlores,
																								GroupLayout.PREFERRED_SIZE,
																								GroupLayout.DEFAULT_SIZE,
																								GroupLayout.PREFERRED_SIZE)))
														.addGroup(
																gl_layeredPane_3
																		.createSequentialGroup()
																		.addGap(6)
																		.addGroup(
																				gl_layeredPane_3
																						.createParallelGroup(
																								Alignment.LEADING)
																						.addComponent(
																								hprlnkCosmticos,
																								GroupLayout.PREFERRED_SIZE,
																								89,
																								GroupLayout.PREFERRED_SIZE)
																						.addComponent(
																								hprlnkHigiene,
																								GroupLayout.PREFERRED_SIZE,
																								89,
																								GroupLayout.PREFERRED_SIZE))))
										.addContainerGap(21, Short.MAX_VALUE)));
		gl_layeredPane_3.setVerticalGroup(gl_layeredPane_3.createParallelGroup(
				Alignment.LEADING).addGroup(
				gl_layeredPane_3
						.createSequentialGroup()
						.addContainerGap()
						.addComponent(hprlnkCasaEJardim,
								GroupLayout.PREFERRED_SIZE, 19,
								GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(hprlnkAnimais,
								GroupLayout.PREFERRED_SIZE, 16,
								GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(hprlnkJardinagem,
								GroupLayout.PREFERRED_SIZE, 16,
								GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(hprlnkImveis, GroupLayout.PREFERRED_SIZE,
								16, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(hprlnkMoblia, GroupLayout.PREFERRED_SIZE,
								16, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(hprlnkPlantasEFlores,
								GroupLayout.PREFERRED_SIZE, 16,
								GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(hprlnkSade, GroupLayout.PREFERRED_SIZE,
								19, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(hprlnkHigiene,
								GroupLayout.PREFERRED_SIZE, 16,
								GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(hprlnkCosmticos,
								GroupLayout.PREFERRED_SIZE, 16,
								GroupLayout.PREFERRED_SIZE)
						.addContainerGap(GroupLayout.DEFAULT_SIZE,
								Short.MAX_VALUE)));
		layeredPane_3.setLayout(gl_layeredPane_3);
		setLayout(groupLayout);

	}
}
