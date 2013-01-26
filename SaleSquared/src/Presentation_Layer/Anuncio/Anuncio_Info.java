package Presentation_Layer.Anuncio;

import Business_Layer.Anuncio;
import Business_Layer.AnuncioVenda;
import Business_Layer.ModoVenda;
import Presentation_Layer.Sale_Squared;
import java.awt.CardLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.GregorianCalendar;
import java.util.Map;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.LayoutStyle.ComponentPlacement;

public class Anuncio_Info extends JPanel {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    /**
     * Create the panel.
     */
    private AnuncioVenda anuncio;
    private int idanuncio;
    private final JButton btnNewButton_2;
    private Sale_Squared root;
    private String username;

    public Anuncio_Info(final Sale_Squared root, int idanuncio) {

        this.root = root;
        this.idanuncio = idanuncio;
        this.anuncio = (AnuncioVenda) root.getSistema().encontrarAnuncio(this.idanuncio); 
        this.username = this.anuncio.getAnunciante().getUsername();

        JLabel lblNewLabel = new JLabel("Início:");
        lblNewLabel.setFont(new Font("Lucida Grande", Font.BOLD, 13));

        JLabel lblNewLabel_1 = new JLabel(showdata(anuncio.getDataInser()));

        JLabel lblNewLabel_2 = new JLabel("Fim:");
        lblNewLabel_2.setFont(new Font("Lucida Grande", Font.BOLD, 13));

        JLabel lblNewLabel_3 = new JLabel(temporestante(new GregorianCalendar(), anuncio.getDataExpir()) + " (" + showdata(anuncio.getDataExpir()) + ")");


        JLabel lblNewLabel_4 = new JLabel("Quantidade:");
        lblNewLabel_4.setFont(new Font("Lucida Grande", Font.BOLD, 13));

        JLabel lblNewLabel_5 = new JLabel("" + anuncio.getQuantidade());

        JSeparator separator = new JSeparator();

        JLabel lblLocalizo = new JLabel("Localizão:");
        lblLocalizo.setFont(new Font("Lucida Grande", Font.BOLD, 13));


        String codPostal = this.root.getSistema().encontrarUtilizadorReg(username).getCodPostal();
        String localidade = this.root.getSistema().encontrarUtilizadorReg(username).getLocalidade();
        JLabel lblNewLabel_13 = new JLabel(codPostal+", "+localidade);

        JLabel lblNewLabel_14 = new JLabel(
                "(Envio para o estrangeiro: " + (anuncio.isEnvioEstrangeiro() ? "Sim" : "Não"));
        lblNewLabel_14.setFont(new Font("Lucida Grande", Font.PLAIN, 11));

        
        
        btnNewButton_2 = new JButton("Seguir Negócio");
        btnNewButton_2.setVisible(Sale_Squared.REGISTADO);
        if(Sale_Squared.REGISTADO){
            Map<Integer,Anuncio> anunciosseguidos = root.getSistema().encontrarUtilizadorReg(Sale_Squared.UTILIZADOR).getAnuncSeguidos();
            if(anunciosseguidos.containsKey(new Integer(this.idanuncio)))
                btnNewButton_2.setText("Deixar Negócio");
        }
        
        btnNewButton_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                removerSeguir();
            }
        });

        JButton btnNewButton_3 = new JButton("Reportar");

        JLabel lblNewLabel_15 = new JLabel("Utilizador:");
        lblNewLabel_15.setFont(new Font("Lucida Grande", Font.BOLD, 13));

        JLabel lblNewLabel_16 = new JLabel(username);

        JButton btnNewButton_4 = new JButton("Ver Perfil");


        JPanel panel = new JPanel();
        GroupLayout groupLayout = new GroupLayout(this);
        groupLayout.setHorizontalGroup(
                groupLayout.createParallelGroup(Alignment.LEADING)
                .addGroup(groupLayout.createSequentialGroup()
                .addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
                .addGroup(groupLayout.createSequentialGroup()
                .addGap(44)
                .addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
                .addGroup(groupLayout.createSequentialGroup()
                .addComponent(lblNewLabel_15)
                .addGap(18)
                .addComponent(lblNewLabel_16)
                .addPreferredGap(ComponentPlacement.RELATED)
                .addComponent(btnNewButton_4))
                .addGroup(groupLayout.createSequentialGroup()
                .addComponent(lblLocalizo)
                .addGap(18)
                .addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
                .addComponent(lblNewLabel_13)
                .addGroup(groupLayout.createSequentialGroup()
                .addGap(6)
                .addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
                .addComponent(lblNewLabel_14, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnNewButton_3, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnNewButton_2, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))))
                .addGroup(groupLayout.createSequentialGroup()
                .addGap(43)
                .addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
                .addComponent(panel, GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE)
                .addGroup(groupLayout.createSequentialGroup()
                .addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
                .addComponent(lblNewLabel)
                .addComponent(lblNewLabel_4)
                .addComponent(lblNewLabel_2))
                .addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
                .addGroup(groupLayout.createSequentialGroup()
                .addGap(9)
                .addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
                .addComponent(lblNewLabel_3)
                .addComponent(lblNewLabel_1)))
                .addGroup(groupLayout.createSequentialGroup()
                .addPreferredGap(ComponentPlacement.UNRELATED)
                .addComponent(lblNewLabel_5)))
                .addGap(64))))
                .addGroup(groupLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(separator, GroupLayout.DEFAULT_SIZE, 413, Short.MAX_VALUE)))
                .addContainerGap()));
        groupLayout.setVerticalGroup(
                groupLayout.createParallelGroup(Alignment.LEADING)
                .addGroup(groupLayout.createSequentialGroup()
                .addGap(28)
                .addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
                .addComponent(lblNewLabel)
                .addComponent(lblNewLabel_1))
                .addPreferredGap(ComponentPlacement.RELATED)
                .addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
                .addComponent(lblNewLabel_2)
                .addComponent(lblNewLabel_3))
                .addPreferredGap(ComponentPlacement.RELATED)
                .addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
                .addComponent(lblNewLabel_4)
                .addComponent(lblNewLabel_5))
                .addPreferredGap(ComponentPlacement.RELATED)
                .addComponent(panel, GroupLayout.PREFERRED_SIZE, 114, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(ComponentPlacement.UNRELATED)
                .addComponent(separator, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(20)
                .addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
                .addComponent(lblNewLabel_15)
                .addComponent(lblNewLabel_16)
                .addComponent(btnNewButton_4))
                .addPreferredGap(ComponentPlacement.UNRELATED)
                .addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
                .addComponent(lblLocalizo)
                .addComponent(lblNewLabel_13))
                .addPreferredGap(ComponentPlacement.RELATED)
                .addComponent(lblNewLabel_14)
                .addGap(62)
                .addComponent(btnNewButton_2)
                .addPreferredGap(ComponentPlacement.RELATED)
                .addComponent(btnNewButton_3)
                .addContainerGap(30, Short.MAX_VALUE)));
        panel.setLayout(new CardLayout(0, 0));
        ModoVenda mv = anuncio.getTipoVenda();
        if (mv.getClass().getSimpleName().equals("Leilao")) {
            panel.add(new Anuncio_Leilao(root, this.anuncio));
        } else {
            panel.add(new Anuncio_Compra(root, idanuncio));
        }

        setLayout(groupLayout);

    }

    private String showdata(GregorianCalendar gc) {
        int dia, mes, ano, hora, minutos;

        dia = gc.get(GregorianCalendar.DAY_OF_MONTH);
        mes = gc.get(GregorianCalendar.MONTH)+1;
        ano = gc.get(GregorianCalendar.YEAR);
        hora = gc.get(GregorianCalendar.HOUR_OF_DAY);
        minutos = gc.get(GregorianCalendar.MINUTE);
        return dia + "/" + mes + "/" + ano + " - " + hora + ":" + minutos;
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

    public void removerSeguir() {


        if (btnNewButton_2.getText().equals("Seguir Negócio")) {
            btnNewButton_2.setText("Deixar Negócio");
            root.getSistema().seguirAnuncio(Sale_Squared.UTILIZADOR, root.getSistema().encontrarAnuncio(this.idanuncio));
        } else {
            btnNewButton_2.setText("Seguir Negócio");
            root.getSistema().deixarSegAnuncio(Sale_Squared.UTILIZADOR, this.idanuncio);
        }






    }
}
