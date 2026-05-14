import javax.swing.*;
import java.awt.*;

public class Quiz_Login extends JFrame {
    public Quiz_Login() {
        setTitle("CPE 222 : Frame Layout");
        setSize(500, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        // ---- Panel บน: TextField + Label ----
        JTextField topField = new JTextField();

        JLabel textLabel = new JLabel("*** pls enter your input  ***");
        textLabel.setFont(new Font("Arial", Font.BOLD, 14));
        textLabel.setForeground(Color.RED);

        JPanel northPanel = new JPanel(new BorderLayout());
        northPanel.add(topField, BorderLayout.NORTH);
        northPanel.add(textLabel, BorderLayout.CENTER);

        // ---- Panel ซ้าย: Username + Password + ปุ่ม ----
        JTextField field1 = new JTextField(12);
        JPasswordField result = new JPasswordField(12);

        JPanel leftPanel = new JPanel(new GridLayout(3, 2, 5, 5));
        leftPanel.setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 10));
        leftPanel.add(new JLabel("Username"));
        leftPanel.add(field1);
        leftPanel.add(new JLabel("Password"));
        leftPanel.add(result);

        JButton btnLogin = new JButton("Log in");
        JButton btnCancel = new JButton("Cancel");
        leftPanel.add(btnLogin);
        leftPanel.add(btnCancel);

        // ---- Panel ขวา: ปุ่มตัวเลข ----
        JPanel buttonPanel = new JPanel(new GridLayout(4, 3, 3, 3));
        buttonPanel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        String[] labels = {"1","2","3","4","5","6","7","8","9","0",".","EXP"};
        for (String label : labels) {
            buttonPanel.add(new JButton(label));
        }

        add(northPanel, BorderLayout.NORTH);
        add(leftPanel, BorderLayout.WEST);
        add(buttonPanel, BorderLayout.EAST);

        setVisible(true);
    }

    public static void main(String[] args) {
        new Quiz_Login();
    }
}