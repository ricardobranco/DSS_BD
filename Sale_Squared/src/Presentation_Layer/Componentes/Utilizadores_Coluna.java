package Presentation_Layer.Componentes;

import Business_Layer.UtilizadorRegistado;
import Presentation_Layer.Sale_Squared;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JPanel;
import javax.swing.LayoutStyle.ComponentPlacement;

public class Utilizadores_Coluna extends JPanel {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private final Sale_Squared root;
    private List<JPanel> jpanels;
    private List<UtilizadorRegistado> users;

    /**
     * Create the panel.
     */
    public Utilizadores_Coluna(final Sale_Squared root, Collection<UtilizadorRegistado> users) {

        this.root = root;
        this.jpanels = new ArrayList<>();
        this.users = new ArrayList<>();
        JPanel panel = new JPanel();
        JPanel panel_1 = new JPanel();
        JPanel panel_2 = new JPanel();
        JPanel panel_3 = new JPanel();
        JPanel panel_4 = new JPanel();

        jpanels.add(panel);
        jpanels.add(panel_1);
        jpanels.add(panel_2);
        jpanels.add(panel_3);
        jpanels.add(panel_4);

        for (JPanel jp : jpanels) {
            jp.setVisible(false);
        }

        for (UtilizadorRegistado ur : users) {
            users.add(ur);
        }


        GroupLayout groupLayout = new GroupLayout(this);
        groupLayout
                .setHorizontalGroup(groupLayout
                .createParallelGroup(Alignment.TRAILING)
                .addGroup(
                groupLayout
                .createSequentialGroup()
                .addContainerGap()
                .addGroup(
                groupLayout
                .createParallelGroup(
                Alignment.TRAILING)
                .addComponent(
                panel,
                Alignment.LEADING,
                GroupLayout.PREFERRED_SIZE,
                322,
                Short.MAX_VALUE)
                .addComponent(
                panel_1,
                Alignment.LEADING,
                GroupLayout.PREFERRED_SIZE,
                322,
                Short.MAX_VALUE)
                .addComponent(
                panel_4,
                Alignment.LEADING,
                GroupLayout.DEFAULT_SIZE,
                322,
                Short.MAX_VALUE)
                .addComponent(
                panel_3,
                Alignment.LEADING,
                GroupLayout.DEFAULT_SIZE,
                322,
                Short.MAX_VALUE)
                .addComponent(
                panel_2,
                Alignment.LEADING,
                GroupLayout.DEFAULT_SIZE,
                322,
                Short.MAX_VALUE))
                .addContainerGap()));
        groupLayout.setVerticalGroup(groupLayout.createParallelGroup(
                Alignment.TRAILING).addGroup(
                groupLayout
                .createSequentialGroup()
                .addContainerGap()
                .addComponent(panel, GroupLayout.DEFAULT_SIZE, 81,
                Short.MAX_VALUE)
                .addPreferredGap(ComponentPlacement.RELATED)
                .addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 81,
                Short.MAX_VALUE)
                .addPreferredGap(ComponentPlacement.RELATED)
                .addComponent(panel_2, GroupLayout.DEFAULT_SIZE, 81,
                Short.MAX_VALUE)
                .addPreferredGap(ComponentPlacement.RELATED)
                .addComponent(panel_3, GroupLayout.DEFAULT_SIZE, 81,
                Short.MAX_VALUE)
                .addPreferredGap(ComponentPlacement.RELATED)
                .addComponent(panel_4, GroupLayout.DEFAULT_SIZE, 81,
                Short.MAX_VALUE).addGap(2)));

        for (JPanel jp : jpanels) {
            jp.setLayout(new CardLayout(0, 0));
        }

        for (int i = 0; i < jpanels.size() && i < this.users.size(); i++) {
            this.jpanels.get(i).add(new Utilizador_Base(root, this.users.get(i).getUsername()));

        }




        setLayout(groupLayout);

    }
}
