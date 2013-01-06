package Presentation_Layer.Componentes;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.LayoutStyle.ComponentPlacement;

import org.jdesktop.swingx.JXHyperlink;

import Presentation_Layer.Sale_Squared;
import Presentation_Layer.Anuncio.Anuncio_Main;

public class Produto_Base extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public Produto_Base(final Sale_Squared root, String titulo, boolean tpreco,
			float preco, boolean tulic, float ulic, String tempRest) {

		JButton button = new JButton("");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JPanel anuncio = new Anuncio_Main(root);
				root.setBody(anuncio, "Nome do anuncio");

			}
		});
		button.setIcon(new ImageIcon(Produto_Base.class
				.getResource("/Imagens/Sem_Imagem.png")));
		JLabel lblMin = new JLabel("50");

		if (tulic)
			lblMin.setText("� " + ulic);
		else
			lblMin.setVisible(false);

		JLabel label = new JLabel("100");

		if (tpreco)
			label.setText("� " + preco);
		else
			label.setVisible(false);

		label.setFont(new Font("Lucida Grande", Font.BOLD, 13));

		JLabel label_1 = new JLabel(tempRest);
		label_1.setFont(new Font("Lucida Grande", Font.BOLD | Font.ITALIC, 13));

		JXHyperlink hprlnkNegcio = new JXHyperlink();
		hprlnkNegcio.setForeground(new Color(0, 102, 204));
		hprlnkNegcio.setText(titulo);
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout
				.setHorizontalGroup(groupLayout
						.createParallelGroup(Alignment.LEADING)
						.addGroup(
								groupLayout
										.createSequentialGroup()
										.addComponent(button)
										.addPreferredGap(
												ComponentPlacement.RELATED)
										.addGroup(
												groupLayout
														.createParallelGroup(
																Alignment.LEADING)
														.addComponent(
																lblMin,
																Alignment.TRAILING)
														.addGroup(
																groupLayout
																		.createSequentialGroup()
																		.addGroup(
																				groupLayout
																						.createParallelGroup(
																								Alignment.TRAILING,
																								false)
																						.addComponent(
																								hprlnkNegcio,
																								Alignment.LEADING,
																								GroupLayout.DEFAULT_SIZE,
																								GroupLayout.DEFAULT_SIZE,
																								Short.MAX_VALUE)
																						.addComponent(
																								label_1,
																								Alignment.LEADING,
																								GroupLayout.DEFAULT_SIZE,
																								GroupLayout.DEFAULT_SIZE,
																								Short.MAX_VALUE))
																		.addPreferredGap(
																				ComponentPlacement.RELATED,
																				237,
																				Short.MAX_VALUE)
																		.addComponent(
																				label)))
										.addContainerGap()));
		groupLayout
				.setVerticalGroup(groupLayout
						.createParallelGroup(Alignment.LEADING)
						.addComponent(button, GroupLayout.PREFERRED_SIZE, 79,
								GroupLayout.PREFERRED_SIZE)
						.addGroup(
								groupLayout
										.createSequentialGroup()
										.addContainerGap()
										.addComponent(hprlnkNegcio,
												GroupLayout.PREFERRED_SIZE, 13,
												GroupLayout.PREFERRED_SIZE)
										.addGap(10)
										.addComponent(lblMin,
												GroupLayout.PREFERRED_SIZE, 21,
												Short.MAX_VALUE)
										.addPreferredGap(
												ComponentPlacement.RELATED)
										.addGroup(
												groupLayout
														.createParallelGroup(
																Alignment.BASELINE)
														.addComponent(
																label,
																GroupLayout.DEFAULT_SIZE,
																GroupLayout.DEFAULT_SIZE,
																Short.MAX_VALUE)
														.addComponent(
																label_1,
																GroupLayout.DEFAULT_SIZE,
																GroupLayout.DEFAULT_SIZE,
																Short.MAX_VALUE))
										.addGap(13)));
		setLayout(groupLayout);

	}
}
