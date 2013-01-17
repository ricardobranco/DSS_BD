package Presentation_Layer.Tabbed;

import Business_Layer.Anuncio;
import Business_Layer.AnuncioVenda;
import Business_Layer.ComparadorATerminar;
import Business_Layer.ComparadorAnuncPreco;
import Business_Layer.ComparadorUltimosAnunc;
import java.awt.CardLayout;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

import Presentation_Layer.Sale_Squared;
import Presentation_Layer.Componentes.Produtos_Coluna;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;


public class Tabbed_Produtos extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public Tabbed_Produtos(final Sale_Squared root) {

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);

                
                
                
		JPanel panel = new JPanel();
		tabbedPane.addTab("Últimos Negócios", null, panel, null);
		Set<AnuncioVenda> un = new TreeSet<>(new ComparadorUltimosAnunc());
                Set<AnuncioVenda> af = new TreeSet<>(new ComparadorATerminar());
                
                Iterator<Anuncio> it = root.getSistema().ultimosAnuncios();
                while(it.hasNext()){
                    Anuncio anunc = it.next();
                    un.add((AnuncioVenda)anunc);
                    af.add((AnuncioVenda)anunc);
                }
                
                panel.setLayout(new CardLayout(0, 0));
                panel.add(new Produtos_Coluna(root,un), "Ultimos Negócios");
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Negócios a Fechar", null, panel_1, null);
		panel_1.setLayout(new CardLayout(0, 0));
                panel_1.add(new Produtos_Coluna(root,af), "A Fechar");
		
		
                
                if (Sale_Squared.REGISTADO) {
			JPanel panel_2 = new JPanel();
			
                        Set<AnuncioVenda> ns = new TreeSet<>(new ComparadorAnuncPreco(ComparadorAnuncPreco.CRESCENTE));
                        
                        for(Anuncio a:root.getSistema().sugerirAnuncios(Sale_Squared.UTILIZADOR, new ArrayList<Character>()))
                            ns.add((AnuncioVenda) a);
                        
                        tabbedPane.addTab("Sugestões", null, panel_2, null);
                        panel_2.setLayout(new CardLayout(0, 0));
			panel_2.add(new Produtos_Coluna(root,ns), "Ultimos Negócios");
			
		}

		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(
				Alignment.LEADING).addComponent(tabbedPane,
				GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE));
		groupLayout.setVerticalGroup(groupLayout.createParallelGroup(
				Alignment.LEADING).addGroup(
				groupLayout
						.createSequentialGroup()
						.addComponent(tabbedPane, GroupLayout.PREFERRED_SIZE,
								485, Short.MAX_VALUE).addContainerGap()));
		setLayout(groupLayout);

	}
}
