package Presentation_Layer.Registo;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

import Presentation_Layer.Sale_Squared;

public class Terms extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();

	

	/**
	 * Create the dialog.
	 */
	public Terms(final Sale_Squared root) {
		setTitle("Sale Squared - Condi\u00E7\u00F5es de Servi\u00E7o");
		root.setEnabled(false);

		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent arg0) {
				root.setEnabled(true);
			}
		});
		setAlwaysOnTop(true);
		setBounds(100, 100, 723, 649);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		
		JScrollPane scrollPane = new JScrollPane();
		GroupLayout gl_contentPanel = new GroupLayout(contentPanel);
		gl_contentPanel.setHorizontalGroup(
			gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 434, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_contentPanel.setVerticalGroup(
			gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
		);
		
		JTextArea txtrTermosECondies = new JTextArea();
		txtrTermosECondies.setText("Condi\u00E7\u00F5es de Servi\u00E7o\n1. Compra e Venda de Mercadorias\nVenda Squared (\"Vendedor\") concorda em vender, e voc\u00EA (\"Comprador\") vem a comprar a mercadoria da descri\u00E7\u00E3o e quantidade descrita na janela de compra (\"Caixa\") e aqui incorporados por esta refer\u00EAncia (\"Bens\" ) sobre os termos e condi\u00E7\u00F5es estabelecidos neste Acordo.\n2. Pre\u00E7o de Compra\nComprador se compromete a pagar o pre\u00E7o de compra das mercadorias, como publicado no site em anexo.\n3. Condi\u00E7\u00F5es de Pagamento\nO montante total do pre\u00E7o de compra dever\u00E1 ser pago na totalidade pelo comprador de acordo com a data de pagamento de vencimento estabelecida no Checkout. Qualquer parte do passado Pre\u00E7o de Compra n\u00E3o remunerado de 30 (trinta) dias ser\u00E1 considerada em atraso. Todos os valores vencidos est\u00E3o sujeitas a uma taxa de atraso do percentual menor de um e meio (1 1/2%) por m\u00EAs (sendo 18 por cento (18%) ao ano) ou a mais alta taxa legal. Al\u00E9m disso, o vendedor tem o direito de accionar quaisquer rem\u00E9dios dispon\u00EDveis na lei ou conforme previsto neste documento e ter\u00E1 o direito ao reembolso do comprador para os custos do vendedor de cobran\u00E7a, incluindo honor\u00E1rios advocat\u00EDcios, honor\u00E1rios advocat\u00EDcios e custos e despesas.\n4. Entrega\nSalvo acordo em contr\u00E1rio por escrito, a entrega deve ser feita de acordo com a pol\u00EDtica do Vendedor de transporte em vigor na data de embarque. As datas de entrega fornecidos pelo vendedor s\u00E3o apenas estimativas. Vendedor far\u00E1 esfor\u00E7os razo\u00E1veis \u200B\u200Bpara entregar de acordo com essas datas, no entanto, o Vendedor n\u00E3o ser\u00E1 respons\u00E1vel por falha na entrega como previsto. Salvo acordo em contr\u00E1rio por escrito pelo Vendedor, as mercadorias devem ser embaladas de acordo com as normas do vendedor e pr\u00E1ticas.\n5. Garantia Limitada\nVendedor suprimentos como sua \u00FAnica garantia o seguinte:\nOs bens adquiridos a partir deste site ser\u00E1 livre de defeitos por um per\u00EDodo de duas semanas\nA garantia deve durar 2 anos.\nAs garantias previstas neste documento deve ser regida pelas pol\u00EDticas de garantia do vendedor em vigor na data de embarque.\n6. Ren\u00FAncia de Garantia / Limita\u00E7\u00E3o de Responsabilidade\nO vendedor n\u00E3o assume qualquer responsabilidade pela qualidade dos bens ou que os bens ser\u00E3o adequadas para qualquer finalidade espec\u00EDfica para a qual Comprador pode estar comprando os bens, salvo disposi\u00E7\u00E3o em contr\u00E1rio no presente Acordo, e Vendedor nega todas as outras garantias e condi\u00E7\u00F5es, expressas ou impl\u00EDcitas .\nVENDEDOR (incluindo suas subsidi\u00E1rias, afiliadas, diretores, DIRETORES, EMPREGADOS, agentes ou subcontratados, os quais s\u00E3o aqui referidas coletivamente como \"afiliadas vendedor\") N\u00C3O SER\u00C1 RESPONS\u00C1VEL SOB QUALQUER CIRCUNST\u00C2NCIA AO COMPRADOR OU QUALQUER OUTRA PARTE POR QUAISQUER DANOS ESPECIAIS, consequenciais, incidentais danos OU EXEMPLARES DECORRENTES OU DE QUALQUER FORMA RELACIONADOS COM OS PRODUTOS OU N\u00C3O, INCLUINDO, SEM LIMITA\u00C7\u00C3O, DANOS PARA A PERDA DE LUCROS, PERDA DOS BENS OU qualquer equipamento associado, custo de capital, CUSTO DE substituto ou substitui\u00E7\u00E3o do equipamento, OU SERVI\u00C7OS, PARA BAIXO tempo, o tempo do comprador, PERDA DE DADOS LES\u00C3O, a propriedade ou QUAISQUER DANOS OU montantes pagos pelo COMPRADOR PARA TERCEIROS, MESMO QUE O VENDEDOR OU QUALQUER DOS ASSOCIADOS VENDEDOR TENHA SIDO AVISADO DA POSSIBILIDADE DE TAIS DANOS. A LIMITA\u00C7\u00C3O DE RESPONSABILIDADE SER\u00C1 APLICADA QUE QUALQUER afirma\u00E7\u00E3o \u00E9 baseada nos princ\u00EDpios de contrato, garantia, neglig\u00EAncia ou outro ato il\u00EDcito, viola\u00E7\u00E3o de qualquer obriga\u00E7\u00E3o legal PRINC\u00CDPIOS DE INDENIZA\u00C7\u00C3O OU CONTRIBUI\u00C7\u00C3O, a falha de qualquer RECURSO OU EXCLUSIVO PARA ATINGIR SUA FINALIDADE ESSENCIAL OU OUTROS.\nEM NENHUM CASO O VENDEDOR OU QUALQUER AFILIADO VENDEDOR SER\u00C1 RESPONS\u00C1VEL AO COMPRADOR OU QUALQUER OUTRA PARTE POR PERDA, DANO OU DANOS DE QUALQUER TIPO OU NATUREZA DECORRENTES DE OU EM CONEX\u00C3O COM OS TERMOS E CONDI\u00C7\u00D5ES EM EXCESSO DO PRE\u00C7O DE COMPRA l\u00EDquido das mercadorias efectivamente entregue e pago pelo NESTE COMPRADOR.\nVENDEDOR DE QUAISQUER GARANTIAS DE N\u00C3O-INFRA\u00C7\u00C3O COM RESPEITO AOS BENS E NENHUM DE VENDEDOR OU QUALQUER AFILIADO VENDEDOR N\u00C3O TER\u00C1 qualquer dever de defender, indemnizar OU isentar\u00E1 a Comprador de e contra qualquer OU todos os danos ou custos incorridos PELO COMPRADOR resultantes da infrac\u00E7\u00E3o DE patentes ou marcas registradas ou viola\u00E7\u00E3o de direitos autorais, qualquer dos bens.\n7. For\u00E7a Maior\nVendedor n\u00E3o ser\u00E1 respons\u00E1vel por qualquer falha de desempenho para fazer a entrega atempada de toda ou qualquer parte dos Bens na falha evento, deveu-se, no todo ou em parte, para federal, a\u00E7\u00E3o provincial ou municipal, estatuto ou regulamento , greve ou problemas laboral, inc\u00EAndio ou outros danos ou destrui\u00E7\u00E3o de, no todo ou em parte, os bens ou a instala\u00E7\u00E3o de fabrico das mercadorias, a falta de \u00E1gua ou pela incapacidade de obter mat\u00E9rias-primas, m\u00E3o de obra, combust\u00EDvel, energia el\u00E9trica, ou suprimentos, ou qualquer outra causa, ato de Deus, conting\u00EAncia ou circunst\u00E2ncias que n\u00E3o est\u00E3o sujeitos ao controle razo\u00E1vel de vendedor, o que provoca atrasos ou dificulta o fabrico ou a entrega de mercadorias. O vendedor deve determinar de boa f\u00E9 na medida em que \u00E9 razoavelmente controlar uma causa, de conting\u00EAncia, ou circunst\u00E2ncia que afeta o desempenho de suas obriga\u00E7\u00F5es.\n8. Geral\nO comprador n\u00E3o pode transferir este Contrato sem o consentimento escrito do Vendedor. Vendedor \u00E9 o \u00FAnico benefici\u00E1rio indicado deste Acordo. Se houver qualquer inconsist\u00EAncia entre este Acordo e qualquer outro contrato inclu\u00EDdo ou em rela\u00E7\u00E3o aos Produtos, presente Contrato. Este acordo n\u00E3o pode ser modificado, alterado ou modificado sem o acordo escrito do vendedor. Quaisquer termos adicionais ou alteradas anexados a qualquer ordem apresentada pelo Comprador ser\u00E1 nula e sem efeito, a menos que expressamente acordado por escrito pelo Vendedor. Se qualquer termo deste acordo \u00E9 ilegal ou n\u00E3o aplic\u00E1vel, a legalidade e aplicabilidade das disposi\u00E7\u00F5es restantes n\u00E3o ser\u00E3o afetadas ou prejudicadas. O presente Acordo ser\u00E1 interpretado de acordo com as leis do Estado da Virg\u00EDnia, sem dar efeito aos conflitos de leis regras e, no caso de uma disputa no \u00E2mbito do presente Acordo; Comprador submete \u00E0 jurisdi\u00E7\u00E3o e foro exclusivo dos tribunais da Comunidade de Virg\u00EDnia e renuncia a qualquer obje\u00E7\u00E3o \u00E0 jurisdi\u00E7\u00E3o e local.");
		txtrTermosECondies.setLineWrap(true);
		txtrTermosECondies.setEditable(false);
		scrollPane.setViewportView(txtrTermosECondies);
		contentPanel.setLayout(gl_contentPanel);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton cancelButton = new JButton("Voltar");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						root.setEnabled(true);
						dispose();
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
}
