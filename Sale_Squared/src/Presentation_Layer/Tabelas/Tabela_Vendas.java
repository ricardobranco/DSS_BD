package Presentation_Layer.Tabelas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JCheckBox;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import org.jdesktop.swingx.JXTable;

import Presentation_Layer.Sale_Squared;
import Presentation_Layer.Componentes.CWCheckBoxRenderer;
import Presentation_Layer.Componentes.CheckBoxCellEditor;
import Presentation_Layer.Componentes.HyperLinkEditor;
import Presentation_Layer.Componentes.HyperLinkRenderer;

public class Tabela_Vendas extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public Tabela_Vendas(final Sale_Squared root) {

		JScrollPane scrollPane = new JScrollPane();
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(
				Alignment.LEADING).addGroup(
				groupLayout
						.createSequentialGroup()
						.addContainerGap()
						.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE,
								438, Short.MAX_VALUE).addContainerGap()));
		groupLayout.setVerticalGroup(groupLayout.createParallelGroup(
				Alignment.LEADING).addGroup(
				groupLayout
						.createSequentialGroup()
						.addContainerGap()
						.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE,
								288, Short.MAX_VALUE).addContainerGap()));

		@SuppressWarnings("serial")
		DefaultTableModel dm = new DefaultTableModel() {
			@SuppressWarnings("rawtypes")
			Class[] columnTypes = new Class[] { Object.class, Object.class,
					Object.class, Object.class, Object.class, Object.class,
					Object.class };

			@SuppressWarnings({ "rawtypes", "unchecked" })
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}

			boolean[] columnEditables = new boolean[] { false, false, true,
					false, false, false, false };

			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		};

		dm.setDataVector(new Object[][] {}, new Object[] { "Data In�cio",
				"Data de Fim", "Neg�cio", "Pre�o", "Estado", "Leil�o",
				"Comprar J�" });
		ActionListener abre = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				root.setBody(new Anuncio(root), "Anuncio");

			}
		};
		JXTable table = new JXTable(dm);
		table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
		table.setCellSelectionEnabled(false);
		table.getColumn("Neg�cio").setCellRenderer(new HyperLinkRenderer());
		table.getColumn("Neg�cio").setCellEditor(
				new HyperLinkEditor(new JCheckBox(), abre));
		table.getColumn("Leil�o").setCellEditor(new CheckBoxCellEditor());
		table.getColumn("Comprar J�").setCellEditor(new CheckBoxCellEditor());
		table.getColumn("Leil�o").setCellRenderer(new CWCheckBoxRenderer());
		table.getColumn("Comprar J�").setCellRenderer(new CWCheckBoxRenderer());

		scrollPane.setViewportView(table);
		// teste
		Object[] row1 = { "3/1/2013", "13/1/2013", "Neg�cio 1", "� 15",
				"Aberto", true, false };

		dm.addRow(row1);

		scrollPane.setViewportView(table);
		setLayout(groupLayout);

	}
}
