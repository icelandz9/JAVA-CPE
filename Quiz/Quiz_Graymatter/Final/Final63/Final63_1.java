import javax.swing.*;
import java.awt.*;

public class Final63_1 extends JFrame {

    public Final63_1() {
        setLayout(new BorderLayout());

        // ===== LEFT =====
        JPanel leftPanel = new JPanel(new GridLayout(4, 4));

        String[] buttons = {
                "1", "2", "3", "+",
                "4", "5", "6", "-",
                "7", "8", "9", "*",
                "0", ".", "=", "/"
        };

        for (String text : buttons) {
            leftPanel.add(new JButton(text));
        }

        add(leftPanel, BorderLayout.WEST);

        // ===== RIGHT =====
        JPanel rightPanel = new JPanel(new BorderLayout());

        // ===== TOP =====
        JLabel titleLabel = new JLabel("*** กรุณากรอกข้อมูลเข้าสู่ระบบ ***", JLabel.CENTER);
        titleLabel.setForeground(Color.RED);
        rightPanel.add(titleLabel, BorderLayout.NORTH);

        // ===== CENTER =====
        JPanel centerPanel = new JPanel(new GridLayout(2, 2, 5, 5));

        centerPanel.add(new JLabel("Username"));
        centerPanel.add(new JTextField(10));

        centerPanel.add(new JLabel("Password"));
        centerPanel.add(new JPasswordField(10));

        rightPanel.add(centerPanel, BorderLayout.CENTER);

        // ===== SOUTH =====
        JPanel buttonPanel = new JPanel(new FlowLayout());

        buttonPanel.add(new JButton("Log in"));
        buttonPanel.add(new JButton("Cancel"));

        rightPanel.add(buttonPanel, BorderLayout.SOUTH);

        add(rightPanel, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        Final63_1 frame = new Final63_1();

        frame.setTitle("CPE 222 : Frame Layout");
        frame.setSize(500, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}