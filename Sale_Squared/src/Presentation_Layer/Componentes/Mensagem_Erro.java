package Presentation_Layer.Componentes;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JDialog;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;

import org.jdesktop.swingx.JXButton;
import org.jdesktop.swingx.JXLabel;

import Presentation_Layer.Sale_Squared;

public class Mensagem_Erro extends JDialog {

	/**
	 * Launch the application.
	 */

	/**
	 * Create the dialog.
	 */
	public Mensagem_Erro(final Sale_Squared root, String mensagem) {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				root.setEnabled(true);

			}
		});
		setResizable(false);
		setAlwaysOnTop(true);
		setBounds(100, 100, 336, 143);
		root.setEnabled(false);
		JXLabel lblMensagemDeErro = new JXLabel();
		lblMensagemDeErro.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		lblMensagemDeErro.setForeground(new Color(255, 0, 51));
		lblMensagemDeErro.setHorizontalAlignment(SwingConstants.CENTER);
		lblMensagemDeErro.setText(mensagem);
		
		JXButton btnVoltar = new JXButton();
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				root.setEnabled(true);
				dispose();
			}
		});
		btnVoltar.setText("Voltar");
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblMensagemDeErro, GroupLayout.DEFAULT_SIZE, 324, Short.MAX_VALUE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(125)
							.addComponent(btnVoltar, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(18)
					.addComponent(lblMensagemDeErro, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnVoltar, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(34, Short.MAX_VALUE))
		);
		getContentPane().setLayout(groupLayout);

	}
}
