package Presentation_Layer.Tabbed;

import Business_Layer.AnuncioVenda;
import Business_Layer.ComparadorUltimosAnunc;
import Business_Layer.ModoVenda;
import java.awt.CardLayout;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

import Presentation_Layer.Sale_Squared;
import Presentation_Layer.Pesquisa.Resultados_Panel;
import java.util.Set;
import java.util.TreeSet;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

public class Tabbed_Resultados extends JPanel {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private Set<AnuncioVenda> todos;
    private Set<AnuncioVenda> leiloes;
    private Set<AnuncioVenda> comprar;
    private Resultados_Panel rptodos, rpleiloes, rpcompras;
    private JTabbedPane tabbedPane;

    /**
     * Create the panel.
     */
    public Tabbed_Resultados(final Sale_Squared root, Set<AnuncioVenda> anuncios) {


        setAnuncios(anuncios);
        rptodos = new Resultados_Panel(root, this.todos);
        rpleiloes = new Resultados_Panel(root, this.leiloes);
        rpcompras = new Resultados_Panel(root, this.comprar);

        tabbedPane = new JTabbedPane(JTabbedPane.TOP);
        tabbedPane.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                
                switch(tabbedPane.getSelectedIndex()){
                    case 0:
                        rptodos.setanuncios(todos);
                        break;
                    case 1:
                        rpleiloes.setanuncios(leiloes);
                        break;
                    case 2:
                        rpcompras.setanuncios((comprar));
                    
                } 

                
            }
        });
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

        JPanel panel = new JPanel();
        tabbedPane.addTab("Todos", null, panel, null);
        panel.setLayout(new CardLayout(0, 0));
        panel.add(new Resultados_Panel(root, this.todos), "Todos");

        JPanel panel_1 = new JPanel();
        tabbedPane.addTab("Leilões", null, panel_1, null);
        panel_1.setLayout(new CardLayout(0, 0));
        panel_1.add(new Resultados_Panel(root, this.leiloes), "Leilões");

        JPanel panel_2 = new JPanel();
        tabbedPane.addTab("Comprar Já", null, panel_2, null);
        panel_2.setLayout(new CardLayout(0, 0));
        panel_2.add(new Resultados_Panel(root, this.comprar), "Comprar");
        setLayout(groupLayout);

    }

    public void setAnuncios(Set<AnuncioVenda> anuncios) {
        this.todos = anuncios;
        this.leiloes = new TreeSet<>(new ComparadorUltimosAnunc());
        this.comprar = new TreeSet<>(new ComparadorUltimosAnunc());

        for (AnuncioVenda a : this.todos) {
            ModoVenda mv = a.getTipoVenda();
            if (mv.getClass().getSimpleName().equals("Leilao")) {
                this.leiloes.add(a);
            } else {
                this.comprar.add(a);
            }
        }
    }
}
