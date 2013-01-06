package Presentation_Layer.ContaPessoal;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.LayoutStyle.ComponentPlacement;

import org.jdesktop.swingx.JXHyperlink;

import presentation_Layer.Sale_Squared;


public class Conta_Pessoal extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public Conta_Pessoal(final Sale_Squared root) {

		JLabel lblContaPessoal = new JLabel("Conta Pessoal");
		lblContaPessoal.setFont(new Font("Lucida Grande", Font.BOLD, 20));

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);

		JXHyperlink hprlnkUtilizador = new JXHyperlink();
		hprlnkUtilizador.setForeground(new Color(0, 102, 204));
		hprlnkUtilizador.setText("Utilizador123");
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout
				.setHorizontalGroup(groupLayout
						.createParallelGroup(Alignment.LEADING)
						.addGroup(
								groupLayout
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												groupLayout
														.createParallelGroup(
																Alignment.LEADING)
														.addGroup(
																groupLayout
																		.createSequentialGroup()
																		.addComponent(
																				lblContaPessoal)
																		.addPreferredGap(
																				ComponentPlacement.RELATED)
																		.addComponent(
																				hprlnkUtilizador,
																				GroupLayout.PREFERRED_SIZE,
																				152,
																				GroupLayout.PREFERRED_SIZE))
														.addComponent(
																tabbedPane,
																Alignment.TRAILING,
																GroupLayout.DEFAULT_SIZE,
																438,
																Short.MAX_VALUE))
										.addContainerGap()));
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
																Alignment.TRAILING)
														.addComponent(
																lblContaPessoal)
														.addComponent(
																hprlnkUtilizador,
																GroupLayout.PREFERRED_SIZE,
																10,
																GroupLayout.PREFERRED_SIZE))
										.addGap(18)
										.addComponent(tabbedPane,
												GroupLayout.DEFAULT_SIZE, 245,
												Short.MAX_VALUE)
										.addContainerGap()));

		JPanel panel = new JPanel();
		tabbedPane.addTab("Actividade", null, panel, null);
		panel.setLayout(new CardLayout(0, 0));
		panel.add(new Actividade(root), "actividade");

		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("A Minha Conta", null, panel_1, null);
		panel_1.setLayout(new CardLayout(0, 0));
		setLayout(groupLayout);

	}
}
