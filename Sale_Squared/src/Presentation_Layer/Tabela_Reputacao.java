package Presentation_Layer;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Tabela_Reputacao extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
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
				Object.class, String.class, Object.class
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
	 
		dm.setDataVector(new Object[][] {}, new Object[] { "Reputação", "Comentário","Anuncio","De","Data" });

	    table = new JTable(dm);
	    table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
	    table.getColumn("Reputação").setCellRenderer(new ImageCellRender());
	    table.setCellSelectionEnabled(false);scrollPane.setViewportView(table);
		setLayout(groupLayout);

	}
}
