package Quiz.Quiz_Graymatter.Final.Final63;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Final63_6 extends JFrame {
    private JButton btnCm = new JButton("cm");
    private JButton btnFt = new JButton("ft");
    private JButton btnYd = new JButton("yd");
    private JButton btnWa = new JButton("wa");

    private JTextField tfInput = new JTextField(10);
    private JTextField tfResult = new JTextField(10);

    private JLabel lbInput = new JLabel("�������(in)");
    private JLabel lbOutput = new JLabel("�������");

    public Final63_6() {

        // Panel ����Ѻ����
        JPanel panelTop = new JPanel(new GridLayout(2, 2));
        panelTop.add(btnCm);
        panelTop.add(btnFt);
        panelTop.add(btnYd);
        panelTop.add(btnWa);

        // Panel ����Ѻ��ͧ input/output
        JPanel panelBottom = new JPanel(new GridLayout(2, 2));
        panelBottom.add(lbInput);
        panelBottom.add(tfInput);
        panelBottom.add(lbOutput);
        panelBottom.add(tfResult);

        JPanel panelBottomFlow = new JPanel(new FlowLayout());
        panelBottomFlow.add(panelBottom);

        // �Ѵ layout
        setLayout(new BorderLayout());
        add(panelTop, BorderLayout.NORTH);
        add(panelBottomFlow, BorderLayout.CENTER);

        // �������Ѿ����������
        tfResult.setEditable(false);

        // ===== ACTIONS =====
        btnCm.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                convertToCm();
            }
        });

        btnFt.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                convertToFt();
            }
        });

        btnYd.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                convertToYd();
            }
        });

        btnWa.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                convertToWa();
            }
        });

        setSize(300, 180);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    // ===== Methods �ŧ˹��� =====
    private void convertToCm() {
        try {
            double inch = Double.parseDouble(tfInput.getText());
            double result = inch * 2.54;
            tfResult.setText(String.format("%.6f", result));
        } catch (NumberFormatException ex) {
            tfResult.setText("Invalid input");
        }
    }

    private void convertToFt() {
        try {
            double inch = Double.parseDouble(tfInput.getText());
            double result = inch / 12;
            tfResult.setText(String.format("%.6f", result));
        } catch (NumberFormatException ex) {
            tfResult.setText("Invalid input");
        }
    }

    private void convertToYd() {
        try {
            double inch = Double.parseDouble(tfInput.getText());
            double result = (inch * 2.54) / 91.4; // �ŧ������ ������ô��� 0.914
            tfResult.setText(String.format("%.6f", result));
        } catch (NumberFormatException ex) {
            tfResult.setText("Invalid input");
        }
    }

    private void convertToWa() {
        try {
            double inch = Double.parseDouble(tfInput.getText());
            double result = (inch * 2.54) / 200.0; // �ŧ������ ������ô��� 2
            tfResult.setText(String.format("%.6f", result));
        } catch (NumberFormatException ex) {
            tfResult.setText("Invalid input");
        }
    }

    // ===== main =====
    public static void main(String[] args) {
        Final63_6 frame = new Final63_6();
        frame.setTitle("Metric Conversions");
        frame.setSize(300, 180);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
