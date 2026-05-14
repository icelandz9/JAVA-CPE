import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Star extends JFrame {
    StarPanel1 hp = new StarPanel1();
    JButton jbtEnlarge = new JButton("Enlarge");
    JButton jbtShrink = new JButton("Shrink");

    public Star() {
        JPanel pbt = new JPanel();

        setLayout(new BorderLayout());
        add(hp, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        Star frame = new Star();
        frame.setTitle("Star");
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setVisible(true);
    }
}
