/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation_Layer.Mensagens;

import Business_Layer.Mensagem;
import Presentation_Layer.Perfil.Perfil;
import Presentation_Layer.Sale_Squared;
import javax.swing.JDialog;

/**
 *
 * @author ricardobranco
 */
public class Ler_Mensagem extends javax.swing.JDialog {

    public static final int RECEBIDA = 1;
    public static final int ENVIADA = 2;
    private final Sale_Squared root;
    private final int idmensagem;
    private final int tipoMensagem;

    /**
     * Creates new form Ler_Mensagem1
     */
    public Ler_Mensagem(final Sale_Squared root, int idmensagem, int tipoMensagem) {
        super(root, true);
        initComponents();
        this.root = root;
        this.idmensagem = idmensagem;
        this.tipoMensagem = tipoMensagem; 

        Mensagem m = tipoMensagem == ENVIADA ? this.root.getSistema().encontrarUtilizadorReg(Sale_Squared.UTILIZADOR).encontrarMsgEnv(idmensagem) : this.root.getSistema().encontrarUtilizadorReg(Sale_Squared.UTILIZADOR).encontrarMsgRec(idmensagem);
        if(m.getEstado()==Mensagem.NAO_LIDA)
            root.getSistema().marcarMsgComoLida(Sale_Squared.UTILIZADOR, idmensagem);
        
        de.setText(m.getEmissor().getUsername());
        para.setText(m.getReceptor().getUsername());
        assunto.setText(m.getAssunto());
        corpo.setText(m.getCorpo());




    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        de = new org.jdesktop.swingx.JXHyperlink();
        para = new org.jdesktop.swingx.JXHyperlink();
        assunto = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        corpo = new javax.swing.JTextArea();
        apagar = new javax.swing.JButton();
        reponder = new javax.swing.JButton();
        reencaminhar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jLabel1.setText("De:");

        jLabel2.setText("Para:");

        jLabel3.setText("Assunto:");

        de.setForeground(new java.awt.Color(0, 102, 204));
        de.setText("jXHyperlink1");
        de.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deActionPerformed(evt);
            }
        });

        para.setForeground(new java.awt.Color(0, 102, 204));
        para.setText("jXHyperlink2");
        para.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paraActionPerformed(evt);
            }
        });

        assunto.setText("jLabel4");

        corpo.setColumns(20);
        corpo.setLineWrap(true);
        corpo.setRows(5);
        corpo.setText("\n");
        corpo.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        corpo.setEnabled(false);
        jScrollPane1.setViewportView(corpo);

        apagar.setText("Apagar");
        apagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apagarActionPerformed(evt);
            }
        });

        reponder.setText("Responder");
        reponder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reponderActionPerformed(evt);
            }
        });

        reencaminhar.setText("Reencaminhar");
        reencaminhar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reencaminharActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jScrollPane1)
                    .add(layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(layout.createSequentialGroup()
                                .add(jLabel1)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(de, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(layout.createSequentialGroup()
                                .add(jLabel2)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(para, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(layout.createSequentialGroup()
                                .add(jLabel3)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(assunto)))
                        .add(0, 0, Short.MAX_VALUE))
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                        .add(0, 317, Short.MAX_VALUE)
                        .add(reencaminhar)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(reponder)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(apagar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel1)
                    .add(de, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel2)
                    .add(para, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel3)
                    .add(assunto))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 330, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(apagar)
                    .add(reponder)
                    .add(reencaminhar)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void apagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apagarActionPerformed
        // TODO add your handling code here:
       
        if (tipoMensagem == ENVIADA) {
            root.getSistema().apagarMensagemEnviada(de.getText(), idmensagem);
        } else {
            root.getSistema().apagarMensagemRecebida(para.getText(), idmensagem);
        }
        root.setBody(new Mensagem_Main(root), "Caixa de Mensagens");
        dispose();

    }//GEN-LAST:event_apagarActionPerformed

    private void reencaminharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reencaminharActionPerformed
        // TODO add your handling code here:
        JDialog frame = new Enviar_Mensagem(root, "", assunto.getText(), corpo.getText());
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        dispose();
    }//GEN-LAST:event_reencaminharActionPerformed

    private void reponderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reponderActionPerformed
        // TODO add your handling code here:
        JDialog frame = new Enviar_Mensagem(root, tipoMensagem == ENVIADA ? para.getText() : de.getText(), assunto.getText(), "");
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        dispose();
    }//GEN-LAST:event_reponderActionPerformed

    private void deActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deActionPerformed
        // TODO add your handling code here:
        root.setBody(new Perfil(root, de.getText()), de.getText());
        dispose();
    }//GEN-LAST:event_deActionPerformed

    private void paraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paraActionPerformed
        // TODO add your handling code here:
        root.setBody(new Perfil(root, para.getText()), para.getText());
        dispose();
    }//GEN-LAST:event_paraActionPerformed
    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton apagar;
    private javax.swing.JLabel assunto;
    private javax.swing.JTextArea corpo;
    private org.jdesktop.swingx.JXHyperlink de;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private org.jdesktop.swingx.JXHyperlink para;
    private javax.swing.JButton reencaminhar;
    private javax.swing.JButton reponder;
    // End of variables declaration//GEN-END:variables
}