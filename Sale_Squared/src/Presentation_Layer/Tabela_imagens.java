package Presentation_Layer;

import javax.swing.JCheckBox;
import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

public class Tabela_Imagens extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	

	/**
	 * Create the panel.
	 */
	@SuppressWarnings("serial")
	public Tabela_Imagens() {
		
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
				false, false, true
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		};
	    String cancelar = "Eliminar";
		dm.setDataVector(new Object[][] { 
	    	{ "button 1", "foo",cancelar },
	        { "button 2", "bar",cancelar },
	        { "button 2", "bar",cancelar },
	        { "button 2", "bar",cancelar },
	        { "button 2", "bar",cancelar },
	        { "button 2", "bar",cancelar },
	        { "button 2", "bar",cancelar },
	        { "button 2", "bar",cancelar },
	        { "button 2", "bar",cancelar } }, new Object[] { "Imagem", "Nome","" });

	    JTable table = new JTable(dm);
	    table.getColumn("").setCellRenderer(new ButtonRenderer());
	    table.getColumn("").setCellEditor(
	        new ButtonEditor(new JCheckBox(),table));
	    
		scrollPane.setViewportView(table);
		setLayout(groupLayout);

	}
}
