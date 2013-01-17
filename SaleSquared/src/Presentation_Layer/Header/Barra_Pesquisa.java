package Presentation_Layer.Header;

import Business_Layer.Anuncio;
import Business_Layer.AnuncioVenda;
import Business_Layer.ComparadorUltimosAnunc;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.LayoutStyle.ComponentPlacement;

import org.jdesktop.swingx.JXSearchField;

import Presentation_Layer.Sale_Squared;
import Presentation_Layer.Pesquisa.Pesquisa_Resultado;
import java.util.Set;
import java.util.TreeSet;

public class Barra_Pesquisa extends JPanel {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    /**
     * Create the panel.
     */
    private JXSearchField searchField;
    private final JComboBox<Object> comboBox;
    private final Sale_Squared root;

    public Barra_Pesquisa(final Sale_Squared root) {
        this.root = root;
        comboBox = new JComboBox<Object>();
        comboBox.setModel(new DefaultComboBoxModel<Object>(new String[]{"Todos",
                    "    Moda", "        Vestuário",
                    "        Acessórios", "    Casa e Jardim",
                    "        Animais", "        Artigos de Jardim",
                    "        Imóveis", "        Móveis",
                    "    Tecnologia e Electrónica",
                    "        Áudio,Tv e Vídeo", "        Consolas",
                    "        Fotografia", "        Informática",
                    "        Telemóveis e Telefones",
                    "    Coleccionáveis e Arte", "        Selos",
                    "        Moeda e Notas", "        Medalhas",
                    "        Antiguidades", "        Arte", "    Saúde",
                    "        Cosméticos", "    Desporto e Entretenimento",
                    "        Brinquedos", "        Artigos de Desporto",
                    "        Filmes e Cinema", "        Livros e Revistas",
                    "        Música", "    Auto    ", "        Veículos",
                    "        Peças auto", "    Outros"}));

        JPanel panel = new JPanel();

        searchField = new JXSearchField();
        searchField.setToolTipText("Procurar");
        GroupLayout groupLayout = new GroupLayout(this);
        groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(
                Alignment.TRAILING).addGroup(
                groupLayout
                .createSequentialGroup()
                .addContainerGap()
                .addComponent(searchField, GroupLayout.DEFAULT_SIZE,
                107, Short.MAX_VALUE)
                .addPreferredGap(ComponentPlacement.RELATED)
                .addComponent(comboBox, 0, 148, Short.MAX_VALUE)
                .addPreferredGap(ComponentPlacement.RELATED)
                .addComponent(panel, GroupLayout.PREFERRED_SIZE,
                GroupLayout.DEFAULT_SIZE,
                GroupLayout.PREFERRED_SIZE).addContainerGap()));
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
                Alignment.LEADING)
                .addComponent(
                panel,
                GroupLayout.PREFERRED_SIZE,
                288,
                Short.MAX_VALUE)
                .addGroup(
                groupLayout
                .createParallelGroup(
                Alignment.BASELINE)
                .addComponent(
                comboBox,
                GroupLayout.PREFERRED_SIZE,
                GroupLayout.DEFAULT_SIZE,
                GroupLayout.PREFERRED_SIZE)
                .addComponent(
                searchField,
                GroupLayout.PREFERRED_SIZE,
                GroupLayout.DEFAULT_SIZE,
                GroupLayout.PREFERRED_SIZE)))
                .addContainerGap()));

        JButton btnPesquisa = new JButton("Pesquisa");
        btnPesquisa.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                pesquisar();
            }
        });

        JButton btnPesquisaAvanada = new JButton("Pesquisa Avançada");
        GroupLayout gl_panel = new GroupLayout(panel);
        gl_panel.setHorizontalGroup(gl_panel
                .createParallelGroup(Alignment.LEADING)
                .addGroup(
                Alignment.TRAILING,
                gl_panel.createSequentialGroup()
                .addComponent(btnPesquisa,
                GroupLayout.DEFAULT_SIZE, 169,
                Short.MAX_VALUE).addGap(2))
                .addComponent(btnPesquisaAvanada, GroupLayout.DEFAULT_SIZE,
                171, Short.MAX_VALUE));
        gl_panel.setVerticalGroup(gl_panel.createParallelGroup(
                Alignment.LEADING).addGroup(
                gl_panel.createSequentialGroup()
                .addComponent(btnPesquisa)
                .addPreferredGap(ComponentPlacement.RELATED)
                .addComponent(btnPesquisaAvanada)
                .addContainerGap(GroupLayout.DEFAULT_SIZE,
                Short.MAX_VALUE)));
        panel.setLayout(gl_panel);
        setLayout(groupLayout);

    }

    public void pesquisar() {

        String[] campos = {"tit", "desc","t", "c"};

        String categoria = (String) comboBox.getModel().getElementAt(comboBox.getSelectedIndex());
        String critpesq = searchField.getText();

        Object[] valores = {critpesq, critpesq, critpesq, categoria
        };

        Set<Anuncio> panuncios = root.getSistema().procurarAnuncAvanc(campos, valores);
        Set<AnuncioVenda> anuncios = new TreeSet<>(new ComparadorUltimosAnunc());
        for (Anuncio a : panuncios) {
            anuncios.add((AnuncioVenda) a);
        }


        root.setBody(new Pesquisa_Resultado(root, anuncios), "Resultados");
    }
}
