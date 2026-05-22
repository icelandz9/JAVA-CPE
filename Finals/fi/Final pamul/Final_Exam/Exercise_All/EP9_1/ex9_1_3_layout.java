package Final_Exam.Exercise_All.EP9_1;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class ex9_1_3_layout {
    public static void main(String[] args) {
        JFrame mainFrame = new JFrame("Exercise 7");
        JPanel p = new JPanel(new GridLayout(4, 1, 0, 0));

        JLabel t1 = new JLabel("Hello,My Name ise CPE 320");
        t1.setBorder(new LineBorder(Color.BLUE));
        p.add(t1);
        JLabel t2 = new JLabel("Department of Computer Engineering");
        t2.setBorder(new LineBorder(Color.BLUE));
        p.add(t2);
        JLabel t3 = new JLabel("Srinakharainwirot University");
        t3.setBorder(new LineBorder(Color.BLUE));
        p.add(t3);
        JLabel t4 = new JLabel("Ongkarak NAkornnayok");
        t4.setBorder(new LineBorder(Color.BLUE));
        p.add(t4);

        mainFrame.add(p);
        mainFrame.setSize(500, 100);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setVisible(true);
    }
}
