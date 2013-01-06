package Presentation_Layer.Registo;

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.UIManager;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JSeparator;

public class Registo_4 extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	
	JTextArea textArea;
	
	public Registo_4() {
		
		JLabel lblSobre = new JLabel("4 - Sobre Mim");
		lblSobre.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		
		textArea = new JTextArea();
		textArea.setLineWrap(true);
		textArea.setBorder(UIManager.getBorder("TextField.border"));
		
		JSeparator separator = new JSeparator();
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
							.addGroup(groupLayout.createSequentialGroup()
								.addContainerGap()
								.addComponent(lblSobre))
							.addGroup(groupLayout.createSequentialGroup()
								.addContainerGap(69, Short.MAX_VALUE)
								.addComponent(textArea, GroupLayout.PREFERRED_SIZE, 375, GroupLayout.PREFERRED_SIZE)))
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(separator, GroupLayout.DEFAULT_SIZE, 438, Short.MAX_VALUE)))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblSobre)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(textArea, GroupLayout.PREFERRED_SIZE, 241, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(separator, GroupLayout.PREFERRED_SIZE, 9, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(20, Short.MAX_VALUE))
		);
		setLayout(groupLayout);

	}
	
	public String getInfo(){
		return textArea.getSelectedText();
	}
}
