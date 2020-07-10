import java.awt.event.*;
import javax.swing.*;
import net.miginfocom.swing.*;
/*
 * Created by JFormDesigner on Fri Jul 10 23:38:55 IRDT 2020
 */



/**
 * @author mohammad
 */
public class Teachers extends JFrame {
    public Teachers() {
        initComponents();
    }

    private void button1ActionPerformed(ActionEvent e) {
        dispose();
        MainUI mainUI = new MainUI();
        mainUI.setVisible(true);
        mainUI.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - mohammad
        label1 = new JLabel();
        label6 = new JLabel();
        label2 = new JLabel();
        label7 = new JLabel();
        label3 = new JLabel();
        label8 = new JLabel();
        label4 = new JLabel();
        label9 = new JLabel();
        label5 = new JLabel();
        label10 = new JLabel();
        button1 = new JButton();

        //======== this ========
        setTitle("Teachers");
        var contentPane = getContentPane();
        contentPane.setLayout(new MigLayout(
            "hidemode 3",
            // columns
            "[117,fill]" +
            "[223,fill]",
            // rows
            "[55]" +
            "[57]" +
            "[53]" +
            "[50]" +
            "[53]" +
            "[]" +
            "[]"));

        //---- label1 ----
        label1.setText("Mr.LookZade");
        contentPane.add(label1, "cell 0 0");

        //---- label6 ----
        label6.setText("More than 8 years of teaching experience");
        contentPane.add(label6, "cell 1 0");

        //---- label2 ----
        label2.setText("Mr.Karimi");
        contentPane.add(label2, "cell 0 1");

        //---- label7 ----
        label7.setText("Professor at the University of Tehran");
        contentPane.add(label7, "cell 1 1");

        //---- label3 ----
        label3.setText("Mr.Ataherian");
        contentPane.add(label3, "cell 0 2");

        //---- label8 ----
        label8.setText("The best language teacher in 95 and 96");
        contentPane.add(label8, "cell 1 2");

        //---- label4 ----
        label4.setText("Mr.Nosrati");
        contentPane.add(label4, "cell 0 3");

        //---- label9 ----
        label9.setText("The youngest language teacher");
        contentPane.add(label9, "cell 1 3");

        //---- label5 ----
        label5.setText("Mr.Ashoori");
        contentPane.add(label5, "cell 0 4");

        //---- label10 ----
        label10.setText("The most experienced language teacher");
        contentPane.add(label10, "cell 1 4");

        //---- button1 ----
        button1.setText("Back to main menu");
        button1.addActionListener(e -> button1ActionPerformed(e));
        contentPane.add(button1, "cell 0 6");
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - mohammad
    private JLabel label1;
    private JLabel label6;
    private JLabel label2;
    private JLabel label7;
    private JLabel label3;
    private JLabel label8;
    private JLabel label4;
    private JLabel label9;
    private JLabel label5;
    private JLabel label10;
    private JButton button1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
