package Presentation_Layer.Tabelas;

import java.awt.Component;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JFileChooser;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

import Presentation_Layer.Componentes.ButtonEditor;
import Presentation_Layer.Componentes.ButtonRenderer;
import Presentation_Layer.Componentes.ImageCellRender;
import Presentation_Layer.Componentes.ThumbnailIcon;

public class Tabela_Imagens extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private final JTable table;

	/**
	 * Create the panel.
	 */
	@SuppressWarnings("serial")
	public Tabela_Imagens() {
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

		DefaultTableModel dm = new DefaultTableModel() {
			@SuppressWarnings("rawtypes")
			Class[] columnTypes = new Class[] { Object.class, String.class,
					Object.class };

			@SuppressWarnings({ "rawtypes", "unchecked" })
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}

			boolean[] columnEditables = new boolean[] { false, false, true };

			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		};

		dm.setDataVector(new Object[][] {}, new Object[] { "Foto", "Nome", "" });

		table = new JTable(dm);
		table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
		table.getColumn("Foto").setCellRenderer(new ImageCellRender());
		table.getColumn("").setCellRenderer(new ButtonRenderer());
		table.getColumn("").setCellEditor(
				new ButtonEditor(new JCheckBox(), remove()));
		table.setCellSelectionEnabled(false);
		scrollPane.setViewportView(table);
		setLayout(groupLayout);

	}

	public ActionListener remove() {
		return new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel dtm = (DefaultTableModel) table.getModel();
				int row = table.getSelectedRow();
				int size = table.getRowCount();
				dtm.removeRow(row);// fireEditingStopped();
				if (row + 1 < size)
					table.setRowSelectionInterval(row, row);

			}
		};
	}

	public void adiciona() {
		DefaultTableModel dtm = (DefaultTableModel) table.getModel();
		JFileChooser fileChooser = new JFileChooser();
		fileChooser.setCurrentDirectory(new File("").getAbsoluteFile());
		FileNameExtensionFilter filter = new FileNameExtensionFilter("Imagens",
				"jpg", "png");
		fileChooser.setFileFilter(filter);
		int fcOption = fileChooser.showOpenDialog(this);

		if (fcOption == JFileChooser.APPROVE_OPTION) {
			File f = fileChooser.getSelectedFile();
			String path = f.getAbsolutePath();
			ImageIcon icon = new ImageIcon(path);
			Image img = icon.getImage();
			ThumbnailIcon ti = new ThumbnailIcon(img, table.getColumn("Foto")
					.getWidth());
			Object[] row = { ti, "exito", "cancelar" };
			dtm.addRow(row);
			updateRowHeights();
		}

	}

	public boolean isFull() {
		if (table.getRowCount() < 9)
			return false;
		return true;
	}

	private void updateRowHeights() {
		try {
			for (int row = 0; row < table.getRowCount(); row++) {
				int rowHeight = table.getRowHeight();

				for (int column = 0; column < table.getColumnCount(); column++) {
					Component comp = table.prepareRenderer(
							table.getCellRenderer(row, column), row, column);
					rowHeight = Math.max(rowHeight,
							comp.getPreferredSize().height);
				}

				table.setRowHeight(row, rowHeight);
			}
		} catch (ClassCastException e) {
		}
	}
}