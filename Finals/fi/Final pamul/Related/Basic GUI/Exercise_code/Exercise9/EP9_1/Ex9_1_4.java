package EP1;

import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;

public class Ex9_1_4 extends JFrame {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JPanel p = new JPanel();
        p.setLayout(new GridLayout(8, 8));
        for (int i = 1; i < 9; i++) {
            if (i % 2 == 0) {
                for (int j = 1; j < 9; j++) {
                    if (j % 2 == 0) {
                        JButton w = new JButton();
                        w.setBackground(Color.white);
                        p.add(w);
                    } else {
                        JButton b = new JButton();
                        b.setBackground(Color.black);
                        p.add(b);
                    }
                }
            } else {
                for (int j = 1; j < 9; j++) {
                    if (j % 2 == 0) {
                        JButton b = new JButton();
                        b.setBackground(Color.black);
                        p.add(b);
                    } else {
                        JButton w = new JButton();
                        w.setBackground(Color.white);
                        p.add(w);
                    }
                }
            }
        }
        frame.add(p);
        frame.setTitle("Exercise 7");
        frame.setSize(450, 450);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
