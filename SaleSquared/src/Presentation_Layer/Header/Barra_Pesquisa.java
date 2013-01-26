/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation_Layer.Header;

import Business_Layer.Anuncio;
import Business_Layer.AnuncioVenda;
import Business_Layer.ComparadorUltimosAnunc;
import Business_Layer.SaleSquared;
import Presentation_Layer.Pesquisa.Pesquisa_Resultado;
import Presentation_Layer.Sale_Squared;
import java.util.Set;
import java.util.TreeSet;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author ricardobranco
 */
public class Barra_Pesquisa extends javax.swing.JPanel {

    private final Sale_Squared root;

    /**
     * Creates new form Barra_Pesquisa
     */
    public Barra_Pesquisa(final Sale_Squared root) {
        initComponents();
        this.root = root;
        this.jComboBox1.setModel(new DefaultComboBoxModel<Object>(new String[]{"Todos",
                    "    Moda", "        Vestuário",
                    "        Acessórios", "    Casa e Jardim",
                    "        Animais", "        Artigos de Jardim",
                    "        Imóveis", "        Móveis",
                    "    Tecnologia e Electrónica",
                    "        Áudio,Tv e Vídeo", "        Consolas",
                    "        Fotografia", "        Informática",
                    "        Telemóveis e Telefones",
                    "    Coleccionáveis e Arte", "        Selos",
                    "        Moeda e Notas", "        Medalhas",
                    "        Antiguidades", "        Arte", "    Saúde",
                    "        Cosméticos", "    Desporto e Entretenimento",
                    "        Brinquedos", "        Artigos de Desporto",
                    "        Filmes e Cinema", "        Livros e Revistas",
                    "        Música", "    Auto    ", "        Veículos",
                    "        Peças auto", "    Outros"}));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jXSearchField1 = new org.jdesktop.swingx.JXSearchField();
        jComboBox1 = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        jXSearchField1.setToolTipText("Procurar");
        jXSearchField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jXSearchField1ActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jButton1.setText("Pesquisa");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Pesquisa Avançada");

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(layout.createSequentialGroup()
                        .add(jXSearchField1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jComboBox1, 0, 160, Short.MAX_VALUE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jButton1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 163, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(layout.createSequentialGroup()
                        .add(0, 0, Short.MAX_VALUE)
                        .add(jButton2))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jXSearchField1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jComboBox1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jButton1))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jButton2))
        );
    }// </editor-fold>//GEN-END:initComponents

    public void pesquisar() {

        String[] campostext = {"tit", "desc", "t"};
        String[] camposcat = {"c"};
        String categoria = (String) this.jComboBox1.getModel().getElementAt(jComboBox1.getSelectedIndex());
        String critpesq = jXSearchField1.getText();

        Object[] valorestext = {critpesq, critpesq, critpesq
        };
        Object[] valorescat = {noSpaceBegin(categoria)};

        Set<Anuncio> panuncios = root.getSistema().procurarAnuncAvanc(
                root.getSistema().procurarAnuncAvanc(root.getSistema().getAnuncios().values(), campostext, valorestext, 1),
                camposcat, valorescat, 0);
        Set<AnuncioVenda> anuncios = new TreeSet<>(new ComparadorUltimosAnunc());
        for (Anuncio a : panuncios) {
            anuncios.add((AnuncioVenda) a);
        }


        root.setBody(new Pesquisa_Resultado(root, anuncios), "Resultados");
    }
    
    public static String noSpaceBegin(String s){
        int i = 0;
        for(;i<s.length() && s.charAt(i)==' ';i++);
        return s.substring(i); 
        
    }
    
    private void jXSearchField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jXSearchField1ActionPerformed
        // TODO add your handling code here:
        pesquisar();
    }//GEN-LAST:event_jXSearchField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        pesquisar();
    }//GEN-LAST:event_jButton1ActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox jComboBox1;
    private org.jdesktop.swingx.JXSearchField jXSearchField1;
    // End of variables declaration//GEN-END:variables
}
