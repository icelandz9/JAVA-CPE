import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Ex5 extends JFrame {
    public Ex5() {
        setTitle("Exercise08_v2_04"); // ขออนุญาตแก้ชื่อ Title ให้ตรงกับในรูปนะครับ
        setSize(450, 450); 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel board = new JPanel(new GridLayout(10, 10));
        Random random = new Random();

        for(int i = 0; i < 100; i++){
            int value = random.nextInt(2); // สุ่ม 0 หรือ 1
            JLabel label = new JLabel(String.valueOf(value), SwingConstants.CENTER);
            // String.valueOf(value) แปลงจาก “ตัวเลข” ให้เป็น “ข้อความ (String)”
            // SwingConstants.CENTER ทำให้อยู่ตรงกลางใน Label ของตัวเอง 

            // label.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY)); // ทำเส้นขอบรอบ label
            board.add(label);
        }
        
        add(board);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Ex5();
    }
}