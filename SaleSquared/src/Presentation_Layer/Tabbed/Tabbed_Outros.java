package Presentation_Layer.Tabbed;

import Business_Layer.Anuncio;
import Business_Layer.AnuncioVenda;
import Business_Layer.ComparadorAnuncPreco;
import Business_Layer.Tag;
import Business_Layer.UtilizadorRegistado;
import java.awt.CardLayout;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

import Presentation_Layer.Sale_Squared;
import Presentation_Layer.Componentes.Produtos_Coluna;
import Presentation_Layer.Componentes.Utilizadores_Coluna;
import Presentation_Layer.Home.Top_Tags;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Tabbed_Outros extends JPanel {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private final Sale_Squared root;

    /**
     * Create the panel.
     */
    public Tabbed_Outros(final Sale_Squared root) {

       this.root = root;
        
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
                288, Short.MAX_VALUE).addContainerGap()));


        Set<Tag> tags = root.getSistema().topTags();


        JPanel panel = new JPanel();
        tabbedPane.addTab("Mais Procurados", null, panel, null);
        panel.setLayout(new CardLayout(0, 0));
        panel.add(new Top_Tags(tags), "Top Produtos");

        if (Sale_Squared.REGISTADO) {

            Map<String, UtilizadorRegistado> us = root.getSistema().encontrarUtilizadorReg(Sale_Squared.UTILIZADOR).getUsersSeguidos();
            Map<Integer,Anuncio> as = root.getSistema().encontrarUtilizadorReg(Sale_Squared.UTILIZADOR).getAnuncSeguidos();
            Set<AnuncioVenda> av = new TreeSet<>(new ComparadorAnuncPreco(ComparadorAnuncPreco.CRESCENTE));
            
            for(Anuncio a : as.values()){
                av.add((AnuncioVenda) a);
            }
            
            JPanel panel_1 = new JPanel();
            tabbedPane.addTab("Utilizadores Seguidos", null, panel_1, null);
            panel_1.setLayout(new CardLayout(0, 0));
            panel_1.add(new Utilizadores_Coluna(this.root,us.values()), "Utilizadores Seguidos");

            JPanel panel_2 = new JPanel();
            tabbedPane.addTab("Negócios Seguidos", null, panel_2, null);
            panel_2.setLayout(new CardLayout(0, 0));
            panel_2.add(new Produtos_Coluna(root,av), "Negócios Seguidos");
            
        }
        setLayout(groupLayout);

    }
}