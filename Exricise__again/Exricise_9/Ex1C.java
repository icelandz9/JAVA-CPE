import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Ex1C extends JFrame {  // ✅ เพิ่ม extends JFrame

    public Ex1C() {                 // ✅ เพิ่ม constructor
        setTitle("หมากฮอส");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel board = new JPanel(new GridLayout(8, 8));

        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
                JPanel cell = new JPanel();

                if ((row + col) % 2 == 0) {
                    cell.setBackground(Color.WHITE);
                } else {
                    cell.setBackground(Color.BLACK);
                }

                board.add(cell);
            }
        }

        add(board);
        setVisible(true);
    }                                // ✅ ปิด constructor

    public static void main(String[] args) {
        new Ex1C();                 // ✅ แก้ชื่อให้ตรงกับ class
    }
}