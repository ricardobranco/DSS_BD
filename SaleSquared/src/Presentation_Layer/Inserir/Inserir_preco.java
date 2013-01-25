/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation_Layer.Inserir;

import Presentation_Layer.Componentes.Horas;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.DefaultComboBoxModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author ricardobranco
 */
public class Inserir_preco extends javax.swing.JPanel {

    private final Icon ERRADO = new ImageIcon(getClass().getResource("/Imagens/errado.png"));
    private final Icon CERTO = new ImageIcon(getClass().getResource("/Imagens/certo.png"));
    private final Horas horas;

    /**
     * Creates new form Inserir_preco2
     */
    public Inserir_preco() {
        initComponents();
        this.buttonGroup1.add(jRadioButton1);
        this.buttonGroup1.add(jRadioButton2);
        this.lp.setVisible(false);
        this.lpi.setVisible(false);
        this.lq.setVisible(false);
        this.lv.setVisible(false);
        horas = new Horas();
        date.setDate(new Date());

        GregorianCalendar gc = new GregorianCalendar();
        Calendar min = Calendar.getInstance();
        min.set(Calendar.YEAR, gc.get(GregorianCalendar.YEAR));
        min.set(Calendar.MONTH, gc.get(GregorianCalendar.MONTH));
        min.set(Calendar.DATE, gc.get(GregorianCalendar.DATE));

        date.setMinSelectableDate(min.getTime());
        horasp.add(horas, "Horas");
        incremento.setModel(new DefaultComboBoxModel<String>(new String[]{
                    "0.01", "0.05", "0.10", "0.50", "1.00", "5.00", "10.00",
                    "50.00", "100.00", "500.00", "1000.00", "5000.00", "10000.00"}));



    }

    public boolean eLeilao() {
        return jRadioButton1.isSelected();
    }

    public GregorianCalendar validade() throws Exception {
        GregorianCalendar hoje = new GregorianCalendar();
        int dia, mes, ano, hora = 0, minutos;
        Calendar c = date.getCalendar();
        dia = c.get(Calendar.DAY_OF_MONTH);
        mes = c.get(Calendar.MONTH);
        ano = c.get(Calendar.YEAR);
        hora = horas.getHora();
        minutos = horas.getMinutos();

        GregorianCalendar res = new GregorianCalendar(ano, mes, dia, hora,
                minutos);

        long lhoje = hoje.getTimeInMillis();
        long lres = res.getTimeInMillis();
        long diff = lres - lhoje;
        long diffDays = diff / (24 * 60 * 60 * 1000);

        if (diffDays < 7) {
            this.lv.setVisible(true);
            this.lv.setIcon(ERRADO);
            throw new Exception("O anúncio tem que estar no min. 7 dias online");
        }
        this.lv.setVisible(true);
        this.lv.setIcon(CERTO);

        return res;
    }

    public double getLicMin() throws Exception {
        String slicmin = preco_ini.getText();
        if (slicmin.isEmpty()) {
            this.lpi.setVisible(true);
            this.lpi.setIcon(ERRADO);
            throw new Exception("Insira um preço inicial");
        }
        double res;
        try {
            res = new Double(slicmin).doubleValue();
        } catch (Exception e) {
            this.lpi.setVisible(true);
            this.lpi.setIcon(ERRADO);
            throw new Exception("Insira um preço inicial válido");
        }
        if (res <= 0) {
            this.lpi.setVisible(true);
            this.lpi.setIcon(ERRADO);
            throw new Exception("Insira um preço inical positivo");
        }
        this.lpi.setVisible(true);
        this.lpi.setIcon(CERTO);

        return res;
    }

    public double getPreco() throws Exception {
        String spreco = preco.getText();
        if (spreco.isEmpty()) {
            this.lp.setVisible(true);
            this.lp.setIcon(ERRADO);
            throw new Exception("Insira um preço");
        }
        double res;
        try {
            res = new Double(spreco).doubleValue();
        } catch (Exception e) {
            this.lp.setVisible(true);
            this.lp.setIcon(ERRADO);
            throw new Exception("Insira um preço válido");
        }
        if (res <= 0) {
            this.lp.setVisible(true);
            this.lp.setIcon(ERRADO);
            throw new Exception("Insira um preço positivo");
        }
        this.lp.setVisible(true);
        this.lp.setIcon(CERTO);
        return res;
    }

    public double getInc() {
        String sinc = (String) incremento.getModel().getElementAt(
                incremento.getSelectedIndex());
        return new Double(sinc).doubleValue();
    }

