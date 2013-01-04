package Presentation_Layer.Componentes;

import java.awt.Color;
import java.awt.Component;

import javax.swing.AbstractCellEditor;
import javax.swing.JCheckBox;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.TableCellEditor;

public class CheckBoxCellEditor extends AbstractCellEditor implements
		TableCellEditor {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected JCheckBox checkBox;

	public CheckBoxCellEditor() {
		checkBox = new JCheckBox();
		checkBox.setHorizontalAlignment(SwingConstants.CENTER);
		checkBox.setBackground(Color.white);
	}

	public Component getTableCellEditorComponent(JTable table, Object value,
			boolean isSelected, int row, int column) {

		checkBox.setSelected(((Boolean) value).booleanValue());

		// Component c =
		// table.getDefaultRenderer(String.class).getTableCellRendererComponent(table,
		// value, isSelected, false, row, column);
		// if (c != null) {
		// checkBox.setBackground(c.getBackground());
		// }

		return checkBox;
	}

	public Object getCellEditorValue() {
		return Boolean.valueOf(checkBox.isSelected());
	}
}
