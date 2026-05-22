package Final_Exam.Exercise_All.EP9_1;

import javax.swing.*;
import java.awt.*;

public class ex9_1_2_layoutbot {
    public static void main(String[] args) {
        JFrame fm = new JFrame("Handle Event");
        JPanel p = new JPanel(new GridLayout(2, 2, 10, 10));
        fm.add(p);
        JPanel p1 = new JPanel(new FlowLayout(0, 5, 5));
        p1.add(new JLabel("Name"));
        p1.add(new JTextField(50));
        p.add(p1);

        JPanel p2 = new JPanel(new BorderLayout());
        p2.add(new JButton("OK"), BorderLayout.WEST);
        p2.add(new JButton("Cancle"), BorderLayout.CENTER);
        p2.add(new JButton("Exit"), BorderLayout.EAST);
        p.add(p2);

        fm.setSize(650, 100);
        fm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fm.setVisible(true);

    }
}
