package Presentation_Layer.Mensagens;

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTabbedPane;
import java.awt.CardLayout;
import javax.swing.JButton;

public class Mensagem_Main extends JPanel {

	/**
	 * Create the panel.
	 */
	public Mensagem_Main() {
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		
		JButton btnEnviarMensagem = new JButton("Enviar Mensagem");
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(tabbedPane, GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)
						.addComponent(btnEnviarMensagem))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(18)
					.addComponent(btnEnviarMensagem)
					.addGap(18)
					.addComponent(tabbedPane, GroupLayout.PREFERRED_SIZE, 220, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(21, Short.MAX_VALUE))
		);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Recebidas", null, panel, null);
		panel.setLayout(new CardLayout(0, 0));
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Enviadas", null, panel_1, null);
		panel_1.setLayout(new CardLayout(0, 0));
		panel.add(new Caixa_Rec(),"cr");
		panel_1.add(new Caixa_Envio(),"ce");

		
		setLayout(groupLayout);

	}
}
