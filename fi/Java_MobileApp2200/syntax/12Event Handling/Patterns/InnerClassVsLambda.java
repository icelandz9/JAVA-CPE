/*
 * ชื่อไฟล์: InnerClassVsLambda.java
 * หัวข้อ: รูปแบบการเขียน Event Listener (Anonymous Inner Class vs Lambda)
 * คำอธิบาย: แสดงวิวัฒนาการของการเขียน Listener จากแบบเก่าสู่แบบใหม่
 *           ที่สั้นและอ่านง่ายขึ้น
 * ตัวอย่างการใช้งาน: เป็นรูปแบบมาตรฐานในการเขียนโค้ด Java ยุคใหม่ (Java 8+)
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InnerClassVsLambda extends JFrame {

    public InnerClassVsLambda() {
        setTitle("รูปแบบการเขียน Listener");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout(FlowLayout.CENTER, 20, 50));

        // ปุ่มที่ 1
        JButton btnOld = new JButton("แบบ Anonymous Inner Class");
        
        // รูปแบบเก่า (ใช้มาตั้งแต่ Java สมัยแรกๆ)
        // ต้อง new Interface แล้ว Override เมธอดเต็มๆ
        btnOld.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "คุณกดปุ่มแบบเก่า");
            }
        });


        // ปุ่มที่ 2
        JButton btnNew = new JButton("แบบ Lambda Expression (Java 8+)");
        
        // รูปแบบใหม่ (Lambda) 
        // e -> { ... } ใช้แทนบล็อกโค้ดด้านบนทั้งหมดได้เลย
        // สั้นกว่า สะอาดกว่ามาก
        btnNew.addActionListener(e -> {
            JOptionPane.showMessageDialog(null, "คุณกดปุ่มแบบใหม่! โค้ดสั้นลงเยอะ");
        });


        // ปุ่มที่ 3 (สั้นที่สุด กรณีคำสั่งบรรทัดเดียว)
        JButton btnShort = new JButton("Lambda แบบบรรทัดเดียว");
        btnShort.addActionListener(e -> System.out.println("พิมพ์ข้อความเฉยๆ บรรทัดเดียวจบ"));


        add(btnOld);
        add(btnNew);
        add(btnShort);

        setVisible(true);
    }

    public static void main(String[] args) {
        new InnerClassVsLambda();
    }
}

/*
 * สรุปเปรียบเทียบ:
 * 
 * แบบเก่า (Anonymous Inner Class):
 * button.addActionListener(new ActionListener() {
 *     @Override
 *     public void actionPerformed(ActionEvent e) {
 *         // โค้ด
 *     }
 * });
 * 
 * แบบใหม่ (Lambda Expression):
 * button.addActionListener(e -> {
 *     // โค้ด
 * });
 * 
 * หมายเหตุ:
 * - Lambda ใช้ได้กับ Interface ที่มีแค่ "เมธอดเดียว" เท่านั้น (Functional Interface)
 * - ActionListener มีแค่ actionPerformed จึงใช้ Lambda ได้
 * - MouseListener มี 5 เมธอด ใช้ Lambda ไม่ได้ (ยกเว้นจะเขียนผ่าน MouseAdapter ซึ่งเป็นอีกเรื่องนึง)
 */
