package EP1;

import javax.swing.*;
import java.awt.*;

public class ex1_2 extends JFrame {
  public static void main(String[] args) {
    JFrame frame = new JFrame("Handle Event");
    JPanel p = new JPanel();
    p.setLayout(new BorderLayout());

    JButton a = new JButton("OK");
    JButton b = new JButton("Cancel");
    JButton c = new JButton("Exit");
    JLabel d = new JLabel("Name");
    JTextField e = new JTextField(20);

    JPanel p1 = new JPanel();
    p1.setLayout(new BorderLayout());
    JPanel p2 = new JPanel();
    p2.setLayout(new BorderLayout());

    p.add(p1, BorderLayout.NORTH);
    p1.add(d, BorderLayout.WEST);
    p1.add(e, BorderLayout.CENTER);

    p.add(p2, BorderLayout.SOUTH);
    p2.add(a, BorderLayout.WEST);
    p2.add(b, BorderLayout.CENTER);
    p2.add(c, BorderLayout.EAST);

    frame.add(p);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLocationRelativeTo(null);
    frame.setSize(450, 100);
    frame.setVisible(true);
  }
}