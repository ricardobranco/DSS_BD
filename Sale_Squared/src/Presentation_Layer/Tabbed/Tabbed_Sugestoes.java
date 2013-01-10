package Presentation_Layer.Tabbed;

import Business_Layer.Anuncio;
import Business_Layer.AnuncioVenda;
import Business_Layer.ComparadorUltimosAnunc;
import Business_Layer.UtilizadorRegistado;
import java.awt.CardLayout;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

import Presentation_Layer.Sale_Squared;
import Presentation_Layer.Componentes.Produtos_Coluna;
import java.util.Set;
import java.util.TreeSet;


public class Tabbed_Sugestoes extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
    private final int idanuncio;
    private final AnuncioVenda anuncio;

	/**
	 * Create the panel.
	 */
	public Tabbed_Sugestoes(final Sale_Squared root, int idanuncio) {

            
                this.idanuncio = idanuncio;
                this.anuncio = (AnuncioVenda) root.getSistema().encontrarAnuncio(this.idanuncio);
		UtilizadorRegistado ur = this.anuncio.getAnunciante();
                JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(
				Alignment.LEADING).addGroup(
				groupLayout
						.createSequentialGroup()
						.addContainerGap()
						.addComponent(tabbedPane, GroupLayout.DEFAULT_SIZE,
								438, Short.MAX_VALUE).addContainerGap()));
		groupLayout.setVerticalGroup(groupLayout.createParallelGroup(
				Alignment.LEADING).addGroup(
				Alignment.TRAILING,
				groupLayout
						.createSequentialGroup()
						.addContainerGap()
						.addComponent(tabbedPane, GroupLayout.DEFAULT_SIZE,
								288, Short.MAX_VALUE).addContainerGap()));
                
                String[] user = {"user"};
                Object[] nome = {ur.getUsername()};
                Set<Anuncio> panuncios = root.getSistema().procurarAnuncAvanc(user, nome);
                Set<AnuncioVenda> anuncios =  new TreeSet<>(new ComparadorUltimosAnunc());
                for(Anuncio a : panuncios){
                    anuncios.add((AnuncioVenda) a);
                }
                
		JPanel panel = new JPanel();
		tabbedPane.addTab("Do Vendedor", null, panel, null);
		panel.setLayout(new CardLayout(0, 0));
		
                panel.add(new Produtos_Coluna(root, anuncios), "Do vendedor");

		
                String[] uservt = {"c"};
                Object[] campos = {};//ACABAR
                
                 Set<Anuncio> pvtanuncios = root.getSistema().procurarAnuncAvanc(user, nome);
                Set<AnuncioVenda> vtanuncios =  new TreeSet<>(new ComparadorUltimosAnunc());
                for(Anuncio a : panuncios){
                    anuncios.add((AnuncioVenda) a);
                }
                
                
                
                JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Veja também", null, panel_1, null);
		panel_1.setLayout(new CardLayout(0, 0));
		panel_1.add(new Produtos_Coluna(root,vtanuncios), "Veja tambem");
		setLayout(groupLayout);

	}
}
