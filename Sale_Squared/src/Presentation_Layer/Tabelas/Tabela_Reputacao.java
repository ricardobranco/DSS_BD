package Presentation_Layer.Tabelas;

import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.table.DefaultTableModel;

import Presentation_Layer.Componentes.ImageCellRender;
import Presentation_Layer.Perfil.Perfil;


public class Tabela_Reputacao extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static Icon POSITIVO = new ImageIcon(
			Perfil.class.getResource("/Imagens/positivo.png"));
	public static Icon NEUTRO = new ImageIcon(
			Perfil.class.getResource("/Imagens/neutro.png"));
	public static Icon NEGATIVO = new ImageIcon(
			Perfil.class.getResource("/Imagens/negativo.png"));

	private JTable table;

	/**
	 * Create the panel.
	 */
	public Tabela_Reputacao() {

		JScrollPane scrollPane = new JScrollPane();

		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] { "Todos",
				"Positivos", "Neutros", "Negativos" }));
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout
				.setHorizontalGroup(groupLayout
						.createParallelGroup(Alignment.LEADING)
						.addGroup(
								Alignment.TRAILING,
								groupLayout
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												groupLayout
														.createParallelGroup(
																Alignment.TRAILING)
														.addComponent(
																scrollPane,
																GroupLayout.DEFAULT_SIZE,
																438,
																Short.MAX_VALUE)
														.addComponent(
																comboBox,
																GroupLayout.PREFERRED_SIZE,
																109,
																GroupLayout.PREFERRED_SIZE))
										.addContainerGap()));
		groupLayout.setVerticalGroup(groupLayout.createParallelGroup(
				Alignment.LEADING).addGroup(
				groupLayout
						.createSequentialGroup()
						.addContainerGap()
						.addComponent(comboBox, GroupLayout.PREFERRED_SIZE,
								GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE,
								255, Short.MAX_VALUE).addContainerGap()));

		@SuppressWarnings("serial")
		DefaultTableModel dm = new DefaultTableModel() {
			@SuppressWarnings("rawtypes")
			Class[] columnTypes = new Class[] { Object.class, String.class,
					Object.class, Object.class, Object.class };

			@SuppressWarnings({ "rawtypes", "unchecked" })
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}

			boolean[] columnEditables = new boolean[] { false, false, false,
					false, false };

			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		};

		dm.setDataVector(new Object[][] {}, new Object[] { "Reputa��o",
				"Coment�rio", "Neg�cio", "De", "Data" });

		table = new JTable(dm);
		table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
		table.getColumn("Reputa��o").setCellRenderer(new ImageCellRender());
		table.setCellSelectionEnabled(false);
		scrollPane.setViewportView(table);
		// teste
		Object[] row1 = { POSITIVO, "exito", "cancelar", "", "" };
		Object[] row2 = { NEUTRO, "exito", "cancelar", null, null };
		Object[] row3 = { NEGATIVO, "exito", "cancelar", null, null };
		dm.addRow(row1);
		dm.addRow(row2);
		dm.addRow(row3);

		setLayout(groupLayout);

	}
}
