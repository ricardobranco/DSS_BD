package Presentation_Layer.Pesquisa;

import Business_Layer.Anuncio;
import Business_Layer.AnuncioVenda;
import Business_Layer.ComparadorAnuncPreco;
import Business_Layer.ComparadorUltimosAnunc;
import Business_Layer.SaleSquared;
import Presentation_Layer.Sale_Squared;
import java.awt.Font;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import javax.swing.JOptionPane;

public class Pesquisa_Ferramentas extends JPanel {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private JTextField min;
    private JTextField max;
    private TreeSet<AnuncioVenda> anuncios;
    private JCheckBox portesgratis;
    private JCheckBox portespagos;
    private JCheckBox tb;
    private JCheckBox pp;
    private JCheckBox dinheiro;
    private JCheckBox envicob;
    private JCheckBox cheque;
    private JCheckBox normal;
    private JCheckBox reg;
    private JCheckBox transp;
    private JCheckBox entmao;
    private JCheckBox seguro;
    private JCheckBox azul;
    private JCheckBox verde;
    private JCheckBox novo;
    private JCheckBox usado;
    private List<JCheckBox> pagamentos;
    private List<JCheckBox> envios;

    /**
     * Create the panel.
     */
    public Pesquisa_Ferramentas(final Sale_Squared root, Pesquisa_Resultado pr) {


        anuncios = new TreeSet<>(new ComparadorAnuncPreco(ComparadorAnuncPreco.CRESCENTE));
        anuncios.addAll(pr.getAnuncios());
        this.pagamentos = new ArrayList<>();
        this.envios = new ArrayList<>();



        JLabel lblNewLabel = new JLabel("Refinar Pesquisa");
        lblNewLabel.setFont(new Font("Lucida Grande", Font.BOLD, 15));

        JLabel lblNewLabel_1 = new JLabel("€");

        min = new JTextField();
        min.setText(anuncios.isEmpty() ? "" : "" + anuncios.first().getPreco());
        min.setColumns(10);

        JLabel lblNewLabel_2 = new JLabel("até €");

        max = new JTextField();
        max.setText(anuncios.isEmpty() ? "" : "" + anuncios.last().getPreco());
        max.setColumns(10);

        JButton btnNewButton = new JButton("Filtrar");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                SaleSquared sistema = root.getSistema();
                Set<AnuncioVenda> res = new TreeSet<>(new ComparadorUltimosAnunc());

                try {
                    String[] crit = {"pMenorI", "pMaiorI"};
                    Object[] values = {getMin(), getMax()};
                    Set<Anuncio> res1 = sistema.procurarAnuncAvanc(crit, values,0);
                    //Portes Gratis
                    for (Anuncio a : res1) {
                        AnuncioVenda av = (AnuncioVenda) a;

                        //Portes gratis
                        if (portesgratis.isSelected()) {
                            if (av.getPrecoEnvio() == 0) {
                                res.add(av);
                            }

                        }

                        //Portes Pagos
                        if (portespagos.isSelected()) {
                            if (av.getPrecoEnvio() != 0) {
                                res.add(av);
                            }

                        }

                        for (JCheckBox j : pagamentos) {
                            if (j.isSelected()) {
                                if (av.getModosPagamento().contains(j.getText())) {
                                    res.add(av);
                                }
                            }
                        }

                        for (JCheckBox j : envios) {
                            if (j.isSelected()) {
                                if (av.getMetodoEnvio().contains(j.getText())) {
                                    res.add(av);
                                }
                            }
                        }

                        if (novo.isSelected()) {
                            if (av.isEstadoProduto() == AnuncioVenda.NOVO) {
                                res.add(av);
                            }
                        }

                        if (usado.isSelected()) {
                            if (av.isEstadoProduto() == AnuncioVenda.USADO) {
                                res.add(av);
                            }
                        }
                    }


                } catch (Exception e2) {

                    String html1 = "<html><body style='width: ";
                    String html2 = "px'>";
                    JOptionPane.showMessageDialog(null, new JLabel(html1 + "300" + html2 + e2.getMessage()));
                }

            }
        });

        JSeparator separator = new JSeparator();

        JLabel lblNewLabel_3 = new JLabel("Preferências");
        lblNewLabel_3.setFont(new Font("Lucida Grande", Font.BOLD, 15));

        JPanel panel = new JPanel();
        GroupLayout groupLayout = new GroupLayout(this);
        groupLayout.setHorizontalGroup(
                groupLayout.createParallelGroup(Alignment.LEADING)
                .addGroup(groupLayout.createSequentialGroup()
                .addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
                .addGroup(groupLayout.createSequentialGroup()
                .addGap(33)
                .addComponent(lblNewLabel_1)
                .addPreferredGap(ComponentPlacement.RELATED)
                .addComponent(min, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(ComponentPlacement.RELATED)
                .addComponent(lblNewLabel_2)
                .addPreferredGap(ComponentPlacement.RELATED)
                .addComponent(max, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE))
                .addGroup(groupLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(separator, GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE))
                .addGroup(groupLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblNewLabel))
                .addGroup(groupLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblNewLabel_3))
                .addGroup(groupLayout.createSequentialGroup()
                .addGap(76)
                .addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
                .addComponent(panel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addComponent(btnNewButton))))
                .addContainerGap()));
        groupLayout.setVerticalGroup(
                groupLayout.createParallelGroup(Alignment.LEADING)
                .addGroup(groupLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblNewLabel)
                .addPreferredGap(ComponentPlacement.RELATED)
                .addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
                .addComponent(lblNewLabel_1)
                .addComponent(min, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addComponent(lblNewLabel_2)
                .addComponent(max, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addGap(18)
                .addComponent(separator, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(ComponentPlacement.RELATED)
                .addComponent(lblNewLabel_3)
                .addPreferredGap(ComponentPlacement.UNRELATED)
                .addComponent(panel, GroupLayout.PREFERRED_SIZE, 558, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(ComponentPlacement.RELATED)
                .addComponent(btnNewButton)
                .addContainerGap(53, Short.MAX_VALUE)));

        JLabel lblNewLabel_4 = new JLabel("Portes de Envio");
        lblNewLabel_4.setFont(new Font("Lucida Grande", Font.BOLD, 13));

        portesgratis = new JCheckBox("Portes Grátis");
        portesgratis.setSelected(true);

        portespagos = new JCheckBox("Portes Pagos");
        portespagos.setSelected(true);

        JLabel lblNewLabel_5 = new JLabel("Modos de Pagamento");
        lblNewLabel_5.setFont(new Font("Lucida Grande", Font.BOLD, 13));

        tb = new JCheckBox(
                "Transferêcia Bancária");
        tb.setSelected(true);
        pagamentos.add(tb);

        pp = new JCheckBox("PayPal");
        pp.setSelected(true);
        pagamentos.add(pp);

        dinheiro = new JCheckBox("Dinheiro");
        dinheiro.setSelected(true);
        pagamentos.add(dinheiro);

        envicob = new JCheckBox(
                "Envia à Cobrança");
        envicob.setSelected(true);

        pagamentos.add(envicob);

        cheque = new JCheckBox("Cheque");
        cheque.setSelected(true);
        pagamentos.add(cheque);

        JLabel lblNewLabel_6 = new JLabel("Modo de Envio");
        lblNewLabel_6.setFont(new Font("Lucida Grande", Font.BOLD, 13));

        normal = new JCheckBox("Normal");
        normal.setSelected(true);
        envios.add(normal);



        reg = new JCheckBox("Registado");
        reg.setSelected(true);
        envios.add(reg);

        transp = new JCheckBox("Transportadora");
        transp.setSelected(true);
        envios.add(transp);

        entmao = new JCheckBox("Entrega em mão");
        entmao.setSelected(true);
        envios.add(entmao);

        seguro = new JCheckBox("Registado com Seguro");
        seguro.setSelected(true);
        envios.add(seguro);


        JLabel lblNewLabel_7 = new JLabel("Estado");
        lblNewLabel_7.setFont(new Font("Lucida Grande", Font.BOLD, 13));

        novo = new JCheckBox("Novo");
        novo.setSelected(true);

        usado = new JCheckBox("Usado");
        usado.setSelected(true);

        azul = new JCheckBox("Correio Azul");
        azul.setSelected(true);

        verde = new JCheckBox("Correio Verde");
        verde.setSelected(true);
        GroupLayout gl_panel = new GroupLayout(panel);
        gl_panel.setHorizontalGroup(
                gl_panel.createParallelGroup(Alignment.LEADING)
                .addGroup(gl_panel.createSequentialGroup()
                .addContainerGap()
                .addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
                .addComponent(lblNewLabel_4)
                .addComponent(lblNewLabel_5)
                .addComponent(portesgratis)
                .addComponent(portespagos)
                .addComponent(tb)
                .addComponent(pp)
                .addComponent(dinheiro)
                .addComponent(envicob)
                .addComponent(cheque)
                .addComponent(lblNewLabel_6)
                .addComponent(normal)
                .addComponent(reg)
                .addComponent(transp)
                .addComponent(entmao)
                .addComponent(seguro)
                .addComponent(lblNewLabel_7)
                .addComponent(novo)
                .addComponent(usado)
                .addComponent(azul)
                .addComponent(verde))
                .addContainerGap(17, Short.MAX_VALUE)));
        gl_panel.setVerticalGroup(
                gl_panel.createParallelGroup(Alignment.LEADING)
                .addGroup(gl_panel.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblNewLabel_4)
                .addPreferredGap(ComponentPlacement.RELATED)
                .addComponent(portesgratis)
                .addPreferredGap(ComponentPlacement.RELATED)
                .addComponent(portespagos)
                .addPreferredGap(ComponentPlacement.RELATED)
                .addComponent(lblNewLabel_5)
                .addPreferredGap(ComponentPlacement.RELATED)
                .addComponent(tb)
                .addPreferredGap(ComponentPlacement.RELATED)
                .addComponent(pp)
                .addPreferredGap(ComponentPlacement.RELATED)
                .addComponent(dinheiro)
                .addPreferredGap(ComponentPlacement.RELATED)
                .addComponent(envicob)
                .addPreferredGap(ComponentPlacement.RELATED)
                .addComponent(cheque)
                .addPreferredGap(ComponentPlacement.RELATED)
                .addComponent(lblNewLabel_6)
                .addPreferredGap(ComponentPlacement.RELATED)
                .addComponent(normal)
                .addPreferredGap(ComponentPlacement.RELATED)
                .addComponent(reg)
                .addPreferredGap(ComponentPlacement.RELATED)
                .addComponent(transp)
                .addPreferredGap(ComponentPlacement.RELATED)
                .addComponent(entmao)
                .addPreferredGap(ComponentPlacement.RELATED)
                .addComponent(seguro)
                .addPreferredGap(ComponentPlacement.RELATED)
                .addComponent(azul)
                .addPreferredGap(ComponentPlacement.RELATED)
                .addComponent(verde)
                .addPreferredGap(ComponentPlacement.RELATED)
                .addComponent(lblNewLabel_7)
                .addPreferredGap(ComponentPlacement.RELATED)
                .addComponent(novo)
                .addPreferredGap(ComponentPlacement.RELATED)
                .addComponent(usado)
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
        panel.setLayout(gl_panel);
        setLayout(groupLayout);

    }

    public double getMin() throws Exception {
        double dmin;
        try {
            dmin = new Double(min.getText());
        } catch (Exception e) {
            throw new Exception("Insira um minimo válido");
        }
        if (dmin < anuncios.first().getPreco()) {
            min.setText(anuncios.isEmpty() ? "" : "" + anuncios.first().getPreco());
            dmin = anuncios.first().getPreco();
        }
        return dmin;
    }

    public double getMax() throws Exception {
        double dmax;
        try {
            dmax = new Double(min.getText());
        } catch (Exception e) {
            throw new Exception("Insira um maximo válido");
        }
        if (dmax < anuncios.first().getPreco()) {
            max.setText(anuncios.isEmpty() ? "" : "" + anuncios.last().getPreco());
            dmax = anuncios.last().getPreco();
        }
        return dmax;
    }
}
