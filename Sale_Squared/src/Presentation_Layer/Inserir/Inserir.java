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

import Presentation_Layer.Sale_Squared;
import Presentation_Layer.Componentes.Mensagem_Erro;
import business_Layer.AnuncioVenda;

public class Inserir extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */

	private int step = 1;
	private AnuncioVenda a;
	final JPanel panel;

	JPanel[] inserir = new JPanel[3];

	public Inserir(final Sale_Squared root) {

		int codigo = root.getSistema().registaIdAnuncio();
		a = new AnuncioVenda(codigo);
		inserir[0] = new Inserir_1(codigo);
		inserir[1] = new Inserir_2();
		inserir[2] = new Inserir_3();

		JLabel lblNewLabel = new JLabel("Inserir Negócio");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.BOLD, 20));

		panel = new JPanel();

		final JButton btnSeguinte = new JButton("Seguinte");
		final JButton btnVoltar = new JButton("Voltar");
		btnSeguinte.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {

					switch (step) {
					case 1:
						Inserir_1 i1 = (Inserir_1) inserir[0];
						a.setTitulo(i1.getTitulo());
						a.setCategorias(i1.getCategorias());
						a.setTags(i1.getTags());
						a.setDataInser(new GregorianCalendar());
						a.setEstadoProduto(i1.getEstado());
						a.setImagens(i1.getImagens());
						// TRATAR SE E LEILAO E/OU COMPRA DIRECTA
						btnVoltar.setVisible(true);
						setBody(inserir[2], step);
						step++;
						break;
					case 2:
						Inserir_2 i2 = (Inserir_2) inserir[1];
						Inserir_Envio envio = i2.getEnvio();
						Inserir_Pagamento pagamento = i2.getPagamentos();

						// Envio
						if (envio.pagaComprador()) {

						}

						// Pagamento
						a.setModosPagamento(pagamento.getModosPagamento());
						setBody(inserir[2], step);
						btnSeguinte.setText("Conluir");
						step++;
						break;
					case 3:
						Inserir_3 i3 = (Inserir_3) inserir[2];
						boolean troca = i3.trocas();
						boolean contacto = i3.contacto();
						a.setPossivelTrocar(troca);
						root.getSistema().inserirAnuncio(a);
						root.setBody(new Presentation_Layer.Anuncio.Anuncio(
								root, a), a.getTitulo());
					}

				} catch (Exception e2) {
					Mensagem_Erro frame = new Mensagem_Erro(root, e2
							.getMessage());
					frame.setLocationRelativeTo(null);
					frame.setVisible(true);
				}
			}
		});

		btnVoltar.setVisible(false);

		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switch (step) {
				case 2:
					
					btnVoltar.setEnabled(false);
					setBody(inserir[0], step);
					break;
				case 3:
					step--;
					btnSeguinte.setText("Seguinte");
					setBody(inserir[1], step);
					
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

}
