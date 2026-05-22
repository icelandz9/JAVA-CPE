package Final_Exam.Final_CODE.Final_1.code2;

public class cpe222_442_01_v2 {
    public static void main(String[] args) {
        // สร้าง Array ของคลาสแม่ (Shape) เพื่อเก็บออบเจ็กต์ลูกที่ต่างกัน (Polymorphism)
        Shape[] shapes = new Shape[2];
        shapes[0] = new Rectangle(5.0, 10.0);
        shapes[1] = new Sphere(3.0);

        System.out.println("--- Shape Report ---");

        for (Shape s : shapes) {
            System.out.println(s.getDescription());

            // เช็กว่าออบเจ็กต์นี้คำนวณได้หรือไม่ (instanceof)
            if (s instanceof Computable) {
                Computable c = (Computable);
                System.out.printf(" > Area: %.2f\n", c.getArea());
                System.out.printf(" > Volume: %.2f\n", c.getVolume());
            }
            System.out.println("--------------------");
        }
    }
}

/*
 * ข้อสอบปฏิบัติ: การออกแบบระบบรูปทรงเรขาคณิตด้วยหลักการ OOP
 * คำชี้แจง: จงเขียนโปรแกรม Java โดยแบ่งโครงสร้างไฟล์ตามที่กำหนดดังนี้
 * (ทุกไฟล์อยู่ใน package Final_Exam.Final_CODE.Final_1.code2)
 * 
 * 1. การสร้างความสามารถในการคำนวณ (Interface)
 * จงสร้างไฟล์ Computable.java เพื่อกำหนดพฤติกรรมของการคำนวณ:
 * 
 * มีเมธอด getArea() สำหรับคืนค่าพื้นที่ (double)
 * มีเมธอด getVolume() สำหรับคืนค่าปริมาตร (double)
 * 2. การสร้างโครงสร้างหลักของรูปทรง (Abstract Class)
 * จงสร้างไฟล์ Shape.java เพื่อเป็นคลาสแม่ของทุกรูปทรง:
 * 
 * มีตัวแปร name (String) เพื่อเก็บชื่อรูปทรง โดยกำหนดระดับการเข้าถึงเป็น
 * protected
 * มี Constructor สำหรับรับค่าชื่อและกำหนดลงในตัวแปร name
 * มี Abstract Method ชื่อ getDescription() ที่ส่งคืนค่าเป็น String
 * มี Getter method สำหรับตัวแปร name
 * 3. การสร้างคลาสรูปทรงเฉพาะ (Concrete Classes)
 * จงสร้างคลาสที่สืบทอดจาก Shape และใช้งาน Interface Computable:
 * 
 * คลาส Rectangle.java: รับค่าความกว้าง (width) และความสูง (height) ผ่าน
 * Constructor และเขียนทับเมธอดการคำนวณพื้นที่ (กว้าง x สูง) และปริมาตร
 * (ให้คืนค่าเป็น 0)
 * คลาส Sphere.java: รับค่ายังรัศมี (radius) ผ่าน Constructor
 * และเขียนทับเมธอดการคำนวณพื้นที่ผิว ($4 \pi r^2$) และปริมาตร ($\frac{4}{3} \pi
 * r^3$) (หมายเหตุ: ใช้ Math.PI และ Math.pow ในการคำนวณ)
 * 4. การแสดงผลและการใช้ Polymorphism (Main Class)
 * จงสร้างไฟล์ cpe222_442_01_v2.java เพื่อรันโปรแกรม:
 * 
 * สร้าง Array ของคลาส Shape ขนาด 2 ช่อง
 * ช่องที่ 1 เก็บออบเจ็กต์ Rectangle (กว้าง 5.0, สูง 10.0)
 * ช่องที่ 2 เก็บออบเจ็กต์ Sphere (รัศมี 3.0)
 * ใช้ Loop วนอ่านค่าใน Array และทำงานดังนี้:
 * แสดงคำอธิบายรูปทรงผ่านเมธอด getDescription()
 * ตรวจสอบว่าออบเจ็กต์ในรอบนั้นเป็น Computable หรือไม่ (ใช้ instanceof)
 * ถ้าใช่ ให้ทำการ Casting ออบเจ็กต์นั้นเป็นชนิด Computable และแสดงผลลัพธ์ของ
 * Area และ Volume โดยใช้ printf เพื่อแสดงทศนิยม 2 ตำแหน่ง
 * จุดที่ต้องระวังในการทำโจทย์นี้ (Exam Checklist):
 * super("Rectangle"): ใน Constructor ของคลาสลูก อย่าลืมส่งชื่อกลับไปให้คลาสแม่
 * 
 * @Override: อย่าลืมใส่เหนือเมธอดที่มาจาก Abstract Class และ Interface
 * 4.0/3.0: ในการหาปริมาตรทรงกลม ต้องใช้ 4.0 (double) ไม่ใช่ 4 (int)
 * ไม่งั้นผลลัพธ์จะเป็น 1.0 เสมอ
 * instanceof และ (Computable) s:
 * นี่คือจุดที่อาจได้คะแนนเสริมหรือโดนหักคะแนนบ่อยที่สุดในข้อสอบ Final ครับ
 */