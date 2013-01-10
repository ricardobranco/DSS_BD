package Presentation_Layer.Header;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.LayoutStyle.ComponentPlacement;

import Presentation_Layer.Sale_Squared;
import Presentation_Layer.ContaPessoal.Conta_Pessoal;
import Presentation_Layer.Home.Home;
import Presentation_Layer.Inserir.Inserir;
import Presentation_Layer.Perfil.Perfil;


public class Registado_Panel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public Registado_Panel(final Sale_Squared root) {

		JButton btnNewButton = new JButton("Sair");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Sale_Squared.REGISTADO = false;
				Sale_Squared.UTILIZADOR = null;
				root.reloadHeader();
				root.setBody(new Home(root), "Home");
			}
		});

		JButton btnNewButton_1 = new JButton("Mensagens");

		JButton btnNewButton_2 = new JButton("Perfil");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				root.setBody(new Perfil(root,Sale_Squared.UTILIZADOR),Sale_Squared.UTILIZADOR);
			}
		});

		JButton btnNewButton_3 = new JButton("Anunciar");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				root.setBody(new Inserir(root), "Novo negócio");
			}
		});

		JButton btnContaPessoal = new JButton("Conta Pessoal");
		btnContaPessoal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				root.setBody(new Conta_Pessoal(root), "Conta Pessoal");
			}
		});
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(
				Alignment.TRAILING).addGroup(
				groupLayout.createSequentialGroup()
						.addContainerGap(99, Short.MAX_VALUE)
						.addComponent(btnNewButton_3)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(btnContaPessoal)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(btnNewButton_2)
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addComponent(btnNewButton_1)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(btnNewButton).addContainerGap()));
		groupLayout.setVerticalGroup(groupLayout.createParallelGroup(
				Alignment.LEADING)
				.addGroup(
						groupLayout
								.createSequentialGroup()
								.addContainerGap()
								.addGroup(
										groupLayout
												.createParallelGroup(
														Alignment.BASELINE)
												.addComponent(btnNewButton)
												.addComponent(btnNewButton_1)
												.addComponent(btnNewButton_2)
												.addComponent(btnContaPessoal)
												.addComponent(btnNewButton_3))
								.addContainerGap(265, Short.MAX_VALUE)));
		setLayout(groupLayout);

	}
}
