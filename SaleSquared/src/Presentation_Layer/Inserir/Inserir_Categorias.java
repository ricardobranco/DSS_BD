package Presentation_Layer.Inserir;

import java.awt.Font;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.LayoutStyle.ComponentPlacement;

import Business_Layer.Categoria;

public class Inserir_Categorias extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */

	private Map<String, Categoria> categorias;
	private List<JCheckBox> jcbs;

	public Inserir_Categorias() {
                
                Categoria todos = new Categoria("Todos");
                
		this.categorias = new HashMap<>();
		this.jcbs = new ArrayList<>();
		JLabel label = new JLabel("Categoria");
		label.setFont(new Font("Lucida Grande", Font.BOLD, 13));

		// Auto
		JCheckBox cbauto = new JCheckBox("Auto");
		JCheckBox cbpecas = new JCheckBox("Peças Auto");
		JCheckBox cbveiculos = new JCheckBox("Veículos");

		this.jcbs.add(cbveiculos);
		this.jcbs.add(cbpecas);
		this.jcbs.add(cbauto);

		Categoria cauto = new Categoria("Auto",todos);
		Categoria cpecas = new Categoria("Peças Auto", cauto);
		Categoria cveiculos = new Categoria("Veículos", cauto);

		categorias.put(cbauto.getText(), cauto);
		categorias.put(cbpecas.getText(), cpecas);
		categorias.put(cbveiculos.getText(), cveiculos);

		// Moda
		JCheckBox cbmoda = new JCheckBox("Moda");
		JCheckBox cbacessorios = new JCheckBox("Acessórios");
		JCheckBox cbvestuario = new JCheckBox("Vestuário");

		this.jcbs.add(cbvestuario);
		this.jcbs.add(cbacessorios);
		this.jcbs.add(cbmoda);

		Categoria cmoda = new Categoria("Moda",todos);
		Categoria cacessorios = new Categoria("Acessórios", cmoda);
		Categoria cvestuario = new Categoria("Vestuário", cmoda);

		categorias.put(cbmoda.getText(), cmoda);
		categorias.put(cbvestuario.getText(), cvestuario);
		categorias.put(cbacessorios.getText(), cacessorios);

		// Saúde
		JCheckBox cbsaude = new JCheckBox("Saúde");
		JCheckBox cbcosmeticos = new JCheckBox("Cosméticos");
		JCheckBox cbhigiene = new JCheckBox("Higiene");

		this.jcbs.add(cbhigiene);
		this.jcbs.add(cbcosmeticos);
		this.jcbs.add(cbsaude);

		Categoria csaude = new Categoria("Saúde",todos);
		Categoria ccosmeticos = new Categoria("Cosméticos", csaude);
		Categoria chigiene = new Categoria("Higiene", csaude);

		categorias.put(cbsaude.getText(), csaude);
		categorias.put(cbcosmeticos.getText(), ccosmeticos);
		categorias.put(cbhigiene.getText(), chigiene);
		// Casa e Jardim
		JCheckBox cbcasajardim = new JCheckBox("Casa e Jardim");
		JCheckBox cbartjardim = new JCheckBox("Artigos de Jardim");
		JCheckBox cbanimais = new JCheckBox("Animais");
		JCheckBox cbimoveis = new JCheckBox("Imóveis");
		JCheckBox cbmoveis = new JCheckBox("Mobiliário");
		JCheckBox cbplantas = new JCheckBox("Plantas e Flores");

		this.jcbs.add(cbmoveis);
		this.jcbs.add(cbimoveis);
		this.jcbs.add(cbcasajardim);
		this.jcbs.add(cbartjardim);
		this.jcbs.add(cbanimais);
		this.jcbs.add(cbplantas);

		Categoria ccasajardim = new Categoria("Casa e Jardim",todos);
		Categoria cartjardim = new Categoria("Artigos de Jardim", ccasajardim);
		Categoria canimais = new Categoria("Animais", ccasajardim);
		Categoria cimoveis = new Categoria("Imóveis", ccasajardim);
		Categoria cmoveis = new Categoria("Mobiliário", ccasajardim);
		Categoria cplantas = new Categoria("Plantas e Flores", ccasajardim);

		categorias.put(cbcasajardim.getText(), ccasajardim);
		categorias.put(cbartjardim.getText(), cartjardim);
		categorias.put(cbanimais.getText(), canimais);
		categorias.put(cbimoveis.getText(), cimoveis);
		categorias.put(cbmoveis.getText(), cmoveis);
		categorias.put(cbplantas.getText(), cplantas);

		// Colecionáveis e Arte

		JCheckBox cbcolecarte = new JCheckBox("Coleccionáveis e Arte");
		JCheckBox cbmoedas = new JCheckBox("Moeda e Notas");
		JCheckBox cbselos = new JCheckBox("Selos");
		JCheckBox cbmedalhas = new JCheckBox("Medalhas");
		JCheckBox cbantiguidade = new JCheckBox("Antiguidades");
		JCheckBox cbarte = new JCheckBox("Arte");

		this.jcbs.add(cbcolecarte);
		this.jcbs.add(cbmedalhas);
		this.jcbs.add(cbmoedas);
		this.jcbs.add(cbselos);
		this.jcbs.add(cbantiguidade);
		this.jcbs.add(cbarte);

		Categoria ccolarte = new Categoria("Coleccionáveis e Arte",todos);
		Categoria cmoedas = new Categoria("Moedas e Notas", ccolarte);
		Categoria cselos = new Categoria("Selos", ccolarte);
		Categoria cmedalhas = new Categoria("Medalhas", ccolarte);
		Categoria cantiguidade = new Categoria("Antiguidades", ccolarte);
		Categoria carte = new Categoria("Arte", ccolarte);

		categorias.put(cbcolecarte.getText(), ccolarte);
		categorias.put(cbmoedas.getText(), cmoedas);
		categorias.put(cbselos.getText(), cselos);
		categorias.put(cbmedalhas.getText(), cmedalhas);
		categorias.put(cbantiguidade.getText(), cantiguidade);
		categorias.put(cbarte.getText(), carte);

		// Tecnologia e Electrónica

		JCheckBox cbtecelec = new JCheckBox("Tecnologia e Electrónica");
		JCheckBox cbconsolas = new JCheckBox("Consolas");
		JCheckBox cbaudio = new JCheckBox("Áudio, TV e Vídeo");
		JCheckBox cbfoto = new JCheckBox("Fotografia");
		JCheckBox cbtelm = new JCheckBox("Telemóveis e Telefones");
		JCheckBox cbinfo = new JCheckBox("Informática");
		JCheckBox cbgad = new JCheckBox("Gadgets");
		JCheckBox cbcirc = new JCheckBox("Circuitos");

		this.jcbs.add(cbtecelec);
		this.jcbs.add(cbconsolas);
		this.jcbs.add(cbaudio);
		this.jcbs.add(cbfoto);
		this.jcbs.add(cbtelm);
		this.jcbs.add(cbinfo);
		this.jcbs.add(cbgad);
		this.jcbs.add(cbcirc);

		Categoria ctecelec = new Categoria("Tecnologia e Electrónica",todos);
		Categoria cconsolas = new Categoria("Consolas", ctecelec);
		Categoria caudio = new Categoria("Áudio, Tv e Vídeo", ctecelec);
		Categoria cfoto = new Categoria("Fotografia", ctecelec);
		Categoria ctelme = new Categoria("Telemóveis e Telefones", ctecelec);
		Categoria cinfo = new Categoria("Informática", ctecelec);
		Categoria cgad = new Categoria("Gadgets", ctecelec);
		Categoria ccirc = new Categoria("Circuitos", ctecelec);

		categorias.put(cbtecelec.getText(), ctecelec);
		categorias.put(cbconsolas.getText(), cconsolas);
		categorias.put(cbaudio.getText(), caudio);
		categorias.put(cbfoto.getText(), cfoto);
		categorias.put(cbtelm.getText(), ctelme);
		categorias.put(cbinfo.getText(), cinfo);
		categorias.put(cbgad.getText(), cgad);
		categorias.put(cbcirc.getText(), ccirc);

		// Livros e Revistas

		JCheckBox cblivrevistas = new JCheckBox("Livros e Revistas");
		JCheckBox cbrevistas = new JCheckBox("Revistas");
		JCheckBox cbmanuais = new JCheckBox("Manuais Escolares");
		JCheckBox cblitinf = new JCheckBox("Literatura Infantil");
		JCheckBox cblit = new JCheckBox("Literatura");
		JCheckBox cbbd = new JCheckBox("Banda Desenhada");

		this.jcbs.add(cblivrevistas);
		this.jcbs.add(cbrevistas);
		this.jcbs.add(cblitinf);
		this.jcbs.add(cblit);
		this.jcbs.add(cbbd);

		Categoria clivrosrevistas = new Categoria("Livros e Revistas",todos);
		Categoria crevistas = new Categoria("Revistas", clivrosrevistas);
		Categoria cmanuais = new Categoria("Manuais Escolares", clivrosrevistas);
		Categoria clitinf = new Categoria("Literatura Infantil",
				clivrosrevistas);
		Categoria clit = new Categoria("Literatura", clivrosrevistas);
		Categoria cbd = new Categoria("Banda Desenhada", clivrosrevistas);

		categorias.put(cblivrevistas.getText(), clivrosrevistas);
		categorias.put(cbrevistas.getText(), crevistas);
		categorias.put(cbmanuais.getText(), cmanuais);
		categorias.put(cblitinf.getText(), clitinf);
		categorias.put(cblit.getText(), clit);
		categorias.put(cbbd.getText(), cbd);

		// Desporto e Entretenimento

		JCheckBox cbdespentre = new JCheckBox("Desporto e Entretenimento");
		JCheckBox cbbrinquedos = new JCheckBox("Brinquedos");
		JCheckBox cbfitness = new JCheckBox("Fitness e Musculação");
		JCheckBox cbfilmes = new JCheckBox("Filmes e Cinema");
		JCheckBox cbmusica = new JCheckBox("Música");
		JCheckBox cbcaca = new JCheckBox("Caça e Pesca");
		JCheckBox cbcampismo = new JCheckBox("Campismo");
		JCheckBox cbfutebol = new JCheckBox("Futebol");
		JCheckBox cbnatacao = new JCheckBox("Natação");

		this.jcbs.add(cbdespentre);
		this.jcbs.add(cbbrinquedos);
		this.jcbs.add(cbfitness);
		this.jcbs.add(cbfilmes);
		this.jcbs.add(cbmusica);
		this.jcbs.add(cbcaca);
		this.jcbs.add(cbcampismo);
		this.jcbs.add(cbfutebol);
		this.jcbs.add(cbnatacao);

		Categoria cdespentre = new Categoria("Desporto e Entretenimento",todos);
		Categoria cbrinquedos = new Categoria("Brinquedos", cdespentre);
		Categoria cfitness = new Categoria("Fitness e Musculação", cdespentre);
		Categoria cfilmes = new Categoria("Filmes e Cinema", cdespentre);
		Categoria cmusica = new Categoria("Música", cdespentre);
		Categoria ccaca = new Categoria("Caça e Pesca", cdespentre);
		Categoria ccampismo = new Categoria("Campismo", cdespentre);
		Categoria cfutebol = new Categoria("Futebol", cdespentre);
		Categoria cnatacao = new Categoria("Natação", cdespentre);

		categorias.put(cbdespentre.getText(), cdespentre);
		categorias.put(cbbrinquedos.getText(), cbrinquedos);
		categorias.put(cbfitness.getText(), cfitness);
		categorias.put(cbfilmes.getText(), cfilmes);
		categorias.put(cbmusica.getText(), cmusica);
		categorias.put(cbcaca.getText(), ccaca);
		categorias.put(cbcampismo.getText(), ccampismo);
		categorias.put(cbfutebol.getText(), cfutebol);
		categorias.put(cbnatacao.getText(), cnatacao);

		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout
				.setHorizontalGroup(groupLayout
						.createParallelGroup(Alignment.LEADING)
						.addGroup(
								groupLayout
										.createSequentialGroup()
										.addGroup(
												groupLayout
														.createParallelGroup(
																Alignment.LEADING)
														.addGroup(
																groupLayout
																		.createSequentialGroup()
																		.addGap(77)
																		.addGroup(
																				groupLayout
																						.createParallelGroup(
																								Alignment.LEADING)
																						.addComponent(
																								cbauto,
																								GroupLayout.PREFERRED_SIZE,
																								62,
																								GroupLayout.PREFERRED_SIZE)
																						.addComponent(
																								cblivrevistas)
																						.addGroup(
																								groupLayout
																										.createSequentialGroup()
																										.addGap(29)
																										.addGroup(
																												groupLayout
																														.createParallelGroup(
																																Alignment.LEADING)
																														.addComponent(
																																cbveiculos,
																																GroupLayout.PREFERRED_SIZE,
																																85,
																																GroupLayout.PREFERRED_SIZE)
																														.addComponent(
																																cbpecas,
																																GroupLayout.PREFERRED_SIZE,
																																101,
																																GroupLayout.PREFERRED_SIZE)))
																						.addGroup(
																								groupLayout
																										.createSequentialGroup()
																										.addGap(29)
																										.addGroup(
																												groupLayout
																														.createParallelGroup(
																																Alignment.LEADING)
																														.addComponent(
																																cbmanuais)
																														.addComponent(
																																cbrevistas)
																														.addComponent(
																																cblitinf)
																														.addComponent(
																																cblit)
																														.addComponent(
																																cbbd))))
																		.addGap(18)
																		.addGroup(
																				groupLayout
																						.createParallelGroup(
																								Alignment.LEADING)
																						.addGroup(
																								groupLayout
																										.createSequentialGroup()
																										.addGap(29)
																										.addGroup(
																												groupLayout
																														.createParallelGroup(
																																Alignment.LEADING)
																														.addComponent(
																																cbartjardim,
																																GroupLayout.PREFERRED_SIZE,
																																141,
																																GroupLayout.PREFERRED_SIZE)
																														.addComponent(
																																cbimoveis,
																																GroupLayout.PREFERRED_SIZE,
																																81,
																																GroupLayout.PREFERRED_SIZE)
																														.addComponent(
																																cbmoveis,
																																GroupLayout.PREFERRED_SIZE,
																																76,
																																GroupLayout.PREFERRED_SIZE)
																														.addComponent(
																																cbplantas)))
																						.addComponent(
																								cbsaude,
																								GroupLayout.PREFERRED_SIZE,
																								70,
																								GroupLayout.PREFERRED_SIZE)
																						.addGroup(
																								groupLayout
																										.createSequentialGroup()
																										.addGap(29)
																										.addGroup(
																												groupLayout
																														.createParallelGroup(
																																Alignment.LEADING)
																														.addComponent(
																																cbhigiene)
																														.addComponent(
																																cbcosmeticos,
																																GroupLayout.PREFERRED_SIZE,
																																106,
																																GroupLayout.PREFERRED_SIZE)))
																						.addComponent(
																								cbcasajardim,
																								GroupLayout.PREFERRED_SIZE,
																								117,
																								GroupLayout.PREFERRED_SIZE)
																						.addGroup(
																								groupLayout
																										.createSequentialGroup()
																										.addGap(29)
																										.addComponent(
																												cbanimais,
																												GroupLayout.PREFERRED_SIZE,
																												83,
																												GroupLayout.PREFERRED_SIZE)))
																		.addPreferredGap(
																				ComponentPlacement.RELATED)
																		.addGroup(
																				groupLayout
																						.createParallelGroup(
																								Alignment.LEADING)
																						.addGroup(
																								groupLayout
																										.createSequentialGroup()
																										.addGroup(
																												groupLayout
																														.createParallelGroup(
																																Alignment.LEADING)
																														.addComponent(
																																cbcolecarte,
																																GroupLayout.PREFERRED_SIZE,
																																167,
																																GroupLayout.PREFERRED_SIZE)
																														.addGroup(
																																groupLayout
																																		.createSequentialGroup()
																																		.addGap(29)
																																		.addGroup(
																																				groupLayout
																																						.createParallelGroup(
																																								Alignment.LEADING)
																																						.addComponent(
																																								cbmoedas,
																																								GroupLayout.PREFERRED_SIZE,
																																								125,
																																								GroupLayout.PREFERRED_SIZE)
																																						.addComponent(
																																								cbselos,
																																								GroupLayout.PREFERRED_SIZE,
																																								65,
																																								GroupLayout.PREFERRED_SIZE)
																																						.addComponent(
																																								cbmedalhas,
																																								GroupLayout.PREFERRED_SIZE,
																																								91,
																																								GroupLayout.PREFERRED_SIZE)
																																						.addComponent(
																																								cbantiguidade,
																																								GroupLayout.PREFERRED_SIZE,
																																								115,
																																								GroupLayout.PREFERRED_SIZE)
																																						.addComponent(
																																								cbarte,
																																								GroupLayout.PREFERRED_SIZE,
																																								58,
																																								GroupLayout.PREFERRED_SIZE)))
																														.addGroup(
																																groupLayout
																																		.createSequentialGroup()
																																		.addGap(29)
																																		.addGroup(
																																				groupLayout
																																						.createParallelGroup(
																																								Alignment.LEADING)
																																						.addComponent(
																																								cbacessorios,
																																								GroupLayout.PREFERRED_SIZE,
																																								101,
																																								GroupLayout.PREFERRED_SIZE)
																																						.addComponent(
																																								cbvestuario,
																																								GroupLayout.PREFERRED_SIZE,
																																								91,
																																								GroupLayout.PREFERRED_SIZE))))
																										.addGap(18)
																										.addGroup(
																												groupLayout
																														.createParallelGroup(
																																Alignment.LEADING)
																														.addComponent(
																																cbdespentre)
																														.addGroup(
																																groupLayout
																																		.createSequentialGroup()
																																		.addGap(29)
																																		.addGroup(
																																				groupLayout
																																						.createParallelGroup(
																																								Alignment.LEADING)
																																						.addComponent(
																																								cbfitness)
																																						.addComponent(
																																								cbbrinquedos)
																																						.addComponent(
																																								cbfilmes)
																																						.addComponent(
																																								cbmusica)
																																						.addComponent(
																																								cbcaca)
																																						.addComponent(
																																								cbcampismo)
																																						.addComponent(
																																								cbfutebol)
																																						.addComponent(
																																								cbnatacao))))
																										.addGap(18)
																										.addGroup(
																												groupLayout
																														.createParallelGroup(
																																Alignment.LEADING)
																														.addComponent(
																																cbtecelec,
																																GroupLayout.PREFERRED_SIZE,
																																185,
																																GroupLayout.PREFERRED_SIZE)
																														.addGroup(
																																groupLayout
																																		.createSequentialGroup()
																																		.addGap(29)
																																		.addGroup(
																																				groupLayout
																																						.createParallelGroup(
																																								Alignment.LEADING)
																																						.addComponent(
																																								cbaudio,
																																								GroupLayout.PREFERRED_SIZE,
																																								143,
																																								GroupLayout.PREFERRED_SIZE)
																																						.addComponent(
																																								cbinfo)
																																						.addComponent(
																																								cbfoto,
																																								GroupLayout.PREFERRED_SIZE,
																																								96,
																																								GroupLayout.PREFERRED_SIZE)
																																						.addComponent(
																																								cbtelm,
																																								GroupLayout.PREFERRED_SIZE,
																																								179,
																																								GroupLayout.PREFERRED_SIZE)
																																						.addComponent(
																																								cbgad)
																																						.addComponent(
																																								cbcirc)
																																						.addComponent(
																																								cbconsolas,
																																								GroupLayout.PREFERRED_SIZE,
																																								90,
																																								GroupLayout.PREFERRED_SIZE)))))
																						.addComponent(
																								cbmoda,
																								GroupLayout.PREFERRED_SIZE,
																								66,
																								GroupLayout.PREFERRED_SIZE)))
														.addComponent(
																label,
																GroupLayout.PREFERRED_SIZE,
																65,
																GroupLayout.PREFERRED_SIZE))
										.addContainerGap(139, Short.MAX_VALUE)));
		groupLayout
				.setVerticalGroup(groupLayout
						.createParallelGroup(Alignment.LEADING)
						.addGroup(
								groupLayout
										.createSequentialGroup()
										.addGroup(
												groupLayout
														.createParallelGroup(
																Alignment.LEADING)
														.addGroup(
																groupLayout
																		.createSequentialGroup()
																		.addContainerGap()
																		.addComponent(
																				label)
																		.addPreferredGap(
																				ComponentPlacement.RELATED)
																		.addGroup(
																				groupLayout
																						.createParallelGroup(
																								Alignment.LEADING)
																						.addGroup(
																								groupLayout
																										.createSequentialGroup()
																										.addGroup(
																												groupLayout
																														.createParallelGroup(
																																Alignment.BASELINE)
																														.addComponent(
																																cbcolecarte)
																														.addComponent(
																																cbdespentre)
																														.addComponent(
																																cbtecelec)
																														.addComponent(
																																cbcasajardim))
																										.addGroup(
																												groupLayout
																														.createParallelGroup(
																																Alignment.LEADING)
																														.addGroup(
																																groupLayout
																																		.createSequentialGroup()
																																		.addGap(6)
																																		.addGroup(
																																				groupLayout
																																						.createParallelGroup(
																																								Alignment.BASELINE)
																																						.addComponent(
																																								cbselos)
																																						.addComponent(
																																								cbbrinquedos)
																																						.addComponent(
																																								cbaudio)))
																														.addGroup(
																																groupLayout
																																		.createSequentialGroup()
																																		.addPreferredGap(
																																				ComponentPlacement.RELATED)
																																		.addComponent(
																																				cbanimais)))
																										.addPreferredGap(
																												ComponentPlacement.RELATED)
																										.addGroup(
																												groupLayout
																														.createParallelGroup(
																																Alignment.LEADING)
																														.addComponent(
																																cbartjardim)
																														.addGroup(
																																groupLayout
																																		.createParallelGroup(
																																				Alignment.BASELINE)
																																		.addComponent(
																																				cbmoedas)
																																		.addComponent(
																																				cbfitness)
																																		.addComponent(
																																				cbconsolas))))
																						.addGroup(
																								groupLayout
																										.createSequentialGroup()
																										.addComponent(
																												cbauto)
																										.addGap(6)
																										.addComponent(
																												cbpecas)
																										.addPreferredGap(
																												ComponentPlacement.RELATED)
																										.addComponent(
																												cbveiculos)))
																		.addGap(6)
																		.addGroup(
																				groupLayout
																						.createParallelGroup(
																								Alignment.LEADING)
																						.addGroup(
																								groupLayout
																										.createSequentialGroup()
																										.addComponent(
																												cbfilmes)
																										.addPreferredGap(
																												ComponentPlacement.RELATED)
																										.addComponent(
																												cbmusica)
																										.addPreferredGap(
																												ComponentPlacement.RELATED)
																										.addComponent(
																												cbcaca)
																										.addPreferredGap(
																												ComponentPlacement.RELATED)
																										.addComponent(
																												cbcampismo)
																										.addPreferredGap(
																												ComponentPlacement.RELATED)
																										.addComponent(
																												cbfutebol))
																						.addGroup(
																								groupLayout
																										.createSequentialGroup()
																										.addGroup(
																												groupLayout
																														.createParallelGroup(
																																Alignment.LEADING)
																														.addComponent(
																																cblivrevistas)
																														.addComponent(
																																cbimoveis)
																														.addComponent(
																																cbmedalhas))
																										.addPreferredGap(
																												ComponentPlacement.RELATED)
																										.addGroup(
																												groupLayout
																														.createParallelGroup(
																																Alignment.TRAILING,
																																false)
																														.addGroup(
																																groupLayout
																																		.createSequentialGroup()
																																		.addGroup(
																																				groupLayout
																																						.createParallelGroup(
																																								Alignment.TRAILING)
																																						.addComponent(
																																								cbantiguidade)
																																						.addComponent(
																																								cbmoveis))
																																		.addPreferredGap(
																																				ComponentPlacement.RELATED,
																																				GroupLayout.DEFAULT_SIZE,
																																				Short.MAX_VALUE)
																																		.addGroup(
																																				groupLayout
																																						.createParallelGroup(
																																								Alignment.LEADING)
																																						.addComponent(
																																								cbplantas)
																																						.addComponent(
																																								cbarte))
																																		.addGap(6))
																														.addGroup(
																																groupLayout
																																		.createSequentialGroup()
																																		.addComponent(
																																				cbrevistas)
																																		.addPreferredGap(
																																				ComponentPlacement.RELATED)
																																		.addComponent(
																																				cbmanuais)
																																		.addPreferredGap(
																																				ComponentPlacement.RELATED)))
																										.addGroup(
																												groupLayout
																														.createParallelGroup(
																																Alignment.LEADING)
																														.addGroup(
																																groupLayout
																																		.createParallelGroup(
																																				Alignment.BASELINE)
																																		.addComponent(
																																				cblitinf)
																																		.addComponent(
																																				cbsaude,
																																				GroupLayout.PREFERRED_SIZE,
																																				17,
																																				GroupLayout.PREFERRED_SIZE))
																														.addGroup(
																																groupLayout
																																		.createSequentialGroup()
																																		.addPreferredGap(
																																				ComponentPlacement.RELATED)
																																		.addComponent(
																																				cbmoda)))
																										.addPreferredGap(
																												ComponentPlacement.RELATED)
																										.addGroup(
																												groupLayout
																														.createParallelGroup(
																																Alignment.LEADING)
																														.addComponent(
																																cblit)
																														.addComponent(
																																cbcosmeticos)))
																						.addGroup(
																								groupLayout
																										.createSequentialGroup()
																										.addComponent(
																												cbfoto)
																										.addPreferredGap(
																												ComponentPlacement.RELATED)
																										.addComponent(
																												cbinfo)
																										.addPreferredGap(
																												ComponentPlacement.RELATED)
																										.addComponent(
																												cbtelm)
																										.addPreferredGap(
																												ComponentPlacement.RELATED)
																										.addComponent(
																												cbgad)
																										.addPreferredGap(
																												ComponentPlacement.RELATED)
																										.addComponent(
																												cbcirc))))
														.addGroup(
																groupLayout
																		.createSequentialGroup()
																		.addGap(231)
																		.addComponent(
																				cbvestuario)))
										.addPreferredGap(
												ComponentPlacement.RELATED)
										.addGroup(
												groupLayout
														.createParallelGroup(
																Alignment.LEADING)
														.addComponent(cbhigiene)
														.addComponent(
																cbacessorios)
														.addComponent(cbbd)
														.addComponent(cbnatacao))
										.addGap(17)));
		setLayout(groupLayout);

	}

	public Map<String, Categoria> getCategorias() {
		Map<String, Categoria> res = new HashMap<>();
		for (JCheckBox jcb : jcbs) {
			if (jcb.isSelected())
				res.put(jcb.getText(), categorias.get(jcb.getText()));
		}

		return res;
	}

}
