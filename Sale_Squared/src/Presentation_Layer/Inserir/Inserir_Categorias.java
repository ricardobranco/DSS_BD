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

import business_Layer.Categoria;


public class Inserir_Categorias extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	private Map<JCheckBox, Categoria> categorias;

	public Inserir_Categorias() {

		this.categorias = new HashMap<>();
		JLabel label = new JLabel("Categoria");
		label.setFont(new Font("Lucida Grande", Font.BOLD, 13));

		// Auto
		JCheckBox cbauto = new JCheckBox("Auto");
		JCheckBox cbpecas = new JCheckBox("Peças Auto");
		JCheckBox cbveiculos = new JCheckBox("Veículos");

		Categoria cauto = new Categoria("Auto");
		Categoria cpecas = new Categoria("Peças Auto", cauto);
		Categoria cveiculos = new Categoria("Veículos", cauto);

		categorias.put(cbauto, cauto);
		categorias.put(cbpecas, cpecas);
		categorias.put(cbveiculos, cveiculos);

		// Moda
		JCheckBox cbmoda = new JCheckBox("Moda");
		JCheckBox cbacessorios = new JCheckBox("Acessórios");
		JCheckBox cbvestuario = new JCheckBox("Vestuário");

		Categoria cmoda = new Categoria("Moda");
		Categoria cacessorios = new Categoria("Acessórios", cmoda);
		Categoria cvestuario = new Categoria("Vestuário", cmoda);

		categorias.put(cbmoda, cmoda);
		categorias.put(cbvestuario, cvestuario);
		categorias.put(cbacessorios, cacessorios);

		// Saúde
		JCheckBox cbsaude = new JCheckBox("Saúde");
		JCheckBox cbcosmeticos = new JCheckBox("Cosméticos");
		JCheckBox cbhigiene = new JCheckBox("Higiene");

		Categoria csaude = new Categoria("Saúde");
		Categoria ccosmeticos = new Categoria("Cosméticos", csaude);
		Categoria chigiene = new Categoria("Higiene",csaude);
		
		categorias.put(cbsaude, csaude);
		categorias.put(cbcosmeticos, ccosmeticos);
		categorias.put(cbhigiene, chigiene)
;
		// Casa e Jardim
		JCheckBox cbcasajardim = new JCheckBox("Casa e Jardim");
		JCheckBox cbartjardim = new JCheckBox("Artigos de Jardim");
		JCheckBox cbanimais = new JCheckBox("Animais");
		JCheckBox cbimoveis = new JCheckBox("Imóveis");
		JCheckBox cbmoveis = new JCheckBox("Mobiliário");
		JCheckBox cbplantas = new JCheckBox("Plantas e Flores");

		Categoria ccasajardim = new Categoria("Casa e Jardim");
		Categoria cartjardim = new Categoria("Artigos de Jardim", ccasajardim);
		Categoria canimais = new Categoria("Animais", ccasajardim);
		Categoria cimoveis = new Categoria("Imóveis", ccasajardim);
		Categoria cmoveis = new Categoria("Mobiliário", ccasajardim);
		Categoria cplantas = new Categoria("Plantas e Flores",ccasajardim);
		
		categorias.put(cbcasajardim, ccasajardim);
		categorias.put(cbartjardim, cartjardim);
		categorias.put(cbanimais, canimais);
		categorias.put(cbimoveis, cimoveis);
		categorias.put(cbmoveis, cmoveis);
		categorias.put(cbplantas, cplantas);
		
				
		// Colecionáveis e Arte

		JCheckBox cbcolecarte = new JCheckBox("Coleccionáveis e Arte");
		JCheckBox cbmoedas = new JCheckBox("Moeda e Notas");
		JCheckBox cbselos = new JCheckBox("Selos");
		JCheckBox cbmedalhas = new JCheckBox("Medalhas");
		JCheckBox cbantiguidade = new JCheckBox("Antiguidades");
		JCheckBox cbarte = new JCheckBox("Arte");

		Categoria ccolarte = new Categoria("Coleccionáveis e Arte");
		Categoria cmoedas = new Categoria("Moedas e Notas", ccolarte);
		Categoria cselos = new Categoria("Selos", ccolarte);
		Categoria cmedalhas = new Categoria("Medalhas", ccolarte);
		Categoria cantiguidade = new Categoria("Antiguidades", ccolarte);
		Categoria carte = new Categoria("Arte", ccolarte);

		categorias.put(cbcolecarte, ccolarte);
		categorias.put(cbmoedas, cmoedas);
		categorias.put(cbselos, cselos);
		categorias.put(cbmedalhas, cmedalhas);
		categorias.put(cbantiguidade, cantiguidade);
		categorias.put(cbarte, carte);

		// Tecnologia e Electrónica

		JCheckBox cbtecelec = new JCheckBox("Tecnologia e Electrónica");
		JCheckBox cbconsolas = new JCheckBox("Consolas");
		JCheckBox cbaudio = new JCheckBox("Áudio, TV e Vídeo");
		JCheckBox cbfoto = new JCheckBox("Fotografia");
		JCheckBox cbtelm = new JCheckBox("Telemóveis e Telefones");
		JCheckBox cbinfo = new JCheckBox("Informática");
		JCheckBox cbgad = new JCheckBox("Gadgets");
		JCheckBox cbcirc = new JCheckBox("Circuitos");

		Categoria ctecelec = new Categoria("Tecnologia e Electrónica");
		Categoria cconsolas = new Categoria("Consolas", ctecelec);
		Categoria caudio = new Categoria("Áudio, Tv e Vídeo", ctecelec);
		Categoria cfoto = new Categoria("Fotografia", ctecelec);
		Categoria ctelme = new Categoria("Telemóveis e Telefones", ctecelec);
		Categoria cinfo = new Categoria("Informática",ctecelec);
		Categoria cgad = new Categoria("Gadgets",ctecelec);
		Categoria ccirc = new Categoria("Circuitos",ctecelec);
		
		categorias.put(cbtecelec, ctecelec);
		categorias.put(cbconsolas, cconsolas);
		categorias.put(cbaudio, caudio);
		categorias.put(cbfoto, cfoto);
		categorias.put(cbtelm, ctelme);
		categorias.put(cbinfo, cinfo);
		categorias.put(cbgad, cgad);
		categorias.put(cbcirc, ccirc);

		// Livros e Revistas

		JCheckBox cblivrevistas = new JCheckBox("Livros e Revistas");
		JCheckBox cbrevistas = new JCheckBox("Revistas");
		JCheckBox cbmanuais = new JCheckBox("Manuais Escolares");
		JCheckBox cblitinf = new JCheckBox("Literatura Infantil");
		JCheckBox cblit = new JCheckBox("Literatura");
		JCheckBox cbbd = new JCheckBox("Banda Desenhada");

		Categoria clivrosrevistas = new Categoria("Livros e Revistas");
		Categoria crevistas = new Categoria("Revistas", clivrosrevistas);
		Categoria cmanuais = new Categoria("Manuais Escolares", clivrosrevistas);
		Categoria clitinf = new Categoria("Literatura Infantil",
				clivrosrevistas);
		Categoria clit = new Categoria("Literatura", clivrosrevistas);
		Categoria cbd = new Categoria("Banda Desenhada", clivrosrevistas);

		categorias.put(cblivrevistas, clivrosrevistas);
		categorias.put(cbrevistas, crevistas);
		categorias.put(cbmanuais, cmanuais);
		categorias.put(cblitinf, clitinf);
		categorias.put(cblit, clit);
		categorias.put(cbbd, cbd);

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

		Categoria cdespentre = new Categoria("Desporto e Entretenimento");
		Categoria cbrinquedos = new Categoria("Brinquedos",cdespentre);
		Categoria cfitness = new Categoria("Fitness e Musculação",cdespentre);
		Categoria cfilmes = new Categoria("Filmes e Cinema",cdespentre);
		Categoria cmusica = new Categoria("Música",cdespentre);
		Categoria ccaca = new Categoria("Caça e Pesca",cdespentre);
		Categoria ccampismo = new Categoria("Campismo",cdespentre);
		Categoria cfutebol = new Categoria("Futebol",cdespentre);
		Categoria cnatacao = new Categoria("Natação",cdespentre);
		
		
		
		
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
	
	public Map<String,Categoria> getCategorias(){
		Map<String,Categoria> res = new HashMap<>();
		for( JCheckBox jcb : categorias.keySet()){
			if(jcb.isSelected());
			res.put(jcb.getText(),categorias.get(jcb));
		}
		
		return res;
		}
	
	
}
