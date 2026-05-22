import java.awt.*;
import javax.swing.*;
import javax.swing.border.TitledBorder;

/**
 * รูปแบบที่ 2: Advanced GUI
 * เน้นความสวยงาม ใช้ TitledBorder และการจัดวางที่ซับซ้อนขึ้น
 * แยก Logic ไปใช้คลาส Tax.java ภายนอก (เหมือนที่ loan.java มักถูกเรียกใช้)
 */
public class TaxCalc_Pro extends JFrame {
    
    private JTextField jtfIncome = new JTextField();
    private JTextField jtfRate = new JTextField();
    private JTextField jtfDeduct = new JTextField();
    private JTextArea jtaSummary = new JTextArea(5, 20);
    private JButton jbtCalc = new JButton("Process Tax Report");

    public TaxCalc_Pro() {
        // ส่วนบน: รับข้อมูล
        JPanel pInput = new JPanel(new GridLayout(3, 2, 5, 5));
        pInput.setBorder(new TitledBorder("Income Information"));
        pInput.add(new JLabel("Yearly Income:"));
        pInput.add(jtfIncome);
        pInput.add(new JLabel("Tax Rate (%):"));
        pInput.add(jtfRate);
        pInput.add(new JLabel("Deductions:"));
        pInput.add(jtfDeduct);

        // ส่วนกลาง: แสดงผลสรุป
        jtaSummary.setEditable(false);
        jtaSummary.setFont(new Font("Monospaced", Font.PLAIN, 12));
        JScrollPane scroll = new JScrollPane(jtaSummary);
        scroll.setBorder(new TitledBorder("Calculation Result"));

        // การทำงาน
        jbtCalc.addActionListener(e -> {
            try {
                double income = Double.parseDouble(jtfIncome.getText());
                double rate = Double.parseDouble(jtfRate.getText()) / 100;
                double deduct = Double.parseDouble(jtfDeduct.getText());

                // เรียกใช้คลาส Tax ภายนอก
                Tax t = new Tax(income, rate, deduct);

                String report = String.format(
                    "--- Tax Report ---\n" +
                    "Gross Income:  %,.2f\n" +
                    "Deductions:    %,.2f\n" +
                    "Net Income:    %,.2f\n" +
                    "------------------\n" +
                    "Tax to Pay:    %,.2f",
                    t.getAnnualIncome(), t.getDeduction(), t.getNetIncome(), t.getTaxToPay()
                );
                jtaSummary.setText(report);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Invalid Input Data!");
            }
        });

        // ประกอบร่าง
        setLayout(new BorderLayout(10, 10));
        add(pInput, BorderLayout.NORTH);
        add(scroll, BorderLayout.CENTER);
        add(jbtCalc, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        TaxCalc_Pro f = new TaxCalc_Pro();
        f.setTitle("Professional Tax System");
        f.setSize(350, 400);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
