package Presentation_Layer.Mensagens;

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.UIManager;
import org.jdesktop.swingx.JXHyperlink;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Ler_mensagem extends JPanel {

	/**
	 * Create the panel.
	 */
	public Ler_mensagem() {
		
		JScrollPane scrollPane = new JScrollPane();
		
		JButton btnApagarMensagem = new JButton("Apagar Mensagem");
		
		JLabel lblAssunto = new JLabel("Assunto:");
		
		JLabel lblDe = new JLabel("De:");
		
		JButton btnResponder = new JButton("Responder");
		 
		JLabel lblNewLabel_1 = new JLabel("New label");
		
		JXHyperlink hprlnkGregs = new JXHyperlink();
		hprlnkGregs.setUnclickedColor(new Color(0, 102, 204));
		hprlnkGregs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		hprlnkGregs.setText("gregs");
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(19)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(btnResponder)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnApagarMensagem))
						.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 421, Short.MAX_VALUE)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(lblAssunto)
								.addComponent(lblDe))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(hprlnkGregs, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_1))))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(39)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblDe)
						.addComponent(hprlnkGregs, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE))
					.addGap(9)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblAssunto)
						.addComponent(lblNewLabel_1))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 151, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnResponder)
						.addComponent(btnApagarMensagem))
					.addGap(29))
		);
		
		JTextArea textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setBorder(UIManager.getBorder("TextField.border"));
		textArea.setLineWrap(true);
		scrollPane.setViewportView(textArea);
		setLayout(groupLayout);

	}
}
