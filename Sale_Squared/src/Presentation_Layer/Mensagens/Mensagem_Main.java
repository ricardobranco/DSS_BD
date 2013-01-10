package Presentation_Layer.Mensagens;

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTabbedPane;
import java.awt.CardLayout;
import java.util.List;

import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

import Business_Layer.Mensagem;
import Presentation_Layer.Sale_Squared;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Mensagem_Main extends JPanel {

	/**
	 * Create the panel.
	 */
	private JTabbedPane tabbedPane;
	private JButton btnEnviarMensagem;
	private JButton btnMarcarComoLido;
	private JButton btnApagar;
	private Caixa_Rec cr;
	private Caixa_Envio ce;
	

	public Mensagem_Main(final Sale_Squared root) {
		
                cr = new Caixa_Rec(root, (List<Mensagem>) root.getSistema()
				.encontrarUtilizadorReg(Sale_Squared.UTILIZADOR).getRecebidas()
				.values());
		ce = new Caixa_Envio(root, (List<Mensagem>) root.getSistema()
				.encontrarUtilizadorReg(Sale_Squared.UTILIZADOR).getEnviadas()
				.values());
		
                
                btnEnviarMensagem = new JButton("Enviar Mensagem");
                btnMarcarComoLido = new JButton("Marcar como lido");
		btnMarcarComoLido.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cr.marcarLidas();
			}
		});

		btnApagar = new JButton("Apagar");
		btnApagar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cr.remMarcadas();
				ce.remMarcadas();

			}
		});

		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				switch (tabbedPane.getSelectedIndex()) {
				case 0:
					btnMarcarComoLido.setVisible(false);
				case 1:
					btnMarcarComoLido.setVisible(false);
				}

			}
		});
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout
				.setHorizontalGroup(groupLayout
						.createParallelGroup(Alignment.TRAILING)
						.addGroup(
								groupLayout
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												groupLayout
														.createParallelGroup(
																Alignment.LEADING)
														.addComponent(
																tabbedPane,
																GroupLayout.DEFAULT_SIZE,
																430,
																Short.MAX_VALUE)
														.addComponent(
																btnEnviarMensagem)
														.addGroup(
																Alignment.TRAILING,
																groupLayout
																		.createSequentialGroup()
																		.addComponent(
																				btnMarcarComoLido)
																		.addPreferredGap(
																				ComponentPlacement.RELATED)
																		.addComponent(
																				btnApagar)))
										.addContainerGap()));
		groupLayout
				.setVerticalGroup(groupLayout
						.createParallelGroup(Alignment.LEADING)
						.addGroup(
								groupLayout
										.createSequentialGroup()
										.addContainerGap()
										.addComponent(btnEnviarMensagem)
										.addPreferredGap(
												ComponentPlacement.RELATED)
										.addComponent(tabbedPane,
												GroupLayout.DEFAULT_SIZE, 220,
												Short.MAX_VALUE)
										.addPreferredGap(
												ComponentPlacement.RELATED)
										.addGroup(
												groupLayout
														.createParallelGroup(
																Alignment.BASELINE)
														.addComponent(btnApagar)
														.addComponent(
																btnMarcarComoLido))
										.addContainerGap()));

		JPanel panel = new JPanel();
		tabbedPane.addTab("Recebidas", null, panel, null);
		panel.setLayout(new CardLayout(0, 0));
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Enviadas", null, panel_1, null);
		panel_1.setLayout(new CardLayout(0, 0));
		panel.add(cr, "cr");
		panel_1.add(ce, "ce");

		setLayout(groupLayout);

	}
}
