package Presentation_Layer.Perfil;

import Business_Layer.Anuncio;
import Business_Layer.AnuncioVenda;
import Business_Layer.ComparadorUltimosAnunc;
import Business_Layer.UtilizadorRegistado;
import java.awt.CardLayout;
import java.awt.Font;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.LayoutStyle.ComponentPlacement;

import Presentation_Layer.Sale_Squared;
import Presentation_Layer.Pesquisa.Pesquisa_Resultado;
import java.util.Set;
import java.util.TreeSet;


public class Perfil extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
        private UtilizadorRegistado ur;
	/**
	 * Create the panel.
	 */
	public Perfil(final Sale_Squared root,UtilizadorRegistado ur) {
                this.ur = ur;
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(Perfil.class
				.getResource("/Imagens/avatar.jpg")));

		final JLabel lblNewLabel = new JLabel("Utilizador123");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.BOLD, 20));

		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(Perfil.class
				.getResource("/Imagens/top_cliente.png")));

		JLabel lblRegistadoDesde = new JLabel("Registado desde 1/1/2013");

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);

		JButton btnSeguirUtilizador = new JButton("Seguir Utilizador");
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout
				.setHorizontalGroup(groupLayout
						.createParallelGroup(Alignment.LEADING)
						.addGroup(
								Alignment.TRAILING,
								groupLayout
										.createSequentialGroup()
										.addGap(14)
										.addGroup(
												groupLayout
														.createParallelGroup(
																Alignment.LEADING)
														.addGroup(
																groupLayout
																		.createSequentialGroup()
																		.addComponent(
																				tabbedPane,
																				GroupLayout.DEFAULT_SIZE,
																				430,
																				Short.MAX_VALUE)
																		.addContainerGap())
														.addGroup(
																groupLayout
																		.createSequentialGroup()
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
																										.addComponent(
																												lblNewLabel)
																										.addPreferredGap(
																												ComponentPlacement.RELATED)
																										.addComponent(
																												lblNewLabel_1))
																						.addComponent(
																								lblRegistadoDesde))
																		.addGap(157))))
						.addGroup(
								Alignment.TRAILING,
								groupLayout.createSequentialGroup()
										.addContainerGap(327, Short.MAX_VALUE)
										.addComponent(btnSeguirUtilizador)
										.addContainerGap()));
		groupLayout
				.setVerticalGroup(groupLayout
						.createParallelGroup(Alignment.LEADING)
						.addGroup(
								groupLayout
										.createSequentialGroup()
										.addGap(15)
										.addGroup(
												groupLayout
														.createParallelGroup(
																Alignment.LEADING)
														.addComponent(
																lblNewLabel_1)
														.addGroup(
																groupLayout
																		.createSequentialGroup()
																		.addComponent(
																				lblNewLabel)
																		.addPreferredGap(
																				ComponentPlacement.RELATED)
																		.addComponent(
																				lblRegistadoDesde))
														.addComponent(label))
										.addGap(18)
										.addComponent(tabbedPane,
												GroupLayout.DEFAULT_SIZE, 363,
												Short.MAX_VALUE)
										.addPreferredGap(
												ComponentPlacement.RELATED)
										.addComponent(btnSeguirUtilizador)
										.addGap(12)));

		JPanel panel = new JPanel();
		tabbedPane.addTab("Reputação", null, panel, null);
		panel.setLayout(new CardLayout(0, 0));
		panel.add(new Perfil_Reputacao(), "perfil_rep");

		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Negócios", null, panel_1, null);
		panel_1.setLayout(new CardLayout(0, 0));
		String[] user = {"user"};
                Object[] nome = {Sale_Squared.UTILIZADOR};
                Set<Anuncio> panuncios = root.getSistema().procurarAnuncAvanc(user, nome);
                Set<AnuncioVenda> anuncios =  new TreeSet<>(new ComparadorUltimosAnunc());
                for(Anuncio a : panuncios){
                    anuncios.add((AnuncioVenda) a);
                }
                
                panel_1.add(new Pesquisa_Resultado(root, anuncios), "Negócios");
		setLayout(groupLayout);

	}
}
