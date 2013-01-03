package Presentation_Layer.Componentes;

import java.awt.Component;

import javax.swing.JCheckBox;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.table.TableCellRenderer;

public class CWCheckBoxRenderer extends JCheckBox implements TableCellRenderer {  
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
Border border = new EmptyBorder(1,2,1,2);  
  
public CWCheckBoxRenderer() {  
super();  
setOpaque(true);  
setHorizontalAlignment(SwingConstants.CENTER);  
}  
   
public Component getTableCellRendererComponent(  
JTable table,  
Object value,  
boolean isSelected,  
boolean hasFocus,  
int row,  
int column) {  
  
if (value instanceof Boolean) {  
setSelected(((Boolean)value).booleanValue());   
setEnabled(table.isCellEditable(row, column));  
   
if (isSelected) {  
setBackground(table.getSelectionBackground());  
setForeground(table.getSelectionForeground());  
} else {  
setForeground(table.getForeground());  
setBackground(table.getBackground());  
}  
}  
else {  
//setSelected(false);  
//setEnabled(false);  
return null;  
}  
  
return this;   
}  
   
}  