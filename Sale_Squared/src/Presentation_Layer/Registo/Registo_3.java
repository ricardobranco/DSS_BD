package Presentation_Layer.Registo;

import java.awt.Font;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.LayoutStyle.ComponentPlacement;

import business_Layer.Categoria;


public class Registo_3 extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	private List<JCheckBox> categorias;
	
	
	public Registo_3() {

		categorias = new ArrayList<>();
		
		JLabel lblNewLabel = new JLabel("3 - Favoritos");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.BOLD, 15));

		JCheckBox chckbxNewCheckBox = new JCheckBox("Moda");
		categorias.add(chckbxNewCheckBox);
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Casa e Jardim");
		categorias.add(chckbxNewCheckBox_1);

		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("Auto");
		categorias.add(chckbxNewCheckBox_2);

		JCheckBox chckbxNewCheckBox_3 = new JCheckBox(
				"Coleccionáveis e Arte");

		categorias.add(chckbxNewCheckBox_3);

		JCheckBox chckbxNewCheckBox_4 = new JCheckBox(
				"Tecnologia e Electrónica");

		categorias.add(chckbxNewCheckBox_4);

		JCheckBox chckbxNewCheckBox_5 = new JCheckBox("Saúde");
		categorias.add(chckbxNewCheckBox_5);

		JSeparator separator = new JSeparator();
		
		JCheckBox chckbxNewCheckBox_6 = new JCheckBox("Livros e Revistas");
		categorias.add(chckbxNewCheckBox_6);

		JCheckBox chckbxDesportoEEntretenimento = new JCheckBox("Desporto e Entretenimento");
		categorias.add(chckbxDesportoEEntretenimento);

		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblNewLabel))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(105)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(chckbxNewCheckBox_1)
								.addComponent(chckbxNewCheckBox)
								.addComponent(chckbxNewCheckBox_2))
							.addGap(53)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(chckbxNewCheckBox_3)
										.addComponent(chckbxNewCheckBox_4))
									.addGap(26)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(chckbxNewCheckBox_5)
										.addComponent(chckbxNewCheckBox_6)))
								.addComponent(chckbxDesportoEEntretenimento)))
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(separator, GroupLayout.PREFERRED_SIZE, 645, Short.MAX_VALUE)))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel)
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(chckbxNewCheckBox_3)
						.addComponent(chckbxNewCheckBox_6)
						.addComponent(chckbxNewCheckBox))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(chckbxNewCheckBox_4)
						.addComponent(chckbxNewCheckBox_1)
						.addComponent(chckbxNewCheckBox_5))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(chckbxNewCheckBox_2)
						.addComponent(chckbxDesportoEEntretenimento))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(separator, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(134, Short.MAX_VALUE))
		);
		setLayout(groupLayout);

	}
	
	
	public Map<String,Categoria> getCategorias(){
		Map<String,Categoria> res = new  HashMap<>();
		for(JCheckBox jcb : categorias){
			Categoria c = new Categoria(jcb.getText());
			res.put(c.getNome(),c);
		}
		return res;
	}
	
	
	
}
