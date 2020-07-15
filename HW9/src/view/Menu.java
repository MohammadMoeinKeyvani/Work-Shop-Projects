/*
 * Created by JFormDesigner on Wed Jul 15 15:21:41 IRDT 2020
 */

package view;

import java.awt.event.*;
import javax.swing.*;
import net.miginfocom.swing.*;

/**
 * @author mohammad
 */
public class Menu extends JFrame {
    public Menu() {
        initComponents();
    }

    private void button1ActionPerformed(ActionEvent e) {
        dispose();
        AddViolation addViolation = new AddViolation();
        addViolation.setVisible(true);
        addViolation.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void button2ActionPerformed(ActionEvent e) {
        dispose();
        EditViolation editViolation = new EditViolation();
        editViolation.setVisible(true);
        editViolation.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void button3ActionPerformed(ActionEvent e) {
        dispose();
        RemoveViolation removeViolation = new RemoveViolation();
        removeViolation.setVisible(true);
        removeViolation.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - mohammad
        label1 = new JLabel();
        button1 = new JButton();
        button2 = new JButton();
        button3 = new JButton();

        //======== this ========
        setTitle("Welcome!");
        var contentPane = getContentPane();
        contentPane.setLayout(new MigLayout(
            "hidemode 3",
            // columns
            "[113,fill]" +
            "[132,fill]" +
            "[110,fill]",
            // rows
            "[38]" +
            "[39]" +
            "[39]" +
            "[48]" +
            "[43]"));

        //---- label1 ----
        label1.setText("Menu :");
        label1.setFont(label1.getFont().deriveFont(label1.getFont().getSize() + 6f));
        contentPane.add(label1, "cell 0 0,alignx center,growx 0");

        //---- button1 ----
        button1.setText("Record Violation");
        button1.setFont(button1.getFont().deriveFont(button1.getFont().getSize() + 4f));
        button1.addActionListener(e -> button1ActionPerformed(e));
        contentPane.add(button1, "cell 1 1");

        //---- button2 ----
        button2.setText("Edit Violation");
        button2.setFont(button2.getFont().deriveFont(button2.getFont().getSize() + 4f));
        button2.addActionListener(e -> button2ActionPerformed(e));
        contentPane.add(button2, "cell 1 2");

        //---- button3 ----
        button3.setText("Remove Violation");
        button3.setFont(button3.getFont().deriveFont(button3.getFont().getSize() + 4f));
        button3.addActionListener(e -> button3ActionPerformed(e));
        contentPane.add(button3, "cell 1 3");
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - mohammad
    private JLabel label1;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
