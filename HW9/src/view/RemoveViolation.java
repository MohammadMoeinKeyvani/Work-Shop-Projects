/*
 * Created by JFormDesigner on Wed Jul 15 15:27:44 IRDT 2020
 */

package view;

import java.awt.event.*;
import javax.swing.*;

import controller.Controller;
import net.miginfocom.swing.*;

/**
 * @author mohammad
 */
public class RemoveViolation extends JFrame {
    public RemoveViolation() {
        initComponents();
    }

    private void button1ActionPerformed(ActionEvent e) {
        Controller controller = new Controller();
        controller.remove(textField1.getText());
        JOptionPane.showMessageDialog(null,"The operation was successful");
    }

    private void button2ActionPerformed(ActionEvent e) {
        dispose();
        Menu menu = new Menu();
        menu.setVisible(true);
        menu.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - mohammad
        label1 = new JLabel();
        textField1 = new JTextField();
        button1 = new JButton();
        button2 = new JButton();

        //======== this ========
        setTitle("Remove");
        var contentPane = getContentPane();
        contentPane.setLayout(new MigLayout(
            "hidemode 3",
            // columns
            "[fill]" +
            "[79,fill]" +
            "[116,fill]" +
            "[64,fill]",
            // rows
            "[28]" +
            "[48]" +
            "[45]" +
            "[51]"));

        //---- label1 ----
        label1.setText("Enter ID :");
        contentPane.add(label1, "cell 1 1");
        contentPane.add(textField1, "cell 2 1");

        //---- button1 ----
        button1.setText("Remove");
        button1.addActionListener(e -> button1ActionPerformed(e));
        contentPane.add(button1, "cell 2 2");

        //---- button2 ----
        button2.setText("Back to Menu");
        button2.addActionListener(e -> button2ActionPerformed(e));
        contentPane.add(button2, "cell 1 3");
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - mohammad
    private JLabel label1;
    private JTextField textField1;
    private JButton button1;
    private JButton button2;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
