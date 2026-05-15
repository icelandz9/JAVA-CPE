package Final_Exam.Exercise_All.EP9_2;

import javax.swing.*;
import java.awt.*;
import java.awt.BorderLayout;

public class ex9_2_button {
  public static void main(String[] args) {
    JFrame fm = new JFrame("Exercise08_v2_01");
    JPanel p = new JPanel(new FlowLayout());
    fm.add(p);
    p.add(new JButton("Button4"), BorderLayout.CENTER);
    p.add(new JButton("Button5"), BorderLayout.CENTER);
    p.add(new JButton("Button6"), BorderLayout.CENTER);

    JPanel pp = new JPanel(new FlowLayout());

    pp.add(new JButton("Button1"), BorderLayout.SOUTH);
    pp.add(new JButton("Button2"), BorderLayout.SOUTH);
    pp.add(new JButton("Button3"), BorderLayout.SOUTH);
    p.add(pp);

    fm.setSize(300, 100);
    fm.setLocationRelativeTo(null);
    fm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    fm.setVisible(true);
  }
}