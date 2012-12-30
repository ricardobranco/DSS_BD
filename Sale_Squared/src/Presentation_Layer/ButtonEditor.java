package Presentation_Layer;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultCellEditor;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

class ButtonEditor extends DefaultCellEditor {
	  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected JButton button;

	  private String label;

	  private boolean isPushed;
	  
	  public ButtonEditor(JCheckBox checkBox, final JTable table) {
	    super(checkBox);
	    button = new JButton();
	    button.setOpaque(true);
	    button.addActionListener(new ActionListener() {
	      public void actionPerformed(ActionEvent e) {
	    	  DefaultTableModel dtm = (DefaultTableModel) table.getModel();
		      int row = table.getSelectedRow();
		      int size = table.getRowCount();
	    	  dtm.removeRow(row);//fireEditingStopped();
	    	  if(row+1<size)
	    		  table.setRowSelectionInterval(row, row);
	    	  
	      }
	    });
	  }

	  public Component getTableCellEditorComponent(JTable table, Object value,
	      boolean isSelected, int row, int column) {
	    if (isSelected) {
	      button.setForeground(table.getSelectionForeground());
	      button.setBackground(table.getSelectionBackground());
	    } else {
	      button.setForeground(table.getForeground());
	      button.setBackground(table.getBackground());
	    }
	    label = (value == null) ? "" : value.toString();
	    button.setText(label);
	    isPushed = true;
	    return button;
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
	    //super.fireEditingStopped();
	  }
	}
