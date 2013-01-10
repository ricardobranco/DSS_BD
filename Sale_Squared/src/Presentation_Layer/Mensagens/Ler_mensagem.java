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

import Business_Layer.Mensagem;
import Presentation_Layer.Sale_Squared;
import Presentation_Layer.Perfil.Perfil;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Ler_mensagem extends JPanel {
	private JXHyperlink from;
	private JLabel assunto;
	private JTextArea body;

	/**
	 * Create the panel.
	 */
	public Ler_mensagem(final Sale_Squared root, final Mensagem msg) {
		
		JScrollPane scrollPane = new JScrollPane();
		
		JButton btnApagarMensagem = new JButton("Apagar Mensagem");
		btnApagarMensagem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				root.getSistema().apagarMensagemRecebida(Sale_Squared.UTILIZADOR, msg.getId());
				root.setBody(new Mensagem_Main(root), "Caixa de Mensagens");
			}
		});
		
		JLabel lblAssunto = new JLabel("Assunto:");
		
		JLabel lblDe = new JLabel("De:");
		
		JButton btnResponder = new JButton("Responder");
		btnResponder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				root.setBody(new Enviar_Mensagem(root,msg.getEmissor().getUsername(),"Resposta: "+msg.getAssunto(),""), "Responder mensagem");
			}
		});
		 
		assunto = new JLabel(msg.getAssunto());
		
		from = new JXHyperlink();
		from.setUnclickedColor(new Color(0, 102, 204));
		from.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				root.setBody(new Perfil(root, msg.getEmissor()), msg.getEmissor().getUsername());
			}
		});
		from.setText(msg.getEmissor().getUsername());
		
		JButton btnReencaminhar = new JButton("Reencaminhar");
		btnReencaminhar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				root.setBody(new Enviar_Mensagem(root,"",msg.getAssunto(),""), "Reencaminhar mensagem");

				
			}
		});
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addGap(19)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(btnResponder)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnReencaminhar)
							.addPreferredGap(ComponentPlacement.RELATED, 108, Short.MAX_VALUE)
							.addComponent(btnApagarMensagem))
						.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 421, Short.MAX_VALUE)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(lblAssunto)
								.addComponent(lblDe))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(from, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(assunto))))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblDe)
						.addComponent(from, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE))
					.addGap(9)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblAssunto)
						.addComponent(assunto))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 151, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnResponder)
						.addComponent(btnReencaminhar)
						.addComponent(btnApagarMensagem))
					.addContainerGap(57, Short.MAX_VALUE))
		);
		
		body = new JTextArea();
		body.setEditable(false);
		body.setBorder(UIManager.getBorder("TextField.border"));
		body.setLineWrap(true);
		scrollPane.setViewportView(body);
		setLayout(groupLayout);

	}
}
