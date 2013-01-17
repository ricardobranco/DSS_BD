package Presentation_Layer.Componentes;

import Business_Layer.UtilizadorRegistado;
import Presentation_Layer.Perfil.Perfil;
import Presentation_Layer.Sale_Squared;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.LayoutStyle.ComponentPlacement;

import org.jdesktop.swingx.JXHyperlink;

public class Utilizador_Base extends JPanel {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private final Sale_Squared root;
    private final String username;
    private final UtilizadorRegistado ur;
    private final JButton button;
    private final JXHyperlink hprlnkUtlizador;

    /**
     * Create the panel.
     */
    public Utilizador_Base(final Sale_Squared root, String username) {

        this.root = root;
        this.username = username;
        this.ur = this.root.getSistema().encontrarUtilizadorReg(this.username);

        
        button = new JButton("");
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                abrirperfil();
            }
        });
        
        button.setIcon(new Avatar(new ImageIcon(ur.getImagem().getPath()).getImage()));

        
        hprlnkUtlizador = new JXHyperlink();
        hprlnkUtlizador.setForeground(new Color(0, 102, 204));
        hprlnkUtlizador.setText(this.username);
        hprlnkUtlizador.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
              abrirperfil();
            }
        });
        GroupLayout groupLayout = new GroupLayout(this);
        groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(
                Alignment.LEADING).addGroup(
                groupLayout
                .createSequentialGroup()
                .addComponent(button)
                .addPreferredGap(ComponentPlacement.RELATED)
                .addComponent(hprlnkUtlizador,
                GroupLayout.PREFERRED_SIZE, 144,
                GroupLayout.PREFERRED_SIZE)
                .addContainerGap(204, Short.MAX_VALUE)));
        groupLayout
                .setVerticalGroup(groupLayout
                .createParallelGroup(Alignment.LEADING)
                .addGroup(
                groupLayout
                .createSequentialGroup()
                .addGroup(
                groupLayout
                .createParallelGroup(
                Alignment.LEADING)
                .addComponent(
                button,
                GroupLayout.PREFERRED_SIZE,
                80,
                GroupLayout.PREFERRED_SIZE)
                .addGroup(
                groupLayout
                .createSequentialGroup()
                .addContainerGap()
                .addComponent(
                hprlnkUtlizador,
                GroupLayout.PREFERRED_SIZE,
                21,
                GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(220, Short.MAX_VALUE)));
        setLayout(groupLayout);

    }
    
    
    public void abrirperfil(){
        root.setBody(new Perfil(root, this.username), this.username);
    }
}
