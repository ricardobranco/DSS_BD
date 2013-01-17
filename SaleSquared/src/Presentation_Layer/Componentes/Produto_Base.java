package Presentation_Layer.Componentes;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.LayoutStyle.ComponentPlacement;

import org.jdesktop.swingx.JXHyperlink;

import Presentation_Layer.Sale_Squared;
import Presentation_Layer.Anuncio.Anuncio_Main;

import Business_Layer.*;
import java.util.Collection;
import java.util.GregorianCalendar;
import java.util.List;
import javax.swing.Icon;

public class Produto_Base extends JPanel {

    /**
     *
     */
    private AnuncioVenda anuncio;
    private int idanuncio;
    private static final long serialVersionUID = 1L;
    private final Sale_Squared root;
    

    /**
     * Create the panel.
     */
    public Produto_Base(final Sale_Squared root, int idanuncio) {

       this.root = root;
       this.idanuncio = idanuncio;
       this.anuncio = (AnuncioVenda) root.getSistema().encontrarAnuncio(this.idanuncio); 
        JButton button = new JButton("");
        button.addActionListener(new ActionListener() {
            private AnuncioVenda anuncio;

            public void actionPerformed(ActionEvent e) {
               abrir();

            }
        });


        List<Imagem> ci = (List<Imagem>) anuncio.getImagens().values();
        Icon i = ci.isEmpty() ? new ImageIcon(Produto_Base.class
                .getResource("/Imagens/Sem_Imagem.png")) : new Avatar(new ImageIcon(ci.get(0).getPath()).getImage());



        button.setIcon(i);
        JLabel lblMin = new JLabel("50");

        ModoVenda mv = anuncio.getTipoVenda();
        boolean leilao = mv.getClass().getSimpleName().equals("Leilao");

        JLabel label = new JLabel("");


        if (leilao) {
            label.setVisible(false);
            lblMin.setText("€ " + ((Leilao) mv).getPrecoActual());
        } else {
            lblMin.setVisible(false);
            label.setText("€ " + ((VendaDirecta) mv).getPreco());
        }




        label.setFont(new Font("Lucida Grande", Font.BOLD, 13));

        JLabel label_1 = new JLabel(temporestante(new GregorianCalendar(), anuncio.getDataExpir()));
        label_1.setFont(new Font("Lucida Grande", Font.BOLD | Font.ITALIC, 13));

        JXHyperlink hprlnkNegcio = new JXHyperlink();
        hprlnkNegcio.setForeground(new Color(0, 102, 204));
        hprlnkNegcio.setText(anuncio.getTitulo());
        GroupLayout groupLayout = new GroupLayout(this);
        groupLayout
                .setHorizontalGroup(groupLayout
                .createParallelGroup(Alignment.LEADING)
                .addGroup(
                groupLayout
                .createSequentialGroup()
                .addComponent(button)
                .addPreferredGap(
                ComponentPlacement.RELATED)
                .addGroup(
                groupLayout
                .createParallelGroup(
                Alignment.LEADING)
                .addComponent(
                lblMin,
                Alignment.TRAILING)
                .addGroup(
                groupLayout
                .createSequentialGroup()
                .addGroup(
                groupLayout
                .createParallelGroup(
                Alignment.TRAILING,
                false)
                .addComponent(
                hprlnkNegcio,
                Alignment.LEADING,
                GroupLayout.DEFAULT_SIZE,
                GroupLayout.DEFAULT_SIZE,
                Short.MAX_VALUE)
                .addComponent(
                label_1,
                Alignment.LEADING,
                GroupLayout.DEFAULT_SIZE,
                GroupLayout.DEFAULT_SIZE,
                Short.MAX_VALUE))
                .addPreferredGap(
                ComponentPlacement.RELATED,
                237,
                Short.MAX_VALUE)
                .addComponent(
                label)))
                .addContainerGap()));
        groupLayout
                .setVerticalGroup(groupLayout
                .createParallelGroup(Alignment.LEADING)
                .addComponent(button, GroupLayout.PREFERRED_SIZE, 79,
                GroupLayout.PREFERRED_SIZE)
                .addGroup(
                groupLayout
                .createSequentialGroup()
                .addContainerGap()
                .addComponent(hprlnkNegcio,
                GroupLayout.PREFERRED_SIZE, 13,
                GroupLayout.PREFERRED_SIZE)
                .addGap(10)
                .addComponent(lblMin,
                GroupLayout.PREFERRED_SIZE, 21,
                Short.MAX_VALUE)
                .addPreferredGap(
                ComponentPlacement.RELATED)
                .addGroup(
                groupLayout
                .createParallelGroup(
                Alignment.BASELINE)
                .addComponent(
                label,
                GroupLayout.DEFAULT_SIZE,
                GroupLayout.DEFAULT_SIZE,
                Short.MAX_VALUE)
                .addComponent(
                label_1,
                GroupLayout.DEFAULT_SIZE,
                GroupLayout.DEFAULT_SIZE,
                Short.MAX_VALUE))
                .addGap(13)));
        setLayout(groupLayout);

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
    
    
    public void abrir(){
         this.anuncio = (AnuncioVenda) root.getSistema().encontrarAnuncio(idanuncio);
                JPanel anuncio = new Anuncio_Main(root, this.idanuncio);
                
                root.setBody(anuncio, this.anuncio.getTitulo());
        
    }
}
