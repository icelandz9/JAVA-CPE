package Quiz.Quiz_monkey.Quiz5;

import java.util.Scanner;

public class Q05_442_02 {
  public static void main(String[] args) {
    Scanner sn = new Scanner(System.in);

    // 1. สร้างอ็อบเจกต์ด้วย Default Constructor
    CircularCone Cc1 = new CircularCone();
    Cc1.printCircularCone();
    
    // 2. สร้างอ็อบเจกต์ด้วย Constructor รับ 1 พารามิเตอร์ (รัศมี=2)
    CircularCone Cc2 = new CircularCone(2);
    Cc2.printCircularCone();
    
    // 3. สร้างอ็อบเจกต์ด้วย Constructor รับ 2 พารามิเตอร์ (รัศมี=3, สูง=7)
    CircularCone Cc3 = new CircularCone(3, 7);
    Cc3.printCircularCone();
  }
}
