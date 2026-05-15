package Quiz.Quiz_monkey.Quiz3;

import javax.swing.JOptionPane;

/**
 * Quiz 3 - Item 1: Matrix Odd Sum
 * สร้างเมทริกซ์ขนาด 5x5 สุ่มตัวเลขระหว่าง -1500 ถึง 500
 * และหาผลรวมของ "ตัวเลขคี่" (Odd numbers) ทั้งหมด
 */
public class Q03_MatrixOddSum {
    public static void main(String[] args) {
        int ran = 0, sum = 0;
        
        System.out.println("Generated 5x5 Matrix:");
        // 1. วนลูป 25 ครั้ง เพื่อสร้างเมทริกซ์ 5x5
        for (int i = 1; i <= 25; i++) {
            // 2. สุ่มตัวเลขระหว่าง -1500 ถึง 500
            // Math.random() * 2001 จะได้ [0, 2000]
            // - 1500 จะได้ [-1500, 500]
            ran = (int) ((Math.random() * 2001) - 1500);
            
            // 3. แสดงผลตัวเลข จัดรูปแบบให้สวยงาม
            System.out.printf("%6d", ran);
            
            // ขึ้นบรรทัดใหม่ทุก 5 ตัว
            if (i % 5 == 0) {
                System.out.println();
            }
            
            // 4. ตรวจสอบว่าเป็นเลขคี่หรือไม่ (ระวังเลขติดลบ % 2 จะได้ -1)
            if (ran % 2 != 0) {
                sum += ran;
            }
        }
        
        // 5. แสดงผลรวมผ่าน JOptionPane
        JOptionPane.showMessageDialog(null, 
            "The sum of all odd numbers in the 5x5 matrix is " + sum, 
            "Result",
            JOptionPane.INFORMATION_MESSAGE);
    }
}
