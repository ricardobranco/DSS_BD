package Presentation_Layer;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Tabela_Reputacao extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static Icon POSITIVO = new ImageIcon(Perfil.class.getResource("/Imagens/positivo.png"));
	public static Icon NEUTRO = new ImageIcon(Perfil.class.getResource("/Imagens/neutro.png"));
	public static Icon NEGATIVO = new ImageIcon(Perfil.class.getResource("/Imagens/negativo.png"));
	
	private JTable table;
	

	/**
	 * Create the panel.
	 */
	public Tabela_Reputacao() {
		
		JScrollPane scrollPane = new JScrollPane();
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 438, Short.MAX_VALUE)
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
					.addContainerGap())
		);
		
		@SuppressWarnings("serial")
		DefaultTableModel dm = new DefaultTableModel(){
			@SuppressWarnings("rawtypes")
			Class[] columnTypes = new Class[] {
				Object.class, String.class, Object.class,Object.class,Object.class
			};
			@SuppressWarnings({ "rawtypes", "unchecked" })
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
			boolean[] columnEditables = new boolean[] {
				false, false, false,false,false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		};
	 
		dm.setDataVector(new Object[][] {}, new Object[] { "Reputação", "Comentário","Anuncio","De","Data"});
		
		table = new JTable(dm);
	    table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
	    table.getColumn("Reputação").setCellRenderer(new ImageCellRender());
	    table.setCellSelectionEnabled(false);
	    scrollPane.setViewportView(table);
	    //teste
	    Object[] row1 = {POSITIVO,"exito","cancelar","",""};
	    Object[] row2 = {NEUTRO,"exito","cancelar",null,null};
	    Object[] row3 = {NEGATIVO,"exito","cancelar",null,null};
		dm.addRow(row1);
		dm.addRow(row2);
		dm.addRow(row3);
		
		
		setLayout(groupLayout);

	}
	
	
}
