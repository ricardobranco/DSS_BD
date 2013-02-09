/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation_Layer.Pesquisa;

import Business_Layer.Anuncio;
import Business_Layer.AnuncioVenda;
import Business_Layer.Imagem;
import Business_Layer.Leilao;
import Business_Layer.VendaDirecta;
import Presentation_Layer.Anuncio.Anuncio_Main;
import Presentation_Layer.Componentes.Avatar;
import Presentation_Layer.Perfil.Perfil;
import Presentation_Layer.Sale_Squared;
import java.util.GregorianCalendar;
import java.util.List;
import javax.swing.ImageIcon;

/**
 *
 * @author ricardobranco
 */
public class Resultado_Label extends javax.swing.JPanel {
    private final int idanuncio;
    private final Sale_Squared root;
    private final AnuncioVenda anuncio;

    /**
     * Creates new form Resultado_Label
     */
    public Resultado_Label(final Sale_Squared root, int idanuncio) {
        initComponents();
        setBorder(null);
        this.idanuncio = idanuncio;
        this.root = root;
        this.anuncio = (AnuncioVenda) this.root.getSistema().encontrarAnuncio(this.idanuncio);
        
        if(!this.anuncio.getImagens().isEmpty()){
            Imagem i = ((List<Imagem>) this.anuncio.getImagens().values()).get(0);
            this.thumb.setIcon(new Avatar(new ImageIcon(i.getPath()).getImage()));
        }
        
        this.linkanuncio.setText(this.anuncio.getTitulo());
        this.user.setText(this.anuncio.getAnunciante().getUsername());
        
        if(this.anuncio.getTipoVenda().getClass().getSimpleName().equals("Leilao"))
            this.preco.setText(((Leilao) this.anuncio.getTipoVenda()).getPrecoActual()+"");
        else
            this.preco.setText(((VendaDirecta) this.anuncio.getTipoVenda()).getPreco()+"");
        this.portes.setText(this.anuncio.getPrecoEnvio()>0?"+ € "+this.anuncio.getPrecoEnvio():"Portes Grátis");
        
        this.tempo.setText(temporestante(new GregorianCalendar(), this.anuncio.getDataExpir()));
        
        
        
        
    }
    
    private String temporestante(GregorianCalendar in, GregorianCalendar end) {

        long lin = in.getTimeInMillis();
        long lend = end.getTimeInMillis();
        long diff = lend - lin;
        long segundos = diff / 1000;
        long msres = diff % 1000;

        long minutos = segundos / 60;
        long sres = segundos % 60;

        long horas = minutos / 60;
        long mres = minutos % 60;

        long ldia = horas / 24;
        long hres = horas % 24;

        int dia = (int) ldia;
        int hora = (int) hres;
        int minuto = (int) mres;
        int segundo = (int) sres;

        String sdias = (dia > 0) ? (dia > 1 ? dia + " dias " : "1 dia ") : "";
        String shoras = (hora > 0) ? (hora > 1 ? hora + " horas " : "1 hora ") : "";
        String sminutos = (minuto > 0) ? (minuto > 1 ? minuto + " minutos " : "1 minuto ") : "";
        String ssegundos = (segundo > 0) ? (segundo > 1 ? segundo + " segundos" : "1 segundo ") : "";
        if ((sdias + shoras + sminutos + ssegundos + "").isEmpty()) {
            return "Terminado";
        } else {
            return sdias + ", " + shoras + " " + sminutos + " " + ssegundos;
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

        user = new org.jdesktop.swingx.JXHyperlink();
        thumb = new javax.swing.JButton();
        linkanuncio = new org.jdesktop.swingx.JXHyperlink();
        jLabel1 = new javax.swing.JLabel();
        preco = new javax.swing.JLabel();
        portes = new javax.swing.JLabel();
        tempo = new javax.swing.JLabel();
        comprar = new javax.swing.JButton();

        user.setForeground(new java.awt.Color(0, 102, 204));
        user.setText("jXHyperlink1");
        user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userActionPerformed(evt);
            }
        });

        thumb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Sem_Imagem.png"))); // NOI18N
        thumb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thumbActionPerformed(evt);
            }
        });

        linkanuncio.setForeground(new java.awt.Color(0, 102, 204));
        linkanuncio.setText("jXHyperlink1");
        linkanuncio.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        linkanuncio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                linkanuncioActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/top_cliente.png"))); // NOI18N

        preco.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        preco.setText("€ 100");

        portes.setText("Portes Grátis");

        tempo.setText("tempo restante");

        comprar.setText("Comprar");

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .add(thumb)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(12, 12, 12)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(linkanuncio, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(user, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(layout.createSequentialGroup()
                                .add(0, 0, Short.MAX_VALUE)
                                .add(tempo))
                            .add(layout.createSequentialGroup()
                                .add(jLabel1)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .add(comprar)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(preco))))
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(portes)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(thumb)
                    .add(layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(layout.createSequentialGroup()
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(linkanuncio, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(jLabel1))
                                .add(0, 0, Short.MAX_VALUE))
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                                .add(0, 12, Short.MAX_VALUE)
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                                    .add(preco)
                                    .add(comprar))))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(portes)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(user, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 26, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(tempo)))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void linkanuncioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_linkanuncioActionPerformed
        // TODO add your handling code here:
        this.root.setBody(new Anuncio_Main(root, idanuncio),this.anuncio.getTitulo());
    }//GEN-LAST:event_linkanuncioActionPerformed

    private void userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userActionPerformed
        // TODO add your handling code here:
        this.root.setBody(new Perfil(root, this.anuncio.getAnunciante().getUsername()), this.anuncio.getAnunciante().getUsername());
    }//GEN-LAST:event_userActionPerformed

    private void thumbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thumbActionPerformed
        // TODO add your handling code here:
        this.root.setBody(new Anuncio_Main(root, idanuncio),this.anuncio.getTitulo());
    }//GEN-LAST:event_thumbActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton comprar;
    private javax.swing.JLabel jLabel1;
    private org.jdesktop.swingx.JXHyperlink linkanuncio;
    private javax.swing.JLabel portes;
    private javax.swing.JLabel preco;
    private javax.swing.JLabel tempo;
    private javax.swing.JButton thumb;
    private org.jdesktop.swingx.JXHyperlink user;
    // End of variables declaration//GEN-END:variables
}
