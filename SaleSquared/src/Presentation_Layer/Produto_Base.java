package Presentation_Layer;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.LayoutStyle.ComponentPlacement;

public class Produto_Base extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public Produto_Base(final Sale_Squared root, String titulo, boolean tpreco , float preco, boolean tulic, float ulic, String tempRest) {
		
		JButton button = new JButton("");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JPanel anuncio = new Anuncio();
				root.setBody(anuncio,"Nome do anuncio");
				
		
		
				
				
				
				
				
			}
		});
		button.setIcon(new ImageIcon(Produto_Base.class.getResource("/Imagens/Sem_Imagem.png")));
		
		JLabel lblNewLabel = new JLabel(titulo);
		Mouse_S2.mouseINOUT(lblNewLabel);
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		lblNewLabel.setForeground(new Color(0, 102, 204));
		JLabel lblMin = new JLabel("50");
		
		
		if(tulic)
			lblMin.setText("Û " + ulic);
		else
			lblMin.setVisible(false);
		
		JLabel label = new JLabel("100");
		
		if(tpreco)
			label.setText("Û "+ preco);
		else
			label.setVisible(false);
		
		label.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		
		JLabel label_1 = new JLabel(tempRest);
		label_1.setFont(new Font("Lucida Grande", Font.BOLD | Font.ITALIC, 13));
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(button)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblNewLabel, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 342, Short.MAX_VALUE)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(label_1)
							.addPreferredGap(ComponentPlacement.RELATED, 237, Short.MAX_VALUE)
							.addComponent(label))
						.addComponent(lblMin))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(button, GroupLayout.PREFERRED_SIZE, 79, GroupLayout.PREFERRED_SIZE)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblMin, GroupLayout.PREFERRED_SIZE, 9, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(label, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(label_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addGap(13))
		);
		setLayout(groupLayout);

	}
}
