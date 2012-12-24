package Interface;

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

public class Imagem_Panel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public Imagem_Panel() {
		
		JPanel panel = new Imagem_Label();
		
		Imagem_Label imagem_Label = new Imagem_Label();
		
		Imagem_Label imagem_Label_1 = new Imagem_Label();
		
		Imagem_Label imagem_Label_2 = new Imagem_Label();
		
		Imagem_Label imagem_Label_3 = new Imagem_Label();
		
		Imagem_Label imagem_Label_4 = new Imagem_Label();
		
		Imagem_Label imagem_Label_5 = new Imagem_Label();
		
		Imagem_Label imagem_Label_6 = new Imagem_Label();
		
		Imagem_Label imagem_Label_7 = new Imagem_Label();
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(panel, GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(imagem_Label, GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
							.addGap(12)
							.addComponent(imagem_Label_1, GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(imagem_Label_2, GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(imagem_Label_3, GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(imagem_Label_4, GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(imagem_Label_5, GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(imagem_Label_6, GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(imagem_Label_7, GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)))
					.addGap(5))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(imagem_Label_1, GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
						.addComponent(panel, GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
						.addComponent(imagem_Label, 0, 0, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(imagem_Label_2, GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
						.addComponent(imagem_Label_3, GroupLayout.PREFERRED_SIZE, 107, GroupLayout.PREFERRED_SIZE)
						.addComponent(imagem_Label_4, GroupLayout.PREFERRED_SIZE, 107, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(imagem_Label_6, GroupLayout.PREFERRED_SIZE, 107, GroupLayout.PREFERRED_SIZE)
						.addComponent(imagem_Label_5, GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
						.addComponent(imagem_Label_7, GroupLayout.PREFERRED_SIZE, 107, GroupLayout.PREFERRED_SIZE))
					.addGap(2))
		);
		setLayout(groupLayout);

	}
}
