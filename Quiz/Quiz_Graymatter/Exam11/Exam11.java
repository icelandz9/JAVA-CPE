package Quiz.Quiz_Graymatter.Exam11;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class Exam11 extends JFrame {
    public Exam11() {
        // ἧ��������Ţ (4x3)
        String num[] = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "*", "0", "#" };
        JPanel numberPanel = new JPanel(new GridLayout(4, 3, 5, 5));
        for (String s : num) {
            JButton b = new JButton(s);
            numberPanel.add(b);
        }

        // ἧ��������ͧ���� (2x3)
        String ops[] = { "+", "-", "x", "/", ".", "%" };
        JPanel operatorPanel = new JPanel(new GridLayout(2, 3, 5, 5));
        for (String op : ops) {
            JButton b = new JButton(op);
            operatorPanel.add(b);
        }

        // ἧ�����š�äӹǳ (3x2)
        JPanel inputPanel = new JPanel(new GridLayout(3, 2, 5, 5));
        JTextField n1 = new JTextField();
        JTextField n2 = new JTextField();
        JTextField result = new JTextField();
        result.setEditable(true);

        inputPanel.add(new JLabel("Number 1:"));
        inputPanel.add(n1);
        inputPanel.add(new JLabel("Number 2:"));
        inputPanel.add(n2);
        inputPanel.add(new JLabel("Result:"));
        inputPanel.add(result);

        // ��� inputPanel ��� operatorPanel (�ǹ͹)
        JPanel centerPanel = new JPanel(new BorderLayout(10, 10));
        centerPanel.add(inputPanel, BorderLayout.CENTER);
        centerPanel.add(operatorPanel, BorderLayout.EAST);

        // ��� border (�ͺ�����ҧ) �ͺ centerPanel ����������ͧ�
        centerPanel.setBorder(new EmptyBorder(10, 10, 40, 10)); // ���� 40px ��ҹ��ҧ

        // ���� "="
        JButton equalButton = new JButton("=");

        // ��� panel ����Ѻ���� = ������� margin �ͺ� ���� EmptyBorder
        JPanel equalPanel = new JPanel(new BorderLayout());
        equalPanel.add(equalButton, BorderLayout.CENTER);
        equalPanel.setBorder(new EmptyBorder(10, 10, 10, 10));

        // �Ѵ�ҧ�ء��ǹŧ� JFrame
        setLayout(new BorderLayout(10, 10));
        add(numberPanel, BorderLayout.NORTH);
        add(centerPanel, BorderLayout.CENTER);
        add(equalPanel, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        Exam11 frame = new Exam11();
        frame.setTitle("Calculator");
        frame.setSize(500, 450);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
