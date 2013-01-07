package Presentation_Layer.Anuncio;

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
	public Descricao(String descricao) {

		JScrollPane scrollPane = new JScrollPane();
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(
				Alignment.LEADING).addGroup(
				groupLayout
						.createSequentialGroup()
						.addContainerGap()
						.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE,
								437, Short.MAX_VALUE).addGap(7)));
		groupLayout.setVerticalGroup(groupLayout.createParallelGroup(
				Alignment.LEADING).addGroup(
				groupLayout
						.createSequentialGroup()
						.addContainerGap()
						.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE,
								290, Short.MAX_VALUE).addGap(5)));

		JTextArea txtrCondioUtilizaoNovo = new JTextArea();
		txtrCondioUtilizaoNovo.setText(descricao);
                txtrCondioUtilizaoNovo.setLineWrap(true);
		txtrCondioUtilizaoNovo.setEditable(false);
		txtrCondioUtilizaoNovo.setBackground(UIManager
				.getColor("Button.background"));
		scrollPane.setViewportView(txtrCondioUtilizaoNovo);
		setLayout(groupLayout);

	}
        
        public void setDescricao(String descricao){
            
        }
}


