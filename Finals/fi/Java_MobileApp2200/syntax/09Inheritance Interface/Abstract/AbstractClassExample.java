/*
 * ชื่อไฟล์: AbstractClassExample.java
 * หัวข้อ: Abstract Class (คลาสนามธรรม)
 * คำอธิบาย: Abstract class ไม่สามารถสร้าง object ได้โดยตรง
 *           ใช้เป็น "แม่แบบ" กำหนดโครงสร้างให้ class ลูกทำตาม
 *           abstract method = เมธอดที่ไม่มี body (ลูกต้อง implement)
 * ตัวอย่างการใช้งาน: คำนวณพื้นที่รูปทรงต่างๆ
 */

// Abstract Class — ไม่สามารถ new Shape() ได้
abstract class Shape {
    String color;

    public Shape(String color) {
        this.color = color;
    }

    // Abstract method — ไม่มี body, ลูกต้อง Override
    abstract double getArea();
    abstract double getPerimeter();

    // Concrete method — มี body, ลูกใช้ได้เลย
    public void showInfo() {
        System.out.println("สี: " + color);
        System.out.printf("พื้นที่: %.2f%n", getArea());
        System.out.printf("เส้นรอบรูป: %.2f%n", getPerimeter());
    }
}

// Class ลูกต้อง implement ทุก abstract method
class Circle extends Shape {
    double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    double getArea() { return Math.PI * radius * radius; }

    @Override
    double getPerimeter() { return 2 * Math.PI * radius; }
}

class Rectangle extends Shape {
    double width, height;

    public Rectangle(String color, double w, double h) {
        super(color);
        this.width = w;
        this.height = h;
    }

    @Override
    double getArea() { return width * height; }

    @Override
    double getPerimeter() { return 2 * (width + height); }
}

public class AbstractClassExample {
    public static void main(String[] args) {
        System.out.println("=== Abstract Class ===");

        // Shape s = new Shape("แดง"); // Error! ไม่สามารถสร้าง object จาก abstract class

        System.out.println("-- วงกลม --");
        Circle c = new Circle("แดง", 5);
        c.showInfo();

        System.out.println("\n-- สี่เหลี่ยม --");
        Rectangle r = new Rectangle("น้ำเงิน", 4, 6);
        r.showInfo();

        // ใช้ Polymorphism กับ abstract class ได้
        System.out.println("\n-- Polymorphism --");
        Shape[] shapes = { c, r };
        for (Shape s : shapes) {
            System.out.printf("%s: พื้นที่ = %.2f%n",
                s.getClass().getSimpleName(), s.getArea());
        }
    }
}

/*
 * ผลลัพธ์:
 * วงกลม — สี: แดง, พื้นที่: 78.54, เส้นรอบรูป: 31.42
 * สี่เหลี่ยม — สี: น้ำเงิน, พื้นที่: 24.00, เส้นรอบรูป: 20.00
 *
 * หมายเหตุ:
 * - abstract class มีทั้ง abstract method (ไม่มี body) และ concrete method (มี body)
 * - ถ้าลูกไม่ implement abstract method ทุกตัว → ลูกต้องเป็น abstract ด้วย
 * - abstract class vs interface: abstract มี constructor + field ได้, interface ไม่มี
 */
