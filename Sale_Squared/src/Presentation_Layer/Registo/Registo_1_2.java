package Presentation_Layer.Registo;

import java.awt.CardLayout;
import java.util.HashMap;
import java.util.Map;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JPanel;
import javax.swing.LayoutStyle.ComponentPlacement;

import Presentation_Layer.Sale_Squared;
import Presentation_Layer.Componentes.Mensagem_Erro;

public class Registo_1_2 extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static final int DADOSBASE = 1;
	public static final int DADOSPESSOAIS = 2;

	private Map<Integer,JPanel> jpanels;
	/**
	 * Create the panel.
	 */
	public Registo_1_2(final Sale_Squared root) {

		jpanels = new HashMap<>();
		JPanel panel = new JPanel();
		jpanels.put(new Integer(DADOSBASE),new Registo_1(root));
		jpanels.put(new Integer(DADOSPESSOAIS),new Registo_2());
		

		JPanel panel_1 = new JPanel();
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(panel, GroupLayout.PREFERRED_SIZE, 616, Short.MAX_VALUE)
						.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 983, Short.MAX_VALUE))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 511, Short.MAX_VALUE)
					.addGap(6))
		);
		panel_1.setLayout(new CardLayout(0, 0));
		panel.setLayout(new CardLayout(0, 0));
		panel.add(jpanels.get(new Integer(DADOSBASE)), "Dados Base");
		panel_1.add(jpanels.get(new Integer(DADOSPESSOAIS)), "Dados Pessoais");
		setLayout(groupLayout);

	}
	
	public JPanel get(int key){
		return jpanels.get(new Integer(key));
		}
	
	

}
