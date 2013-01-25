package Presentation_Layer.Inserir;

import java.awt.CardLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.GregorianCalendar;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.LayoutStyle.ComponentPlacement;

import Business_Layer.AnuncioVenda;
import Business_Layer.Categoria;
import Business_Layer.Imagem;
import Business_Layer.Leilao;
import Business_Layer.ModoVenda;
import Business_Layer.Tag;
import Business_Layer.VendaDirecta;
import Presentation_Layer.Anuncio.Anuncio_Main;
import Presentation_Layer.Sale_Squared;
import Presentation_Layer.Home.Categorias;
import java.util.ArrayList;
import java.util.Collection;
import javax.swing.JOptionPane;

public class Inserir extends JPanel {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    /**
     * Create the panel.
     */
    private boolean inserefinal;
    private int step = 1;
    private AnuncioVenda a;
    final JPanel panel;
    JPanel[] inserir = new JPanel[3];
    Collection<Imagem> imagens;
    Collection<Categoria> categorias;
    Collection<Tag> tags;
    Collection<String> pagamentos;
    private final Sale_Squared root;
    private final JButton btnSeguinte;
    private final JButton btnVoltar;
    private final int codigo;

    public Inserir(final Sale_Squared root) {


        this.inserefinal = false;
        this.imagens = new ArrayList<>();
        this.categorias = new ArrayList<>();
        this.tags = new ArrayList<>();
        this.pagamentos = new ArrayList<>();



        codigo = root.getSistema().registaIdAnuncio();
        a = new AnuncioVenda(codigo);
        inserir[0] = new Inserir_1(codigo);
        inserir[1] = new Inserir_2();
        this.root = root;
        JLabel lblNewLabel = new JLabel("Inserir Negócio");
        lblNewLabel.setFont(new Font("Lucida Grande", Font.BOLD, 20));

        panel = new JPanel();

        btnSeguinte = new JButton("Seguinte");
        btnVoltar = new JButton("Voltar");
        btnSeguinte.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                adiciona();
            }
        });

        btnVoltar.setVisible(false);

        btnVoltar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                btnVoltar.setEnabled(false);
                step--;
                setBody(inserir[0], step);
                btnSeguinte.setText("Seguinte");

            }
        });
        GroupLayout groupLayout = new GroupLayout(this);
        groupLayout
                .setHorizontalGroup(groupLayout
                .createParallelGroup(Alignment.TRAILING)
                .addGroup(
                groupLayout
                .createSequentialGroup()
                .addGroup(
                groupLayout
                .createParallelGroup(
                Alignment.TRAILING)
                .addGroup(
                Alignment.LEADING,
                groupLayout
                .createSequentialGroup()
                .addContainerGap()
                .addComponent(
                lblNewLabel))
                .addGroup(
                Alignment.LEADING,
                groupLayout
                .createSequentialGroup()
                .addGap(45)
                .addGroup(
                groupLayout
                .createParallelGroup(
                Alignment.LEADING)
                .addGroup(
                Alignment.TRAILING,
                groupLayout
                .createSequentialGroup()
                .addComponent(
                btnVoltar)
                .addPreferredGap(
                ComponentPlacement.RELATED,
                206,
                Short.MAX_VALUE)
                .addComponent(
                btnSeguinte))
                .addComponent(
                panel,
                GroupLayout.DEFAULT_SIZE,
                421,
                Short.MAX_VALUE))))
                .addGap(26)));
        groupLayout.setVerticalGroup(groupLayout.createParallelGroup(
                Alignment.LEADING)
                .addGroup(
                groupLayout
                .createSequentialGroup()
                .addContainerGap()
                .addComponent(lblNewLabel)
                .addPreferredGap(ComponentPlacement.RELATED)
                .addComponent(panel, GroupLayout.DEFAULT_SIZE,
                50, Short.MAX_VALUE)
                .addPreferredGap(ComponentPlacement.RELATED)
                .addGroup(
                groupLayout
                .createParallelGroup(
                Alignment.BASELINE)
                .addComponent(btnSeguinte)
                .addComponent(btnVoltar))
                .addGap(6)));
        panel.setLayout(new CardLayout(0, 0));
        panel.add(inserir[0], "Inserir 1");
        setLayout(groupLayout);

    }

    private void setBody(JPanel jp, int step) {
        panel.removeAll();
        panel.add(jp, "" + step);
        panel.updateUI();
        panel.validate();
    }

    private void adiciona() {
        try {


            switch (step) {
                case 1:
                    Inserir_1 i1 = (Inserir_1) inserir[0];
                    a.setTitulo(i1.getTitulo());
                    for (Categoria c : i1.getCategorias().values()) {
                        this.categorias.add(c);
                    }

                    for (Tag t : i1.getTags().values()) {
                        this.tags.add(t);
                    }


                    a.setDataInser(new GregorianCalendar());
                    a.setDescricao(i1.getDescricao());
                    a.setEstadoProduto(i1.getEstado());


                    for (Imagem img : i1.getImagens().values()) {
                        this.imagens.add(img);
                    }


                    int quantidade;
                    ModoVenda mv;
                    Inserir_preco ip = i1.precopanel();
                    int id = codigo;
                    if (ip.eLeilao()) {
                        double precoB = ip.getLicMin();
                        GregorianCalendar dataF = ip.validade();
                        double inc = ip.getInc();
                        double precoActual = precoB;
                        quantidade = 1;
                        mv = new Leilao(id, precoB, dataF, 0, precoActual,
                                inc);

                    } else {
                        double preco = ip.getPreco();
                        quantidade = ip.getQuantidade();
                        mv = new VendaDirecta(id, 0, preco);

                    }

                    a.setTipoVenda(mv);
                    a.setQuantidade(quantidade);
                    a.setnVisitas(0);
                    GregorianCalendar expira = ip.validade();
                    a.setDataExpir(expira);
                    a.setPossivelTrocar(ip.trocas());

                    btnVoltar.setVisible(true);
                    setBody(inserir[1], step);
                    btnSeguinte.setText("Concluir");

                    step++;
                    break;
                case 2:
                    Inserir_2 i2 = (Inserir_2) inserir[1];
                    Inserir_Envio envio = i2.getEnvio();
                    Inserir_Pagamento pagamento = i2.getPagamentos();

                    // Envio
                    if (envio.pagaComprador()) {
                        double portes = envio.getPortes();
                        double seguro = envio.getSeguro();
                        a.setPrecoEnvio(portes);
                        a.setSeguro(seguro);
                    } else {
                        a.setPrecoEnvio(0);
                        a.setSeguro(0);
                    }

                    a.setMetodoEnvio(envio.envio());
                    a.setEnvioEstrangeiro(envio.envioEstrangeiro());

                    // Pagamento

                    for (String s : pagamento.getModosPagamento()) {
                        this.pagamentos.add(s);
                    }



                    a.setEstadoAnuncio(AnuncioVenda.ABERTO);
                    a.setAnunciante(root
                            .getSistema()
                            .encontrarUtilizadorReg(Sale_Squared.UTILIZADOR));
                    root.getSistema().inserirAnuncio(a);

                    inserefinal = true;
                    break;

            }

        } catch (Exception e2) {
            System.out.println(e2.getMessage());
            String html1 = "<html><body style='width: ";
            String html2 = "px'>";
            JOptionPane.showMessageDialog(null, new JLabel(html1 + "300" + html2 + e2.getMessage()));
        }

        if (inserefinal) {

            try {
                for (Imagem img : this.imagens) {
                    a.inserirImagem(img);
                }

            } catch (Exception e) {
            }
            try {
                for (Categoria cat : this.categorias) {
                    a.inserirCategoria(cat);
                }

            } catch (Exception e) {
            }
            try {
                for (Tag tag : this.tags) {
                    a.inserirTag(tag);
                }

            } catch (Exception e) {
            }
            try {
                for (String pag : this.pagamentos) {
                    a.getModosPagamento().add(pag);
                }

            } catch (Exception e) {
            }






            String atitul = a.getTitulo();
            root.setBody(new Anuncio_Main(root, a.getCodigo()), atitul);

        }


    }
}
