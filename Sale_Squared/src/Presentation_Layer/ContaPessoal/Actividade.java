package Presentation_Layer.ContaPessoal;

import java.awt.CardLayout;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JPanel;
import javax.swing.LayoutStyle.ComponentPlacement;

import org.jdesktop.swingx.JXTaskPane;

import Presentation_Layer.Sale_Squared;
import Presentation_Layer.Tabelas.Tabela_Vendas;
import Presentation_Layer.Tabelas.Tabela_licitacao;


public class Actividade extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public Actividade(final Sale_Squared root) {

		JXTaskPane taskPane = new JXTaskPane();
		taskPane.setCollapsed(true);
		taskPane.setTitle("Licita��es");

		JXTaskPane taskPane_1 = new JXTaskPane();
		taskPane_1.setCollapsed(true);
		taskPane_1.setTitle("Vendas");

		JXTaskPane taskPane_2 = new JXTaskPane();
		taskPane_2.setCollapsed(true);
		taskPane_2.setTitle("Compras");

		JXTaskPane taskPane_3 = new JXTaskPane();
		taskPane_3.setCollapsed(true);
		taskPane_3.setTitle("Neg�cios Seguidos");

		JXTaskPane taskPane_4 = new JXTaskPane();
		taskPane_4.setCollapsed(true);
		taskPane_4.setTitle("Utilizadores Seguidos");
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(
				Alignment.LEADING).addGroup(
				groupLayout
						.createSequentialGroup()
						.addContainerGap()
						.addGroup(
								groupLayout
										.createParallelGroup(Alignment.LEADING)
										.addComponent(taskPane_4,
												Alignment.TRAILING,
												GroupLayout.DEFAULT_SIZE, 741,
												Short.MAX_VALUE)
										.addComponent(taskPane_3,
												Alignment.TRAILING,
												GroupLayout.DEFAULT_SIZE, 741,
												Short.MAX_VALUE)
										.addComponent(taskPane_2,
												GroupLayout.DEFAULT_SIZE, 741,
												Short.MAX_VALUE)
										.addComponent(taskPane_1,
												GroupLayout.DEFAULT_SIZE, 741,
												Short.MAX_VALUE)
										.addComponent(taskPane,
												GroupLayout.DEFAULT_SIZE, 741,
												Short.MAX_VALUE))
						.addContainerGap()));
		groupLayout.setVerticalGroup(groupLayout.createParallelGroup(
				Alignment.LEADING).addGroup(
				groupLayout
						.createSequentialGroup()
						.addContainerGap()
						.addComponent(taskPane, GroupLayout.DEFAULT_SIZE, 25,
								Short.MAX_VALUE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(taskPane_1, GroupLayout.PREFERRED_SIZE,
								GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(taskPane_2, GroupLayout.PREFERRED_SIZE,
								GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(taskPane_3, GroupLayout.PREFERRED_SIZE,
								GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(taskPane_4, GroupLayout.DEFAULT_SIZE, 25,
								Short.MAX_VALUE).addGap(12)));
		taskPane_2.getContentPane().setLayout(new CardLayout(0, 0));
		taskPane_1.getContentPane().setLayout(new CardLayout(0, 0));
		taskPane_4.getContentPane().setLayout(new CardLayout(0, 0));
		taskPane_3.getContentPane().setLayout(new CardLayout(0, 0));
		taskPane.getContentPane().setLayout(new CardLayout(0, 0));
		taskPane.getContentPane().add(new Tabela_licitacao(root), "licita��es");
		taskPane_1.getContentPane().add(new Tabela_Vendas(root), "vendas");

		setLayout(groupLayout);
	}

}
