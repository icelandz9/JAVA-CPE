import java.awt.*;
import javax.swing.*;
public class TextTest {
public static void main(String args[]) {
Font fn = new Font("Courier New", Font.BOLD, 20);
JFrame f = new JFrame("Text and PassWord Test");
JPanel p = new JPanel();
JLabel t1 = new JLabel("Text and PassWord Test");
JTextField t2 = new JTextField("admin", 15);
JPasswordField pw = new JPasswordField("123", 15);
t1.setFont(fn); t2.setFont(fn); pw.setFont(fn);
t2.setForeground(Color.white);t2.setBackground(Color.blue);
p.add(t1); p.add(t2); p.add(pw); f.add(p);
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
f.setSize(320, 150);
f.setVisible(true);
}}
