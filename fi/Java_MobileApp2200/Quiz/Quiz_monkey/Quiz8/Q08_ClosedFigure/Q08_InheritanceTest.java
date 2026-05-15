package Quiz.Quiz_monkey.Quiz8.Q08_ClosedFigure;

/**
 * โปรแกรมทดสอบ Inheritance (Quiz #08)
 */
public class Q08_InheritanceTest {
    public static void main(String[] args) {
        // สร้างอ็อบเจ็กต์ของ Circle
        ClosedFigure c1 = new Circle(2.0);
        ClosedFigure c2 = new Circle();
        ClosedFigure c3 = new Circle(3.0, "Red");

        // สร้างอ็อบเจ็กต์ของ Rectangle
        ClosedFigure r1 = new Rectangle(3.0, 3.3, "Black");
        ClosedFigure r2 = new Rectangle(2.0, 2.2);
        ClosedFigure r3 = new Rectangle();

        // แสดงผลลัพธ์
        System.out.println(r3);
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c1);
    }
}
