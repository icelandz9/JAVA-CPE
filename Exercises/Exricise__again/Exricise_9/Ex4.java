import javax.swing.*;
import java.awt.*;
// import javax.swing.border.LineBorder;

public class Ex4 extends JFrame {
    public Ex4() {
        setTitle("Exercise08_v2_02");
        setSize(500, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // ทำให้หน้าต่างอยู่ตรงกลางจอ

        JPanel panel = new JPanel();
        // ปรับ FlowLayout ให้มีระยะห่างระหว่างธงแต่ละอัน (แนวนอน 30, แนวตั้ง 20)
        panel.setLayout(new FlowLayout(FlowLayout.CENTER, 30, 80));

        // SwingConstants คือการกำหนดตำแหน่ง
        // "ตรงกลาง" และ "ด้านล่าง"
        panel.add(createLableWithImage("uk_flag.png", "UK", SwingConstants.CENTER, SwingConstants.BOTTOM));

        // "ด้านขวา" และ "ตรงกลาง"
        panel.add(createLableWithImage("france_flag.png", "FRA", SwingConstants.RIGHT, SwingConstants.CENTER));
        
        // "ด้านซ้าย" และ "ตรงกลาง"
        panel.add(createLableWithImage("germany_flag.png", "GER", SwingConstants.LEFT, SwingConstants.CENTER));
        
        // "ตรงกลาง" และ "ด้านบน"
        panel.add(createLableWithImage("denmark_flag.png", "DNK", SwingConstants.CENTER, SwingConstants.TOP));

        add(panel);
        setVisible(true);
    }

    private JLabel createLableWithImage(String imaString, String countryCode, int horizontal, int verticalPos) {
        ImageIcon icon = new ImageIcon(imaString);
        Image img = icon.getImage();

        Image scaledImg = img.getScaledInstance(40, 40, Image.SCALE_SMOOTH);

        // สร้าง JLabel โดยใส่ข้อความและรูปที่ย่อแล้วเข้าไปพร้อมกันเลย
        JLabel label = new JLabel(countryCode, new ImageIcon(scaledImg), SwingConstants.CENTER);

        // เซ็ตตำแหน่งของข้อความ (Text) เทียบกับรูปภาพ (Icon)
        label.setHorizontalTextPosition(horizontal);
        label.setVerticalTextPosition(verticalPos);

        label.setIconTextGap(5);

        return label;
    }

    public static void main(String[] args) {
        new Ex4();
    }
}