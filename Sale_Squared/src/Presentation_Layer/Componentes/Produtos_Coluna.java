package Presentation_Layer.Componentes;

import Business_Layer.Anuncio;
import java.awt.CardLayout;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JPanel;
import javax.swing.LayoutStyle.ComponentPlacement;

import Presentation_Layer.Sale_Squared;
import java.util.List;
import Business_Layer.AnuncioVenda;
import Presentation_Layer.Anuncio.Anuncio_Main;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Set;

public class Produtos_Coluna extends JPanel {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    /**
     * Create the panel.
     */
    private List<AnuncioVenda> anuncios;
    private List<JPanel> jpanels;

    public Produtos_Coluna(final Sale_Squared root, Set<AnuncioVenda> anuncios) {

        
        this.anuncios = new ArrayList<>();
        for(AnuncioVenda av : anuncios)
            this.anuncios.add(av);
        
        
        this.jpanels = new ArrayList<>();


        JPanel panel = new JPanel();
        JPanel panel_1 = new JPanel();
        JPanel panel_2 = new JPanel();
        JPanel panel_3 = new JPanel();
        JPanel panel_4 = new JPanel();

        this.jpanels.add(panel);
        this.jpanels.add(panel_1);
        this.jpanels.add(panel_2);
        this.jpanels.add(panel_3);
        this.jpanels.add(panel_4);
        
        for(JPanel j : jpanels)
            j.setVisible(false);
        
        

        GroupLayout groupLayout = new GroupLayout(this);
        groupLayout
                .setHorizontalGroup(groupLayout
                .createParallelGroup(Alignment.TRAILING)
                .addGroup(
                groupLayout
                .createSequentialGroup()
                .addContainerGap()
                .addGroup(
                groupLayout
                .createParallelGroup(
                Alignment.TRAILING)
                .addComponent(
                panel_4,
                GroupLayout.DEFAULT_SIZE,
                334,
                Short.MAX_VALUE)
                .addComponent(
                panel,
                Alignment.LEADING,
                GroupLayout.DEFAULT_SIZE,
                334,
                Short.MAX_VALUE)
                .addComponent(
                panel_1,
                Alignment.LEADING,
                GroupLayout.DEFAULT_SIZE,
                334,
                Short.MAX_VALUE)
                .addComponent(
                panel_2,
                Alignment.LEADING,
                GroupLayout.DEFAULT_SIZE,
                334,
                Short.MAX_VALUE)
                .addComponent(
                panel_3,
                Alignment.LEADING,
                GroupLayout.DEFAULT_SIZE,
                334,
                Short.MAX_VALUE))
                .addContainerGap()));
        groupLayout.setVerticalGroup(groupLayout.createParallelGroup(
                Alignment.LEADING).addGroup(
                groupLayout
                .createSequentialGroup()
                .addContainerGap()
                .addComponent(panel, GroupLayout.DEFAULT_SIZE, 82,
                Short.MAX_VALUE)
                .addPreferredGap(ComponentPlacement.RELATED)
                .addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 82,
                Short.MAX_VALUE)
                .addPreferredGap(ComponentPlacement.RELATED)
                .addComponent(panel_2, GroupLayout.DEFAULT_SIZE, 82,
                Short.MAX_VALUE)
                .addPreferredGap(ComponentPlacement.RELATED)
                .addComponent(panel_3, GroupLayout.DEFAULT_SIZE, 82,
                Short.MAX_VALUE)
                .addPreferredGap(ComponentPlacement.RELATED)
                .addComponent(panel_4, GroupLayout.DEFAULT_SIZE, 81,
                Short.MAX_VALUE).addContainerGap()));
        panel_4.setLayout(new CardLayout(0, 0));
        panel_3.setLayout(new CardLayout(0, 0));
        panel_2.setLayout(new CardLayout(0, 0));
        panel_1.setLayout(new CardLayout(0, 0));
        panel.setLayout(new CardLayout(0, 0));

        for(int i=0;i<anuncios.size();i++){
            jpanels.get(i).add(new Produto_Base(root, this.anuncios.get(i)),"anuncio");
            jpanels.get(i).setVisible(true);
        }
        setLayout(groupLayout);

    }
}
