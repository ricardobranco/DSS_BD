package Presentation_Layer.Anuncio;

import Business_Layer.AnuncioVenda;
import Business_Layer.ModoVenda;
import java.awt.CardLayout;
import java.awt.Font;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.LayoutStyle.ComponentPlacement;

import Presentation_Layer.Sale_Squared;
import Presentation_Layer.Tabbed.Tabbed_Anuncio;
import Presentation_Layer.Tabbed.Tabbed_Sugestoes;

public class Anuncio_Main extends JPanel {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    /**
     * Create the panel.
     */
    private Business_Layer.Anuncio anuncio;

    public Anuncio_Main(final Sale_Squared root, AnuncioVenda anuncio) {

        this.anuncio = anuncio;
        JLabel lblNewLabel = new JLabel("Titulo do Negócio");
        lblNewLabel.setFont(new Font("Lucida Grande", Font.BOLD, 35));
        ImagePanel imagepanel = new ImagePanel();
        JPanel panel = new JPanel();

        JPanel panel_1 = new JPanel();

        JPanel panel_2 = new JPanel();

        JPanel panel_3 = new JPanel();
       
        
        
        
        
        
        
        GroupLayout groupLayout = new GroupLayout(this);
        groupLayout
                .setHorizontalGroup(groupLayout
                .createParallelGroup(Alignment.TRAILING)
                .addGroup(
                groupLayout
                .createSequentialGroup()
                .addGroup(
                groupLayout
                .createParallelGroup(
                Alignment.LEADING)
                .addGroup(
                groupLayout
                .createSequentialGroup()
                .addGap(22)
                .addComponent(
                lblNewLabel,
                GroupLayout.DEFAULT_SIZE,
                903,
                Short.MAX_VALUE))
                .addGroup(
                groupLayout
                .createSequentialGroup()
                .addContainerGap()
                .addGroup(
                groupLayout
                .createParallelGroup(
                Alignment.LEADING)
                .addComponent(
                panel_3,
                GroupLayout.DEFAULT_SIZE,
                496,
                Short.MAX_VALUE)
                .addComponent(
                panel_1,
                GroupLayout.DEFAULT_SIZE,
                GroupLayout.DEFAULT_SIZE,
                Short.MAX_VALUE))
                .addPreferredGap(
                ComponentPlacement.RELATED)
                .addGroup(
                groupLayout
                .createParallelGroup(
                Alignment.LEADING)
                .addComponent(
                panel,
                GroupLayout.PREFERRED_SIZE,
                436,
                Short.MAX_VALUE)
                .addComponent(
                panel_2,
                GroupLayout.DEFAULT_SIZE,
                423,
                Short.MAX_VALUE))))
                .addContainerGap()));
        groupLayout
                .setVerticalGroup(groupLayout
                .createParallelGroup(Alignment.TRAILING)
                .addGroup(
                groupLayout
                .createSequentialGroup()
                .addGap(24)
                .addComponent(lblNewLabel)
                .addGap(6)
                .addGroup(
                groupLayout
                .createParallelGroup(
                Alignment.TRAILING)
                .addGroup(
                groupLayout
                .createSequentialGroup()
                .addComponent(
                panel_3,
                GroupLayout.DEFAULT_SIZE,
                218,
                Short.MAX_VALUE)
                .addPreferredGap(
                ComponentPlacement.RELATED)
                .addComponent(
                panel_1,
                GroupLayout.DEFAULT_SIZE,
                408,
                Short.MAX_VALUE))
                .addGroup(
                groupLayout
                .createSequentialGroup()
                .addComponent(
                panel,
                GroupLayout.DEFAULT_SIZE,
                410,
                Short.MAX_VALUE)
                .addPreferredGap(
                ComponentPlacement.RELATED)
                .addComponent(
                panel_2,
                GroupLayout.DEFAULT_SIZE,
                216,
                Short.MAX_VALUE)))
                .addGap(15)));
        panel_2.setLayout(new CardLayout(0, 0));
        panel_2.add(new Tabbed_Sugestoes(root,anuncio), "Mais sugestoes");

        panel_3.setLayout(new CardLayout(0, 0));
        panel_3.add(imagepanel, "Imagem");
        panel_1.setLayout(new CardLayout(0, 0));
        panel_1.add(new Tabbed_Anuncio(anuncio, imagepanel), "Info");
        panel.setLayout(new CardLayout(0, 0));
        panel.add(new Anuncio_Info(root, anuncio), "Compra");
        setLayout(groupLayout);

    }

  
}
