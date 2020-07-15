/*
 * Created by JFormDesigner on Wed Jul 15 15:27:20 IRDT 2020
 */

package view;

import java.awt.event.*;
import javax.swing.*;

import controller.Controller;
import net.miginfocom.swing.*;

/**
 * @author mohammad
 */
public class EditViolation extends JFrame {
    public EditViolation() {
        initComponents();
    }

    private void button1ActionPerformed(ActionEvent e) {
        Controller controller = new Controller();
        controller.update(textField1.getText(),textField2.getText(),textField3.getText());
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
        label2 = new JLabel();
        textField2 = new JTextField();
        label3 = new JLabel();
        textField3 = new JTextField();
        button1 = new JButton();
        button2 = new JButton();

        //======== this ========
        setTitle("Edit");
        var contentPane = getContentPane();
        contentPane.setLayout(new MigLayout(
            "hidemode 3",
            // columns
            "[22,fill]" +
            "[111,fill]" +
            "[123,fill]" +
            "[29,fill]",
            // rows
            "[20]" +
            "[45]" +
            "[48]" +
            "[50]" +
            "[31]" +
            "[37]" +
            "[26]"));

        //---- label1 ----
        label1.setText("Enter ID :");
        contentPane.add(label1, "cell 1 1");
        contentPane.add(textField1, "cell 2 1");

        //---- label2 ----
        label2.setText("New Number Plate :");
        contentPane.add(label2, "cell 1 2");
        contentPane.add(textField2, "cell 2 2");

        //---- label3 ----
        label3.setText("New Model :");
        contentPane.add(label3, "cell 1 3");
        contentPane.add(textField3, "cell 2 3");

        //---- button1 ----
        button1.setText("Edit");
        button1.addActionListener(e -> button1ActionPerformed(e));
        contentPane.add(button1, "cell 2 4");

        //---- button2 ----
        button2.setText("Back to Menu");
        button2.addActionListener(e -> button2ActionPerformed(e));
        contentPane.add(button2, "cell 1 5");
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - mohammad
    private JLabel label1;
    private JTextField textField1;
    private JLabel label2;
    private JTextField textField2;
    private JLabel label3;
    private JTextField textField3;
    private JButton button1;
    private JButton button2;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
