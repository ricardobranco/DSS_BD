package Presentation_Layer.Registo;

import java.awt.CardLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.GregorianCalendar;
import java.util.Map;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.LayoutStyle.ComponentPlacement;

import Business_Layer.Categoria;
import Business_Layer.Imagem;
import Business_Layer.SaleSquared;
import Business_Layer.UtilizadorRegistado;
import Presentation_Layer.Sale_Squared;
import Presentation_Layer.Componentes.Mensagem_Erro;
import Presentation_Layer.Home.Home;

public class Registo extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	

	/**
	 * Create the panel.
	 */

	public Registo(final Sale_Squared root) {
	
		
		final Registo_1 r1 = new Registo_1(root);
		final Registo_2 r2 = new Registo_2();
		final Registo_3 r3 = new Registo_3();
		final Registo_4 r4 = new Registo_4();
		final Registo_Final rf = new Registo_Final(root);
		
		JLabel lblNewLabel = new JLabel("Registo");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.BOLD, 20));
		final JButton btnNewButton = new JButton("Concluir");
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				try {
						
						int id = root.getSistema().getEmSessao().getId();
						String username = r1.getUser(root);
						String password = r1.getPassword(root);
						String email = r1.getEmail(root);
						char estado = UtilizadorRegistado.NORMAL;
						String nome = r2.getNome();
						String pais = r2.getPais();
						String morada = r2.getMorada();
						String codPostal = r2.getCodigoPostal();
						String localidade = r2.getLocalidade();
						String contacto = r2.getContacto() + "";

						String infPessoal = r4.getInfo();
						if(infPessoal==null)
							infPessoal = "";
						
						Imagem imagem = new Imagem("Avatar" + id, r2
								.getAvatar());
						GregorianCalendar dn = r2.getDataNascimento();

						UtilizadorRegistado ur = new UtilizadorRegistado(id, username, password,
								estado, email, morada, codPostal, localidade,
								pais, infPessoal, imagem, contacto, nome, dn);
						
						rf.termosaceites();
						
						SaleSquared sistema = root.getSistema();
						sistema.inserirUtilizadorReg(ur);
						
						Map<String,Categoria> categorias = r3.getCategorias();
						for(Categoria c : categorias.values())
							ur.inserirCategSeguida(c);
						
						sistema.setEmSessao(ur);
						Sale_Squared.REGISTADO = true;
						root.reloadHeader();
						root.setBody(new Home(root), ur.getUsername());
						}
				
				catch (Exception e) {
					e.printStackTrace();
					new Mensagem_Erro(root, e.getMessage()).setVisible(true);
				}

			}
		});
		
		JPanel panel = new JPanel();
		
		JPanel panel_1 = new JPanel();
		
		JPanel panel_2 = new JPanel();
		
		JPanel panel_3 = new JPanel();
		
		JPanel panel_4 = new JPanel();

		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblNewLabel)
							.addGap(19))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(98)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(panel_1, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 502, Short.MAX_VALUE)
								.addComponent(panel, GroupLayout.DEFAULT_SIZE, 502, Short.MAX_VALUE)
								.addComponent(panel_2, GroupLayout.DEFAULT_SIZE, 502, Short.MAX_VALUE)
								.addComponent(panel_3, GroupLayout.DEFAULT_SIZE, 502, Short.MAX_VALUE)
								.addComponent(panel_4, GroupLayout.DEFAULT_SIZE, 502, Short.MAX_VALUE)))
						.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
							.addContainerGap(503, Short.MAX_VALUE)
							.addComponent(btnNewButton)))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel, GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_2, GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_3, GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_4, GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnNewButton)
					.addGap(59))
		);
		panel_4.setLayout(new CardLayout(0, 0));
		panel_3.setLayout(new CardLayout(0, 0));
		panel_2.setLayout(new CardLayout(0, 0));
		panel_1.setLayout(new CardLayout(0, 0));
		panel.setLayout(new CardLayout(0, 0));
		
		panel.add(r1,"r1");
		panel_1.add(r2,"r2");
		panel_2.add(r3,"r3");
		panel_3.add(r4,"r3");
		panel_4.add(rf,"rf");
		
		setLayout(groupLayout);

	}
}
