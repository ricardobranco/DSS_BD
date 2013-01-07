package Presentation_Layer.Registo;

import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.filechooser.FileNameExtensionFilter;

import Presentation_Layer.Componentes.Avatar;

public class Registo_2 extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField nome;
	private JTextField morada;
	private JTextField codPostal1;
	private JTextField codPostal2;
	private JTextField localidade;
	private JTextField contacto;
	private boolean avatar_s2;
	private JComboBox<?> paises;
	private com.toedter.calendar.JDateChooser datanascimento;
	private Avatar avatar;
	private String avatarurl;

	/**
	 * Create the panel.
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public Registo_2() {
		
		avatar_s2 = true;
		JLabel lblNewLabel = new JLabel("2 - Dados Pessoais");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.BOLD, 15));

		JLabel lblNewLabel_1 = new JLabel("Nome");
		lblNewLabel_1.setFont(new Font("Lucida Grande", Font.BOLD, 13));

		nome = new JTextField();
		nome.setColumns(10);

		JLabel lblNewLabel_2 = new JLabel("Pa\u00EDs");
		lblNewLabel_2.setFont(new Font("Lucida Grande", Font.BOLD, 13));

		paises = new JComboBox();
		paises.setModel(new DefaultComboBoxModel(new String[] { "Afeganistão",
				"África do Sul", "Akrotiri", "Albânia", "Alemanha", "Andorra",
				"Angola", "Anguila", "Antárctida", "Antígua e Barbuda",
				"Antilhas Neerlandesas", "Arábia Saudita", "Arctic Ocean",
				"Argélia", "Argentina", "Arménia", "Aruba",
				"Ashmore and Cartier Islands", "Atlantic Ocean", "Austrália",
				"Áustria", "Azerbaijão", "Baamas", "Bangladeche", "Barbados",
				"Barém", "Bélgica", "Belize", "Benim", "Bermudas",
				"Bielorrússia", "Birmânia", "Bolívia", "Bósnia e Herzegovina",
				"Botsuana", "Brasil", "Brunei", "Bulgária", "Burquina Faso",
				"Burúndi", "Butão", "Cabo Verde", "Camarões", "Camboja",
				"Canadá", "Catar", "Cazaquistão", "Chade", "Chile", "China",
				"Chipre", "Clipperton Island", "Colômbia", "Comores",
				"Congo-Brazzaville", "Congo-Kinshasa", "Coral Sea Islands",
				"Coreia do Norte", "Coreia do Sul", "Costa do Marfim",
				"Costa Rica", "Croácia", "Cuba", "Dhekelia", "Dinamarca",
				"Domínica", "Egipto", "Emiratos Árabes Unidos", "Equador",
				"Eritreia", "Eslováquia", "Eslovénia", "Espanha",
				"Estados Unidos", "Estónia", "Etiópia", "Faroé", "Fiji",
				"Filipinas", "Finlândia", "França", "Gabão", "Gâmbia", "Gana",
				"Gaza Strip", "Geórgia", "Geórgia do Sul e Sandwich do Sul",
				"Gibraltar", "Granada", "Grécia", "Gronelândia", "Guame",
				"Guatemala", "Guernsey", "Guiana", "Guiné", "Guiné Equatorial",
				"Guiné-Bissau", "Haiti", "Honduras", "Hong Kong", "Hungria",
				"Iémen", "Ilha Bouvet", "Ilha do Natal", "Ilha Norfolk",
				"Ilhas Caimão", "Ilhas Cook", "Ilhas dos Cocos",
				"Ilhas Falkland", "Ilhas Heard e McDonald", "Ilhas Marshall",
				"Ilhas Salomão", "Ilhas Turcas e Caicos",
				"Ilhas Virgens Americanas", "Ilhas Virgens Britânicas",
				"Índia", "Indian Ocean", "Indonésia", "Irão", "Iraque",
				"Irlanda", "Islândia", "Israel", "Itália", "Jamaica",
				"Jan Mayen", "Japão", "Jersey", "Jibuti", "Jordânia", "Kuwait",
				"Laos", "Lesoto", "Letónia", "Líbano", "Libéria", "Líbia",
				"Listenstaine", "Lituânia", "Luxemburgo", "Macau", "Macedónia",
				"Madagáscar", "Malásia", "Malávi", "Maldivas", "Mali", "Malta",
				"Man, Isle of", "Marianas do Norte", "Marrocos", "Maurícia",
				"Mauritânia", "Mayotte", "México", "Micronésia", "Moçambique",
				"Moldávia", "Mónaco", "Mongólia", "Monserrate", "Montenegro",
				"Mundo", "Namíbia", "Nauru", "Navassa Island", "Nepal",
				"Nicarágua", "Níger", "Nigéria", "Niue", "Noruega",
				"Nova Caledónia", "Nova Zelândia", "Omã", "Pacific Ocean",
				"Países Baixos", "Palau", "Panamá", "Papua-Nova Guiné",
				"Paquistão", "Paracel Islands", "Paraguai", "Peru", "Pitcairn",
				"Polinésia Francesa", "Polónia", "Porto Rico", "Portugal",
				"Quénia", "Quirguizistão", "Quiribáti", "Reino Unido",
				"República Centro-Africana", "República Checa",
				"República Dominicana", "Roménia", "Ruanda", "Rússia",
				"Salvador", "Samoa", "Samoa Americana", "Santa Helena",
				"Santa Lúcia", "São Cristóvão e Neves", "São Marinho",
				"São Pedro e Miquelon", "São Tomé e Príncipe",
				"São Vicente e Granadinas", "Sara Ocidental", "Seicheles",
				"Senegal", "Serra Leoa", "Sérvia", "Singapura", "Síria",
				"Somália", "Southern Ocean", "Spratly Islands", "Sri Lanca",
				"Suazilândia", "Sudão", "Suécia", "Suíça", "Suriname",
				"Svalbard e Jan Mayen", "Tailândia", "Taiwan", "Tajiquistão",
				"Tanzânia", "Território Britânico do Oceano Índico",
				"Territórios Austrais Franceses", "Timor Leste", "Togo",
				"Tokelau", "Tonga", "Trindade e Tobago", "Tunísia",
				"Turquemenistão", "Turquia", "Tuvalu", "Ucrânia", "Uganda",
				"União Europeia", "Uruguai", "Usbequistão", "Vanuatu",
				"Vaticano", "Venezuela", "Vietname", "Wake Island",
				"Wallis e Futuna", "West Bank", "Zâmbia", "Zimbabué" }));

		JLabel lblNewLabel_3 = new JLabel("Morada");
		lblNewLabel_3.setFont(new Font("Lucida Grande", Font.BOLD, 13));

		morada = new JTextField();
		morada.setColumns(10);

		JLabel lblNewLabel_4 = new JLabel("C\u00F3digo Postal");
		lblNewLabel_4.setFont(new Font("Lucida Grande", Font.BOLD, 13));

		codPostal1 = new JTextField();
		codPostal1.setColumns(10);

		JLabel lblNewLabel_5 = new JLabel("-");

		codPostal2 = new JTextField();
		codPostal2.setColumns(10);

		JLabel lblNewLabel_6 = new JLabel("Localidade");
		lblNewLabel_6.setFont(new Font("Lucida Grande", Font.BOLD, 13));

		localidade = new JTextField();
		localidade.setColumns(10);

		JLabel lblNewLabel_7 = new JLabel("Contacto");
		lblNewLabel_7.setFont(new Font("Lucida Grande", Font.BOLD, 13));

		contacto = new JTextField();
		contacto.setColumns(10);

		JLabel lblNewLabel_8 = new JLabel("Data de Nascimento");
		lblNewLabel_8.setFont(new Font("Lucida Grande", Font.BOLD, 13));

		datanascimento = new com.toedter.calendar.JDateChooser();
		datanascimento.setDateFormatString("dd/MM/yyyy");
		datanascimento.setDate(new Date());
		GregorianCalendar gc = new GregorianCalendar();
		Calendar max = Calendar.getInstance();
		max.set(Calendar.YEAR, gc.get(GregorianCalendar.YEAR));
		max.set(Calendar.MONTH, gc.get(GregorianCalendar.MONTH));
		max.set(Calendar.DATE, gc.get(GregorianCalendar.DATE));

		datanascimento.setMaxSelectableDate(max.getTime());

		JLabel lblImagemDePerfil = new JLabel("Imagem de perfil");
		lblImagemDePerfil.setFont(new Font("Lucida Grande", Font.BOLD, 13));

		final JLabel avatar = new JLabel("");
		avatar.setIcon(new ImageIcon(Registo_2.class
				.getResource("/Imagens/avatar.jpg")));
		final JButton btnApagar = new JButton("Apagar");
		btnApagar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				avatar.setIcon(new ImageIcon(Registo_2.class
						.getResource("/Imagens/avatar.jpg")));
				
				btnApagar.setVisible(!avatar_s2);
			}
		});

		JButton btnProcurar = new JButton("Procurar");
		btnProcurar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				procura(avatar);
                                avatar_s2 = true;
				btnApagar.setVisible(!avatar_s2);

			}
		});
		btnApagar.setVisible(!avatar_s2);
		btnApagar.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		
		JSeparator separator = new JSeparator();
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblNewLabel))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(37)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_4)
								.addComponent(lblNewLabel_2)
								.addComponent(lblNewLabel_1)
								.addComponent(lblNewLabel_3)
								.addComponent(lblNewLabel_6)
								.addComponent(lblNewLabel_7)
								.addComponent(lblNewLabel_8)
								.addComponent(lblImagemDePerfil))
							.addGap(18)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(avatar)
								.addComponent(contacto, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE)
								.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
									.addGroup(groupLayout.createSequentialGroup()
										.addComponent(codPostal1, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(lblNewLabel_5)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(codPostal2, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE))
									.addComponent(paises, GroupLayout.PREFERRED_SIZE, 175, GroupLayout.PREFERRED_SIZE)
									.addComponent(nome, GroupLayout.DEFAULT_SIZE, 371, Short.MAX_VALUE)
									.addComponent(morada, Alignment.TRAILING)
									.addComponent(localidade))
								.addComponent(datanascimento, GroupLayout.PREFERRED_SIZE, 182, GroupLayout.PREFERRED_SIZE)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(btnProcurar)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(btnApagar))))
						.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(separator, GroupLayout.DEFAULT_SIZE, 561, Short.MAX_VALUE)))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel)
					.addGap(33)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_1)
						.addComponent(nome, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(22)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_2)
						.addComponent(paises, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_3)
						.addComponent(morada, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_4)
						.addComponent(codPostal1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_5)
						.addComponent(codPostal2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_6)
						.addComponent(localidade, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_7)
						.addComponent(contacto, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_8)
						.addComponent(datanascimento, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(29)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblImagemDePerfil)
						.addComponent(avatar))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnProcurar)
						.addComponent(btnApagar, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(separator, GroupLayout.PREFERRED_SIZE, 12, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		setLayout(groupLayout);

	}

	public void procura(final JLabel label) {
		JFileChooser fileChooser = new JFileChooser();
		fileChooser.setCurrentDirectory(new File("").getAbsoluteFile());
		FileNameExtensionFilter filter = new FileNameExtensionFilter("Imagens",
				"jpg", "png","gif");
		fileChooser.setFileFilter(filter);
		int fcOption = fileChooser.showOpenDialog(this);

		if (fcOption == JFileChooser.APPROVE_OPTION) {
			File f = fileChooser.getSelectedFile();
			String path = f.getAbsolutePath();
			avatarurl = path;
		
			ImageIcon icon = new ImageIcon(path);
			Image img = icon.getImage();
			avatar = new Avatar(img);
			label.setIcon(avatar);
			avatar_s2 = false;
		}
	}

	public String getNome() throws Exception {
		if (nome.getText().isEmpty())
			throw new Exception("Insira o seu Nome");
		return nome.getText();
	}

	public long getContacto() throws Exception {
		long l;
		String scontacto = contacto.getText();
		try {
			l = new Long(scontacto).longValue();
		} catch (Exception e) {
			throw new Exception("Insira um contacto válido");
		}
		if (scontacto.length() == 9)
			return l;
		else
			throw new Exception("Insira um contacto válido");
	}

	public String getCodigoPostal() throws Exception {
		String cp1,cp2;
		cp1 = codPostal1.getText();
		cp2 = codPostal2.getText();
		if(cp1.length()==4 && cp2.length()==3)
			return cp1+"-"+cp2;
		else
			throw new Exception("Insira um Código Postal válido");
	}

	public String getPais() {
		return (String) paises.getModel().getElementAt(
				paises.getSelectedIndex());
	}

	public String getMorada() throws Exception {
		String smorada =  morada.getText();
		if(smorada.isEmpty())
			throw new Exception("Insira a sua Morada");
		return smorada;
	
	}

	public String getLocalidade() throws Exception {
		String slocaldiade = localidade.getText();
		if(slocaldiade.isEmpty())
			throw new Exception("Insira a sua Localidade");
		return slocaldiade;
	}

	public GregorianCalendar getDataNascimento() throws Exception {
		int dia, mes, ano;
		Calendar c = datanascimento.getCalendar();
		dia = c.get(Calendar.DAY_OF_MONTH);
		mes = c.get(Calendar.MONTH);
		ano = c.get(Calendar.YEAR);
		GregorianCalendar gc = new GregorianCalendar(ano, mes, dia);
		GregorianCalendar now = new GregorianCalendar();
		long lgc = gc.getTimeInMillis();
		long lnow = now.getTimeInMillis();
		GregorianCalendar aux = new GregorianCalendar();
		aux.setTimeInMillis(lnow-lgc);
		int anos = aux.get(GregorianCalendar.YEAR);
		
		if(anos >= 18)
			return gc;
		throw new Exception("Necessita ter mais de 18 anos para proceder com o registo");
				
		
	}

	public String getAvatar() {
		if (avatar_s2)
			return avatarurl==null ? "" : avatarurl;
		else
			return "";
	}
}
