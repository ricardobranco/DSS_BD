package Presentation_Layer.Anuncio;

import Business_Layer.AnuncioVenda;
import Business_Layer.Leilao;
import Presentation_Layer.Sale_Squared;
import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Anuncio_Leilao extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField lic;
        

	/**
	 * Create the panel.
	 */
	public Anuncio_Leilao(final Sale_Squared root,final AnuncioVenda anuncio) {
            
            
                
		Leilao l = (Leilao) anuncio.getTipoVenda();
		JLabel label = new JLabel("Licitação actual:");
		label.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		
		JLabel licatual = new JLabel("€"+l.getPrecoActual());
		licatual.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		
		JLabel label_2 = new JLabel("Licitação máxima:");
		label_2.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		
		JLabel label_3 = new JLabel("€");
		label_3.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		
                double minlic = l.getPrecoActual()+l.getIncrementoMinimo();
                
		JLabel info = new JLabel("(Tem que licitar €" + minlic +" para cima)");
		info.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		
		lic = new JTextField();
		lic.setColumns(10);
		
		JButton button = new JButton("Licitar");
                button.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {
                            
                    
                }
            });
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(13)
							.addComponent(label, GroupLayout.PREFERRED_SIZE, 107, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(licatual, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(label_2, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(label_3, GroupLayout.PREFERRED_SIZE, 9, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(lic, GroupLayout.PREFERRED_SIZE, 134, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(button, GroupLayout.PREFERRED_SIZE, 83, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(153)
							.addComponent(info, GroupLayout.PREFERRED_SIZE, 169, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(68, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(label)
						.addComponent(licatual))
					.addGap(6)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(6)
							.addComponent(label_2))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(6)
							.addComponent(label_3))
						.addComponent(lic, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(1)
							.addComponent(button)))
					.addGap(6)
					.addComponent(info, GroupLayout.PREFERRED_SIZE, 13, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(223, Short.MAX_VALUE))
		);
		setLayout(groupLayout);

	}
}
