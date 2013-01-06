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
import business_Layer.Leilao;
import business_Layer.ModoVenda;
import business_Layer.VendaDirecta;

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

		final int codigo = root.getSistema().registaIdAnuncio();
		a = new AnuncioVenda(codigo);
		inserir[0] = new Inserir_1(codigo);
		inserir[1] = new Inserir_2();

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
						a.setDescricao(i1.getDescricao());
						a.setEstadoProduto(i1.getEstado());
						a.setImagens(i1.getImagens());
						double preco = 0;
						int quantidade;
						ModoVenda mv;
						Inserir_preco ip = i1.precopanel();
						int id = codigo;
						if (ip.eLeilao()) {
							double precoB = ip.getLicMin();
							GregorianCalendar dataF = ip.validade();
							int nlic = 0;
							double precoActual = precoB;
							quantidade = 1;
							mv = new Leilao(id, precoB, dataF, nlic,
									precoActual);
						} else {
							preco = ip.getPreco();
							quantidade = ip.getQuantidade();
							mv = new VendaDirecta(id, 0);
						}

						a.setTipoVenda(mv);
						a.setPreco(preco);
						a.setQuantidade(quantidade);
						a.setnVisitas(0);
						GregorianCalendar expira = ip.validade();
						a.setDataExpir(expira);
						a.setPossivelTrocar(ip.trocas());

						btnVoltar.setVisible(true);
						setBody(inserir[2], step);
						btnSeguinte.setText("Conluir");

						step++;
						break;
					case 2:
						Inserir_2 i2 = (Inserir_2) inserir[1];
						Inserir_Envio envio = i2.getEnvio();
						Inserir_Pagamento pagamento = i2.getPagamentos();

						// Envio
						if (envio.pagaComprador()) {
							double portes = envio.getPortes();
							double seguro = envio.getSeguro();
							a.setPrecoEnvio(portes);
							a.setSeguro(seguro);
						} else {
							a.setPrecoEnvio(0);
							a.setSeguro(0);
						}
						a.setEnvioEstrangeiro(envio.envioEstrangeiro());

						// Pagamento
						a.setModosPagamento(pagamento.getModosPagamento());

						a.setEstadoAnuncio(AnuncioVenda.ABERTO);
						a.setAnunciante(root
								.getSistema()
								.encontrarUtilizadorReg(Sale_Squared.UTILIZADOR));
						root.getSistema().inserirAnuncio(a);
						root.setBody(new Presentation_Layer.Anuncio.Anuncio_Main(
								root, a), a.getTitulo());

						break;

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
				btnVoltar.setEnabled(false);
				step--;
				setBody(inserir[0], step);
				btnSeguinte.setText("Seguinte");

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
