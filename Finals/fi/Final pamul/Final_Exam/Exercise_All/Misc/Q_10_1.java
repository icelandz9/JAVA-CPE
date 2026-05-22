package Final_Exam.Exercise_All.Misc;

import java.awt.*;

import javax.swing.*;

public class Q_10_1 {

  public static void main(String[] args) {
    JPanel p1 = new JPanel();
    JPanel p23 = new JPanel();
    JPanel p2 = new JPanel();
    JPanel p3 = new JPanel();
    JPanel g = new JPanel();
    JFrame frame = new JFrame();

    p1.setLayout(new GridLayout(5, 3));
    for (int i = 1; i <= 9; i++) {
      p1.add(new JButton("" + i));
    }
    p1.add(new JButton("*"));
    p1.add(new JButton("" + 0));
    p1.add(new JButton("#"));

    p2.setLayout(new GridLayout(2, 3));
    p2.add(new JButton("+"));
    p2.add(new JButton("-"));
    p2.add(new JButton("x"));
    p2.add(new JButton("/"));
    p2.add(new JButton("."));
    p2.add(new JButton("%"));

    p3.setLayout(new GridLayout(3, 2, 5, 5));
    p3.add(new JLabel("Number1"));
    p3.add(new JTextField(5));
    p3.add(new JLabel("Number2"));
    p3.add(new JTextField(5));
    p3.add(new JLabel("Number3"));
    p3.add(new JTextField(5));

    p23.setLayout(new FlowLayout());
    p23.add(p3);
    p23.add(p2);

    g.setLayout(new BorderLayout());
    g.add(p23, BorderLayout.NORTH);
    g.add(p1, BorderLayout.CENTER);
    g.add(new JButton("="), BorderLayout.SOUTH);

    frame.setTitle("Calculator");
    frame.add(g);
    frame.setSize(400, 250);
    frame.setLocationRelativeTo(null); // Center the frame
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);

  }
}