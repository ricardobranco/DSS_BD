package Presentation_Layer.Registo;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Set;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;

import Business_Layer.SaleSquared;
import Business_Layer.UtilizadorRegistado;
import Presentation_Layer.Sale_Squared;


public class Registo_1 extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public final Icon VALIDO = new ImageIcon(Registo_1.class.getResource("/Imagens/certo.png"));
	public final Icon INVALIDO = new ImageIcon(Registo_1.class.getResource("/Imagens/errado.png"));
	private JTextField email2;
	private JTextField email1;
	private JPasswordField pass2;
	private JPasswordField pass1;
	private JTextField username;
	private final JLabel label;
	
	/**
	 * Create the panel.
	 */
	public Registo_1(final Sale_Squared root) {

		
		JLabel lblNewLabel = new JLabel("1 - Dados Básicos");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		label = new JLabel("");
		label.setVisible(false);
		JButton btnNewButton = new JButton("Verificar Username");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean existe;
				String nome = username.getText();
				existe=root.getSistema().existeUtilizadorReg(nome);
				
				label.setVisible(true);
				
				if(existe || nome.equals(""))
					label.setIcon(INVALIDO);
				else
					label.setIcon(VALIDO);
					
			}
		});

		JSeparator separator = new JSeparator();
		
		JPanel panel = new JPanel();
		
	
		
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblNewLabel))
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(separator, GroupLayout.PREFERRED_SIZE, 977, Short.MAX_VALUE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(58)
							.addComponent(panel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(label)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnNewButton)
							.addPreferredGap(ComponentPlacement.RELATED, 384, Short.MAX_VALUE)))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(panel, GroupLayout.PREFERRED_SIZE, 197, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
							.addComponent(label)
							.addComponent(btnNewButton)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(separator, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		
		JLabel label_1 = new JLabel("Password");
		label_1.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		
		JLabel label_2 = new JLabel("Username");
		label_2.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		
		JLabel label_3 = new JLabel("Confirmar Password");
		label_3.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		
		JLabel label_4 = new JLabel("Email");
		label_4.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		
		JLabel label_5 = new JLabel("Confirmar Email");
		label_5.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		
		email2 = new JTextField();
		email2.setColumns(10);
		
		email1 = new JTextField();
		email1.setColumns(10);
		
		pass2 = new JPasswordField();
		pass2.setToolTipText("Min. 6 caracteres");
		
		pass1 = new JPasswordField();
		pass1.setToolTipText("Min. 6 caracteres");
			
		
		username = new JTextField();
		username.setColumns(10);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(label_2, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)
							.addGap(73)
							.addComponent(username, GroupLayout.PREFERRED_SIZE, 213, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(label_1, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
							.addComponent(pass1, GroupLayout.PREFERRED_SIZE, 213, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(label_3, GroupLayout.PREFERRED_SIZE, 136, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(pass2, GroupLayout.PREFERRED_SIZE, 213, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(label_4, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
							.addComponent(email1, GroupLayout.PREFERRED_SIZE, 213, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(label_5, GroupLayout.PREFERRED_SIZE, 136, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(email2, GroupLayout.PREFERRED_SIZE, 213, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(label_2)
						.addComponent(username, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(24)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_1)
						.addComponent(pass1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(6)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_3)
						.addComponent(pass2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_4)
						.addComponent(email1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(6)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_5)
						.addComponent(email2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		setLayout(groupLayout);

	}
	
	public String getUser(final Sale_Squared root) throws Exception{
		String susername = username.getText();
		if(root.getSistema().existeUtilizadorReg(susername)){
			label.setIcon(INVALIDO);
			throw new Exception("Já existe um utilizador com esse username");
		}
		else if(susername.isEmpty()){
			label.setIcon(INVALIDO);
			throw new Exception("Insira um username");
		}
		else if(susername.length()>15){
			label.setIcon(INVALIDO);
			throw new Exception("O username tem que ter no max. 8 caracteres");}
		else
			label.setIcon(VALIDO);

			return susername;
			
	}
	
	public String getPassword(final Sale_Squared root) throws Exception{
		if(!coincidePassword())
			throw new Exception("As passwords não são iguais");
		
			String pass = new String(pass1.getPassword());
			
			if(!root.getSistema().eValidaPassword(pass)){
				System.out.println(root.getSistema().eValidaPassword("password"));
				throw new Exception("Insira uma Password válida");}
			
			if(pass.isEmpty())
				throw new Exception("Insira uma password");
			return pass;
			
		}
	
	public String getEmail(final Sale_Squared root) throws Exception{
		if(!coincideEmail())
			throw new Exception("Os emails não são iguais");
		
			String email = email1.getText();
		
			if(email.isEmpty())
				throw new Exception("Insira um Email");
			
			
			SaleSquared sistema = root.getSistema();
			if(!sistema.eValidoEmail(email))
				throw new Exception("Insira um email válido");
				
			Set<UtilizadorRegistado> users = sistema.procurarUserMail(email);
			
			if(!users.isEmpty())
				throw new Exception("Já existe um utilizador com esse email");
			
			return email;
			}
	
	private boolean coincidePassword(){
		return Arrays.equals(pass1.getPassword(),pass2.getPassword());
	}
	
	private boolean coincideEmail(){
		return email1.getText().equals(email2.getText());
	}
	
	
}
