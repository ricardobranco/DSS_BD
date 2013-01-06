package Presentation_Layer.Header;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.LayoutStyle.ComponentPlacement;

import org.jdesktop.swingx.JXSearchField;

import Presentation_Layer.Sale_Squared;
import Presentation_Layer.Pesquisa.Pesquisa_Resultado;


public class Barra_Pesquisa extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public Barra_Pesquisa(final Sale_Squared root) {

		JComboBox<Object> comboBox = new JComboBox<Object>();
		comboBox.setModel(new DefaultComboBoxModel<Object>(new String[] { "Todos",
				"    Moda", "        Vestu\u00E1rio",
				"        Acess\u00F3rios", "    Casa e Jardim",
				"        Animais", "        Artigos de Jardim",
				"        Im\u00F3veis", "        M\u00F3veis",
				"    Tecnologia e Electr\u00F3nica",
				"        \u00C1udio,Tv e V\u00EDdeo", "        Consolas",
				"        Fotografia", "        Inform\u00E1tica",
				"        Telem\u00F3veis e Telefones",
				"    Coleccion\u00E1veis e Arte", "        Selos",
				"        Moeda e Notas", "        Medalhas",
				"        Antiguidades", "        Arte", "    Sa\u00FAde",
				"        Cosm\u00E9ticos", "    Desporto e Entretenimento",
				"        Brinquedos", "        Artigos de Desporto",
				"        Filmes e Cinema", "        Livros e Revistas",
				"        M\u00FAsica", "    Auto    ", "        Ve\u00EDculos",
				"        Pe\u00E7as auto", "    Outros    \t" }));

		JPanel panel = new JPanel();

		JXSearchField searchField = new JXSearchField();
		searchField.setToolTipText("Procurar");
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(
				Alignment.TRAILING).addGroup(
				groupLayout
						.createSequentialGroup()
						.addContainerGap()
						.addComponent(searchField, GroupLayout.DEFAULT_SIZE,
								107, Short.MAX_VALUE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(comboBox, 0, 148, Short.MAX_VALUE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(panel, GroupLayout.PREFERRED_SIZE,
								GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE).addContainerGap()));
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
																Alignment.LEADING)
														.addComponent(
																panel,
																GroupLayout.PREFERRED_SIZE,
																288,
																Short.MAX_VALUE)
														.addGroup(
																groupLayout
																		.createParallelGroup(
																				Alignment.BASELINE)
																		.addComponent(
																				comboBox,
																				GroupLayout.PREFERRED_SIZE,
																				GroupLayout.DEFAULT_SIZE,
																				GroupLayout.PREFERRED_SIZE)
																		.addComponent(
																				searchField,
																				GroupLayout.PREFERRED_SIZE,
																				GroupLayout.DEFAULT_SIZE,
																				GroupLayout.PREFERRED_SIZE)))
										.addContainerGap()));

		JButton btnPesquisa = new JButton("Pesquisa");
		btnPesquisa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				root.setBody(new Pesquisa_Resultado(root), "Resultados");
			}
		});

		JButton btnPesquisaAvanada = new JButton("Pesquisa Avan\u00E7ada");
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(gl_panel
				.createParallelGroup(Alignment.LEADING)
				.addGroup(
						Alignment.TRAILING,
						gl_panel.createSequentialGroup()
								.addComponent(btnPesquisa,
										GroupLayout.DEFAULT_SIZE, 169,
										Short.MAX_VALUE).addGap(2))
				.addComponent(btnPesquisaAvanada, GroupLayout.DEFAULT_SIZE,
						171, Short.MAX_VALUE));
		gl_panel.setVerticalGroup(gl_panel.createParallelGroup(
				Alignment.LEADING).addGroup(
				gl_panel.createSequentialGroup()
						.addComponent(btnPesquisa)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(btnPesquisaAvanada)
						.addContainerGap(GroupLayout.DEFAULT_SIZE,
								Short.MAX_VALUE)));
		panel.setLayout(gl_panel);
		setLayout(groupLayout);

	}
}
