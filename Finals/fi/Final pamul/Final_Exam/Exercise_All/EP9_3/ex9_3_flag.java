package Final_Exam.Exercise_All.EP9_3;

import javax.swing.*;
import java.awt.*;

public class ex9_3_flag {

    private static ImageIcon scaleImage(ImageIcon icon) {
        Image image = icon.getImage();
        Image scaledImage = image.getScaledInstance(540, 400, Image.SCALE_SMOOTH);
        return new ImageIcon(scaledImage);
    }

    public static void main(String[] args) {
        JFrame fm = new JFrame("Exercise08_v2_01");

        ImageIcon uk = new ImageIcon("C:\\Users\\Admin\\Downloads\\england.png");
        ImageIcon ru = new ImageIcon("C:\\Users\\Admin\\Downloads\\french.png");
        ImageIcon dk = new ImageIcon("C:\\Users\\Admin\\Downloads\\german.png");
        ImageIcon fn = new ImageIcon("C:\\Users\\Admin\\Downloads\\denmark.jpg");

        JPanel p1 = new JPanel();
        p1.setLayout(new GridLayout(2, 2, 5, 5));
        p1.add(new JLabel(scaleImage(uk)));
        p1.add(new JLabel(scaleImage(ru)));
        p1.add(new JLabel(scaleImage(dk)));
        p1.add(new JLabel(scaleImage(fn)));

        fm.add(p1);

        fm.setTitle("Exercise_v2_02");
        fm.setSize(300, 100);
        fm.setLocationRelativeTo(null);
        fm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fm.setVisible(true);
        fm.pack();

    }
}