/*
 * ชื่อไฟล์: InterfaceBasics.java
 * หัวข้อ: Interface พื้นฐาน
 * คำอธิบาย: Interface คือ "สัญญา" ที่กำหนดว่า class ต้องมีเมธอดอะไรบ้าง
 *           ทุกเมธอดใน interface เป็น abstract โดยปริยาย
 *           class หนึ่งสามารถ implements หลาย interface ได้
 * ตัวอย่างการใช้งาน: กำหนดความสามารถ (Printable, Drawable, Comparable)
 */

// Interface ที่ 1
interface Printable {
    void print(); // abstract โดยปริยาย (ไม่ต้องเขียน abstract)

    // default method (Java 8+) — มี body ได้
    default void printHeader() {
        System.out.println("===== เอกสาร =====");
    }
}

// Interface ที่ 2
interface Saveable {
    void save(String filename);

    // static method ใน interface (Java 8+)
    static String getDefaultPath() {
        return "C:/documents/";
    }
}

// Class implements หลาย interface (Multiple Interface)
class Report implements Printable, Saveable {
    String title;
    String content;

    public Report(String title, String content) {
        this.title = title;
        this.content = content;
    }

    @Override
    public void print() {
        printHeader(); // เรียก default method จาก interface
        System.out.println("หัวข้อ: " + title);
        System.out.println("เนื้อหา: " + content);
    }

    @Override
    public void save(String filename) {
        System.out.println("บันทึก '" + title + "' ไปที่ " + filename);
    }
}

public class InterfaceBasics {
    public static void main(String[] args) {
        System.out.println("=== Interface ===");

        Report r = new Report("รายงานสรุป", "ผลประกอบการไตรมาส 1");
        r.print();

        System.out.println();
        r.save("report.txt");

        // เรียก static method จาก interface
        System.out.println("Default path: " + Saveable.getDefaultPath());

        // ใช้ interface เป็นชนิดตัวแปร (Polymorphism)
        System.out.println("\n-- Interface as Type --");
        Printable p = new Report("บิล", "ค่าอาหาร 500 บาท");
        p.print(); // ได้
        // p.save("x"); // Error! ตัวแปร Printable ไม่เห็น save()
    }
}

/*
 * หมายเหตุ:
 * - interface ไม่มี constructor, ไม่มี instance field (มีได้แค่ constant)
 * - field ใน interface เป็น public static final โดยปริยาย
 * - class implements ได้หลาย interface (ต่างจาก extends ที่ได้แค่ 1)
 * - Java 8+: interface มี default method (มี body) และ static method ได้
 */
