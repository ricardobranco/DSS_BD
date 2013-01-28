/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation_Layer.Perfil;

import Business_Layer.Anuncio;
import Business_Layer.AnuncioVenda;
import Business_Layer.ComparadorUltimosAnunc;
import Business_Layer.Imagem;
import Business_Layer.UtilizadorRegistado;
import Presentation_Layer.Componentes.Avatar;
import Presentation_Layer.Mensagens.Enviar_Mensagem;
import Presentation_Layer.Pesquisa.Pesquisa_Resultado;
import Presentation_Layer.Sale_Squared;
import java.util.GregorianCalendar;
import java.util.Set;
import java.util.TreeSet;
import javax.swing.ImageIcon;
import javax.swing.JDialog;

/**
 *
 * @author ricardobranco
 */
public class Perfil extends javax.swing.JPanel {
    
    private final String username;
    private final UtilizadorRegistado ur;
    private final Sale_Squared root;

    /**
     * Creates new form Perfil
     */
    public Perfil(final Sale_Squared root, String username) {
        initComponents();
        this.username = username;
        this.ur = root.getSistema().encontrarUtilizadorReg(username);
        this.root = root;
        Imagem img = this.ur.getImagem();
        if (!img.getPath().isEmpty()) {
            avatar.setIcon(new Avatar(new ImageIcon(img.getPath()).getImage()));
        }
        this.nick.setText(username);
        this.registo.setText("Registado desde " + showdata(this.ur.getDataRegisto()));
        this.top.setVisible(root.getSistema().eUserConfiavel(this.username));
        this.seguir.setVisible(Sale_Squared.REGISTADO);
        if (username.equals(Sale_Squared.REGISTADO) || !Sale_Squared.REGISTADO) {
            seguir.setVisible(false);
            enviar.setVisible(false);
        }
        
        
    }
    
    private String showdata(GregorianCalendar gc) {
        int dia, mes, ano, hora, minutos;
        
        dia = gc.get(GregorianCalendar.DAY_OF_MONTH);
        mes = gc.get(GregorianCalendar.MONTH) + 1;
        ano = gc.get(GregorianCalendar.YEAR);
        return dia + "/" + mes + "/" + ano;
    }
    
    public void seguirutilizador() {
        if (seguir.getText().equals("Seguir Utilizador")) {
            seguir.setText("Deixar Utilizador");
            this.root.getSistema().deixarSegUser(Sale_Squared.UTILIZADOR, this.username);
        } else {
            seguir.setText("Seguir Utilizador");
            this.root.getSistema().seguirUser(Sale_Squared.UTILIZADOR, this.ur);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        avatar = new javax.swing.JLabel();
        nick = new javax.swing.JLabel();
        registo = new javax.swing.JLabel();
        top = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        seguir = new javax.swing.JButton();
        enviar = new javax.swing.JButton();

        avatar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/avatar.jpg"))); // NOI18N

        nick.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        nick.setText("jLabel2");

        registo.setText("jLabel3");

        top.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/top_cliente.png"))); // NOI18N

        jTabbedPane1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jTabbedPane1StateChanged(evt);
            }
        });

        jPanel1.setLayout(new java.awt.CardLayout());
        jTabbedPane1.addTab("Reputação", jPanel1);

        jPanel2.setLayout(new java.awt.CardLayout());
        jTabbedPane1.addTab("Anúncios", jPanel2);

        jPanel3.setLayout(new java.awt.CardLayout());
        jTabbedPane1.addTab("Sobre", jPanel3);

        seguir.setText("Seguir Utilizador");
        seguir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seguirActionPerformed(evt);
            }
        });

        enviar.setText("Enviar Mensagem");
        enviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enviarActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jTabbedPane1)
                    .add(layout.createSequentialGroup()
                        .add(avatar)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(layout.createSequentialGroup()
                                .add(nick)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(top))
                            .add(registo))
                        .add(0, 161, Short.MAX_VALUE))
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                        .add(enviar)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(seguir)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                            .add(top)
                            .add(nick))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(registo))
                    .add(avatar))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jTabbedPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(seguir)
                    .add(enviar))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void seguirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seguirActionPerformed
        // TODO add your handling code here:
        seguirutilizador();
    }//GEN-LAST:event_seguirActionPerformed
    
    private void jTabbedPane1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jTabbedPane1StateChanged
        // TODO add your handling code here:
        switch (this.jTabbedPane1.getSelectedIndex()) {
            case 0:
                jPanel1.removeAll();
                jPanel1.add(new Perfil_Reputacao(), "perfil_rep");
                jPanel1.updateUI();
                jPanel1.validate();
                break;
            case 1:
                String[] user = {"user"};
                Object[] nome = {this.username};
                Set<Anuncio> panuncios = root.getSistema().procurarAnuncAvanc(root.getSistema().getAnuncios().values(), user, nome, 0);
                Set<AnuncioVenda> anuncios = new TreeSet<>(new ComparadorUltimosAnunc());
                for (Anuncio a : panuncios) {
                    anuncios.add((AnuncioVenda) a);
                }
                jPanel2.removeAll();
                jPanel2.add(new Pesquisa_Resultado(root, anuncios), "Negócios");
                jPanel2.updateUI();
                jPanel2.validate();
                break;
            case 2:
                break;
            
        }
        
    }//GEN-LAST:event_jTabbedPane1StateChanged
    
    private void enviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enviarActionPerformed
        // TODO add your handling code here:
        JDialog frame = new Enviar_Mensagem(root, username, "", "");
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }//GEN-LAST:event_enviarActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel avatar;
    private javax.swing.JButton enviar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel nick;
    private javax.swing.JLabel registo;
    private javax.swing.JButton seguir;
    private javax.swing.JLabel top;
    // End of variables declaration//GEN-END:variables
}
