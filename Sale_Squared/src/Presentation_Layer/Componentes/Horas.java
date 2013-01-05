package Presentation_Layer.Componentes;

import java.awt.Font;
import java.util.GregorianCalendar;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

public class Horas extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JSpinner horas;
	private JSpinner minutos;

	/**
	 * Create the panel.
	 */
	public Horas() {

		SpinnerNumberModel smh = (new SpinnerNumberModel(
				(int) (new GregorianCalendar()
						.get(GregorianCalendar.HOUR_OF_DAY)),
				0, 23, 1));
		SpinnerNumberModel smm = (new SpinnerNumberModel(
				(int) (new GregorianCalendar().get(GregorianCalendar.MINUTE)),
				0, 59, 1));

		horas = new JSpinner(smh);

		JLabel lblHora = new JLabel("Horas");
		lblHora.setFont(new Font("Lucida Grande", Font.BOLD, 13));

		JLabel lblMinutos = new JLabel("Minutos");
		lblMinutos.setFont(new Font("Lucida Grande", Font.BOLD, 13));

		minutos = new JSpinner(smm);

		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(
				Alignment.LEADING).addGroup(
				groupLayout
						.createSequentialGroup()
						.addGroup(
								groupLayout
										.createParallelGroup(Alignment.LEADING)
										.addComponent(lblMinutos)
										.addComponent(lblHora))
						.addGap(18)
						.addGroup(
								groupLayout
										.createParallelGroup(Alignment.LEADING,
												false).addComponent(horas)
										.addComponent(minutos))
						.addContainerGap(8, Short.MAX_VALUE)));
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
																				lblHora))
														.addComponent(
																horas,
																GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE,
																GroupLayout.PREFERRED_SIZE))
										.addGap(12)
										.addGroup(
												groupLayout
														.createParallelGroup(
																Alignment.LEADING)
														.addComponent(
																lblMinutos)
														.addComponent(
																minutos,
																GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE,
																GroupLayout.PREFERRED_SIZE))
										.addContainerGap(15, Short.MAX_VALUE)));
		setLayout(groupLayout);

	}
	
	public int getHora(){return  ((Integer )horas.getValue()).intValue();}

	public int getMinutos(){return  ((Integer )minutos.getValue()).intValue();}
	
}
