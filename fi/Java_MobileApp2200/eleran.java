import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class e12 {



    private JTextField tfNumber1 = new JTextField(5);
    private JTextField tfNumber2 = new JTextField(5);
    private JTextField tfResult  = new JTextField(10);
    
    private JButton btnAdd      = new JButton("Add");
    private JButton btnSubtract = new JButton("Subtract");
    private JButton btnMultiply = new JButton("Multiply");
    private JButton btnDivide   = new JButton("Divide");


    public e12() {
        JFrame frame = new JFrame("Caluculator");

        // ─── ส่วนที่ 1: แผงรับค่าตัวเลขและผลลัพธ์ ────────────────────────────────────
        JPanel panelInput = new JPanel(new GridLayout(3, 2));
        panelInput.add(new JLabel("Number 1"));
        panelInput.add(tfNumber1);                  
        panelInput.add(new JLabel("Number 2"));
        panelInput.add(tfNumber2);                  
        panelInput.add(new JLabel("Result"));
        tfResult.setEditable(false);                
        panelInput.add(tfResult);                   

        // ─── ส่วนที่ 2: แผงปุ่ม Operator ─────────────────────────────────────────────
        JPanel panelButtons = new JPanel(new GridLayout(4, 1));
        panelButtons.add(btnAdd);
        panelButtons.add(btnSubtract);
        panelButtons.add(btnMultiply);
        panelButtons.add(btnDivide);
        
        // ─── ส่วนที่ 3: แผงหลัก — วาง panelInput และ panelButtons ข้างๆ กัน ──────────
        // GridLayout 1 แถว 2 คอลัมน์ (ซ้าย = input, ขวา = ปุ่ม)
        JPanel panelAll = new JPanel(new GridLayout(1, 2));
        panelAll.add(panelInput);
        panelAll.add(panelButtons);
        frame.add(panelAll);    // เพิ่ม panelAll เข้าหน้าต่างหลัก

        // ─── ส่วนที่ 4: ผูก ActionListener ให้แต่ละปุ่ม ──────────────────────────────

        // ปุ่ม Add — คำนวณ num1 + num2
        btnAdd.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double num1   = Double.parseDouble(tfNumber1.getText()); // อ่านค่าจากช่อง 1
                double num2   = Double.parseDouble(tfNumber2.getText()); // อ่านค่าจากช่อง 2
                double result = num1 + num2;                             // บวกกัน
                tfResult.setText(String.valueOf(result));                // แสดงผล
            }
        });

        // ปุ่ม Subtract — คำนวณ num1 - num2
        btnSubtract.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double num1   = Double.parseDouble(tfNumber1.getText()); // อ่านค่าจากช่อง 1
                double num2   = Double.parseDouble(tfNumber2.getText()); // อ่านค่าจากช่อง 2
                double result = num1 - num2;                             // ลบกัน
                tfResult.setText(String.valueOf(result));                // แสดงผล
            }
        });

        // ปุ่ม Multiply — คำนวณ num1 * num2
        btnMultiply.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double num1   = Double.parseDouble(tfNumber1.getText()); // อ่านค่าจากช่อง 1
                double num2   = Double.parseDouble(tfNumber2.getText()); // อ่านค่าจากช่อง 2
                double result = num1 * num2;                             // คูณกัน
                tfResult.setText(String.valueOf(result));                // แสดงผล
            }
        });

        // ปุ่ม Divide — คำนวณ num1 / num2 พร้อมป้องกันหารด้วย 0
        btnDivide.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(tfNumber1.getText()); // อ่านค่าจากช่อง 1
                double num2 = Double.parseDouble(tfNumber2.getText()); // อ่านค่าจากช่อง 2
                if (num2 != 0) {
                    // กรณีปกติ: หารได้
                    double result = num1 / num2;
                    tfResult.setText(String.valueOf(result));
                } else {
                    // กรณี num2 = 0: ไม่สามารถหารได้ แสดงข้อความ Error
                    tfResult.setText("Error: Divide by 0");
                }
            }
        });

        frame.setSize(500, 150);                                 
        frame.setLocationRelativeTo(null);                         
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);      
        frame.setVisible(true);                                 
    }

    public static void main(String[] args) {
        new e12(); 
    }
}


/*
มองโค้ดให้เหมือนเกมทายคำ เราไม่ได้เริ่มเขียนใหม่หมด แต่เราต้องทำนายโค้ดที่ถูกต้องต่อจากที่ที่เราก้อปมา

และ 

ตอนสอบให้คอมเมนต์โค้ดทีละฟังก์ชั่นหรือทีละการทำงานที่เป็นชุดๆ จะทำให้เข้าใจง่าย และก้อปวางได้ถูกต้อง


เอา ai เจนโค้ดและคอมเมนต์แต่ละอันไว้ก่อนหลายๆชุด
*/