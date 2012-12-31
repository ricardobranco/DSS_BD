package Presentation_Layer;

import java.awt.Font;

import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JCheckBox;

public class Inserir_3 extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Create the panel.
	 */
	public Inserir_3() {
		
		JLabel lblFinalizar = new JLabel("3 - Finalizar");
		lblFinalizar.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		
		JLabel lblPas = new JLabel("Pa\u00EDs");
		lblPas.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Portugal", "Afeganist\u00E3o", "\u00C1frica do Sul", "Alb\u00E2nia", "Alemanha", "Andorra", "Angola", "Anguilla", "Antilhas Holandesas", "Ant\u00E1rtica", "Ant\u00EDgua e Barbuda", "Argentina", "Arg\u00E9lia", "Arm\u00EAnia", "Aruba", "Ar\u00E1bia Saudita", "Austr\u00E1lia", "\u00C1ustria", "Azerbaij\u00E3o", "Bahamas", "Bahrein", "Bangladesh", "Barbados", "Belize", "Benin", "Bermudas", "Bielorr\u00FAssia", "Bol\u00EDvia", "Botswana", "Brasil", "British Indian Ocean Territory", "Brunei Darussalam", "Bulg\u00E1ria", "Burkina Faso", "Burundi", "But\u00E3o", "B\u00E9lgica", "B\u00F3snia-Herzegovina", "Cabo Verde", "Camar\u00F5es", "Camboja", "Canad\u00E1", "Catar", "Cazaquist\u00E3o", "Central Africano Rep\u00FAblica", "Chade", "Chile", "China", "Chipre", "Christmas Island", "Cidade do Vaticano", "Cingapura", "Cocos (Keeling)", "Col\u00F4mbia", "Comores", "Congo", "Cor\u00E9ia do Norte", "Cor\u00E9ia do Sul", "Costa do Marfim (C\u00F4te d'Ivoire)", "Costa Rica", "Cro\u00E1cia", "Cuba", "Dinamarca", "Djibouti", "Dominica", "Egito", "El Salvador", "Emirados \u00C1rabes Unidos", "Equador", "Eritreia", "Eslovenia", "Espanha", "Est\u00F4nia", "Eti\u00F3pia", "EUA Militar", "EUA Territ\u00F3rios Insulares", "Ex-Checoslov\u00E1quia", "Ex-URSS", "Fiji", "Filipinas", "Finl\u00E2ndia", "Fran\u00E7a", "Fran\u00E7a (Territ\u00F3rio Europeu)", "Gab\u00E3o", "Gana", "Ge\u00F3rgia", "Gibraltar", "Granada", "Groenl\u00E2ndia", "Gr\u00E3-Bretanha", "Gr\u00E9cia", "Guadalupe (franc\u00EAs)", "Guam (EUA)", "Guatemala", "Guiana", "Guiana Francesa", "Guin\u00E9", "Guin\u00E9 Equatorial", "Guin\u00E9-Bissau", "G\u00E2mbia", "Haiti", "Holanda", "Honduras", "Hong Kong", "Hungria", "Ilha Bouvet", "Ilha Pitcairn", "Ilhas Cayman", "Ilhas Cook", "Ilhas Faroe", "Ilhas Heard e McDonald", "Ilhas Malvinas", "Ilhas Marianas do Norte", "Ilhas Marshall", "Ilhas Salom\u00E3o", "Ilhas Turks e Caicos", "Ilhas Virgens (Brit\u00E2nicas)", "Ilhas Virgens (EUA)", "Ilhas Wallis e Futuna", "\u00CDndia", "Indon\u00E9sia", "Internacional", "Iraque", "Irlanda", "Ir\u00E3", "Isl\u00E2ndia", "Israel", "It\u00E1lia", "Iugosl\u00E1via", "I\u00E9men", "Jamaica", "Jap\u00E3o", "Jord\u00E2nia", "Kiribati", "Kuweit", "Laos", "Lesoto", "Lib\u00E9ria", "Liechtenstein", "Litu\u00E2nia", "Luxemburgo", "L\u00E1tvia", "L\u00EDbano", "L\u00EDbia", "Macau", "Maced\u00F3nia", "Madag\u00E1scar", "Malavi", "Maldivas", "Mali", "Malta", "Mal\u00E1sia", "Marrocos", "Martinica (franc\u00EAs)", "Maurit\u00E2nia", "Maur\u00EDcio", "Mayotte", "Mianmar", "Micron\u00E9sia", "Mold\u00E1via", "Mong\u00F3lia", "Montserrat", "Mo\u00E7ambique", "M\u00E9xico", "M\u00F4naco", "Nam\u00EDbia", "Nauru", "Nepal", "Nicar\u00E1gua", "Nig\u00E9ria", "Niue", "Norfolk Island", "Noruega", "Nova Caled\u00F4nia (franc\u00EAs)", "Nova Zel\u00E2ndia", "N\u00EDger", "Om\u00E3", "Palau", "Panam\u00E1", "Papua Nova Guin\u00E9", "Paquist\u00E3o", "Paraguai", "Peru", "Polin\u00E9sia (Franc\u00EAs)", "Pol\u00F4nia", "Porto Rico", "Quirguist\u00E3o", "Qu\u00EAnia", "Reino Unido", "Rep\u00FAblica Checa", "Rep\u00FAblica Dominicana", "Rep\u00FAblica Eslovaca", "Reuni\u00E3o (franc\u00EAs)", "Rom\u00EAnia", "Ruanda", "R\u00FAssia", "S. Ge\u00F3rgia e Sandwich ISLs S..", "Saara Ocidental", "Saint Pierre e Miquelon", "Samoa", "Samoa Americana", "San Marino", "Santa Helena", "Santa L\u00FAcia", "Senegal", "Serra Leoa", "Seychelles", "Som\u00E1lia", "Sri Lanka", "Suazil\u00E2ndia", "Sud\u00E3o", "Suriname", "Su\u00E9cia", "Su\u00ED\u00E7a", "Svalbard e Jan Mayen", "S\u00E3o Crist\u00F3v\u00E3o e Nevis Anguilla", "S\u00E3o Tom\u00E9 (S\u00E3o Tom\u00E9) e Pr\u00EDncipe", "S\u00E3o Vicente e Granadinas", "S\u00EDria", "Tail\u00E2ndia", "Taiwan", "Tajiquist\u00E3o", "Tanz\u00E2nia", "Territ\u00F3rios Franceses do Sul", "Timor Leste", "Togo", "Tokelau", "Tonga", "Trinidad e Tobago", "Tun\u00EDsia", "Turcomenist\u00E3o", "Turquia", "Tuvalu", "Ucr\u00E2nia", "Uganda", "United States", "Uruguai", "Uzbequist\u00E3o", "Vanuatu", "Venezuela", "Vietn\u00E3", "Zaire", "Zimb\u00E1bue", "Zona Neutra", "Z\u00E2mbia"}));
		
		JLabel lblLocalidade = new JLabel("Localidade");
		lblLocalidade.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		
		textField = new JTextField();
		textField.setColumns(10);
		
		JLabel lblCdigoPostal = new JLabel("C\u00F3digo Postal");
		lblCdigoPostal.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		
		JLabel label = new JLabel("-");
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Permitir trocas");
		chckbxNewCheckBox.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		
		JCheckBox chckbxMostrarTelemvel = new JCheckBox("Mostrar telem\u00F3vel");
		chckbxMostrarTelemvel.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(63)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(lblLocalidade)
										.addComponent(lblPas)
										.addComponent(lblCdigoPostal))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
										.addGroup(groupLayout.createSequentialGroup()
											.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(label)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(textField_2, 0, 0, Short.MAX_VALUE))
										.addComponent(textField)
										.addComponent(comboBox, 0, 167, Short.MAX_VALUE)))
								.addComponent(chckbxNewCheckBox)
								.addComponent(chckbxMostrarTelemvel)))
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblFinalizar)))
					.addContainerGap(123, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblFinalizar)
					.addGap(40)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblPas)
						.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblLocalidade)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblCdigoPostal)
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
							.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(label)
							.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addGap(18)
					.addComponent(chckbxNewCheckBox)
					.addGap(18)
					.addComponent(chckbxMostrarTelemvel)
					.addContainerGap(58, Short.MAX_VALUE))
		);
		setLayout(groupLayout);

	}
}
