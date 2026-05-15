package Quiz.Quiz_monkey.Quiz3;

import javax.swing.JOptionPane;

public class Q03_442_02 {
  public static void main(String[] args) {
    int i, ran = 0, sum = 0;
    
    // 1. วนลูป 25 ครั้ง เพื่อสร้างเมทริกซ์ขนาด 5x5
    for (i = 1; i <= 25; i++) {
      // 2. สุ่มตัวเลขในช่วง [-999, 1500] (Math.random() ให้ 0.0 - 0.99)
      ran = (int) ((Math.random() * 2499) - 999);
      
      // 3. จัดรูปแบบการแสดงผลให้เป็นระเบียบ (เว้นวรรคตามจำนวนหลัก)
      if (ran >= 0) {
        System.out.print(" ");
      }
      if (ran > -10 && ran < 10) {
        System.out.print(" ");
      }
      if (ran > -100 && ran < 100) {
        System.out.print(" ");
      }
      System.out.print("  " + ran);
      
      // 4. ขึ้นบรรทัดใหม่ทุกๆ 5 ตัวเลข
      if (i % 5 == 0)
        System.out.print("\n");
        
      // 5. หาผลรวม (ในโค้ดนี้คือผลรวมของตัวเลขที่ "ติดลบ" แม้โจทย์จะระบุเป็นเลขคี่ก็ตาม)
      if (ran < 0)
        sum = sum + ran;
    }
    
    // 6. แสดงผลลัพธ์รวมผ่าน Dialog
    JOptionPane.showMessageDialog(null, "The sum of all positive numbers in the 5x5 matrix is " + sum, "Result",
        JOptionPane.INFORMATION_MESSAGE);
  }
}