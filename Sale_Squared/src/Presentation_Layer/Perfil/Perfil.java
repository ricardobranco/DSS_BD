package Presentation_Layer.Perfil;

import Business_Layer.Anuncio;
import Business_Layer.AnuncioVenda;
import Business_Layer.ComparadorUltimosAnunc;
import Business_Layer.Imagem;
import Business_Layer.UtilizadorRegistado;
import Presentation_Layer.Componentes.Avatar;
import java.awt.CardLayout;
import java.awt.Font;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.LayoutStyle.ComponentPlacement;

import Presentation_Layer.Sale_Squared;
import Presentation_Layer.Pesquisa.Pesquisa_Resultado;
import com.sun.org.apache.xalan.internal.xsltc.compiler.Template;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.GregorianCalendar;
import java.util.Set;
import java.util.TreeSet;

public class Perfil extends JPanel {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private UtilizadorRegistado ur;
    private String username;
    private final Sale_Squared root;
    private final JButton btnSeguirUtilizador;

    /**
     * Create the panel.
     */
    public Perfil(final Sale_Squared root, String username) {

        this.username = username;
        this.ur = root.getSistema().encontrarUtilizadorReg(username);
        this.root = root;

        JLabel label = new JLabel("");

        Imagem img = this.ur.getImagem();

        label.setIcon(new Avatar(new ImageIcon(img.getPath()).getImage()));

        final JLabel lblNewLabel = new JLabel(this.username);
        lblNewLabel.setFont(new Font("Lucida Grande", Font.BOLD, 20));

        JLabel lblNewLabel_1 = new JLabel("");
        lblNewLabel_1.setVisible(false);

        if (this.root.getSistema().temUserRating(this.username)) {
            //VER REPUTAÇÃO
            double rating = this.root.getSistema().calcularRegistadoRating(this.username);
            if (rating >= 90) {
                lblNewLabel_1.setVisible(true);
            }
        }
        lblNewLabel_1.setIcon(new ImageIcon(Perfil.class
                .getResource("/Imagens/top_cliente.png")));

        JLabel lblRegistadoDesde = new JLabel("Registado desde " + showdata(this.ur.getDataRegisto()));

        JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);

        btnSeguirUtilizador = new JButton("Seguir Utilizador");
        btnSeguirUtilizador.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                seguirutilizador();
            }
        });

        btnSeguirUtilizador.setVisible(false);
        if (Sale_Squared.REGISTADO) {
            btnSeguirUtilizador.setVisible(true);
        }

        GroupLayout groupLayout = new GroupLayout(this);
        groupLayout
                .setHorizontalGroup(groupLayout
                .createParallelGroup(Alignment.LEADING)
                .addGroup(
                Alignment.TRAILING,
                groupLayout
                .createSequentialGroup()
                .addGap(14)
                .addGroup(
                groupLayout
                .createParallelGroup(
                Alignment.LEADING)
                .addGroup(
                groupLayout
                .createSequentialGroup()
                .addComponent(
                tabbedPane,
                GroupLayout.DEFAULT_SIZE,
                430,
                Short.MAX_VALUE)
                .addContainerGap())
                .addGroup(
                groupLayout
                .createSequentialGroup()
                .addComponent(
                label)
                .addPreferredGap(
                ComponentPlacement.RELATED)
                .addGroup(
                groupLayout
                .createParallelGroup(
                Alignment.LEADING)
                .addGroup(
                groupLayout
                .createSequentialGroup()
                .addComponent(
                lblNewLabel)
                .addPreferredGap(
                ComponentPlacement.RELATED)
                .addComponent(
                lblNewLabel_1))
                .addComponent(
                lblRegistadoDesde))
                .addGap(157))))
                .addGroup(
                Alignment.TRAILING,
                groupLayout.createSequentialGroup()
                .addContainerGap(327, Short.MAX_VALUE)
                .addComponent(btnSeguirUtilizador)
                .addContainerGap()));
        groupLayout
                .setVerticalGroup(groupLayout
                .createParallelGroup(Alignment.LEADING)
                .addGroup(
                groupLayout
                .createSequentialGroup()
                .addGap(15)
                .addGroup(
                groupLayout
                .createParallelGroup(
                Alignment.LEADING)
                .addComponent(
                lblNewLabel_1)
                .addGroup(
                groupLayout
                .createSequentialGroup()
                .addComponent(
                lblNewLabel)
                .addPreferredGap(
                ComponentPlacement.RELATED)
                .addComponent(
                lblRegistadoDesde))
                .addComponent(label))
                .addGap(18)
                .addComponent(tabbedPane,
                GroupLayout.DEFAULT_SIZE, 363,
                Short.MAX_VALUE)
                .addPreferredGap(
                ComponentPlacement.RELATED)
                .addComponent(btnSeguirUtilizador)
                .addGap(12)));

        JPanel panel = new JPanel();
        tabbedPane.addTab("Reputação", null, panel, null);
        panel.setLayout(new CardLayout(0, 0));
        panel.add(new Perfil_Reputacao(), "perfil_rep");

        JPanel panel_1 = new JPanel();
        tabbedPane.addTab("Negócios", null, panel_1, null);
        panel_1.setLayout(new CardLayout(0, 0));
        String[] user = {"user"};
        Object[] nome = {this.username};
        Set<Anuncio> panuncios = root.getSistema().procurarAnuncAvanc(user, nome);
        Set<AnuncioVenda> anuncios = new TreeSet<>(new ComparadorUltimosAnunc());
        for (Anuncio a : panuncios) {
            anuncios.add((AnuncioVenda) a);
        }

        panel_1.add(new Pesquisa_Resultado(root, anuncios), "Negócios");
        setLayout(groupLayout);

    }

    private String showdata(GregorianCalendar gc) {
        int dia, mes, ano, hora, minutos;

        dia = gc.get(GregorianCalendar.DAY_OF_MONTH);
        mes = gc.get(GregorianCalendar.MONTH) + 1;
        ano = gc.get(GregorianCalendar.YEAR);
        return dia + "/" + mes + "/" + ano;
    }

    public void seguirutilizador() {
        if (btnSeguirUtilizador.getText().equals("Seguir Utilizador")) {
            btnSeguirUtilizador.setText("Deixar Utilizador");
            this.root.getSistema().deixarSegUser(Sale_Squared.UTILIZADOR, this.username);
        }
        else{
            btnSeguirUtilizador.setText("Seguir Utilizador");
            this.root.getSistema().seguirUser(Sale_Squared.UTILIZADOR, this.ur);
        }
    }
}
