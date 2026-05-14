import javax.swing.*;
import java.awt.*;
public class ex9_1_4_chess {
    public static void main(String[] args) {
        JFrame fm = new JFrame("Exercise 7");
        fm.setLayout(new GridLayout(8, 8));
        int p = 0;
        for (int i = 1; i <= 64; i++) {
            JPanel p1 = new JPanel();
            if ((p + i) % 2 == 0) {
                p1.setBackground(Color.BLACK);
            }
            if (i % 8 == 0) {
                p++;
            }
            fm.add(p1);
        }

        fm.setSize(470, 380);
        fm.setLocationRelativeTo(null);
        fm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fm.setVisible(true);
    }
}
