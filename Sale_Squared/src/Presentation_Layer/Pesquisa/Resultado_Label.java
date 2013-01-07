package Presentation_Layer.Pesquisa;

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

import Business_Layer.AnuncioVenda;
import Business_Layer.Imagem;
import Business_Layer.Leilao;
import Business_Layer.ModoVenda;
import Business_Layer.VendaDirecta;
import Presentation_Layer.Sale_Squared;
import Presentation_Layer.Anuncio.Anuncio_Main;
import Presentation_Layer.Componentes.Avatar;
import Presentation_Layer.Componentes.Produto_Base;
import Presentation_Layer.Perfil.Perfil;
import java.util.List;
import javax.swing.Icon;

public class Resultado_Label extends JPanel {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * Create the panel.
     */
    public Resultado_Label(final Sale_Squared root, final AnuncioVenda anuncio) {
        setBorder(null);

        JPanel panel = new JPanel();

        JPanel panel_1 = new JPanel();

        JPanel panel_2 = new JPanel();

        JPanel panel_3 = new JPanel();

        JPanel panel_4 = new JPanel();
        GroupLayout groupLayout = new GroupLayout(this);
        groupLayout
                .setHorizontalGroup(groupLayout
                .createParallelGroup(Alignment.LEADING)
                .addGroup(
                groupLayout
                .createSequentialGroup()
                .addContainerGap()
                .addComponent(panel,
                GroupLayout.PREFERRED_SIZE,
                105, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(
                ComponentPlacement.UNRELATED)
                .addGroup(
                groupLayout
                .createParallelGroup(
                Alignment.LEADING)
                .addComponent(
                panel_1,
                GroupLayout.DEFAULT_SIZE,
                496,
                Short.MAX_VALUE)
                .addGroup(
                groupLayout
                .createSequentialGroup()
                .addComponent(
                panel_2,
                GroupLayout.PREFERRED_SIZE,
                GroupLayout.DEFAULT_SIZE,
                GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(
                ComponentPlacement.RELATED,
                160,
                Short.MAX_VALUE)
                .addComponent(
                panel_4,
                GroupLayout.PREFERRED_SIZE,
                185,
                GroupLayout.PREFERRED_SIZE))
                .addGroup(
                Alignment.TRAILING,
                groupLayout
                .createSequentialGroup()
                .addGap(159)
                .addComponent(
                panel_3,
                GroupLayout.PREFERRED_SIZE,
                337,
                GroupLayout.PREFERRED_SIZE)))
                .addContainerGap()));
        groupLayout
                .setVerticalGroup(groupLayout
                .createParallelGroup(Alignment.LEADING)
                .addGroup(
                groupLayout
                .createSequentialGroup()
                .addContainerGap()
                .addGroup(
                groupLayout
                .createParallelGroup(
                Alignment.LEADING,
                false)
                .addGroup(
                groupLayout
                .createSequentialGroup()
                .addComponent(
                panel_1,
                GroupLayout.PREFERRED_SIZE,
                25,
                GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(
                ComponentPlacement.RELATED)
                .addGroup(
                groupLayout
                .createParallelGroup(
                Alignment.TRAILING)
                .addGroup(
                Alignment.LEADING,
                groupLayout
                .createSequentialGroup()
                .addComponent(
                panel_3,
                GroupLayout.PREFERRED_SIZE,
                44,
                GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(
                ComponentPlacement.RELATED)
                .addComponent(
                panel_4,
                GroupLayout.PREFERRED_SIZE,
                18,
                Short.MAX_VALUE))
                .addComponent(
                panel_2,
                GroupLayout.PREFERRED_SIZE,
                18,
                GroupLayout.PREFERRED_SIZE)))
                .addComponent(
                panel,
                GroupLayout.PREFERRED_SIZE,
                99,
                GroupLayout.PREFERRED_SIZE))
                .addContainerGap()));

        JLabel lblNewLabel_5 = new JLabel(temporestante(anuncio.calculaTempoRestanteLeilao()));
        lblNewLabel_5.setForeground(new Color(0, 0, 51));
        lblNewLabel_5.setFont(new Font("Lucida Grande", Font.BOLD, 13));
        GroupLayout gl_panel_4 = new GroupLayout(panel_4);
        gl_panel_4.setHorizontalGroup(gl_panel_4.createParallelGroup(
                Alignment.LEADING).addGroup(
                gl_panel_4.createSequentialGroup().addContainerGap()
                .addComponent(lblNewLabel_5)
                .addContainerGap(38, Short.MAX_VALUE)));
        gl_panel_4.setVerticalGroup(gl_panel_4.createParallelGroup(
                Alignment.LEADING).addGroup(
                gl_panel_4
                .createSequentialGroup()
                .addComponent(lblNewLabel_5)
                .addContainerGap(GroupLayout.DEFAULT_SIZE,
                Short.MAX_VALUE)));
        panel_4.setLayout(gl_panel_4);

        JLabel lblNewLabel_2 = new JLabel("");
        
        if(root.getSistema().temUserRating(anuncio.getAnunciante().getUsername()) && root.getSistema().eUserConfiavel(anuncio.getAnunciante().getUsername()))
            lblNewLabel_2.setVisible(true);
        else
            lblNewLabel_2.setVisible(false);
       
        lblNewLabel_2.setIcon(new ImageIcon(Resultado_Label.class
                .getResource("/Imagens/top_cliente.png")));
        lblNewLabel_2.setFont(new Font("Lucida Grande", Font.PLAIN, 13));
        JButton btnNewButton_1 = new JButton("Comprar Já");
        JLabel lblNewLabel_3 = new JLabel("€ 500.28");
        ModoVenda mv = anuncio.getTipoVenda();
        if (mv.getClass().getSimpleName().equals("Leilao")) {
            btnNewButton_1.setVisible(false);
            lblNewLabel_3.setText("€ " + ((Leilao) mv).getPrecoActual());
        } else {
            lblNewLabel_3.setText("€ " + ((VendaDirecta) mv).getPreco());
        }

        lblNewLabel_3.setFont(new Font("Lucida Grande", Font.BOLD, 13));

        JLabel lblNewLabel_4 = new JLabel(anuncio.getPrecoEnvio() == 0 ? "Portes Grátis" : "" + anuncio.getPrecoEnvio());
        lblNewLabel_4.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
        GroupLayout gl_panel_3 = new GroupLayout(panel_3);
        gl_panel_3.setHorizontalGroup(gl_panel_3.createParallelGroup(
                Alignment.LEADING).addGroup(
                gl_panel_3
                .createSequentialGroup()
                .addContainerGap()
                .addComponent(lblNewLabel_2)
                .addPreferredGap(ComponentPlacement.RELATED)
                .addComponent(btnNewButton_1)
                .addPreferredGap(ComponentPlacement.RELATED)
                .addGroup(
                gl_panel_3
                .createParallelGroup(Alignment.LEADING)
                .addComponent(lblNewLabel_3)
                .addComponent(lblNewLabel_4))
                .addContainerGap(107, Short.MAX_VALUE)));
        gl_panel_3
                .setVerticalGroup(gl_panel_3
                .createParallelGroup(Alignment.LEADING)
                .addGroup(
                gl_panel_3
                .createSequentialGroup()
                .addContainerGap()
                .addGroup(
                gl_panel_3
                .createParallelGroup(
                Alignment.LEADING)
                .addGroup(
                gl_panel_3
                .createSequentialGroup()
                .addComponent(
                lblNewLabel_3)
                .addPreferredGap(
                ComponentPlacement.RELATED)
                .addComponent(
                lblNewLabel_4))
                .addComponent(
                btnNewButton_1)
                .addComponent(
                lblNewLabel_2))
                .addContainerGap(13, Short.MAX_VALUE)));
        panel_3.setLayout(gl_panel_3);

        JXHyperlink hprlnkAutor = new JXHyperlink();
        hprlnkAutor.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                root.setBody(new Perfil(root,anuncio.getAnunciante()), "Perfil");
            }
        });
        hprlnkAutor.setForeground(new Color(0, 0, 0));
        hprlnkAutor.setText(""+anuncio.getAnunciante().getUsername());
        GroupLayout gl_panel_2 = new GroupLayout(panel_2);
        gl_panel_2.setHorizontalGroup(gl_panel_2.createParallelGroup(
                Alignment.LEADING).addGroup(
                gl_panel_2
                .createSequentialGroup()
                .addContainerGap()
                .addComponent(hprlnkAutor, GroupLayout.PREFERRED_SIZE,
                81, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(64, Short.MAX_VALUE)));
        gl_panel_2.setVerticalGroup(gl_panel_2.createParallelGroup(
                Alignment.LEADING).addGroup(
                gl_panel_2
                .createSequentialGroup()
                .addComponent(hprlnkAutor, GroupLayout.PREFERRED_SIZE,
                17, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(GroupLayout.DEFAULT_SIZE,
                Short.MAX_VALUE)));
        panel_2.setLayout(gl_panel_2);

        JXHyperlink hprlnkTituloDoNegcio = new JXHyperlink();
        hprlnkTituloDoNegcio.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                root.setBody(new Anuncio_Main(root, anuncio), "anuncio");
            }
        });
        hprlnkTituloDoNegcio.setForeground(new Color(0, 102, 204));
        hprlnkTituloDoNegcio.setText("Titulo do Negócio");
        GroupLayout gl_panel_1 = new GroupLayout(panel_1);
        gl_panel_1.setHorizontalGroup(gl_panel_1.createParallelGroup(
                Alignment.LEADING).addGroup(
                gl_panel_1
                .createSequentialGroup()
                .addContainerGap()
                .addComponent(hprlnkTituloDoNegcio,
                GroupLayout.PREFERRED_SIZE, 128,
                GroupLayout.PREFERRED_SIZE)
                .addContainerGap(362, Short.MAX_VALUE)));
        gl_panel_1.setVerticalGroup(gl_panel_1.createParallelGroup(
                Alignment.LEADING).addGroup(
                Alignment.TRAILING,
                gl_panel_1
                .createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addComponent(hprlnkTituloDoNegcio,
                GroupLayout.PREFERRED_SIZE, 17,
                GroupLayout.PREFERRED_SIZE)));
        panel_1.setLayout(gl_panel_1);

        JButton btnNewButton = new JButton("\n");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                root.setBody(new Anuncio_Main(root, anuncio), anuncio.getTitulo());
            }
        });

        List<Imagem> ci = (List<Imagem>) anuncio.getImagens().values();
        Icon i = ci.isEmpty() ? new ImageIcon(Produto_Base.class
                .getResource("/Imagens/Sem_Imagem.png")) : new Avatar(new ImageIcon(ci.get(0).getPath()).getImage());


        btnNewButton.setIcon(i);


        GroupLayout gl_panel = new GroupLayout(panel);
        gl_panel.setHorizontalGroup(gl_panel.createParallelGroup(
                Alignment.LEADING).addGroup(
                gl_panel.createSequentialGroup()
                .addComponent(btnNewButton)
                .addContainerGap(GroupLayout.DEFAULT_SIZE,
                Short.MAX_VALUE)));
        gl_panel.setVerticalGroup(gl_panel.createParallelGroup(
                Alignment.LEADING).addGroup(
                gl_panel.createSequentialGroup()
                .addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE,
                96, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(3, Short.MAX_VALUE)));
        panel.setLayout(gl_panel);
        setLayout(groupLayout);

    }
    
    
    private String temporestante(long diff) {

        long segundos = diff / 1000;
        long msres = diff % 1000;

        long minutos = segundos / 60;
        long sres = segundos % 60;

        long horas = minutos / 60;
        long mres = minutos % 60;

        long dia = horas / 24;
        long hres = horas % 24;

        String sdias = (((int) dia > 0) ? (int) dia + (((int) dia > 1) ? "1 dia" : (int) dia + "dias") : "");
        String shoras = (((int) hres > 0) ? (int) hres + (((int) hres > 1) ? "1 hora" : (int) hres + "horas") : "");
        String sminutos = (((int) mres > 0) ? (int) mres + (((int) mres > 1) ? "1 minuto" : (int) hres + "minutos") : "");
        String ssegundos = (((int) sres > 0) ? (int) sres + (((int) sres > 1) ? "1 segundo" : (int) hres + "segundo") : "");

        if ((sdias + shoras + sminutos + ssegundos + "").isEmpty()) {
            return "Terminado";
        } else {
            return sdias + ", " + shoras + " " + sminutos + " " + ssegundos;
        }




    }
    
}
