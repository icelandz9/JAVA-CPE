import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Ex1D extends JFrame {

    public Ex1D() {
        setTitle("หมากฮอส");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel board = new JPanel(new GridLayout(8, 8)); // สร้าง grid 8x8

        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
                JPanel cell = new JPanel(); //JPanel คือการสร้างกล่องสี่เหลี่ยมที่ใส่ component ได้

                if ((row + col) % 2 == 0) {
                    cell.setBackground(Color.WHITE);
                } else {
                    cell.setBackground(Color.BLACK);
                }

                board.add(cell); // เพิ่มช่องเข้าตาราง
            }
        }

        add(board);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Ex1D();
    }
}