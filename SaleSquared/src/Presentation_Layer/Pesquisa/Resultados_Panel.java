/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation_Layer.Pesquisa;

import Business_Layer.AnuncioVenda;
import Business_Layer.ComparadorATerminar;
import Business_Layer.ComparadorAnuncNVis;
import Business_Layer.ComparadorAnuncPreco;
import Business_Layer.ComparadorUltimosAnunc;
import Business_Layer.ComparatorPrecoPortes;
import Presentation_Layer.Sale_Squared;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JPanel;
import javax.swing.JSeparator;

/**
 *
 * @author ricardobranco
 */
public class Resultados_Panel extends javax.swing.JPanel {

    /**
     * Creates new form Resultados_Panel
     */
    private List<JPanel> jpanels;
    private Set<AnuncioVenda> anuncios;
    private List<JSeparator> jseparators;
    private final Sale_Squared root;

    public Resultados_Panel(final Sale_Squared root, Set<AnuncioVenda> anuncios) {
        initComponents();
        this.anuncios = anuncios;
        this.root = root;
        this.jpanels = new ArrayList<>();
        this.jseparators = new ArrayList<>();
        this.jpanels.add(this.jPanel1);
        this.jpanels.add(jPanel2);
        this.jpanels.add(jPanel3);
        this.jpanels.add(jPanel4);
        this.jpanels.add(jPanel5);
        this.jpanels.add(jPanel6);
        this.jpanels.add(jPanel7);
        this.jpanels.add(jPanel8);
        this.jpanels.add(jPanel9);
        this.jpanels.add(jPanel10);

        this.jseparators.add(jSeparator1);
        this.jseparators.add(jSeparator2);
        this.jseparators.add(jSeparator3);
        this.jseparators.add(jSeparator4);
        this.jseparators.add(jSeparator5);
        this.jseparators.add(jSeparator6);
        this.jseparators.add(jSeparator7);
        this.jseparators.add(jSeparator8);
        this.jseparators.add(jSeparator9);


        for (JPanel jp : jpanels) {
            jp.setVisible(false);
        }
        
        for(JSeparator jsp : jseparators)
            jsp.setVisible(false);
        this.jComboBox1.setModel(new DefaultComboBoxModel(new String[]{
                    "Mais Recentes", "A fechar",
                    "Preço: Mais baixo", "Preço: Mais alto",
                    "Preço + portes: Mais baixo",
                    "Preço + portes: Mais alto", "Popularidade"}));
        this.jComboBox2.setModel(new DefaultComboBoxModel(listaPagina(npaginas(this.anuncios.size()))));
        ordena();


    }

    public void setanuncios(Set<AnuncioVenda> anuncios) {
        this.anuncios = anuncios;
        jComboBox2.setModel(new DefaultComboBoxModel(listaPagina(npaginas(this.anuncios.size()))));
        ordena();

    }

    public void ordena() {
        String criterio = (String) jComboBox1.getModel().getElementAt(jComboBox1.getSelectedIndex());
        TreeSet<AnuncioVenda> ordenado = null;
        int numeroPag;
        if ((String) this.jComboBox2.getModel().getElementAt(this.jComboBox2.getSelectedIndex()) == null) {
            numeroPag = 0;
        } else {
            numeroPag = new Integer((String) this.jComboBox2.getModel().getElementAt(this.jComboBox2.getSelectedIndex())).intValue();
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
                if(i>0)
                    this.jseparators.get(i-1).setVisible(true);
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

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox();
        jPanel1 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        jSeparator3 = new javax.swing.JSeparator();
        jPanel4 = new javax.swing.JPanel();
        jSeparator4 = new javax.swing.JSeparator();
        jPanel5 = new javax.swing.JPanel();
        jSeparator5 = new javax.swing.JSeparator();
        jPanel6 = new javax.swing.JPanel();
        jSeparator6 = new javax.swing.JSeparator();
        jPanel7 = new javax.swing.JPanel();
        jSeparator7 = new javax.swing.JSeparator();
        jPanel8 = new javax.swing.JPanel();
        jSeparator8 = new javax.swing.JSeparator();
        jPanel9 = new javax.swing.JPanel();
        jSeparator9 = new javax.swing.JSeparator();
        jPanel10 = new javax.swing.JPanel();
        jComboBox2 = new javax.swing.JComboBox();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jPanel1.setLayout(new java.awt.CardLayout());

        jPanel2.setLayout(new java.awt.CardLayout());

        jPanel3.setLayout(new java.awt.CardLayout());

        jPanel4.setLayout(new java.awt.CardLayout());

        jPanel5.setLayout(new java.awt.CardLayout());

        jPanel6.setLayout(new java.awt.CardLayout());

        jPanel7.setLayout(new java.awt.CardLayout());

        jPanel8.setLayout(new java.awt.CardLayout());

        jPanel9.setLayout(new java.awt.CardLayout());

        jPanel10.setLayout(new java.awt.CardLayout());

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(jSeparator1)
                    .add(jPanel2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                    .add(jSeparator2)
                    .add(jPanel3, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                    .add(jSeparator3)
                    .add(jPanel4, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                    .add(jSeparator4)
                    .add(jPanel5, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                    .add(jSeparator5)
                    .add(jPanel6, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                    .add(jSeparator6)
                    .add(jPanel7, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                    .add(jSeparator7)
                    .add(jPanel8, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                    .add(jSeparator8)
                    .add(jPanel9, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                    .add(jSeparator9)
                    .add(jPanel10, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                        .add(0, 0, Short.MAX_VALUE)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, jComboBox2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, jComboBox1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(jComboBox1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jSeparator1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jSeparator2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jSeparator3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jSeparator4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jSeparator5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel6, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jSeparator6, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel7, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jSeparator7, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel8, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jSeparator8, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel9, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jSeparator9, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(jComboBox2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        ordena();

    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
        ordena();
    }//GEN-LAST:event_jComboBox2ActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    // End of variables declaration//GEN-END:variables
}
