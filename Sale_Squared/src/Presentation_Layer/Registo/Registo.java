package Presentation_Layer.Registo;

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

import Business_Layer.Imagem;
import Business_Layer.Mensagem;
import Business_Layer.UtilizadorRegistado;
import Presentation_Layer.Sale_Squared;
import Presentation_Layer.Componentes.Mensagem_Erro;

public class Registo extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int step;

	/**
	 * Create the panel.
	 */

	public Registo(final Sale_Squared root) {
		step = 1;
		final JPanel registo_1_2 = new Registo_1_2(root);
		final JPanel registo_3_Final = new Registo_3_Final(root);

		JLabel lblNewLabel = new JLabel("Registo");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.BOLD, 20));

		final JPanel panel = new JPanel();
		final JButton btnNewButton_1 = new JButton("Voltar");
		final JButton btnNewButton = new JButton("Seguinte");

		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton.setText("Seguinte");
				panel.removeAll();
				panel.add(registo_1_2, "1_2");
				panel.updateUI();
				panel.validate();
				btnNewButton_1.setVisible(false);

			}
		});

		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				try {
					UtilizadorRegistado ur;
					switch (step) {
					case 1:
						Registo_1_2 r12 = (Registo_1_2) registo_1_2;
						Registo_1 r1 = (Registo_1) r12
								.get(Registo_1_2.DADOSBASE);
						Registo_2 r2 = (Registo_2) r12
								.get(Registo_1_2.DADOSPESSOAIS);

						int id = root.getSistema().getEmSessao().getId();
						String username = r1.getUser(root);
						String password = r1.getPassword();
						String email = r1.getEmail(root);
						char estado = UtilizadorRegistado.NORMAL;
						String nome = r2.getNome();
						String pais = r2.getPais();
						String morada = r2.getMorada();
						String codPostal = r2.getCodigoPostal();
						String localidade = r2.getLocalidade();
						String contacto = r2.getContacto() + "";
						
						String infPessoal = ""; // Provisório
						Imagem imagem = new Imagem("Avatar" + id, r2
								.getAvatar());
						GregorianCalendar dn = r2.getDataNascimento();

						ur = new UtilizadorRegistado(id,
								username, password, estado, email, morada,
								codPostal, localidade, pais, infPessoal,
								imagem, contacto, nome, dn);
						break;

					}

					btnNewButton.setText("Concluir");
					panel.removeAll();
					panel.add(registo_3_Final, "3 e Fim");
					panel.updateUI();
					panel.validate();
					btnNewButton_1.setVisible(true);

				} catch (Exception e) {
					new Mensagem_Erro(root, e.getMessage()).setVisible(true);
				}

			}
		});

		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout
				.setHorizontalGroup(groupLayout
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
																				lblNewLabel,
																				GroupLayout.PREFERRED_SIZE,
																				87,
																				GroupLayout.PREFERRED_SIZE))
														.addGroup(
																groupLayout
																		.createSequentialGroup()
																		.addGap(101)
																		.addGroup(
																				groupLayout
																						.createParallelGroup(
																								Alignment.LEADING)
																						.addComponent(
																								panel,
																								GroupLayout.DEFAULT_SIZE,
																								620,
																								Short.MAX_VALUE)
																						.addGroup(
																								groupLayout
																										.createSequentialGroup()
																										.addComponent(
																												btnNewButton_1)
																										.addPreferredGap(
																												ComponentPlacement.RELATED,
																												421,
																												Short.MAX_VALUE)
																										.addComponent(
																												btnNewButton)
																										.addGap(20)))))
										.addContainerGap()));
		groupLayout.setVerticalGroup(groupLayout.createParallelGroup(
				Alignment.LEADING)
				.addGroup(
						groupLayout
								.createSequentialGroup()
								.addContainerGap()
								.addComponent(lblNewLabel)
								.addPreferredGap(ComponentPlacement.RELATED,
										GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)
								.addComponent(panel,
										GroupLayout.PREFERRED_SIZE, 781,
										GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addGroup(
										groupLayout
												.createParallelGroup(
														Alignment.BASELINE)
												.addComponent(btnNewButton_1)
												.addComponent(btnNewButton))
								.addGap(18)));
		panel.setLayout(new CardLayout(0, 0));
		panel.add(registo_1_2, "1 e 2");
		setLayout(groupLayout);
		btnNewButton_1.setVisible(false);

	}
}
