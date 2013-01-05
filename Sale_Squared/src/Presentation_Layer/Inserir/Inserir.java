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

import Business_Layer.Anuncio;
import Business_Layer.AnuncioCompra;
import Business_Layer.AnuncioVenda;
import Presentation_Layer.Sale_Squared;
import Presentation_Layer.Componentes.Mensagem_Erro;

public class Inserir extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */

	private int step = 1;
	private Anuncio a;
	
	JPanel[] inserir = new JPanel[3];

	public Inserir(final Sale_Squared root) {

		int codigo = root.getSistema().registaIdAnuncio();
		a = new AnuncioVenda(codigo);
		inserir[0] = new Inserir_1(codigo);
		inserir[1] = new Inserir_2();
		inserir[2] = new Inserir_3();
		
		
		JLabel lblNewLabel = new JLabel("Inserir Negócio");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.BOLD, 20));

		final JPanel panel = new JPanel();

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
						a.setDataInser(new GregorianCalendar());
						
						
						
						
						break;
					}
					
					
				} catch (Exception e2) {
					Mensagem_Erro frame = new Mensagem_Erro(root, e2
							.getMessage());
					frame.setLocationRelativeTo(null);
					frame.setVisible(true);
				
				}
				
				
				
				
				
				
				panel.removeAll();
				i++;
				panel.add(inserir[i], "inserir");
				panel.updateUI();
				panel.validate();
				if (i == 2)
					btnSeguinte.setVisible(false);
				btnVoltar.setVisible(true);

			}
		});

		btnVoltar.setVisible(false);

		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.removeAll();
				i--;
				panel.add(inserir[i], "inserir");
				panel.updateUI();
				panel.validate();
				if (i == 0)
					btnVoltar.setVisible(false);
				btnSeguinte.setVisible(true);

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
}
