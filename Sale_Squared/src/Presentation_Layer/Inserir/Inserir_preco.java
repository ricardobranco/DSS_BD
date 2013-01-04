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

public class Inserir_preco extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Create the panel.
	 */
	public Inserir_preco() {

		final JPanel panel_2 = new JPanel();
		final JPanel panel_3 = new JPanel();
		final JCheckBox chckbxLeilo = new JCheckBox("Leil›es");
		chckbxLeilo.setSelected(true);
		chckbxLeilo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				panel_2.setVisible(chckbxLeilo.isSelected());

			}
		});
		chckbxLeilo.setFont(new Font("Lucida Grande", Font.BOLD, 13));

		final JCheckBox chckbxNewCheckBox = new JCheckBox("Comprar J‡");
		chckbxNewCheckBox.setSelected(true);
		chckbxNewCheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_3.setVisible(chckbxNewCheckBox.isSelected());
			}
		});
		chckbxNewCheckBox.setFont(new Font("Lucida Grande", Font.BOLD, 13));

		JLabel lblDurao = new JLabel("Validade");
		lblDurao.setFont(new Font("Lucida Grande", Font.BOLD, 13));

		JLabel lblData = new JLabel("Data");
		lblData.setFont(new Font("Lucida Grande", Font.BOLD, 13));

		JPanel panel_1 = new JPanel();

		com.toedter.calendar.JDateChooser dateChooser = new com.toedter.calendar.JDateChooser();
		dateChooser.setDate(new Date());
		GregorianCalendar gc = new GregorianCalendar();
		Calendar min = Calendar.getInstance();
		min.set(Calendar.YEAR, gc.get(GregorianCalendar.YEAR));
		min.set(Calendar.MONTH, gc.get(GregorianCalendar.MONTH));
		min.set(Calendar.DATE, gc.get(GregorianCalendar.DATE));

		dateChooser.setMinSelectableDate(min.getTime());

		GroupLayout groupLayout = new GroupLayout(this);
		dateChooser.setDateFormatString("dd/MM/yyyy");
		groupLayout
				.setHorizontalGroup(groupLayout
						.createParallelGroup(Alignment.TRAILING)
						.addGroup(
								groupLayout
										.createSequentialGroup()
										.addGroup(
												groupLayout
														.createParallelGroup(
																Alignment.LEADING)
														.addComponent(lblDurao)
														.addComponent(
																chckbxNewCheckBox)
														.addComponent(
																chckbxLeilo)
														.addGroup(
																groupLayout
																		.createSequentialGroup()
																		.addGap(36)
																		.addGroup(
																				groupLayout
																						.createParallelGroup(
																								Alignment.LEADING,
																								false)
																						.addComponent(
																								panel_1,
																								GroupLayout.DEFAULT_SIZE,
																								GroupLayout.DEFAULT_SIZE,
																								Short.MAX_VALUE)
																						.addGroup(
																								groupLayout
																										.createSequentialGroup()
																										.addComponent(
																												lblData)
																										.addPreferredGap(
																												ComponentPlacement.RELATED)
																										.addComponent(
																												dateChooser,
																												GroupLayout.PREFERRED_SIZE,
																												169,
																												GroupLayout.PREFERRED_SIZE)))))
										.addContainerGap(208, Short.MAX_VALUE))
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
																295,
																Short.MAX_VALUE)
														.addComponent(
																panel_2,
																Alignment.LEADING,
																GroupLayout.DEFAULT_SIZE,
																GroupLayout.DEFAULT_SIZE,
																Short.MAX_VALUE))
										.addGap(145)));
		groupLayout
				.setVerticalGroup(groupLayout
						.createParallelGroup(Alignment.LEADING)
						.addGroup(
								groupLayout
										.createSequentialGroup()
										.addGroup(
												groupLayout
														.createParallelGroup(
																Alignment.LEADING)
														.addGroup(
																groupLayout
																		.createSequentialGroup()
																		.addContainerGap()
																		.addComponent(
																				chckbxLeilo)
																		.addPreferredGap(
																				ComponentPlacement.RELATED)
																		.addComponent(
																				panel_2,
																				GroupLayout.PREFERRED_SIZE,
																				GroupLayout.DEFAULT_SIZE,
																				GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				ComponentPlacement.RELATED)
																		.addComponent(
																				chckbxNewCheckBox))
														.addGroup(
																groupLayout
																		.createSequentialGroup()
																		.addGap(143)
																		.addComponent(
																				panel_3,
																				GroupLayout.PREFERRED_SIZE,
																				GroupLayout.DEFAULT_SIZE,
																				GroupLayout.PREFERRED_SIZE)))
										.addGap(52)
										.addGroup(
												groupLayout
														.createParallelGroup(
																Alignment.TRAILING)
														.addGroup(
																groupLayout
																		.createSequentialGroup()
																		.addComponent(
																				lblDurao)
																		.addGap(18)
																		.addComponent(
																				lblData))
														.addComponent(
																dateChooser,
																GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE,
																GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(
												ComponentPlacement.UNRELATED)
										.addComponent(panel_1,
												GroupLayout.PREFERRED_SIZE, 70,
												GroupLayout.PREFERRED_SIZE)
										.addContainerGap(13, Short.MAX_VALUE)));

		JLabel label_2 = new JLabel("Pre\u00E7o   \u20AC");
		label_2.setFont(new Font("Lucida Grande", Font.BOLD, 13));

		textField_1 = new JTextField();
		textField_1.setColumns(10);
		GroupLayout gl_panel_3 = new GroupLayout(panel_3);
		gl_panel_3.setHorizontalGroup(gl_panel_3.createParallelGroup(
				Alignment.LEADING).addGroup(
				gl_panel_3
						.createSequentialGroup()
						.addContainerGap()
						.addComponent(label_2, GroupLayout.PREFERRED_SIZE, 58,
								GroupLayout.PREFERRED_SIZE)
						.addGap(6)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE,
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
																textField_1,
																GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE,
																GroupLayout.PREFERRED_SIZE))));
		panel_3.setLayout(gl_panel_3);

		JLabel label = new JLabel("Pre\u00E7o inicial   \u20AC");
		label.setFont(new Font("Lucida Grande", Font.BOLD, 13));

		textField = new JTextField();
		textField.setColumns(10);

		JLabel lblIncrementoMnimo = new JLabel(
				"Incremento m\u00EDnimo    \u20AC");
		lblIncrementoMnimo.setFont(new Font("Lucida Grande", Font.BOLD, 13));

		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] { "0.01",
				"0.05", "0.10", "0.50", "1.00", "5.00", "10.00", "50.00",
				"100.00", "500.00", "1000.00", "5000.00", "10000.00" }));
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
																				textField,
																				GroupLayout.PREFERRED_SIZE,
																				GroupLayout.DEFAULT_SIZE,
																				GroupLayout.PREFERRED_SIZE))
														.addGroup(
																gl_panel_2
																		.createSequentialGroup()
																		.addComponent(
																				lblIncrementoMnimo)
																		.addPreferredGap(
																				ComponentPlacement.RELATED,
																				6,
																				Short.MAX_VALUE)
																		.addComponent(
																				comboBox,
																				GroupLayout.PREFERRED_SIZE,
																				120,
																				GroupLayout.PREFERRED_SIZE)))
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
																textField,
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
																comboBox,
																GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE,
																GroupLayout.PREFERRED_SIZE))
										.addContainerGap(13, Short.MAX_VALUE)));
		panel_2.setLayout(gl_panel_2);
		panel_1.setLayout(new CardLayout(0, 0));
		panel_1.add(new Horas(), "horas");
		setLayout(groupLayout);

	}
}
