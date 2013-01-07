package Presentation_Layer.Mensagens;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;

import org.jdesktop.swingx.JXTable;

import Presentation_Layer.Componentes.CWCheckBoxRenderer;
import Presentation_Layer.Componentes.CheckBoxCellEditor;
import Presentation_Layer.Componentes.HyperLinkEditor;
import Presentation_Layer.Componentes.HyperLinkRenderer;

public class Caixa_Rec extends JPanel {
	private JTable table;

	/**
	 * Create the panel.
	 */
	public Caixa_Rec() {
		
		JScrollPane scrollPane = new JScrollPane();
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
					.addContainerGap())
		);
		
		DefaultTableModel dm = new DefaultTableModel() {
			@SuppressWarnings("rawtypes")
			Class[] columnTypes = new Class[] {Object.class, Object.class, Object.class,
					Object.class};

			@SuppressWarnings({ "rawtypes", "unchecked" })
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}

			boolean[] columnEditables = new boolean[] {true, false, true, false};

			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		};

		ActionListener abre = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			

			}
		};
		dm.setDataVector(new Object[][] {}, new Object[] { "","De", "Assunto", "Data" });

		JXTable table = new JXTable(dm);
		table.getColumn("Assunto").setCellRenderer(new HyperLinkRenderer());
		table.getColumn("Assunto").setCellEditor(
				new HyperLinkEditor(new JCheckBox(), abre));
		
		table.getColumn("").setCellRenderer(new CWCheckBoxRenderer());
		table.getColumn("").setCellEditor(new CheckBoxCellEditor());
		table.getColumn("").setWidth(JCheckBox.WIDTH);

		table.setAutoResizeMode(JTable.AUTO_RESIZE_SUBSEQUENT_COLUMNS);
		table.setCellSelectionEnabled(false);
		scrollPane.setViewportView(table);
		// teste

		Object[] row1 = {true, "serafim", "Negócio", "31/8/2013"};
		dm.addRow(row1);
		
		
		scrollPane.setViewportView(table);
		setLayout(groupLayout);

	}
}
