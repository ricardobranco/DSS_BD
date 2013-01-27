package Presentation_Layer.Componentes;

import java.awt.Component;
import java.awt.Font;

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
        
          public void setBold(){
            this.setFont(new Font(this.getFont().getName(), Font.BOLD, this.getFont().getSize()));
        }
        
         public void setNormal(){
            this.setFont(new Font(this.getFont().getName(), Font.PLAIN, this.getFont().getSize()));
        }
        
}
