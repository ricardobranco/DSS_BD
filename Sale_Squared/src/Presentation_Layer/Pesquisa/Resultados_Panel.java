package Presentation_Layer.Pesquisa;

import Business_Layer.Anuncio;
import Data_Layer.AnuncioVisitadoUtilizadorDAO;
import java.awt.CardLayout;

import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.LayoutStyle.ComponentPlacement;

import Presentation_Layer.Sale_Squared;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import Business_Layer.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import java.util.TreeSet;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Resultados_Panel extends JPanel {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    JComboBox comboBox;
    JComboBox comboBox_1;
    private Set<AnuncioVenda> anuncios;
    private List<JPanel> jpanels;
    private Sale_Squared root;

    /**
     * Create the panel.
     */
    public Resultados_Panel(final Sale_Squared root, Set<AnuncioVenda> anuncios) {
        this.root = root;
        this.jpanels = new ArrayList<>();
        this.anuncios = anuncios;
        comboBox = new JComboBox();
        comboBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ordena();

            }
        });
        comboBox.setModel(new DefaultComboBoxModel(new String[]{
                    "Mais Recentes", "A fechar",
                    "Preço: Mais baixo", "Preço: Mais alto",
                    "Preço + portes: Mais baixo",
                    "Preço + portes: Mais alto", "Popularidade"}));



        JPanel panel = new JPanel();

        comboBox_1 = new JComboBox();
        comboBox_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ordena();
            }
        });
        comboBox_1.setModel(new DefaultComboBoxModel(listaPagina(npaginas(this.anuncios.size()))));
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
                Alignment.LEADING)
                .addComponent(
                panel,
                Alignment.TRAILING,
                GroupLayout.DEFAULT_SIZE,
                GroupLayout.DEFAULT_SIZE,
                Short.MAX_VALUE)
                .addComponent(
                comboBox,
                Alignment.TRAILING,
                GroupLayout.PREFERRED_SIZE,
                174,
                GroupLayout.PREFERRED_SIZE)
                .addComponent(
                comboBox_1,
                Alignment.TRAILING,
                GroupLayout.PREFERRED_SIZE,
                GroupLayout.DEFAULT_SIZE,
                GroupLayout.PREFERRED_SIZE))
                .addContainerGap()));
        groupLayout.setVerticalGroup(groupLayout.createParallelGroup(
                Alignment.LEADING).addGroup(
                groupLayout
                .createSequentialGroup()
                .addContainerGap()
                .addComponent(comboBox, GroupLayout.PREFERRED_SIZE,
                GroupLayout.DEFAULT_SIZE,
                GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(ComponentPlacement.RELATED)
                .addComponent(panel, GroupLayout.DEFAULT_SIZE, 1428,
                Short.MAX_VALUE)
                .addPreferredGap(ComponentPlacement.RELATED)
                .addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE,
                GroupLayout.DEFAULT_SIZE,
                GroupLayout.PREFERRED_SIZE).addGap(8)));

        JPanel panel_1 = new JPanel();

        JSeparator separator = new JSeparator();

        JPanel panel_2 = new JPanel();

        JSeparator separator_1 = new JSeparator();

        JPanel panel_3 = new JPanel();

        JSeparator separator_2 = new JSeparator();

        JPanel panel_4 = new JPanel();

        JSeparator separator_3 = new JSeparator();

        JPanel panel_5 = new JPanel();

        JSeparator separator_4 = new JSeparator();

        JPanel panel_6 = new JPanel();

        JSeparator separator_5 = new JSeparator();

        JPanel panel_7 = new JPanel();

        JSeparator separator_6 = new JSeparator();

        JPanel panel_8 = new JPanel();

        JSeparator separator_7 = new JSeparator();

        JPanel panel_9 = new JPanel();

        JSeparator separator_8 = new JSeparator();
        JPanel panel_10 = new JPanel();


        this.jpanels.add(panel_1);
        this.jpanels.add(panel_2);
        this.jpanels.add(panel_3);
        this.jpanels.add(panel_4);
        this.jpanels.add(panel_5);
        this.jpanels.add(panel_6);
        this.jpanels.add(panel_7);
        this.jpanels.add(panel_8);
        this.jpanels.add(panel_9);
        this.jpanels.add(panel_10);





        GroupLayout gl_panel = new GroupLayout(panel);
        gl_panel.setHorizontalGroup(gl_panel
                .createParallelGroup(Alignment.TRAILING)
                .addGroup(
                gl_panel.createSequentialGroup()
                .addContainerGap()
                .addGroup(
                gl_panel.createParallelGroup(
                Alignment.TRAILING)
                .addComponent(
                panel_2,
                Alignment.LEADING,
                GroupLayout.DEFAULT_SIZE,
                648, Short.MAX_VALUE)
                .addComponent(
                separator_2,
                Alignment.LEADING,
                GroupLayout.DEFAULT_SIZE,
                648, Short.MAX_VALUE)
                .addComponent(
                separator_1,
                Alignment.LEADING,
                GroupLayout.DEFAULT_SIZE,
                648, Short.MAX_VALUE)
                .addComponent(
                separator,
                Alignment.LEADING,
                GroupLayout.DEFAULT_SIZE,
                648, Short.MAX_VALUE)
                .addComponent(
                panel_1,
                Alignment.LEADING,
                GroupLayout.DEFAULT_SIZE,
                648, Short.MAX_VALUE)
                .addComponent(
                panel_3,
                Alignment.LEADING,
                GroupLayout.DEFAULT_SIZE,
                648, Short.MAX_VALUE)
                .addComponent(
                panel_4,
                Alignment.LEADING,
                GroupLayout.DEFAULT_SIZE,
                648, Short.MAX_VALUE)
                .addComponent(
                separator_3,
                Alignment.LEADING,
                GroupLayout.DEFAULT_SIZE,
                648, Short.MAX_VALUE)
                .addComponent(
                panel_5,
                Alignment.LEADING,
                GroupLayout.DEFAULT_SIZE,
                648, Short.MAX_VALUE)
                .addComponent(
                separator_4,
                Alignment.LEADING,
                GroupLayout.DEFAULT_SIZE,
                648, Short.MAX_VALUE)
                .addComponent(
                panel_6,
                Alignment.LEADING,
                GroupLayout.DEFAULT_SIZE,
                648, Short.MAX_VALUE)
                .addComponent(
                separator_5,
                Alignment.LEADING,
                GroupLayout.DEFAULT_SIZE,
                648, Short.MAX_VALUE)
                .addComponent(
                panel_7,
                Alignment.LEADING,
                GroupLayout.DEFAULT_SIZE,
                648, Short.MAX_VALUE)
                .addComponent(
                separator_6,
                Alignment.LEADING,
                GroupLayout.DEFAULT_SIZE,
                648, Short.MAX_VALUE)
                .addComponent(
                panel_8,
                Alignment.LEADING,
                GroupLayout.DEFAULT_SIZE,
                648, Short.MAX_VALUE)
                .addComponent(
                separator_7,
                Alignment.LEADING,
                GroupLayout.DEFAULT_SIZE,
                648, Short.MAX_VALUE)
                .addComponent(
                panel_9,
                Alignment.LEADING,
                GroupLayout.DEFAULT_SIZE,
                648, Short.MAX_VALUE)
                .addComponent(
                separator_8,
                Alignment.LEADING,
                GroupLayout.DEFAULT_SIZE,
                648, Short.MAX_VALUE)
                .addComponent(
                panel_10,
                Alignment.LEADING,
                GroupLayout.DEFAULT_SIZE,
                648, Short.MAX_VALUE))
                .addContainerGap()));
        gl_panel.setVerticalGroup(gl_panel.createParallelGroup(
                Alignment.LEADING).addGroup(
                gl_panel.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 112,
                Short.MAX_VALUE)
                .addPreferredGap(ComponentPlacement.RELATED)
                .addComponent(separator, GroupLayout.DEFAULT_SIZE, 13,
                Short.MAX_VALUE)
                .addPreferredGap(ComponentPlacement.RELATED)
                .addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 112,
                GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(ComponentPlacement.RELATED)
                .addComponent(separator_1, GroupLayout.DEFAULT_SIZE,
                13, Short.MAX_VALUE)
                .addPreferredGap(ComponentPlacement.RELATED)
                .addComponent(panel_3, GroupLayout.DEFAULT_SIZE, 112,
                Short.MAX_VALUE)
                .addPreferredGap(ComponentPlacement.RELATED)
                .addComponent(separator_2, GroupLayout.DEFAULT_SIZE,
                13, Short.MAX_VALUE)
                .addPreferredGap(ComponentPlacement.RELATED)
                .addComponent(panel_4, GroupLayout.DEFAULT_SIZE, 112,
                Short.MAX_VALUE)
                .addPreferredGap(ComponentPlacement.RELATED)
                .addComponent(separator_3, GroupLayout.DEFAULT_SIZE,
                13, Short.MAX_VALUE)
                .addPreferredGap(ComponentPlacement.RELATED)
                .addComponent(panel_5, GroupLayout.DEFAULT_SIZE, 112,
                Short.MAX_VALUE)
                .addPreferredGap(ComponentPlacement.RELATED)
                .addComponent(separator_4, GroupLayout.DEFAULT_SIZE,
                13, Short.MAX_VALUE)
                .addPreferredGap(ComponentPlacement.RELATED)
                .addComponent(panel_6, GroupLayout.DEFAULT_SIZE, 112,
                Short.MAX_VALUE)
                .addPreferredGap(ComponentPlacement.RELATED)
                .addComponent(separator_5, GroupLayout.DEFAULT_SIZE,
                13, Short.MAX_VALUE)
                .addPreferredGap(ComponentPlacement.RELATED)
                .addComponent(panel_7, GroupLayout.DEFAULT_SIZE, 112,
                Short.MAX_VALUE)
                .addPreferredGap(ComponentPlacement.RELATED)
                .addComponent(separator_6, GroupLayout.DEFAULT_SIZE,
                13, Short.MAX_VALUE)
                .addPreferredGap(ComponentPlacement.RELATED)
                .addComponent(panel_8, GroupLayout.DEFAULT_SIZE, 112,
                Short.MAX_VALUE)
                .addPreferredGap(ComponentPlacement.RELATED)
                .addComponent(separator_7, GroupLayout.DEFAULT_SIZE,
                13, Short.MAX_VALUE)
                .addPreferredGap(ComponentPlacement.RELATED)
                .addComponent(panel_9, GroupLayout.DEFAULT_SIZE, 112,
                Short.MAX_VALUE)
                .addPreferredGap(ComponentPlacement.RELATED)
                .addComponent(separator_8, GroupLayout.DEFAULT_SIZE,
                15, Short.MAX_VALUE)
                .addPreferredGap(ComponentPlacement.RELATED)
                .addComponent(panel_10, GroupLayout.DEFAULT_SIZE, 112,
                Short.MAX_VALUE).addContainerGap()));
        panel_2.setLayout(new CardLayout(0, 0));
        panel_7.setLayout(new CardLayout(0, 0));
        panel_9.setLayout(new CardLayout(0, 0));
        panel_6.setLayout(new CardLayout(0, 0));
        panel_5.setLayout(new CardLayout(0, 0));
        panel_10.setLayout(new CardLayout(0, 0));
        panel_8.setLayout(new CardLayout(0, 0));
        panel_3.setLayout(new CardLayout(0, 0));
        panel_4.setLayout(new CardLayout(0, 0));
        panel_1.setLayout(new CardLayout(0, 0));
        ordena();
        panel.setLayout(gl_panel);
        setLayout(groupLayout);

    }

    public void setanuncios(Set<AnuncioVenda> anuncios) {
        this.anuncios = anuncios;
        comboBox_1.setModel(new DefaultComboBoxModel(listaPagina(npaginas(this.anuncios.size()))));
        ordena();

    }

    @SuppressWarnings("empty-statement")
    public void ordena() {
        String criterio = (String) comboBox.getModel().getElementAt(comboBox.getSelectedIndex());
        TreeSet<AnuncioVenda> ordenado = null;
        int numeroPag;
        if ((String) this.comboBox_1.getModel().getElementAt(this.comboBox_1.getSelectedIndex()) == null) {
            numeroPag = 0;
        } else {
            numeroPag = new Integer((String) this.comboBox_1.getModel().getElementAt(this.comboBox_1.getSelectedIndex())).intValue();
        }



        for (JPanel j : this.jpanels) {
            j.setVisible(false);
        }

        switch (criterio) {
            case "Mais Recentes":

                ordenado = new TreeSet<>(new ComparadorUltimosAnunc());

                break;

            case "Popularidade":

                ordenado = new TreeSet<>(new ComparadorAnuncNVis());

                break;

            case "A fechar":
                ordenado = new TreeSet<>(new ComparadorATerminar());

                break;
            case "Preço: Mais baixo":
                ordenado = new TreeSet<>(new ComparadorAnuncPreco(ComparadorAnuncPreco.CRESCENTE));

                break;
            case "Preço + portes: Mais baixo":
                ordenado = new TreeSet<>(new ComparatorPrecoPortes(ComparatorPrecoPortes.CRESCENTE));

                break;

            case "Preço: Mais alto":
                ordenado = new TreeSet<>(new ComparadorAnuncPreco(ComparadorAnuncPreco.DECRESCENTE));

                break;
            case "Preço + portes: Mais alto":
                ordenado = new TreeSet<>(new ComparatorPrecoPortes(ComparatorPrecoPortes.DECRESCENTE));

                break;
        }
        for (AnuncioVenda av : this.anuncios) {
            ordenado.add(av);
        }

        Iterator<AnuncioVenda> it = ordenado.iterator();
        List<AnuncioVenda> la = new ArrayList<>();
        while (it.hasNext()) {
            la.add(it.next());
        }

        int i = 0;
        int start = (numeroPag - 1) * 10;
        if (numeroPag != 0) {
            for (; start < this.anuncios.size() && i < 10; i++, start++) {
                this.jpanels.get(i).removeAll();
                this.jpanels.get(i).add(new Resultado_Label(root, la.get(start).getCodigo()));
                this.jpanels.get(i).updateUI();
                this.jpanels.get(i).validate();
                this.jpanels.get(i).setVisible(true);
            }
        }


    }

    private int npaginas(int size) {
        int res1 = size / 10;
        int res2 = size % 10 == 0 ? 0 : 1;
        return res1 + res2;
    }

    private String[] listaPagina(final int n) {
        String[] res = new String[n];
        for (int i = 1; i <= n; i++) {
            res[i - 1] = "" + i;
        }
        return res;
    }
}
