package Presentation_Layer.Negocio;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class Imagem_Label extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public Imagem_Label() {

		JButton button = new JButton("");
		button.setIcon(new ImageIcon(Imagem_Label.class
				.getResource("/Imagens/Sem_Imagem.png")));
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(
				Alignment.LEADING).addGroup(
				groupLayout
						.createSequentialGroup()
						.addContainerGap()
						.addComponent(button, GroupLayout.DEFAULT_SIZE, 414,
								Short.MAX_VALUE).addGap(9)));
		groupLayout.setVerticalGroup(groupLayout.createParallelGroup(
				Alignment.LEADING).addGroup(
				groupLayout
						.createSequentialGroup()
						.addContainerGap()
						.addComponent(button, GroupLayout.DEFAULT_SIZE, 348,
								Short.MAX_VALUE).addGap(9)));
		setLayout(groupLayout);

	}

}
