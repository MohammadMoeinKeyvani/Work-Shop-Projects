import java.awt.event.*;
import javax.swing.*;
import net.miginfocom.swing.*;
/*
 * Created by JFormDesigner on Fri Jul 10 23:29:37 IRDT 2020
 */



/**
 * @author mohammad
 */
public class MainUI extends JFrame {
    public MainUI() {
        initComponents();
    }

    private void button1ActionPerformed(ActionEvent e) {
        dispose();
        Beginner beginner = new Beginner();
        beginner.setVisible(true);
        beginner.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void button2ActionPerformed(ActionEvent e) {
        dispose();
        Elementary elementary = new Elementary();
        elementary.setVisible(true);
        elementary.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void button3ActionPerformed(ActionEvent e) {
        dispose();
        Intermediate intermediate = new Intermediate();
        intermediate.setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void button4ActionPerformed(ActionEvent e) {
        dispose();
        Teachers teachers = new Teachers();
        teachers.setVisible(true);
        teachers.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void button5ActionPerformed(ActionEvent e) {
        dispose();
        Enrollment enrollment = new Enrollment();
        enrollment.setVisible(true);
        enrollment.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void button6ActionPerformed(ActionEvent e) {
        dispose();
        StudentInfo studentInfo = new StudentInfo();
        studentInfo.setVisible(true);
        studentInfo.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - mohammad
        label1 = new JLabel();
        label2 = new JLabel();
        button1 = new JButton();
        button2 = new JButton();
        button3 = new JButton();
        button4 = new JButton();
        button5 = new JButton();
        button6 = new JButton();

        //======== this ========
        setTitle("Wellcome");
        var contentPane = getContentPane();
        contentPane.setLayout(new MigLayout(
            "hidemode 3",
            // columns
            "[22,fill]" +
            "[109,fill]" +
            "[110,fill]" +
            "[105,fill]" +
            "[46,fill]",
            // rows
            "[55]" +
            "[]" +
            "[63]" +
            "[54]" +
            "[61]" +
            "[55]" +
            "[56]"));

        //---- label1 ----
        label1.setText("Wellcome !!");
        label1.setFont(label1.getFont().deriveFont(label1.getFont().getSize() + 6f));
        contentPane.add(label1, "cell 2 0");

        //---- label2 ----
        label2.setText("Choose Your Level:");
        contentPane.add(label2, "cell 1 1");

        //---- button1 ----
        button1.setText("Beginner");
        button1.addActionListener(e -> button1ActionPerformed(e));
        contentPane.add(button1, "cell 2 2");

        //---- button2 ----
        button2.setText("Elemntry");
        button2.addActionListener(e -> button2ActionPerformed(e));
        contentPane.add(button2, "cell 2 3");

        //---- button3 ----
        button3.setText("Intermediate");
        button3.addActionListener(e -> button3ActionPerformed(e));
        contentPane.add(button3, "cell 2 4");

        //---- button4 ----
        button4.setText("Teachers");
        button4.addActionListener(e -> button4ActionPerformed(e));
        contentPane.add(button4, "cell 2 5");

        //---- button5 ----
        button5.setText("Enrollment");
        button5.addActionListener(e -> button5ActionPerformed(e));
        contentPane.add(button5, "cell 1 6");

        //---- button6 ----
        button6.setText("Student info");
        button6.addActionListener(e -> button6ActionPerformed(e));
        contentPane.add(button6, "cell 3 6");
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - mohammad
    private JLabel label1;
    private JLabel label2;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
