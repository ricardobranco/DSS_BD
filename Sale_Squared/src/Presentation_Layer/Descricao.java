package Presentation_Layer;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.UIManager;

public class Descricao extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public Descricao() {
		
		JScrollPane scrollPane = new JScrollPane();
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 437, Short.MAX_VALUE)
					.addGap(7))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
					.addGap(5))
		);
		
		JTextArea txtrCondioUtilizaoNovo = new JTextArea();
		txtrCondioUtilizaoNovo.setText("Condi\u00E7\u00E3o utiliza\u00E7\u00E3o: Novo\nFormato: Monobloco\nModelo: n\u00BA 5 Dual Sim Java\nFun\u00E7\u00F5es gerais: Alerta Vibra\u00E7\u00E3o, Cart\u00E3o de mem\u00F3ria, Instant Messaging,\nSMS, Touch Screen\nFun\u00E7\u00F5es Multim\u00E9dia: C\u00E2mara, Edi\u00E7\u00E3o de fotos/v\u00EDdeo, Leitor MP3, \nMedia Player, R\u00E1dio, Toques, Toques MP3\nConectividade: Bluetooth\n\nCor: PRETO / BRANCO\n\nAno de compra: 2011-2012\n\nGarantia: Com garantia\n\nSe n\u00E3o ficar contente devolvemos o seu dinheiro\n\nEntrega em m\u00E3o na zona norte do pa\u00EDs\n");
		txtrCondioUtilizaoNovo.setLineWrap(true);
		txtrCondioUtilizaoNovo.setEditable(false);
		txtrCondioUtilizaoNovo.setBackground(UIManager.getColor("Button.background"));
		scrollPane.setViewportView(txtrCondioUtilizaoNovo);
		setLayout(groupLayout);

	}
}
