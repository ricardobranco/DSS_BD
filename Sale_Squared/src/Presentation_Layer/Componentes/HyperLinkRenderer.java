package Presentation_Layer.Componentes;

import java.awt.Component;

import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

import org.jdesktop.swingx.JXHyperlink;

public class HyperLinkRenderer extends JXHyperlink implements TableCellRenderer {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public HyperLinkRenderer() {
		setOpaque(false);
	}

	public Component getTableCellRendererComponent(JTable table, Object value,
			boolean isSelected, boolean hasFocus, int row, int column) {
		setText((value == null) ? "" : value.toString());
		return this;
	}
}
