import java.awt.event.*;
import javax.swing.*;
import net.miginfocom.swing.*;
/*
 * Created by JFormDesigner on Sat Jul 11 00:24:46 IRDT 2020
 */



/**
 * @author mohammad
 */
public class Enrollment extends JFrame {
    public Enrollment() {
        initComponents();
    }

    private void button1ActionPerformed(ActionEvent e) {
        LanguageInstitute l = new LanguageInstitute();
        l.setName(textField1.getText());
        l.setNumber(textField2.getText());
        l.setLevel(textField3.getText());
        JOptionPane.showMessageDialog(null,"We will call you very soon :)");
    }

    private void button2ActionPerformed(ActionEvent e) {
        dispose();
        MainUI mainUI = new MainUI();
        mainUI.setVisible(true);
        mainUI.setDefaultCloseOperation(EXIT_ON_CLOSE);
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
        setTitle("Enrollment");
        var contentPane = getContentPane();
        contentPane.setLayout(new MigLayout(
            "hidemode 3",
            // columns
            "[130,fill]" +
            "[136,fill]" +
            "[114,fill]",
            // rows
            "[61]" +
            "[59]" +
            "[47]" +
            "[63]" +
            "[39]"));

        //---- label1 ----
        label1.setText("Name :");
        contentPane.add(label1, "cell 0 0");
        contentPane.add(textField1, "cell 1 0");

        //---- label2 ----
        label2.setText("Phone Number :");
        contentPane.add(label2, "cell 0 1");
        contentPane.add(textField2, "cell 1 1");

        //---- label3 ----
        label3.setText("Level :");
        contentPane.add(label3, "cell 0 2");
        contentPane.add(textField3, "cell 1 2");

        //---- button1 ----
        button1.setText("Send");
        button1.addActionListener(e -> button1ActionPerformed(e));
        contentPane.add(button1, "cell 1 3");

        //---- button2 ----
        button2.setText("Back to main menu");
        button2.addActionListener(e -> button2ActionPerformed(e));
        contentPane.add(button2, "cell 0 4");
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
