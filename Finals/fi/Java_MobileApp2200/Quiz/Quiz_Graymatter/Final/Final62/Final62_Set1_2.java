package Quiz.Quiz_Graymatter.Final.Final62;

import javax.swing.*;
import java.awt.*;

public class Final62_Set1_2 extends JFrame {
    public Final62_Set1_2() {
        setLayout(new BorderLayout());

        // ===== TOP =====
        JLabel titleLabel = new JLabel("*** ��س����������������к� ***", JLabel.CENTER);
        titleLabel.setForeground(Color.RED);

        JPanel Field = new JPanel(new FlowLayout());
        Field.add(new JTextField(30));
        add(Field, BorderLayout.NORTH);

        // ===== CENTER =====
        JPanel centerPanel = new JPanel(new GridLayout(2, 2));
        centerPanel.add(new JLabel("Username"));
        centerPanel.add(new JTextField(10));
        centerPanel.add(new JLabel("Password"));
        centerPanel.add(new JPasswordField(10));

        // ===== BUTTON (Log in / Cancel) =====
        JPanel buttonPanel = new JPanel(new FlowLayout());
        buttonPanel.add(new JButton("Log in"));
        buttonPanel.add(new JButton("Cancel"));

        // ===== ���������� (Center ��駪ش) =====
        JPanel inputPanel = new JPanel(new GridLayout(3, 1));
        inputPanel.add(titleLabel);
        inputPanel.add(centerPanel);
        inputPanel.add(buttonPanel);

        add(inputPanel, BorderLayout.WEST);

        // ===== ��������Ţ��ҧ (Keypad) =====
        JPanel keypadPanel = new JPanel(new GridLayout(4, 3));
        String[] buttons = {
                "1", "2", "3",
                "4", "5", "6",
                "7", "8", "9",
                "0", ".", "EXP",
        };
        for (String text : buttons) {
            keypadPanel.add(new JButton(text));
        }

        JPanel AllPanel = new JPanel(new GridLayout(1, 2));
        AllPanel.add(inputPanel);
        AllPanel.add(keypadPanel);
        add(AllPanel, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        Final62_Set1_2 frame = new Final62_Set1_2();
        frame.setTitle("CPE 222 : Frame Layout");
        frame.setSize(400, 300);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
