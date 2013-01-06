package Presentation_Layer.Inserir;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;

public class Inserir_Envio extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField portes;
	private JTextField seguro;
	private JCheckBox estrangeiro;
	private JRadioButton vendedor;
	private JRadioButton comprador;
	private JComboBox envio;

	/**
	 * Create the panel.
	 */
	public Inserir_Envio() {
		final JPanel panel = new JPanel();
		JLabel lblNewLabel = new JLabel("2 - Envio");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.BOLD, 15));

		JLabel lblNewLabel_1 = new JLabel("M\u00E9todo de Envio");
		lblNewLabel_1.setFont(new Font("Lucida Grande", Font.BOLD, 13));

		envio = new JComboBox();
		envio.setModel(new DefaultComboBoxModel(new String[] {
				"Correio Normal", "Correio Registado",
				"Correio Registado + Seguro", "Entrega em M\u00E3o",
				"Correio Verde", "Correio Azul", "Ver Descri\u00E7\u00E3o" }));

		comprador = new JRadioButton("Comprador paga custos de envio");
		comprador.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.setVisible(true);

			}
		});
		comprador.setSelected(true);
		buttonGroup.add(comprador);

		vendedor = new JRadioButton("Vendedor paga custos de envio");
		vendedor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panel.setVisible(false);

			}
		});
		buttonGroup.add(vendedor);

		estrangeiro = new JCheckBox("Envio para o estrangeiro");

		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout
				.setHorizontalGroup(groupLayout
						.createParallelGroup(Alignment.LEADING)
						.addGroup(
								groupLayout
										.createSequentialGroup()
										.addContainerGap()
										.addComponent(lblNewLabel)
										.addContainerGap(92,
												GroupLayout.PREFERRED_SIZE))
						.addGroup(
								Alignment.TRAILING,
								groupLayout
										.createSequentialGroup()
										.addGap(99)
										.addGroup(
												groupLayout
														.createParallelGroup(
																Alignment.LEADING)
														.addComponent(comprador)
														.addGroup(
																groupLayout
																		.createSequentialGroup()
																		.addComponent(
																				lblNewLabel_1)
																		.addPreferredGap(
																				ComponentPlacement.RELATED)
																		.addComponent(
																				envio,
																				GroupLayout.PREFERRED_SIZE,
																				168,
																				GroupLayout.PREFERRED_SIZE))
														.addComponent(vendedor)
														.addGroup(
																groupLayout
																		.createSequentialGroup()
																		.addGap(29)
																		.addComponent(
																				panel,
																				GroupLayout.DEFAULT_SIZE,
																				GroupLayout.DEFAULT_SIZE,
																				Short.MAX_VALUE))
														.addComponent(
																estrangeiro))
										.addGap(36)));
		groupLayout
				.setVerticalGroup(groupLayout
						.createParallelGroup(Alignment.LEADING)
						.addGroup(
								groupLayout
										.createSequentialGroup()
										.addContainerGap()
										.addComponent(lblNewLabel)
										.addPreferredGap(
												ComponentPlacement.RELATED, 37,
												Short.MAX_VALUE)
										.addGroup(
												groupLayout
														.createParallelGroup(
																Alignment.BASELINE)
														.addComponent(
																lblNewLabel_1)
														.addComponent(
																envio,
																GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE,
																GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(
												ComponentPlacement.UNRELATED)
										.addComponent(comprador)
										.addPreferredGap(
												ComponentPlacement.RELATED)
										.addComponent(panel,
												GroupLayout.PREFERRED_SIZE,
												GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												ComponentPlacement.RELATED)
										.addComponent(vendedor)
										.addPreferredGap(
												ComponentPlacement.RELATED)
										.addComponent(estrangeiro).addGap(32)));

		JLabel lblPortes = new JLabel("Portes");
		lblPortes.setFont(new Font("Lucida Grande", Font.BOLD, 13));

		JLabel lblSeguro = new JLabel("Seguro");
		lblSeguro.setFont(new Font("Lucida Grande", Font.BOLD, 13));

		portes = new JTextField();
		portes.setColumns(10);

		seguro = new JTextField();
		seguro.setColumns(10);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(gl_panel.createParallelGroup(
				Alignment.LEADING).addGroup(
				gl_panel.createSequentialGroup()
						.addContainerGap()
						.addGroup(
								gl_panel.createParallelGroup(Alignment.LEADING)
										.addComponent(lblSeguro)
										.addComponent(lblPortes))
						.addGap(18)
						.addGroup(
								gl_panel.createParallelGroup(Alignment.LEADING,
										false).addComponent(seguro)
										.addComponent(portes))
						.addContainerGap(81, GroupLayout.PREFERRED_SIZE)));
		gl_panel.setVerticalGroup(gl_panel
				.createParallelGroup(Alignment.LEADING)
				.addGroup(
						gl_panel.createSequentialGroup()
								.addContainerGap()
								.addGroup(
										gl_panel.createParallelGroup(
												Alignment.BASELINE)
												.addComponent(lblPortes)
												.addComponent(
														portes,
														GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE,
														GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addGroup(
										gl_panel.createParallelGroup(
												Alignment.BASELINE)
												.addComponent(lblSeguro)
												.addComponent(
														seguro,
														GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE,
														GroupLayout.PREFERRED_SIZE))
								.addContainerGap(GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)));
		panel.setLayout(gl_panel);
		setLayout(groupLayout);

	}

	public String envio() {
		return (String) envio.getModel().getElementAt(envio.getSelectedIndex());
	}

	public double getPortes() throws Exception {
		String sportes = portes.getText();
		if (sportes.isEmpty())
			return 0;

		double res;
		try {
			res = new Double(sportes).doubleValue();

		} catch (Exception e) {
			throw new Exception("Insira um preço de envio válido");
		}
		if (res < 0)
			throw new Exception(
					"O preço de envio tem que ser igual ou maior que 0");
		return res;
	}

	public double getSeguro() throws Exception {
		String sseguro = seguro.getText();
		if (sseguro.isEmpty())
			return 0;
		double res;
		try {
			res = new Double(sseguro).doubleValue();

		} catch (Exception e) {
			throw new Exception("Insira um seguro válido");
		}
		if (res < 0)
			throw new Exception(
					"O custo do deguro tem que ser igual ou maior que 0");
		return res;

	}
	
	public boolean pagaComprador(){
		return comprador.isSelected();
	}

}
