package Presentation_Layer;

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.CardLayout;
import javax.swing.JSeparator;

public class Resultados_Panel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public Resultados_Panel(final Sale_Squared root) {
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Relev\u00E2ncia", "Mais Recentes", "A fechar", "Pre\u00E7o: Mais baixo", "Pre\u00E7o: Mais alto", "Pre\u00E7o + portes: Mais baixo", "Pre\u00E7o + portes: Mais alto"}));
		
		JPanel panel = new JPanel();
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(listaPagina(10)));
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(panel, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(comboBox, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 174, GroupLayout.PREFERRED_SIZE)
						.addComponent(comboBox_1, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel, GroupLayout.DEFAULT_SIZE, 1428, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(8))
		);
		
		JPanel panel_1 = new JPanel();
		
		JSeparator separator = new JSeparator();
		
		JPanel panel_2 = new JPanel();
		
		JSeparator separator_1 = new JSeparator();
		
		JPanel panel_3 = new JPanel();
		
		JSeparator separator_2 = new JSeparator();
		
		JPanel panel_4 = new JPanel();
		
		JSeparator separator_3 = new JSeparator();
		
		JPanel panel_5 = new JPanel();
		
		JSeparator separator_4 = new JSeparator();
		
		JPanel panel_6 = new JPanel();
		
		JSeparator separator_5 = new JSeparator();
		
		JPanel panel_7 = new JPanel();
		
		JSeparator separator_6 = new JSeparator();
		
		JPanel panel_8 = new JPanel();
		
		JSeparator separator_7 = new JSeparator();
		
		JPanel panel_9 = new JPanel();
		
		JSeparator separator_8 = new JSeparator();
		
		JPanel panel_10 = new JPanel();
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
						.addComponent(panel_2, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 648, Short.MAX_VALUE)
						.addComponent(separator_2, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 648, Short.MAX_VALUE)
						.addComponent(separator_1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 648, Short.MAX_VALUE)
						.addComponent(separator, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 648, Short.MAX_VALUE)
						.addComponent(panel_1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 648, Short.MAX_VALUE)
						.addComponent(panel_3, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 648, Short.MAX_VALUE)
						.addComponent(panel_4, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 648, Short.MAX_VALUE)
						.addComponent(separator_3, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 648, Short.MAX_VALUE)
						.addComponent(panel_5, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 648, Short.MAX_VALUE)
						.addComponent(separator_4, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 648, Short.MAX_VALUE)
						.addComponent(panel_6, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 648, Short.MAX_VALUE)
						.addComponent(separator_5, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 648, Short.MAX_VALUE)
						.addComponent(panel_7, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 648, Short.MAX_VALUE)
						.addComponent(separator_6, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 648, Short.MAX_VALUE)
						.addComponent(panel_8, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 648, Short.MAX_VALUE)
						.addComponent(separator_7, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 648, Short.MAX_VALUE)
						.addComponent(panel_9, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 648, Short.MAX_VALUE)
						.addComponent(separator_8, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 648, Short.MAX_VALUE)
						.addComponent(panel_10, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 648, Short.MAX_VALUE))
					.addContainerGap())
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(separator, GroupLayout.DEFAULT_SIZE, 13, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(separator_1, GroupLayout.DEFAULT_SIZE, 13, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_3, GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(separator_2, GroupLayout.DEFAULT_SIZE, 13, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_4, GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(separator_3, GroupLayout.DEFAULT_SIZE, 13, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_5, GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(separator_4, GroupLayout.DEFAULT_SIZE, 13, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_6, GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(separator_5, GroupLayout.DEFAULT_SIZE, 13, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_7, GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(separator_6, GroupLayout.DEFAULT_SIZE, 13, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_8, GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(separator_7, GroupLayout.DEFAULT_SIZE, 13, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_9, GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(separator_8, GroupLayout.DEFAULT_SIZE, 15, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_10, GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
					.addContainerGap())
		);
		panel_2.setLayout(new CardLayout(0, 0));
		panel_2.add(new Resultado_Label(root),"Resultado 2");
		panel_7.setLayout(new CardLayout(0, 0));
		panel_7.add(new Resultado_Label(root),"Resultado 7");
		panel_9.setLayout(new CardLayout(0, 0));
		panel_9.add(new Resultado_Label(root),"Resultado 9");
		panel_6.setLayout(new CardLayout(0, 0));
		panel_6.add(new Resultado_Label(root),"Resultado 6");
		panel_5.setLayout(new CardLayout(0, 0));
		panel_5.add(new Resultado_Label(root),"Resultado 5");
		panel_10.setLayout(new CardLayout(0, 0));
		panel_10.add(new Resultado_Label(root),"Resultado 10");
		panel_8.setLayout(new CardLayout(0, 0));
		panel_8.add(new Resultado_Label(root),"Resultado 8");
		panel_3.setLayout(new CardLayout(0, 0));
		panel_3.add(new Resultado_Label(root),"Resultado 3");
		panel_4.setLayout(new CardLayout(0, 0));
		panel_4.add(new Resultado_Label(root),"Resultado 4");
		panel_1.setLayout(new CardLayout(0, 0));
		panel_1.add(new Resultado_Label(root),"Resultado 1");
		panel.setLayout(gl_panel);
		setLayout(groupLayout);

	}
	
	private String[] listaPagina(final int n){
		String[] res = new String[n];
		for(int i = 1; i <= n;i++)
			res[i-1] = ""+i;
		return res;
	}
}
