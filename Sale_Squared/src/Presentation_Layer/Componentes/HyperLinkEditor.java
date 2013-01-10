package Presentation_Layer.Componentes;

import java.awt.Component;
import java.awt.event.ActionListener;

import javax.swing.DefaultCellEditor;
import javax.swing.JCheckBox;
import javax.swing.JTable;

import org.jdesktop.swingx.JXHyperlink;

public class HyperLinkEditor extends DefaultCellEditor {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected JXHyperlink hl;

	private String label;

	private boolean isPushed;

	public HyperLinkEditor(JCheckBox checkBox, ActionListener al) {

		super(checkBox);
		hl = new JXHyperlink();
		hl.addActionListener(al);
	}

	public Component getTableCellEditorComponent(JTable table, Object value,
			boolean isSelected, int row, int column) {
		if (isSelected) {
			// hl.setForeground(new Color(153,0,153));
			// hl.setBackground(new Color(238,238,238));

		} else {
			// hl.setForeground(new Color(0, 102, 204));
			// hl.setBackground(new Color(238,238,238));
		}
		label = (value == null) ? "" : value.toString();
		hl.setText(label);
		isPushed = true;
		return hl;
	}

	public Object getCellEditorValue() {
		if (isPushed) {
		}
		isPushed = false;
		return new String(label);
	}

	public boolean stopCellEditing() {
		isPushed = false;
		return super.stopCellEditing();
	}

	protected void fireEditingStopped() {
		// super.fireEditingStopped();
	}
}
