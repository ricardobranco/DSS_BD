package Presentation_Layer.Inserir;

import java.awt.CardLayout;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JPanel;
import javax.swing.LayoutStyle.ComponentPlacement;

public class Inserir_2 extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Inserir_Envio envio;
	private Inserir_Pagamento pagamento;
	/**
	 * Create the panel.
	 */
	public Inserir_2() {
		envio =  new Inserir_Envio();
		pagamento = new Inserir_Pagamento();
		JPanel panel = new JPanel();

		JPanel panel_1 = new JPanel();
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(
				Alignment.TRAILING).addGroup(
				Alignment.LEADING,
				groupLayout
						.createSequentialGroup()
						.addGap(6)
						.addGroup(
								groupLayout
										.createParallelGroup(Alignment.LEADING)
										.addComponent(panel,
												Alignment.TRAILING,
												GroupLayout.DEFAULT_SIZE, 438,
												Short.MAX_VALUE)
										.addComponent(panel_1,
												Alignment.TRAILING,
												GroupLayout.DEFAULT_SIZE, 438,
												Short.MAX_VALUE))
						.addContainerGap()));
		groupLayout.setVerticalGroup(groupLayout.createParallelGroup(
				Alignment.LEADING).addGroup(
				groupLayout
						.createSequentialGroup()
						.addContainerGap()
						.addComponent(panel, GroupLayout.PREFERRED_SIZE, 294,
								GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 136,
								GroupLayout.PREFERRED_SIZE)
						.addContainerGap(GroupLayout.DEFAULT_SIZE,
								Short.MAX_VALUE)));
		panel_1.setLayout(new CardLayout(0, 0));
		panel.setLayout(new CardLayout(0, 0));
		panel.add(envio, "Envio");
		panel_1.add(pagamento, "Pagamento");
		setLayout(groupLayout);

	}
	
	public Inserir_Envio getEnvio(){
		return envio;
	}
	public Inserir_Pagamento getPagamentos(){
		return pagamento;
	}
	
	

}
