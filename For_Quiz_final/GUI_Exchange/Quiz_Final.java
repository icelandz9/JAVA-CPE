import javax.imageio.plugins.jpeg.JPEGHuffmanTable;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Quiz_Final extends JFrame {

    public Quiz_Final() {
        setTitle("Exchange Money");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        final JTextField field1 = new JTextField(10);
        final JTextField result = new JTextField(10);
        result.setEditable(false);

        JPanel field1Wrapper = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 30));
        JPanel resultWrapper = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 20));
        field1Wrapper.add(field1);
        resultWrapper.add(result);

        JPanel leftPanel = new JPanel(new GridLayout(2, 2, 10, 2));
        leftPanel.add(new JLabel("Input Money (TH)"));
        leftPanel.add(field1Wrapper);
        leftPanel.add(new JLabel("Money"));
        leftPanel.add(resultWrapper);

        field1.setPreferredSize(new Dimension(200, 30));
        result.setPreferredSize(new Dimension(200, 30));

        // สร้าง button
        // แถว (Rows), คอลัมน์ (Columns), ช่องว่างแนวนอน (Horizontal Gap),
        // ช่องว่างแนวตั้ง (Vertical Gap)
        JPanel bottonpanel = new JPanel(new GridLayout(2, 1, 0, 5));
        // กำหนด padding
        bottonpanel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));

        // Dimension(width, height)
        bottonpanel.setPreferredSize(new Dimension(150, 30));

        JButton btnUSD = new JButton("USD");
        JButton btnCNY = new JButton("CNY");

        bottonpanel.add(btnUSD);
        bottonpanel.add(btnCNY);

        add(bottonpanel, BorderLayout.EAST);
        add(leftPanel, BorderLayout.WEST);

        btnUSD.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double num = Double.parseDouble(field1.getText());
                double sum = num / 32.40;
                result.setText(String.format("%.3f", sum));
            }
        });

        btnCNY.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double num = Double.parseDouble(field1.getText());
                double sum = num / 4.71;
                result.setText(String.format("%.3f", sum));
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new Quiz_Final();
    }
}
