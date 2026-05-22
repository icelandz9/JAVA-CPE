package Quiz.Quiz_monkey.Quiz5;

/**
 * Quiz 5: Class & UML Test Program
 * โปรแกรมทดสอบการทำงานของคลาส CircleRing ตามโจทย์
 */
public class Q05_CircleRingTest {
    public static void main(String[] args) {
        System.out.println("--- Test CircleRing ---");
        
        // 1. สร้างอ็อบเจกต์ตามโจทย์: CircleRing C1 = new CircleRing(5.0, 8.0)
        CircleRing C1 = new CircleRing(5.0, 8.0);
        
        // 2. เรียกใช้ Method เพื่อแสดงผล: C1.printCircleRing()
        C1.printCircleRing();
    }
}
