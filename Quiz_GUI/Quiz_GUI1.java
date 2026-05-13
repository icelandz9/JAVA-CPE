import javax.imageio.plugins.jpeg.JPEGHuffmanTable;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Quiz_GUI1 extends JFrame {

    public Quiz_GUI1() {
        setTitle("Calculator");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // FlowLayout จัด Layout เองจากซ้ายไปขวา อยู่กึ่งกลาง
        // setLayout(new FlowLayout());

        // ไว้จัดตำแหน่งต่างๆของ หน้าจอ
        setLayout(new BorderLayout());

        JPanel topPanel = new JPanel();
        topPanel.setLayout(new FlowLayout(FlowLayout.CENTER));

        topPanel.add(new JLabel("Number 1"));
        topPanel.add(new JTextField(5));
        topPanel.add(new JLabel("Number 2"));
        topPanel.add(new JTextField(5));
        topPanel.add(new JLabel("Result"));
        topPanel.add(new JTextField(5));

        
        // สร้าง button
        // แถว (Rows), คอลัมน์ (Columns), ช่องว่างแนวนอน (Horizontal Gap), ช่องว่างแนวตั้ง (Vertical Gap)
        JPanel bottonpanel = new JPanel(new GridLayout(3, 2, 2, 2));
        bottonpanel.add(new JButton("+"));
        bottonpanel.add(new JButton("-"));
        bottonpanel.add(new JButton("x"));
        bottonpanel.add(new JButton("/"));
        bottonpanel.add(new JButton("."));
        bottonpanel.add(new JButton("%"));

        // สร้างแผงตัวช่วย บังคับให้ปุ่มชิดซ้าย (LEFT)
        JPanel wrapperPanel = new JPanel();
        wrapperPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 15, 10)); //ช่องว่างแนวนอน (Horizontal Gap), ช่องว่างแนวตั้ง (Vertical Gap)
        wrapperPanel.add(bottonpanel);

        // สร้าง button (=)
        JPanel btn = new JPanel(new GridLayout(1, 1, 2, 2));
        btn.add(new JButton("="));
        // (ความกว้าง 60, ความสูง 80)
        btn.setPreferredSize(new Dimension(200, 80));

        JPanel wrapper = new JPanel();
        wrapper.setLayout(new FlowLayout(FlowLayout.RIGHT, 15, 10));
        wrapper.add(btn);

        // เอาไว้จัด button แยกซ้ายขวา
        JPanel centerPanel = new JPanel(new BorderLayout());
        centerPanel.add(wrapperPanel, BorderLayout.WEST); // เอาปุ่มเครื่องหมายไปไว้ฝั่งตะวันตก (ซ้าย)
        centerPanel.add(wrapper, BorderLayout.EAST); // เอาปุ่ม = ไปไว้ฝั่งตะวันออก (ขวา)
        
        add(centerPanel);
        add(topPanel, BorderLayout.NORTH);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Quiz_GUI1();
    }
}
