package Presentation_Layer.Inserir;

import java.awt.CardLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.UIManager;

import Business_Layer.Categoria;
import Business_Layer.Tag;
import Presentation_Layer.Tabelas.Tabela_Imagens;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

public class Inserir_1 extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField titulo;
	private JTextField tags;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JRadioButton rdbtnNovo;
	private JRadioButton rdbtnUsado;
	private Inserir_Categorias categorias;
	/**
	 * Create the panel.
	 */
	public Inserir_1() {

		final Tabela_Imagens imagens = new Tabela_Imagens();
		categorias = new Inserir_Categorias();

		JLabel lblNewLabel = new JLabel("1 - Definiç\u00F5es");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.BOLD, 15));

		titulo = new JTextField();
		titulo.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("Título");
		lblNewLabel_1.setFont(new Font("Lucida Grande", Font.BOLD, 13));

		JLabel lblTags = new JLabel("Tags");
		lblTags.setFont(new Font("Lucida Grande", Font.BOLD, 13));

		tags = new JTextField();
		tags.setColumns(10);

		JLabel lblSepararPor = new JLabel("Separar por");
		lblSepararPor.setFont(new Font("Lucida Grande", Font.ITALIC, 12));

		JLabel lblNewLabel_3 = new JLabel("Descrição");
		lblNewLabel_3.setFont(new Font("Lucida Grande", Font.BOLD, 13));

		JTextArea descricao = new JTextArea();
		descricao.setLineWrap(true);
		descricao.setBorder(UIManager.getBorder("TextField.border"));

		JLabel label = new JLabel(";");
		label.setFont(new Font("Lucida Grande", Font.BOLD, 13));

		JLabel lblImagens = new JLabel("Fotos");
		lblImagens.setFont(new Font("Lucida Grande", Font.BOLD, 13));

		JPanel panel = new JPanel();

		final JButton btnAdicionarFoto = new JButton("Adicionar Foto");
		btnAdicionarFoto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				imagens.adiciona();
				btnAdicionarFoto.setEnabled(!imagens.isFull());
			}
		});

		JPanel panel_1 = new JPanel();

		JPanel panel_2 = new JPanel();
		
		JLabel lblEstado = new JLabel("Estado");
		lblEstado.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		
		rdbtnNovo = new JRadioButton("Novo");
		buttonGroup.add(rdbtnNovo);
		rdbtnNovo.setSelected(true);
		
		rdbtnUsado = new JRadioButton("Usado");
		buttonGroup.add(rdbtnUsado);
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblNewLabel))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(160)
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(lblNewLabel_1)
										.addComponent(lblTags))
									.addGap(32)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
											.addComponent(btnAdicionarFoto)
											.addComponent(panel, GroupLayout.PREFERRED_SIZE, 466, GroupLayout.PREFERRED_SIZE))
										.addGroup(groupLayout.createSequentialGroup()
											.addComponent(tags, GroupLayout.PREFERRED_SIZE, 411, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(lblSepararPor)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(label, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE))
										.addComponent(descricao, GroupLayout.PREFERRED_SIZE, 645, Short.MAX_VALUE)
										.addGroup(groupLayout.createSequentialGroup()
											.addComponent(rdbtnNovo)
											.addGap(18)
											.addComponent(rdbtnUsado))
										.addComponent(titulo, GroupLayout.PREFERRED_SIZE, 626, GroupLayout.PREFERRED_SIZE))
									.addGap(218))
								.addComponent(panel_1, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_3, Alignment.LEADING)
								.addComponent(lblImagens, Alignment.LEADING)
								.addComponent(panel_2, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 772, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblEstado, Alignment.LEADING))))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel)
					.addGap(34)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_1)
						.addComponent(titulo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblTags)
						.addComponent(tags, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblSepararPor)
						.addComponent(label))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel_3)
					.addGap(18)
					.addComponent(descricao, GroupLayout.PREFERRED_SIZE, 165, GroupLayout.PREFERRED_SIZE)
					.addGap(15)
					.addComponent(lblEstado)
					.addGap(10)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(rdbtnNovo)
						.addComponent(rdbtnUsado))
					.addGap(12)
					.addComponent(lblImagens)
					.addGap(18)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 192, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnAdicionarFoto)
					.addGap(18)
					.addComponent(panel_2, GroupLayout.DEFAULT_SIZE, 367, Short.MAX_VALUE)
					.addContainerGap())
		);
		panel_2.setLayout(new CardLayout(0, 0));
		panel_1.setLayout(new CardLayout(0, 0));
		panel.setLayout(new CardLayout(0, 0));
		panel.add(imagens, "imagens");
		panel_1.add(categorias, "Categorias");
		panel_2.add(new Inserir_preco(), "Def_Preçoo");

		setLayout(groupLayout);

	}

	public String getTitulo() throws Exception{
		String stitulo = titulo.getText();
		if(stitulo.isEmpty())
			throw new Exception("Insira um título");
		if(stitulo.length() > 25)
			throw new Exception("O título tem no max. 25 caracteres");
		return stitulo;
	}
	
	public boolean getEstado(){
		return rdbtnNovo.isSelected();
	}
	
	public List<Tag> getTags(){
		List<Tag> res = new ArrayList<>();
		String stags = tags.getText();
		
		StringTokenizer st =  new StringTokenizer(stags, ";");
		while(st.hasMoreTokens()){
			Tag t = new Tag(st.nextToken());
			res.add(t);
		}
		
		return res;
		}
	
	public List<Categoria> getCategorias(){
		List<Categoria> res = categorias.getCategorias();
		if(res.isEmpty())
			res.add(new Categoria("Outros"));
		return res;
	}
	
	
	
	
	

}
