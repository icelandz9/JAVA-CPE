import javax.swing.*;
import java.awt.*;
public class ex9_1_1_layouttop {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Handle Event");
        frame.setLayout(new FlowLayout(0, 10, 10));
        JLabel n = new JLabel("Name");
        JTextField a = new JTextField(20);
        JButton ok = new JButton("ok");
        JButton cc = new JButton("Cancle");
        JButton e = new JButton("Exit");
    
        frame.add(n);
        frame.add(a);
        frame.add(ok);
        frame.add(cc);
        frame.add(e);
    
        frame.setSize(550, 125);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.pack();
      }
}
