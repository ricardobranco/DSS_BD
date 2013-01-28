package Presentation_Layer.Pesquisa;

import Business_Layer.Anuncio;
import Business_Layer.AnuncioVenda;
import java.awt.CardLayout;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JPanel;
import javax.swing.LayoutStyle.ComponentPlacement;

import Presentation_Layer.Sale_Squared;
import Presentation_Layer.Tabbed.Tabbed_Resultados;
import java.util.Set;


public class Pesquisa_Resultado extends JPanel {

	/**
	 * 
	 */
	
    private Set<Anuncio> anuncios;
    
    private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public Pesquisa_Resultado(final Sale_Squared root,Set<Anuncio> anuncios) {
            
                this.anuncios = anuncios;

		JPanel panel = new JPanel();

		JPanel panel_1 = new JPanel();
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(
				Alignment.LEADING).addGroup(
				groupLayout
						.createSequentialGroup()
						.addContainerGap()
						.addComponent(panel, GroupLayout.PREFERRED_SIZE, 267,
								GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(panel_1, GroupLayout.DEFAULT_SIZE,
								GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addContainerGap()));
		groupLayout.setVerticalGroup(groupLayout.createParallelGroup(
				Alignment.LEADING).addGroup(
				groupLayout
						.createSequentialGroup()
						.addContainerGap()
						.addGroup(
								groupLayout
										.createParallelGroup(Alignment.LEADING)
										.addComponent(panel,
												Alignment.TRAILING,
												GroupLayout.DEFAULT_SIZE, 1343,
												Short.MAX_VALUE)
										.addComponent(panel_1,
												Alignment.TRAILING,
												GroupLayout.DEFAULT_SIZE,
												GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE))
						.addContainerGap()));
		panel_1.setLayout(new CardLayout(0, 0));
		panel.setLayout(new CardLayout(0, 0));
		panel_1.add(new Tabbed_Resultados(root,anuncios), "Resultados");
		panel.add(new Pesquisa_Ferramentas(root, this), "Ferramentas");
		setLayout(groupLayout);

	}
        
        public Set<Anuncio> getAnuncios(){
            return this.anuncios;
            
        }   
                
        
        
        

}
