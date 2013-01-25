/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation_Layer.Header;

import Presentation_Layer.ContaPessoal.Conta_Pessoal;
import Presentation_Layer.Home.Home;
import Presentation_Layer.Inserir.Inserir;
import Presentation_Layer.Mensagens.Mensagem_Main;
import Presentation_Layer.Perfil.Perfil;
import Presentation_Layer.Sale_Squared;

/**
 *
 * @author ricardobranco
 */
public class Registado_Panel extends javax.swing.JPanel {

    private final Sale_Squared root;

    /**
     * Creates new form Registado_Panel
     */
    public Registado_Panel(final Sale_Squared root) {
        initComponents();
        this.root = root;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sair = new javax.swing.JButton();
        mensagens = new javax.swing.JButton();
        perfil = new javax.swing.JButton();
        areapessoal = new javax.swing.JButton();
        anunciar = new javax.swing.JButton();

        sair.setText("Sair");
        sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairActionPerformed(evt);
            }
        });

        mensagens.setText("Mensagens");
        mensagens.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mensagensActionPerformed(evt);
            }
        });

        perfil.setText("Perfil");
        perfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                perfilActionPerformed(evt);
            }
        });

        areapessoal.setText("Área Pessoal");
        areapessoal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                areapessoalActionPerformed(evt);
            }
        });

        anunciar.setText("Anunciar");
        anunciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anunciarActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(anunciar)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(areapessoal)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(perfil)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(mensagens)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(sair)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                .add(sair)
                .add(mensagens)
                .add(perfil)
                .add(areapessoal)
                .add(anunciar))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairActionPerformed
        // TODO add your handling code here:
        Sale_Squared.REGISTADO = false;
        Sale_Squared.UTILIZADOR = null;
        root.getSistema().logout();
        root.reloadHeader();
        root.setBody(new Home(root), "Home");
    }//GEN-LAST:event_sairActionPerformed

    private void perfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_perfilActionPerformed
        // TODO add your handling code here:
        root.setBody(new Perfil(root, Sale_Squared.UTILIZADOR), Sale_Squared.UTILIZADOR);

    }//GEN-LAST:event_perfilActionPerformed

    private void areapessoalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_areapessoalActionPerformed
        // TODO add your handling code here:
        root.setBody(new Conta_Pessoal(root), "Conta Pessoal");
    }//GEN-LAST:event_areapessoalActionPerformed

    private void anunciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anunciarActionPerformed
        // TODO add your handling code here:
        root.setBody(new Inserir(root), "Novo negócio");
    }//GEN-LAST:event_anunciarActionPerformed

    private void mensagensActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mensagensActionPerformed
        // TODO add your handling code here:
        root.setBody(new Mensagem_Main(root), "Caixa de Mensagens");
    }//GEN-LAST:event_mensagensActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton anunciar;
    private javax.swing.JButton areapessoal;
    private javax.swing.JButton mensagens;
    private javax.swing.JButton perfil;
    private javax.swing.JButton sair;
    // End of variables declaration//GEN-END:variables
}
