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
import Presentation_Layer.Componentes.HyperLinkEditor;
import Presentation_Layer.Componentes.HyperLinkRenderer;
import Presentation_Layer.Negocio.Anuncio;

public class Tabela_licitacao extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public Tabela_licitacao(final Sale_Squared root) {
		
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
		
		@SuppressWarnings("serial")
		DefaultTableModel dm = new DefaultTableModel(){
			@SuppressWarnings("rawtypes")
			Class[] columnTypes = new Class[] {
				Object.class, String.class, Object.class,Object.class
			};
			@SuppressWarnings({ "rawtypes", "unchecked" })
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
			boolean[] columnEditables = new boolean[] {
				false, true, false,false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		};
		
		ActionListener abre = new ActionListener() {
		      public void actionPerformed(ActionEvent e) {
			    	 root.setBody(new Anuncio(root), "Anuncio");
			    	 
		    	  
		      }
		    };
		dm.setDataVector(new Object[][] {}, new Object[] { "Data", "Neg—cio","Valor","Estado"});
		
		JXTable table = new JXTable(dm);	
		table.getColumn("Neg—cio").setCellRenderer(new HyperLinkRenderer());
		table.getColumn("Neg—cio").setCellEditor(
		        new HyperLinkEditor(new JCheckBox(),abre));
		   
		table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
	    table.setCellSelectionEnabled(false);
	    scrollPane.setViewportView(table);
	    //teste
	    
	    Object[] row1 = {"3/1/2013","Neg—cio","Û 15","Aberto"};
	    Object[] row2 = {"3/1/2013","Neg—cio 2","Û 30","Vencedora"};
	    Object[] row3 = {"3/1/2013","Neg—cio 3","Û 45","Sem sucesso"};
		dm.addRow(row1);
		dm.addRow(row2);
		dm.addRow(row3);
		
		
		scrollPane.setViewportView(table);
		setLayout(groupLayout);

	}
	
	
}
