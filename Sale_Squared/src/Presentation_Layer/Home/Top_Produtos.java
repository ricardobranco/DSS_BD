package Presentation_Layer.Home;

import java.awt.Color;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.LayoutStyle.ComponentPlacement;

public class Top_Produtos extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public Top_Produtos() {

		JPanel panel = new JPanel();

		JPanel panel_1 = new JPanel();

		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(
				Alignment.LEADING).addGroup(
				Alignment.TRAILING,
				groupLayout
						.createSequentialGroup()
						.addComponent(panel, GroupLayout.DEFAULT_SIZE, 264,
								Short.MAX_VALUE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 180,
								GroupLayout.PREFERRED_SIZE)));
		groupLayout.setVerticalGroup(groupLayout
				.createParallelGroup(Alignment.LEADING)
				.addComponent(panel, GroupLayout.DEFAULT_SIZE,
						GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				.addComponent(panel_1, GroupLayout.DEFAULT_SIZE,
						GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

		JProgressBar progressBar = new JProgressBar();
		progressBar.setValue(100);

		JProgressBar progressBar_1 = new JProgressBar();
		progressBar_1.setValue(90);

		JProgressBar progressBar_2 = new JProgressBar();
		progressBar_2.setValue(80);

		JProgressBar progressBar_3 = new JProgressBar();
		progressBar_3.setValue(70);

		JProgressBar progressBar_4 = new JProgressBar();
		progressBar_4.setValue(60);

		JProgressBar progressBar_5 = new JProgressBar();
		progressBar_5.setValue(50);

		JProgressBar progressBar_6 = new JProgressBar();
		progressBar_6.setValue(40);

		JProgressBar progressBar_7 = new JProgressBar();
		progressBar_7.setValue(30);

		JProgressBar progressBar_8 = new JProgressBar();
		progressBar_8.setValue(20);

		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(gl_panel_1.createParallelGroup(
				Alignment.LEADING).addGroup(
				gl_panel_1
						.createSequentialGroup()
						.addContainerGap()
						.addGroup(
								gl_panel_1
										.createParallelGroup(Alignment.LEADING)
										.addComponent(progressBar,
												GroupLayout.DEFAULT_SIZE, 201,
												Short.MAX_VALUE)
										.addComponent(progressBar_1,
												GroupLayout.DEFAULT_SIZE, 201,
												Short.MAX_VALUE)
										.addComponent(progressBar_2,
												GroupLayout.DEFAULT_SIZE, 201,
												Short.MAX_VALUE)
										.addComponent(progressBar_3,
												Alignment.TRAILING,
												GroupLayout.DEFAULT_SIZE, 201,
												Short.MAX_VALUE)
										.addComponent(progressBar_4,
												GroupLayout.DEFAULT_SIZE, 201,
												Short.MAX_VALUE)
										.addComponent(progressBar_5,
												GroupLayout.DEFAULT_SIZE, 201,
												Short.MAX_VALUE)
										.addComponent(progressBar_6,
												GroupLayout.DEFAULT_SIZE, 201,
												Short.MAX_VALUE)
										.addComponent(progressBar_8,
												GroupLayout.DEFAULT_SIZE, 201,
												Short.MAX_VALUE)
										.addComponent(progressBar_7,
												GroupLayout.DEFAULT_SIZE, 201,
												Short.MAX_VALUE))
						.addContainerGap()));
		gl_panel_1.setVerticalGroup(gl_panel_1.createParallelGroup(
				Alignment.LEADING).addGroup(
				gl_panel_1
						.createSequentialGroup()
						.addContainerGap()
						.addComponent(progressBar, GroupLayout.DEFAULT_SIZE,
								20, Short.MAX_VALUE)
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addComponent(progressBar_1, GroupLayout.DEFAULT_SIZE,
								20, Short.MAX_VALUE)
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addComponent(progressBar_2, GroupLayout.DEFAULT_SIZE,
								20, Short.MAX_VALUE)
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addComponent(progressBar_3, GroupLayout.DEFAULT_SIZE,
								20, Short.MAX_VALUE)
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addComponent(progressBar_4, GroupLayout.DEFAULT_SIZE,
								20, Short.MAX_VALUE)
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addComponent(progressBar_5, GroupLayout.DEFAULT_SIZE,
								20, Short.MAX_VALUE)
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addComponent(progressBar_6, GroupLayout.DEFAULT_SIZE,
								20, Short.MAX_VALUE)
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addComponent(progressBar_7, GroupLayout.DEFAULT_SIZE,
								GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addComponent(progressBar_8, GroupLayout.DEFAULT_SIZE,
								20, Short.MAX_VALUE).addGap(6)));
		panel_1.setLayout(gl_panel_1);

		JLabel lblNewLabel = new JLabel("Tag");
		lblNewLabel.setForeground(new Color(0, 102, 204));

		JLabel lblNewLabel_1 = new JLabel("Tag");
		lblNewLabel_1.setForeground(new Color(0, 102, 204));

		JLabel lblNewLabel_2 = new JLabel("Tag");
		lblNewLabel_2.setForeground(new Color(0, 102, 204));

		JLabel lblNewLabel_3 = new JLabel("Tag");
		lblNewLabel_3.setForeground(new Color(0, 102, 204));

		JLabel lblNewLabel_4 = new JLabel("Tag");
		lblNewLabel_4.setForeground(new Color(0, 102, 204));

		JLabel lblNewLabel_5 = new JLabel("Tag");
		lblNewLabel_5.setForeground(new Color(0, 102, 204));

		JLabel lblNewLabel_6 = new JLabel("Tag");
		lblNewLabel_6.setForeground(new Color(0, 102, 204));

		JLabel lblNewLabel_7 = new JLabel("Tag");
		lblNewLabel_7.setForeground(new Color(0, 102, 204));

		JLabel lblNewLabel_8 = new JLabel("Tag");
		lblNewLabel_8.setForeground(new Color(0, 102, 204));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(gl_panel.createParallelGroup(
				Alignment.LEADING).addGroup(
				gl_panel.createSequentialGroup()
						.addContainerGap(158, Short.MAX_VALUE)
						.addGroup(
								gl_panel.createParallelGroup(Alignment.LEADING)
										.addComponent(lblNewLabel,
												Alignment.TRAILING)
										.addComponent(lblNewLabel_4,
												Alignment.TRAILING)
										.addComponent(lblNewLabel_3,
												Alignment.TRAILING)
										.addComponent(lblNewLabel_2,
												Alignment.TRAILING)
										.addComponent(lblNewLabel_1,
												Alignment.TRAILING)
										.addComponent(lblNewLabel_5,
												Alignment.TRAILING)
										.addComponent(lblNewLabel_6,
												Alignment.TRAILING)
										.addComponent(lblNewLabel_7,
												Alignment.TRAILING)
										.addComponent(lblNewLabel_8,
												Alignment.TRAILING))
						.addContainerGap()));
		gl_panel.setVerticalGroup(gl_panel.createParallelGroup(
				Alignment.LEADING).addGroup(
				gl_panel.createSequentialGroup()
						.addContainerGap()
						.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE,
								GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addGap(18)
						.addComponent(lblNewLabel_1, GroupLayout.DEFAULT_SIZE,
								16, Short.MAX_VALUE)
						.addGap(18)
						.addComponent(lblNewLabel_5, GroupLayout.DEFAULT_SIZE,
								16, Short.MAX_VALUE)
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addComponent(lblNewLabel_6, GroupLayout.DEFAULT_SIZE,
								16, Short.MAX_VALUE)
						.addGap(18)
						.addComponent(lblNewLabel_7, GroupLayout.DEFAULT_SIZE,
								16, Short.MAX_VALUE)
						.addGap(18)
						.addComponent(lblNewLabel_8, GroupLayout.DEFAULT_SIZE,
								16, Short.MAX_VALUE)
						.addGap(12)
						.addComponent(lblNewLabel_2, GroupLayout.DEFAULT_SIZE,
								16, Short.MAX_VALUE)
						.addGap(18)
						.addComponent(lblNewLabel_3, GroupLayout.DEFAULT_SIZE,
								16, Short.MAX_VALUE)
						.addGap(18)
						.addComponent(lblNewLabel_4, GroupLayout.DEFAULT_SIZE,
								16, Short.MAX_VALUE).addContainerGap()));
		panel.setLayout(gl_panel);
		setLayout(groupLayout);

	}
}
