import java.awt.event.*;
import javax.swing.*;
import net.miginfocom.swing.*;
/*
 * Created by JFormDesigner on Sat Jul 11 00:53:45 IRDT 2020
 */



/**
 * @author mohammad
 */
public class StudentInfo extends JFrame {
    public StudentInfo() {
        initComponents();
    }

    private void button1ActionPerformed(ActionEvent e) {
        dispose();
        MainUI mainUI = new MainUI();
        mainUI.setVisible(true);
        mainUI.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    LanguageInstitute l = new LanguageInstitute();


    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - mohammad
        label1 = new JLabel();
        label4 = new JLabel();
        label2 = new JLabel();
        label5 = new JLabel();
        label3 = new JLabel();
        label6 = new JLabel();
        button1 = new JButton();
        label4.setText(l.getName());
        label5.setText(l.getNumber());
        label6.setText(l.getLevel());

        //======== this ========
        var contentPane = getContentPane();
        contentPane.setLayout(new MigLayout(
            "hidemode 3",
            // columns
            "[94,fill]" +
            "[137,fill]" +
            "[65,fill]",
            // rows
            "[45]" +
            "[47]" +
            "[48]" +
            "[60]" +
            "[]"));

        //---- label1 ----
        label1.setText("Name :");
        contentPane.add(label1, "cell 0 0");
        contentPane.add(label4, "cell 1 0");

        //---- label2 ----
        label2.setText("Phone Number :");
        contentPane.add(label2, "cell 0 1");
        contentPane.add(label5, "cell 1 1");

        //---- label3 ----
        label3.setText("Level :");
        contentPane.add(label3, "cell 0 2");
        contentPane.add(label6, "cell 1 2");

        //---- button1 ----
        button1.setText("Back to main menu");
        button1.addActionListener(e -> button1ActionPerformed(e));
        contentPane.add(button1, "cell 0 3");
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - mohammad
    private JLabel label1;
    private JLabel label4;
    private JLabel label2;
    private JLabel label5;
    private JLabel label3;
    private JLabel label6;
    private JButton button1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
