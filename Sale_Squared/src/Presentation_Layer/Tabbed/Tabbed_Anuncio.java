package Presentation_Layer.Tabbed;

import Business_Layer.AnuncioVenda;
import Business_Layer.Imagem;
import java.awt.CardLayout;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

import Presentation_Layer.Anuncio.Descricao;
import Presentation_Layer.Anuncio.Envio_Pagamento;
import Presentation_Layer.Anuncio.ImagePanel;
import Presentation_Layer.Anuncio.Imagem_Grid;
import Presentation_Layer.Sale_Squared;
import java.util.List;

public class Tabbed_Anuncio extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
        
        private int idanuncio;
        private AnuncioVenda anuncio;
        private Sale_Squared root;
	public Tabbed_Anuncio(final Sale_Squared root,int idanuncio,ImagePanel ip) {
                this.root = root;
                this.idanuncio = idanuncio;
                this.anuncio = (AnuncioVenda) root.getSistema().encontrarAnuncio(this.idanuncio); 
                
            
                List<Imagem> imagens = (List<Imagem>)anuncio.getImagens().values();
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
				groupLayout
						.createSequentialGroup()
						.addContainerGap()
						.addComponent(tabbedPane, GroupLayout.DEFAULT_SIZE,
								319, Short.MAX_VALUE).addContainerGap()));

		JPanel panel = new JPanel();
		tabbedPane.addTab("Descrição", null, panel, null);
		panel.setLayout(new CardLayout(0, 0));
		panel.add(new Descricao(anuncio.getDescricao()), "Descrição");

		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Imagens", null, panel_1, null);
		panel_1.setLayout(new CardLayout(0, 0));
		panel_1.add(new Imagem_Grid(imagens, ip), "Imagens");

		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("Envio e Pagamento", null, panel_2, null);
		panel_2.setLayout(new CardLayout(0, 0));
		panel_2.add(new Envio_Pagamento(anuncio), "Envio e Pagamento");
		setLayout(groupLayout);

	}
}
