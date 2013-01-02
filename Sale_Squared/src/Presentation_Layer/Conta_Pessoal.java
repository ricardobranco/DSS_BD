package Presentation_Layer;

import java.awt.Cursor;
import java.awt.Font;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import java.awt.CardLayout;

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
		
		JLabel lblUtilizador = new JLabel("Utilizador123");
		lblUtilizador.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		Mouse_S2.mouseINOUT(lblUtilizador);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblContaPessoal)
							.addGap(18)
							.addComponent(lblUtilizador))
						.addComponent(tabbedPane, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 438, Short.MAX_VALUE))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblContaPessoal)
						.addComponent(lblUtilizador))
					.addGap(18)
					.addComponent(tabbedPane, GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
					.addContainerGap())
		);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Actividade", null, panel, null);
		panel.setLayout(new CardLayout(0, 0));
		panel.add(new Actividade(),"actividade");
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("A Minha Conta", null, panel_1, null);
		panel_1.setLayout(new CardLayout(0, 0));
		setLayout(groupLayout);
		

	}
}
