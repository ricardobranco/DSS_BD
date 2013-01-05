package Presentation_Layer.Inserir;

import java.awt.CardLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;

import Presentation_Layer.Componentes.Horas;
import com.toedter.calendar.JDateChooser;

public class Inserir_preco extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField inipreco;
	private JTextField preco;
	private JCheckBox leilao;
	private JComboBox incpreco;
	private JCheckBox comprarja;
	private JDateChooser data;
	private Horas horas;

	/**
	 * Create the panel.
	 */
	public Inserir_preco() {

		final JPanel panel_2 = new JPanel();
		final JPanel panel_3 = new JPanel();
		leilao = new JCheckBox("Leilão");
		leilao.setSelected(true);
		leilao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				panel_2.setVisible(leilao.isSelected());

			}
		});
		leilao.setFont(new Font("Lucida Grande", Font.BOLD, 13));

		comprarja = new JCheckBox("Comprar Já");
		comprarja.setSelected(true);
		comprarja.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_3.setVisible(comprarja.isSelected());
			}
		});
		comprarja.setFont(new Font("Lucida Grande", Font.BOLD, 13));

		JLabel lblDurao = new JLabel("Validade");
		lblDurao.setFont(new Font("Lucida Grande", Font.BOLD, 13));

		JLabel lblData = new JLabel("Data");
		lblData.setFont(new Font("Lucida Grande", Font.BOLD, 13));

		JPanel panel_1 = new JPanel();

		data = new com.toedter.calendar.JDateChooser();
		data.setDate(new Date());
		GregorianCalendar gc = new GregorianCalendar();
		Calendar min = Calendar.getInstance();
		min.set(Calendar.YEAR, gc.get(GregorianCalendar.YEAR));
		min.set(Calendar.MONTH, gc.get(GregorianCalendar.MONTH));
		min.set(Calendar.DATE, gc.get(GregorianCalendar.DATE));

		data.setMinSelectableDate(min.getTime());
		horas = new Horas();

		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(comprarja)
						.addComponent(leilao)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(36)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(horas, GroupLayout.PREFERRED_SIZE, 206, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
								.addGroup(groupLayout.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(lblData)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(data, GroupLayout.PREFERRED_SIZE, 169, GroupLayout.PREFERRED_SIZE)))))
					.addContainerGap(208, Short.MAX_VALUE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(29)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(panel_3, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 295, Short.MAX_VALUE)
						.addComponent(panel_2, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addGap(145))
				.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
					.addComponent(lblDurao)
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(leilao)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(comprarja))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(143)
							.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lblDurao)
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblData)
						.addComponent(data, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(46)
							.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(horas, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(25, Short.MAX_VALUE))
		);
		data.setDateFormatString("dd/MM/yyyy");

		JLabel label_2 = new JLabel("Pre\u00E7o   \u20AC");
		label_2.setFont(new Font("Lucida Grande", Font.BOLD, 13));

		preco = new JTextField();
		preco.setColumns(10);
		GroupLayout gl_panel_3 = new GroupLayout(panel_3);
		gl_panel_3.setHorizontalGroup(gl_panel_3.createParallelGroup(
				Alignment.LEADING).addGroup(
				gl_panel_3
						.createSequentialGroup()
						.addContainerGap()
						.addComponent(label_2, GroupLayout.PREFERRED_SIZE, 58,
								GroupLayout.PREFERRED_SIZE)
						.addGap(6)
						.addComponent(preco, GroupLayout.PREFERRED_SIZE,
								GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addContainerGap(72, Short.MAX_VALUE)));
		gl_panel_3
				.setVerticalGroup(gl_panel_3
						.createParallelGroup(Alignment.LEADING)
						.addGroup(
								Alignment.TRAILING,
								gl_panel_3
										.createSequentialGroup()
										.addContainerGap(
												GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)
										.addGroup(
												gl_panel_3
														.createParallelGroup(
																Alignment.LEADING)
														.addGroup(
																gl_panel_3
																		.createSequentialGroup()
																		.addGap(6)
																		.addComponent(
																				label_2))
														.addComponent(
																preco,
																GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE,
																GroupLayout.PREFERRED_SIZE))));
		panel_3.setLayout(gl_panel_3);

		JLabel label = new JLabel("Pre\u00E7o inicial   \u20AC");
		label.setFont(new Font("Lucida Grande", Font.BOLD, 13));

		inipreco = new JTextField();
		inipreco.setColumns(10);

		JLabel lblIncrementoMnimo = new JLabel(
				"Incremento m\u00EDnimo    \u20AC");
		lblIncrementoMnimo.setFont(new Font("Lucida Grande", Font.BOLD, 13));

		incpreco = new JComboBox();
		incpreco.setModel(new DefaultComboBoxModel(new String[] { "0.01",
				"0.05", "0.10", "0.50", "1.00", "5.00", "10.00", "50.00",
				"100.00", "500.00", "1000.00", "5000.00", "10000.00" }));
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_2.createSequentialGroup()
							.addComponent(label, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(inipreco, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_2.createSequentialGroup()
							.addComponent(lblIncrementoMnimo)
							.addGap(6)
							.addComponent(incpreco, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
							.addGap(0, 0, Short.MAX_VALUE)))
					.addContainerGap())
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_2.createSequentialGroup()
							.addGap(6)
							.addComponent(label))
						.addComponent(inipreco, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(10)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblIncrementoMnimo)
						.addComponent(incpreco, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(13, Short.MAX_VALUE))
		);
		panel_2.setLayout(gl_panel_2);
		panel_1.setLayout(new CardLayout(0, 0));
		setLayout(groupLayout);

	}
	
	public boolean eLeilao(){
		return leilao.isSelected();
	}
	public boolean eCompra(){
		return comprarja.isSelected();
	}
	
	public GregorianCalendar validade() throws Exception{
		GregorianCalendar hoje = new GregorianCalendar();
		int dia,mes,ano,hora,minutos;
		Calendar c = data.getCalendar();
		dia = c.get(Calendar.DAY_OF_MONTH);
		mes = c.get(Calendar.MONTH);
		ano = c.get(Calendar.YEAR);
		hora = horas.getHora();
		minutos = horas.getMinutos();
		
		GregorianCalendar res = new GregorianCalendar(ano,mes,dia,hora,minutos);
		
		if(res.before(hoje))
			throw new Exception("Insira uma data válida");
		
		long lhoje = hoje.getTimeInMillis();
		long lres = res.getTimeInMillis();
		long diff = lres-lhoje;
		long diffDays = diff / (24 * 60 * 60 * 1000);
		
		if(diffDays < 7)
			throw new Exception("O anúncio tem que estar no min. 7 dias online");
		return res;
		}
	
	public float getLicMin() throws Exception{
		String slicmin = inipreco.getText();
		if(slicmin.isEmpty())
			throw new Exception("Insira um preço inicial");
		float res;
		try {
			res= new Float(slicmin).floatValue();
			} catch (Exception e) {
			throw new Exception("Insira um preço inicial válido");
		}
		if(res<=0)
			throw new Exception("Insira um preço inical positivo");
		return res;
	}
	
	public float getPreco() throws Exception{
		String spreco = preco.getText();
		if(spreco.isEmpty())
			throw new Exception("Insira um preço");
		float res;
		try {
			res= new Float(spreco).floatValue();
			} catch (Exception e) {
			throw new Exception("Insira um preço");
		}
		if(res<=0)
			throw new Exception("Insira um preço");
		return res;
	}
	
	public float getInc(){
		String sinc = (String) incpreco.getModel().getElementAt(incpreco.getSelectedIndex());
		return new Float(sinc).floatValue();
		}
	
	
	
	
	
	
	
}
