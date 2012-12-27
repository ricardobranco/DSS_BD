package Presentation_Layer;

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class Registo_2 extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;

	/**
	 * Create the panel.
	 */
	public Registo_2() {
		
		JLabel lblNewLabel = new JLabel("2 - Dados Pessoais");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		
		JLabel lblNewLabel_1 = new JLabel("Nome");
		lblNewLabel_1.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		
		textField = new JTextField();
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Pa\u00EDs");
		lblNewLabel_2.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Portugal", "Afeganist\u00E3o", "\u00C1frica do Sul", "Alb\u00E2nia", "Alemanha", "Andorra", "Angola", "Anguilla", "Antilhas Holandesas", "Ant\u00E1rtica", "Ant\u00EDgua e Barbuda", "Argentina", "Arg\u00E9lia", "Arm\u00EAnia", "Aruba", "Ar\u00E1bia Saudita", "Austr\u00E1lia", "\u00C1ustria", "Azerbaij\u00E3o", "Bahamas", "Bahrein", "Bangladesh", "Barbados", "Belize", "Benin", "Bermudas", "Bielorr\u00FAssia", "Bol\u00EDvia", "Botswana", "Brasil", "British Indian Ocean Territory", "Brunei Darussalam", "Bulg\u00E1ria", "Burkina Faso", "Burundi", "But\u00E3o", "B\u00E9lgica", "B\u00F3snia-Herzegovina", "Cabo Verde", "Camar\u00F5es", "Camboja", "Canad\u00E1", "Catar", "Cazaquist\u00E3o", "Central Africano Rep\u00FAblica", "Chade", "Chile", "China", "Chipre", "Christmas Island", "Cidade do Vaticano", "Cingapura", "Cocos (Keeling)", "Col\u00F4mbia", "Comores", "Congo", "Cor\u00E9ia do Norte", "Cor\u00E9ia do Sul", "Costa do Marfim (C\u00F4te d'Ivoire)", "Costa Rica", "Cro\u00E1cia", "Cuba", "Dinamarca", "Djibouti", "Dominica", "Egito", "El Salvador", "Emirados \u00C1rabes Unidos", "Equador", "Eritreia", "Eslovenia", "Espanha", "Est\u00F4nia", "Eti\u00F3pia", "EUA Militar", "EUA Territ\u00F3rios Insulares", "Ex-Checoslov\u00E1quia", "Ex-URSS", "Fiji", "Filipinas", "Finl\u00E2ndia", "Fran\u00E7a", "Fran\u00E7a (Territ\u00F3rio Europeu)", "Gab\u00E3o", "Gana", "Ge\u00F3rgia", "Gibraltar", "Granada", "Groenl\u00E2ndia", "Gr\u00E3-Bretanha", "Gr\u00E9cia", "Guadalupe (franc\u00EAs)", "Guam (EUA)", "Guatemala", "Guiana", "Guiana Francesa", "Guin\u00E9", "Guin\u00E9 Equatorial", "Guin\u00E9-Bissau", "G\u00E2mbia", "Haiti", "Holanda", "Honduras", "Hong Kong", "Hungria", "Ilha Bouvet", "Ilha Pitcairn", "Ilhas Cayman", "Ilhas Cook", "Ilhas Faroe", "Ilhas Heard e McDonald", "Ilhas Malvinas", "Ilhas Marianas do Norte", "Ilhas Marshall", "Ilhas Salom\u00E3o", "Ilhas Turks e Caicos", "Ilhas Virgens (Brit\u00E2nicas)", "Ilhas Virgens (EUA)", "Ilhas Wallis e Futuna", "\u00CDndia", "Indon\u00E9sia", "Internacional", "Iraque", "Irlanda", "Ir\u00E3", "Isl\u00E2ndia", "Israel", "It\u00E1lia", "Iugosl\u00E1via", "I\u00E9men", "Jamaica", "Jap\u00E3o", "Jord\u00E2nia", "Kiribati", "Kuweit", "Laos", "Lesoto", "Lib\u00E9ria", "Liechtenstein", "Litu\u00E2nia", "Luxemburgo", "L\u00E1tvia", "L\u00EDbano", "L\u00EDbia", "Macau", "Maced\u00F3nia", "Madag\u00E1scar", "Malavi", "Maldivas", "Mali", "Malta", "Mal\u00E1sia", "Marrocos", "Martinica (franc\u00EAs)", "Maurit\u00E2nia", "Maur\u00EDcio", "Mayotte", "Mianmar", "Micron\u00E9sia", "Mold\u00E1via", "Mong\u00F3lia", "Montserrat", "Mo\u00E7ambique", "M\u00E9xico", "M\u00F4naco", "Nam\u00EDbia", "Nauru", "Nepal", "Nicar\u00E1gua", "Nig\u00E9ria", "Niue", "Norfolk Island", "Noruega", "Nova Caled\u00F4nia (franc\u00EAs)", "Nova Zel\u00E2ndia", "N\u00EDger", "Om\u00E3", "Palau", "Panam\u00E1", "Papua Nova Guin\u00E9", "Paquist\u00E3o", "Paraguai", "Peru", "Polin\u00E9sia (Franc\u00EAs)", "Pol\u00F4nia", "Porto Rico", "Quirguist\u00E3o", "Qu\u00EAnia", "Reino Unido", "Rep\u00FAblica Checa", "Rep\u00FAblica Dominicana", "Rep\u00FAblica Eslovaca", "Reuni\u00E3o (franc\u00EAs)", "Rom\u00EAnia", "Ruanda", "R\u00FAssia", "S. Ge\u00F3rgia e Sandwich ISLs S..", "Saara Ocidental", "Saint Pierre e Miquelon", "Samoa", "Samoa Americana", "San Marino", "Santa Helena", "Santa L\u00FAcia", "Senegal", "Serra Leoa", "Seychelles", "Som\u00E1lia", "Sri Lanka", "Suazil\u00E2ndia", "Sud\u00E3o", "Suriname", "Su\u00E9cia", "Su\u00ED\u00E7a", "Svalbard e Jan Mayen", "S\u00E3o Crist\u00F3v\u00E3o e Nevis Anguilla", "S\u00E3o Tom\u00E9 (S\u00E3o Tom\u00E9) e Pr\u00EDncipe", "S\u00E3o Vicente e Granadinas", "S\u00EDria", "Tail\u00E2ndia", "Taiwan", "Tajiquist\u00E3o", "Tanz\u00E2nia", "Territ\u00F3rios Franceses do Sul", "Timor Leste", "Togo", "Tokelau", "Tonga", "Trinidad e Tobago", "Tun\u00EDsia", "Turcomenist\u00E3o", "Turquia", "Tuvalu", "Ucr\u00E2nia", "Uganda", "United States", "Uruguai", "Uzbequist\u00E3o", "Vanuatu", "Venezuela", "Vietn\u00E3", "Zaire", "Zimb\u00E1bue", "Zona Neutra", "Z\u00E2mbia"}));
		
		JLabel lblNewLabel_3 = new JLabel("Morada");
		lblNewLabel_3.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("C\u00F3digo Postal");
		lblNewLabel_4.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("-");
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Localidade");
		lblNewLabel_6.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("Telefone");
		lblNewLabel_7.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("Data de Nascimento");
		lblNewLabel_8.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		
		JLabel lblNewLabel_9 = new JLabel("-");
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"}));
		
		JLabel lblNewLabel_10 = new JLabel("-");
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
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
								.addComponent(lblNewLabel_8))
							.addGap(18)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE)
								.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
									.addGroup(groupLayout.createSequentialGroup()
										.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(lblNewLabel_5)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE))
									.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 175, GroupLayout.PREFERRED_SIZE)
									.addComponent(textField, GroupLayout.DEFAULT_SIZE, 371, Short.MAX_VALUE)
									.addComponent(textField_1, Alignment.TRAILING)
									.addComponent(textField_4))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(lblNewLabel_9)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(comboBox_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(lblNewLabel_10)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(textField_6, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)))))
					.addContainerGap(262, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel)
					.addGap(33)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_1)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(22)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_2)
						.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_3)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_4)
						.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_5)
						.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_6)
						.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_7)
						.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_8)
						.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_9)
						.addComponent(comboBox_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_10)
						.addComponent(textField_6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(195, Short.MAX_VALUE))
		);
		setLayout(groupLayout);

	}
}
