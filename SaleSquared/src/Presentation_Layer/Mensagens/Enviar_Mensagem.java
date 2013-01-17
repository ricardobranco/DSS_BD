package Presentation_Layer.Mensagens;

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.UIManager;
import org.jdesktop.swingx.JXTextArea;

import Presentation_Layer.Sale_Squared;

public class Enviar_Mensagem extends JPanel {
	private JTextField para;
	private JTextField assunto;
	private JXTextArea corpo;
	private Sale_Squared root;

	/**
	 * Create the panel.
	 */
	public Enviar_Mensagem(final Sale_Squared root, String to, String sub,
			String bdy) {
		this.root = root;
		JButton btnviar = new JButton("Enviar");

		JLabel lblNewLabel = new JLabel("Para:");

		JLabel lblAssunto = new JLabel("Assunto:");

		para = new JTextField();
		para.setColumns(10);
		para.setText(to);

		assunto = new JTextField();
		assunto.setColumns(10);
		assunto.setText(sub);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setViewportBorder(UIManager.getBorder("TextField.border"));
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout
				.setHorizontalGroup(groupLayout
						.createParallelGroup(Alignment.TRAILING)
						.addGroup(
								groupLayout
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												groupLayout
														.createParallelGroup(
																Alignment.LEADING)
														.addGroup(
																groupLayout
																		.createSequentialGroup()
																		.addComponent(
																				lblNewLabel)
																		.addGap(21)
																		.addComponent(
																				para,
																				GroupLayout.DEFAULT_SIZE,
																				383,
																				Short.MAX_VALUE))
														.addGroup(
																groupLayout
																		.createSequentialGroup()
																		.addComponent(
																				lblAssunto)
																		.addPreferredGap(
																				ComponentPlacement.RELATED)
																		.addComponent(
																				assunto,
																				GroupLayout.DEFAULT_SIZE,
																				383,
																				Short.MAX_VALUE))
														.addComponent(
																scrollPane,
																Alignment.TRAILING,
																GroupLayout.DEFAULT_SIZE,
																430,
																Short.MAX_VALUE)
														.addComponent(
																btnviar,
																Alignment.TRAILING))
										.addContainerGap()));
		groupLayout
				.setVerticalGroup(groupLayout
						.createParallelGroup(Alignment.TRAILING)
						.addGroup(
								groupLayout
										.createSequentialGroup()
										.addGap(18)
										.addGroup(
												groupLayout
														.createParallelGroup(
																Alignment.BASELINE)
														.addComponent(
																lblNewLabel)
														.addComponent(
																para,
																GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE,
																GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(
												ComponentPlacement.UNRELATED)
										.addGroup(
												groupLayout
														.createParallelGroup(
																Alignment.BASELINE)
														.addComponent(
																lblAssunto)
														.addComponent(
																assunto,
																GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE,
																GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(
												ComponentPlacement.UNRELATED)
										.addComponent(scrollPane,
												GroupLayout.DEFAULT_SIZE, 175,
												Short.MAX_VALUE).addGap(18)
										.addComponent(btnviar).addGap(4)));

		corpo = new JXTextArea();
		corpo.setBackground(new Color(255, 255, 255));
		corpo.setText(bdy);
		scrollPane.setViewportView(corpo);
		setLayout(groupLayout);

	}

	public String getUsername() throws Exception {
		String susername = para.getText();
		if (susername.isEmpty())
			throw new Exception("Insira um destinatário");
		if (!root.getSistema().existeUtilizadorReg(susername))
			throw new Exception(
					"Não existe nenhum utilizador registado com esse username");
		return susername;
	}

	public String getAssunto() throws Exception {
		String sassunto = para.getText();
		if (sassunto.isEmpty())
			throw new Exception("Insira um assunto");
		return sassunto;
	}

	public String getCorpo() {
		String scorpo = corpo.getText();
		return scorpo.isEmpty() ? "" : scorpo;
	}

}
