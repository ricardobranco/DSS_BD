package Presentation_Layer.Inserir;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;

import Presentation_Layer.Componentes.Horas;

import com.toedter.calendar.JDateChooser;
import javax.swing.JCheckBox;

public class Inserir_preco extends JPanel {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private JTextField inipreco;
    private JTextField preco;
    private JComboBox<String> incpreco;
    private JDateChooser data;
    private Horas horas;
    private final ButtonGroup buttonGroup = new ButtonGroup();
    private JRadioButton leilao;
    private JRadioButton comprarja;
    private JTextField quantidade;
    private JCheckBox trocas;

    /**
     * Create the panel.
     */
    public Inserir_preco() {

        final JPanel panel_2 = new JPanel();
        final JPanel panel_3 = new JPanel();
        panel_3.setVisible(false);
        JLabel lblDurao = new JLabel("Validade");
        lblDurao.setFont(new Font("Lucida Grande", Font.BOLD, 13));

        JLabel lblData = new JLabel("Data");
        lblData.setFont(new Font("Lucida Grande", Font.BOLD, 13));

        data = new com.toedter.calendar.JDateChooser();
        data.setDate(new Date());

        GregorianCalendar gc = new GregorianCalendar();
        Calendar min = Calendar.getInstance();
        min.set(Calendar.YEAR, gc.get(GregorianCalendar.YEAR));
        min.set(Calendar.MONTH, gc.get(GregorianCalendar.MONTH));
        min.set(Calendar.DATE, gc.get(GregorianCalendar.DATE));

        data.setMinSelectableDate(min.getTime());
        horas = new Horas();

        leilao = new JRadioButton("Leilão");
        leilao.setSelected(true);
        leilao.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                panel_2.setVisible(true);
                panel_3.setVisible(false);

            }
        });
        buttonGroup.add(leilao);

        comprarja = new JRadioButton("Comprar já");
        comprarja.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                panel_2.setVisible(false);
                panel_3.setVisible(true);

            }
        });
        buttonGroup.add(comprarja);

        trocas = new JCheckBox("Aceitar Trocas");
        trocas.setFont(new Font("Lucida Grande", Font.BOLD, 13));

        GroupLayout groupLayout = new GroupLayout(this);
        groupLayout
                .setHorizontalGroup(groupLayout
                .createParallelGroup(Alignment.LEADING)
                .addGroup(
                groupLayout.createSequentialGroup()
                .addContainerGap().addComponent(leilao)
                .addContainerGap(256, Short.MAX_VALUE))
                .addGroup(
                groupLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(comprarja)
                .addContainerGap(224, Short.MAX_VALUE))
                .addGroup(
                groupLayout
                .createSequentialGroup()
                .addGap(29)
                .addGroup(
                groupLayout
                .createParallelGroup(
                Alignment.TRAILING)
                .addComponent(
                panel_3,
                Alignment.LEADING,
                GroupLayout.DEFAULT_SIZE,
                289,
                Short.MAX_VALUE)
                .addComponent(
                panel_2,
                Alignment.LEADING,
                GroupLayout.DEFAULT_SIZE,
                GroupLayout.DEFAULT_SIZE,
                Short.MAX_VALUE))
                .addGap(145))
                .addGroup(
                groupLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDurao)
                .addContainerGap(398, Short.MAX_VALUE))
                .addGroup(
                groupLayout.createSequentialGroup()
                .addContainerGap().addComponent(trocas)
                .addContainerGap(335, Short.MAX_VALUE))
                .addGroup(
                groupLayout
                .createSequentialGroup()
                .addGap(38)
                .addGroup(
                groupLayout
                .createParallelGroup(
                Alignment.TRAILING)
                .addComponent(
                horas,
                GroupLayout.PREFERRED_SIZE,
                206,
                GroupLayout.PREFERRED_SIZE)
                .addGroup(
                groupLayout
                .createSequentialGroup()
                .addComponent(
                lblData)
                .addPreferredGap(
                ComponentPlacement.RELATED)
                .addComponent(
                data,
                GroupLayout.PREFERRED_SIZE,
                169,
                GroupLayout.PREFERRED_SIZE)))
                .addGap(105)));
        groupLayout.setVerticalGroup(groupLayout.createParallelGroup(
                Alignment.LEADING).addGroup(
                groupLayout
                .createSequentialGroup()
                .addContainerGap()
                .addComponent(leilao)
                .addGap(6)
                .addComponent(panel_2, GroupLayout.PREFERRED_SIZE,
                GroupLayout.DEFAULT_SIZE,
                GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(ComponentPlacement.RELATED)
                .addComponent(comprarja)
                .addGap(1)
                .addComponent(panel_3, GroupLayout.PREFERRED_SIZE, 71,
                GroupLayout.PREFERRED_SIZE)
                .addGap(18)
                .addComponent(lblDurao)
                .addGap(4)
                .addGroup(
                groupLayout
                .createParallelGroup(Alignment.LEADING)
                .addComponent(lblData)
                .addComponent(data,
                GroupLayout.PREFERRED_SIZE,
                GroupLayout.DEFAULT_SIZE,
                GroupLayout.PREFERRED_SIZE))
                .addGap(12)
                .addComponent(horas, GroupLayout.PREFERRED_SIZE, 70,
                GroupLayout.PREFERRED_SIZE).addGap(18)
                .addComponent(trocas).addGap(12)));
        data.setDateFormatString("dd/MM/yyyy");

        JLabel lblPreo = new JLabel("Preço   €");
        lblPreo.setFont(new Font("Lucida Grande", Font.BOLD, 13));

        preco = new JTextField();
        preco.setColumns(10);

        JLabel lblQuantidade = new JLabel("Quantidade");
        lblQuantidade.setFont(new Font("Lucida Grande", Font.BOLD, 13));

        quantidade = new JTextField();
        quantidade.setColumns(10);
        GroupLayout gl_panel_3 = new GroupLayout(panel_3);
        gl_panel_3
                .setHorizontalGroup(gl_panel_3
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
                lblPreo)
                .addPreferredGap(
                ComponentPlacement.RELATED)
                .addComponent(
                preco,
                GroupLayout.PREFERRED_SIZE,
                GroupLayout.DEFAULT_SIZE,
                GroupLayout.PREFERRED_SIZE))
                .addGroup(
                gl_panel_3
                .createSequentialGroup()
                .addComponent(
                lblQuantidade)
                .addPreferredGap(
                ComponentPlacement.RELATED)
                .addComponent(
                quantidade,
                GroupLayout.PREFERRED_SIZE,
                49,
                GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(85, Short.MAX_VALUE)));
        gl_panel_3
                .setVerticalGroup(gl_panel_3
                .createParallelGroup(Alignment.TRAILING)
                .addGroup(
                Alignment.LEADING,
                gl_panel_3
                .createSequentialGroup()
                .addContainerGap()
                .addGroup(
                gl_panel_3
                .createParallelGroup(
                Alignment.LEADING)
                .addComponent(
                preco,
                GroupLayout.PREFERRED_SIZE,
                GroupLayout.DEFAULT_SIZE,
                GroupLayout.PREFERRED_SIZE)
                .addComponent(lblPreo))
                .addPreferredGap(
                ComponentPlacement.RELATED)
                .addGroup(
                gl_panel_3
                .createParallelGroup(
                Alignment.BASELINE)
                .addComponent(
                quantidade,
                GroupLayout.PREFERRED_SIZE,
                GroupLayout.DEFAULT_SIZE,
                GroupLayout.PREFERRED_SIZE)
                .addComponent(
                lblQuantidade))
                .addContainerGap(9, Short.MAX_VALUE)));
        panel_3.setLayout(gl_panel_3);

        JLabel label = new JLabel("Pre\u00E7o inicial   \u20AC");
        label.setFont(new Font("Lucida Grande", Font.BOLD, 13));

        inipreco = new JTextField();
        inipreco.setColumns(10);

        JLabel lblIncrementoMnimo = new JLabel(
                "Incremento m\u00EDnimo    \u20AC");
        lblIncrementoMnimo.setFont(new Font("Lucida Grande", Font.BOLD, 13));

        incpreco = new JComboBox<String>();
        incpreco.setModel(new DefaultComboBoxModel<String>(new String[]{
                    "0.01", "0.05", "0.10", "0.50", "1.00", "5.00", "10.00",
                    "50.00", "100.00", "500.00", "1000.00", "5000.00", "10000.00"}));
        GroupLayout gl_panel_2 = new GroupLayout(panel_2);
        gl_panel_2
                .setHorizontalGroup(gl_panel_2
                .createParallelGroup(Alignment.LEADING)
                .addGroup(
                gl_panel_2
                .createSequentialGroup()
                .addContainerGap()
                .addGroup(
                gl_panel_2
                .createParallelGroup(
                Alignment.LEADING)
                .addGroup(
                gl_panel_2
                .createSequentialGroup()
                .addComponent(
                label,
                GroupLayout.PREFERRED_SIZE,
                102,
                GroupLayout.PREFERRED_SIZE)
                .addGap(6)
                .addComponent(
                inipreco,
                GroupLayout.PREFERRED_SIZE,
                GroupLayout.DEFAULT_SIZE,
                GroupLayout.PREFERRED_SIZE))
                .addGroup(
                gl_panel_2
                .createSequentialGroup()
                .addComponent(
                lblIncrementoMnimo)
                .addGap(6)
                .addComponent(
                incpreco,
                GroupLayout.PREFERRED_SIZE,
                120,
                GroupLayout.PREFERRED_SIZE)
                .addGap(0,
                0,
                Short.MAX_VALUE)))
                .addContainerGap()));
        gl_panel_2
                .setVerticalGroup(gl_panel_2
                .createParallelGroup(Alignment.LEADING)
                .addGroup(
                gl_panel_2
                .createSequentialGroup()
                .addContainerGap()
                .addGroup(
                gl_panel_2
                .createParallelGroup(
                Alignment.LEADING)
                .addGroup(
                gl_panel_2
                .createSequentialGroup()
                .addGap(6)
                .addComponent(
                label))
                .addComponent(
                inipreco,
                GroupLayout.PREFERRED_SIZE,
                GroupLayout.DEFAULT_SIZE,
                GroupLayout.PREFERRED_SIZE))
                .addGap(10)
                .addGroup(
                gl_panel_2
                .createParallelGroup(
                Alignment.BASELINE)
                .addComponent(
                lblIncrementoMnimo)
                .addComponent(
                incpreco,
                GroupLayout.PREFERRED_SIZE,
                GroupLayout.DEFAULT_SIZE,
                GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE)));
        panel_2.setLayout(gl_panel_2);
        setLayout(groupLayout);

    }

    public boolean eLeilao() {
        return leilao.isSelected();
    }

    public GregorianCalendar validade() throws Exception {
        GregorianCalendar hoje = new GregorianCalendar();
        int dia, mes, ano, hora, minutos;
        Calendar c = data.getCalendar();
        dia = c.get(Calendar.DAY_OF_MONTH);
        mes = c.get(Calendar.MONTH);
        ano = c.get(Calendar.YEAR);
        hora = horas.getHora();
        minutos = horas.getMinutos();

        GregorianCalendar res = new GregorianCalendar(ano, mes, dia, hora,
                minutos);

        if (res.before(hoje)) {
            throw new Exception("Insira uma data válida");
        }

        long lhoje = hoje.getTimeInMillis();
        long lres = res.getTimeInMillis();
        long diff = lres - lhoje;
        long diffDays = diff / (24 * 60 * 60 * 1000);

        if (diffDays < 7) {
            throw new Exception("O anúncio tem que estar no min. 7 dias online");
        }
        return res;
    }

    public double getLicMin() throws Exception {
        String slicmin = inipreco.getText();
        if (slicmin.isEmpty()) {
            throw new Exception("Insira um preço inicial");
        }
        double res;
        try {
            res = new Double(slicmin).doubleValue();
        } catch (Exception e) {
            throw new Exception("Insira um preço inicial válido");
        }
        if (res <= 0) {
            throw new Exception("Insira um preço inical positivo");
        }
        return res;
    }

    public double getPreco() throws Exception {
        String spreco = preco.getText();
        if (spreco.isEmpty()) {
            throw new Exception("Insira um preço");
        }
        double res;
        try {
            res = new Double(spreco).doubleValue();
        } catch (Exception e) {
            throw new Exception("Insira um preço");
        }
        if (res <= 0) {
            throw new Exception("Insira um preço");
        }
        return res;
    }

    public double getInc() {
        String sinc = (String) incpreco.getModel().getElementAt(
                incpreco.getSelectedIndex());
        return new Double(sinc).doubleValue();
    }

    public int getQuantidade() throws Exception {
        String squantidade = quantidade.getText();
        if (squantidade.isEmpty()) {
            throw new Exception("Insira uma quantidade");
        }
        int res;
        try {
            res = new Integer(squantidade).intValue();
        } catch (Exception e) {
            throw new Exception("Insira uma quantidade válida");
        }
        if (res < 1) {
            throw new Exception("Insira uma quantidade positiva");
        }
        return res;
    }

    public boolean trocas() {
        return trocas.isSelected();
    }
}