    public int getQuantidade() throws Exception {
        String squantidade = quantidade.getText();
        if (squantidade.isEmpty()) {
            this.lq.setVisible(true);
            this.lq.setIcon(ERRADO);
            throw new Exception("Insira uma quantidade");
        }
        int res;
        try {
            res = new Integer(squantidade).intValue();
        } catch (Exception e) {
            this.lq.setVisible(true);
            this.lq.setIcon(ERRADO);
            throw new Exception("Insira uma quantidade válida");
        }
        if (res < 1) {
            this.lq.setVisible(true);
            this.lq.setIcon(ERRADO);
            throw new Exception("Insira uma quantidade positiva");
        }
        this.lp.setVisible(true);
        this.lp.setIcon(CERTO);
        return res;
    }

    public boolean trocas() {
        return trocas.isSelected();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        leilao_panel = new javax.swing.JPanel();
        preco_ini = new org.jdesktop.swingx.JXTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        incremento = new javax.swing.JComboBox();
        lpi = new javax.swing.JLabel();
        comprar_panel = new javax.swing.JPanel();
        preco = new org.jdesktop.swingx.JXTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        quantidade = new org.jdesktop.swingx.JXTextField();
        lq = new javax.swing.JLabel();
        lp = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lv = new javax.swing.JLabel();
        horasp = new javax.swing.JPanel();
        trocas = new javax.swing.JCheckBox();
        date = new com.toedter.calendar.JDateChooser();

        jRadioButton1.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jRadioButton1.setText("Leilão");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        jRadioButton2.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jRadioButton2.setText("Comprar Já");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        preco_ini.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                preco_iniActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel1.setText("Preço inicial  €");

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel2.setText("Incremento Mínimo   €");

        lpi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/errado.png"))); // NOI18N

        org.jdesktop.layout.GroupLayout leilao_panelLayout = new org.jdesktop.layout.GroupLayout(leilao_panel);
        leilao_panel.setLayout(leilao_panelLayout);
        leilao_panelLayout.setHorizontalGroup(
            leilao_panelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(leilao_panelLayout.createSequentialGroup()
                .addContainerGap()
                .add(leilao_panelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(leilao_panelLayout.createSequentialGroup()
                        .add(jLabel1)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(preco_ini, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .add(leilao_panelLayout.createSequentialGroup()
                        .add(jLabel2)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(incremento, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 94, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(lpi)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        leilao_panelLayout.setVerticalGroup(
            leilao_panelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(leilao_panelLayout.createSequentialGroup()
                .add(leilao_panelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(preco_ini, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel1)
                    .add(lpi))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(leilao_panelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel2)
                    .add(incremento, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
        );

        preco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                precoActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel3.setText("Preço  €");

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel4.setText("Quantidade");

        quantidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantidadeActionPerformed(evt);
            }
        });

        lq.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/errado.png"))); // NOI18N

        lp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/certo.png"))); // NOI18N

        org.jdesktop.layout.GroupLayout comprar_panelLayout = new org.jdesktop.layout.GroupLayout(comprar_panel);
        comprar_panel.setLayout(comprar_panelLayout);
        comprar_panelLayout.setHorizontalGroup(
            comprar_panelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(comprar_panelLayout.createSequentialGroup()
                .addContainerGap()
                .add(comprar_panelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(comprar_panelLayout.createSequentialGroup()
                        .add(jLabel3)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(preco, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .add(comprar_panelLayout.createSequentialGroup()
                        .add(jLabel4)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(quantidade, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 125, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(comprar_panelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(lq)
                    .add(lp))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        comprar_panelLayout.setVerticalGroup(
            comprar_panelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(comprar_panelLayout.createSequentialGroup()
                .add(comprar_panelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(preco, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel3))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(comprar_panelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(quantidade, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel4)))
            .add(comprar_panelLayout.createSequentialGroup()
                .add(lp)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(lq))
        );

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel6.setText("Validade");

        jLabel9.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel9.setText("Data");

        jLabel10.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel10.setText("Hora");

        lv.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/certo.png"))); // NOI18N

        horasp.setLayout(new java.awt.CardLayout());

        trocas.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        trocas.setText("Aceitar trocas");

        date.setDateFormatString("dd/MMMM/yyyy");
        date.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                datePropertyChange(evt);
            }
        });

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(29, 29, 29)
                        .add(comprar_panel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .add(layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                                .add(29, 29, 29)
                                .add(leilao_panel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .add(layout.createSequentialGroup()
                                .add(jRadioButton1)
                                .add(0, 316, Short.MAX_VALUE)))
                        .addContainerGap())
                    .add(layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jRadioButton2)
                            .add(jLabel6))
                        .add(0, 0, Short.MAX_VALUE))))
            .add(layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(71, 71, 71)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                            .add(layout.createSequentialGroup()
                                .add(jLabel10)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(horasp, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .add(layout.createSequentialGroup()
                                .add(jLabel9)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(date, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 159, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(lv))))
                    .add(layout.createSequentialGroup()
                        .addContainerGap()
                        .add(trocas)))
                .add(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(jRadioButton1)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(leilao_panel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jRadioButton2)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(comprar_panel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jLabel6)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jLabel9)
                            .add(lv))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(horasp, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 41, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jLabel10))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(trocas))
                    .add(date, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(9, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
        this.leilao_panel.setVisible(false);
        this.comprar_panel.setVisible(true);
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
        this.leilao_panel.setVisible(true);
        this.comprar_panel.setVisible(false);
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void preco_iniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_preco_iniActionPerformed
        // TODO add your handling code here:
        String slicmin = preco_ini.getText();
        if (slicmin.isEmpty()) {
            this.lpi.setVisible(true);
            this.lpi.setIcon(ERRADO);
        } else {
            double res = 0;
            try {
                res = new Double(slicmin).doubleValue();
            } catch (Exception e) {
                res = 0;
            }
            if (res <= 0) {
                this.lpi.setVisible(true);
                this.lpi.setIcon(ERRADO);

            } else {
                this.lpi.setVisible(true);
                this.lpi.setIcon(CERTO);
            }
        }
    }//GEN-LAST:event_preco_iniActionPerformed

    private void precoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_precoActionPerformed
        // TODO add your handling code here:
        String slicmin = preco.getText();
        if (slicmin.isEmpty()) {
            this.lp.setVisible(true);
            this.lp.setIcon(ERRADO);
        } else {
            double res = 0;
            try {
                res = new Double(slicmin).doubleValue();
            } catch (Exception e) {
                res = 0;
            }
            if (res <= 0) {
                this.lp.setVisible(true);
                this.lp.setIcon(ERRADO);

            } else {
                this.lp.setVisible(true);
                this.lp.setIcon(CERTO);
            }
        }
    }//GEN-LAST:event_precoActionPerformed

    private void quantidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quantidadeActionPerformed
        // TODO add your handling code here:
         String slicmin = quantidade.getText();
        if (slicmin.isEmpty()) {
            this.lq.setVisible(true);
            this.lq.setIcon(ERRADO);
        } else {
            double res = 0;
            try {
                res = new Double(slicmin).doubleValue();
            } catch (Exception e) {
                res = 0;
            }
            if (res <= 0) {
                this.lq.setVisible(true);
                this.lq.setIcon(ERRADO);

            } else {
                this.lq.setVisible(true);
                this.lq.setIcon(CERTO);
            }
        }
    }//GEN-LAST:event_quantidadeActionPerformed

    private void datePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_datePropertyChange
        // TODO add your handling code here:
        GregorianCalendar hoje = new GregorianCalendar();
        int dia, mes, ano, hora = 0, minutos;
        Calendar c = date.getCalendar();
        dia = c.get(Calendar.DAY_OF_MONTH);
        mes = c.get(Calendar.MONTH);
        ano = c.get(Calendar.YEAR);
        hora = horas.getHora();
        minutos = horas.getMinutos();

        GregorianCalendar res = new GregorianCalendar(ano, mes, dia, hora,
                minutos);

        long lhoje = hoje.getTimeInMillis();
        long lres = res.getTimeInMillis();
        long diff = lres - lhoje;
        long diffDays = diff / (24 * 60 * 60 * 1000);

        if (diffDays < 7) {
            this.lv.setVisible(true);
            this.lv.setIcon(ERRADO);

        } else {
            this.lv.setVisible(true);
            this.lv.setIcon(CERTO);
        }
    }//GEN-LAST:event_datePropertyChange
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel comprar_panel;
    private com.toedter.calendar.JDateChooser date;
    private javax.swing.JPanel horasp;
    private javax.swing.JComboBox incremento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JPanel leilao_panel;
    private javax.swing.JLabel lp;
    private javax.swing.JLabel lpi;
    private javax.swing.JLabel lq;
    private javax.swing.JLabel lv;
    private org.jdesktop.swingx.JXTextField preco;
    private org.jdesktop.swingx.JXTextField preco_ini;
    private org.jdesktop.swingx.JXTextField quantidade;
    private javax.swing.JCheckBox trocas;
    // End of variables declaration//GEN-END:variables
}
