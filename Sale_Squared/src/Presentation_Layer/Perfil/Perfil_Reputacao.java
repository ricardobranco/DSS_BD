package Presentation_Layer.Perfil;

import java.awt.CardLayout;
import java.awt.Font;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;

import Presentation_Layer.Tabelas.Tabela_Reputacao;

public class Perfil_Reputacao extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public Perfil_Reputacao() {
		
		JPanel panel = new JPanel();
		
		
		JLabel lblReputao = new JLabel("Reputação");
		lblReputao.setHorizontalAlignment(SwingConstants.CENTER);
		lblReputao.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		
		JLabel lblNewLabel = new JLabel("0");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.BOLD | Font.ITALIC, 30));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblPositiva = new JLabel("Positiva: 0");
		
		JLabel lblNeutra = new JLabel("Neutra: 0");
		
		JLabel lblNegativa = new JLabel("Negativa: 0");
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblPositiva))
						.addGroup(gl_panel.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblNeutra))
						.addGroup(gl_panel.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblNegativa))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(27)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
								.addComponent(lblReputao, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
					.addContainerGap(36, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblReputao)
					.addGap(18)
					.addComponent(lblNewLabel)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblPositiva)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNeutra)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNegativa)
					.addContainerGap(20, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(23)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(tabbedPane, GroupLayout.DEFAULT_SIZE, 542, Short.MAX_VALUE)
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(22)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(tabbedPane, GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
							.addContainerGap())
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(panel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(65))))
		);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Todos", null, panel_1, null);
		panel_1.setLayout(new CardLayout(0, 0));
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("Vendedor", null, panel_2, null);
		panel_2.setLayout(new CardLayout(0, 0));
		
		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("Comprador", null, panel_3, null);
		panel_3.setLayout(new CardLayout(0, 0));
		
		panel_1.add(new Tabela_Reputacao(),"todos");
		panel_2.add(new Tabela_Reputacao(),"vendedor");
		panel_3.add(new Tabela_Reputacao(),"comprador");
		
		setLayout(groupLayout);

	}
}
