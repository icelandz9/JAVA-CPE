package Quiz.Quiz_monkey.Quiz9;

import javax.swing.*;
import java.awt.*;

public class Q09 {
  public static void main(String[] args) {

    JFrame frame = new JFrame("Calculator");
    JPanel p = new JPanel();

    p.setLayout(new GridLayout(2, 2, 5, 0));

    JLabel num1 = new JLabel("Number 1");
    JTextField t1 = new JTextField(5);
    JLabel num2 = new JLabel("Number 2");
    JTextField t2 = new JTextField(5);
    JLabel num3 = new JLabel("Result");
    JTextField t3 = new JTextField(5);

    JButton b1 = new JButton("+");
    JButton b2 = new JButton("-");
    JButton b3 = new JButton("x");
    JButton b4 = new JButton("/");
    JButton b5 = new JButton(".");
    JButton b6 = new JButton("%");
    JButton b7 = new JButton("=");

    JButton n1 = new JButton("1");
    JButton n2 = new JButton("2");
    JButton n3 = new JButton("3");
    JButton n4 = new JButton("4");
    JButton n5 = new JButton("5");
    JButton n6 = new JButton("6");
    JButton n7 = new JButton("7");
    JButton n8 = new JButton("8");
    JButton n9 = new JButton("9");

    JPanel p1 = new JPanel();
    p1.setLayout(new GridLayout(3, 2));

    JPanel p2 = new JPanel();
    p2.setLayout(new GridLayout(3, 1));

    JPanel p3 = new JPanel();
    p3.setLayout(new GridLayout(3, 1));

    JPanel p5 = new JPanel();
    p5.setLayout(new FlowLayout(FlowLayout.CENTER));

    JPanel p6 = new JPanel();
    p6.setLayout(new BorderLayout());

    p.add(p5);
    p.add(b7);
    p.add(p3);
    p.add(p2);

    p1.add(b1);
    p1.add(b2);
    p1.add(b3);
    p1.add(b4);
    p1.add(b5);
    p1.add(b6);
    p5.add(p1);

    p2.add(n1);
    p2.add(n2);
    p2.add(n3);
    p2.add(n4);
    p2.add(n5);
    p2.add(n6);
    p2.add(n7);
    p2.add(n8);
    p2.add(n9);

    p3.add(num1);
    p3.add(t1);
    p3.add(num2);
    p3.add(t2);
    p3.add(num3);
    p3.add(t3);

    frame.add(p);
    frame.setSize(300, 220);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }
}