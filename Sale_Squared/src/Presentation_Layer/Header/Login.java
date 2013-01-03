package Presentation_Layer.Header;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JDialog;
import javax.swing.LayoutStyle.ComponentPlacement;

import org.jdesktop.swingx.JXButton;
import org.jdesktop.swingx.JXHyperlink;
import org.jdesktop.swingx.JXLabel;
import org.jdesktop.swingx.JXLoginPane;

import Presentation_Layer.Sale_Squared;
import Presentation_Layer.Home.Home;
import Presentation_Layer.Registo.Registo;

public class Login extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the dialog.
	 */
	public Login(final Sale_Squared root) {
		setTitle("Sale Squared - Entrar");
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setAlwaysOnTop(true);
		root.setEnabled(false);
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosed(WindowEvent arg0) {
				root.setEnabled(true);
			}
		});
		setResizable(false);
		setBounds(100, 100, 397, 294);
		
		JXLoginPane loginPane = new JXLoginPane();
		loginPane.setBannerText("Entrar");
		JXLabel lblNoPossuiConta = new JXLabel();
		lblNoPossuiConta.setText("N‹o possui conta?");
		
		JXHyperlink hprlnkRegistese = new JXHyperlink();
		hprlnkRegistese.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				root.setBody(new Registo(root),"Registo");
				root.setEnabled(true);
				dispose();
				
				
				
				
			}
		});
		hprlnkRegistese.setText("Registe-se!");
		
		JXButton btnEntrar = new JXButton();
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Sale_Squared.REGISTADO=true;
				root.reloadHeader();
				root.setBody(new Home(root), "Home");
				root.setEnabled(true);
				dispose();
			}
		});
		btnEntrar.setText("Entrar");
		
		JXButton btnCancelar = new JXButton();
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				root.setEnabled(true);
				dispose();
			}
		});
		btnCancelar.setText("Cancelar");
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(loginPane, GroupLayout.DEFAULT_SIZE, 397, Short.MAX_VALUE)
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap(117, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(btnEntrar, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnCancelar, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblNoPossuiConta, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(hprlnkRegistese, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addGap(86))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(loginPane, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNoPossuiConta, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
						.addComponent(hprlnkRegistese, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(btnEntrar, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnCancelar, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(14, Short.MAX_VALUE))
		);
		getContentPane().setLayout(groupLayout);
	}
}
