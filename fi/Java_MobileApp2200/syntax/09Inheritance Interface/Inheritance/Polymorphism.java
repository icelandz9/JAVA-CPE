/*
 * ชื่อไฟล์: Polymorphism.java
 * หัวข้อ: ความหลากหลายรูปแบบ (Polymorphism)
 * คำอธิบาย: ตัวแปรชนิดแม่สามารถชี้ไปที่ object ชนิดลูกได้ (Upcasting)
 *           เมื่อเรียกเมธอด จะเรียกเวอร์ชันของ object จริง (Dynamic Dispatch)
 * ตัวอย่างการใช้งาน: ระบบจัดการสัตว์ (Animal → Dog, Cat)
 */

class Animal {
    String name;
    public Animal(String name) { this.name = name; }

    public void makeSound() {
        System.out.println(name + ": ...(เสียงทั่วไป)");
    }
}

class Dog extends Animal {
    public Dog(String name) { super(name); }

    @Override
    public void makeSound() {
        System.out.println(name + ": โฮ่ง โฮ่ง!");
    }

    public void fetch() {
        System.out.println(name + ": ไปเก็บลูกบอล!");
    }
}

class Cat extends Animal {
    public Cat(String name) { super(name); }

    @Override
    public void makeSound() {
        System.out.println(name + ": เมี้ยว~");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        System.out.println("=== Polymorphism ===");

        // 1. Upcasting (ลูก → แม่) — เกิดอัตโนมัติ
        System.out.println("-- Upcasting --");
        Animal a1 = new Dog("บัดดี้");   // Dog → Animal (OK)
        Animal a2 = new Cat("มิกกี้");   // Cat → Animal (OK)
        a1.makeSound(); // เรียก Dog.makeSound() (Dynamic Dispatch!)
        a2.makeSound(); // เรียก Cat.makeSound()
        // a1.fetch(); // Error! ตัวแปรชนิด Animal ไม่เห็น fetch()

        // 2. Polymorphic Array
        System.out.println("\n-- Polymorphic Array --");
        Animal[] animals = { new Dog("โกลเด้น"), new Cat("แมวส้ม"), new Dog("ชิบะ") };
        for (Animal a : animals) {
            a.makeSound(); // เรียกเมธอดตาม object จริง
        }

        // 3. instanceof — ตรวจชนิด object จริง
        System.out.println("\n-- instanceof --");
        for (Animal a : animals) {
            if (a instanceof Dog) {
                System.out.println(a.name + " เป็น Dog");
                // 4. Downcasting (แม่ → ลูก) — ต้อง cast เอง
                Dog d = (Dog) a; // Explicit downcast
                d.fetch(); // ตอนนี้เรียกได้แล้ว
            } else if (a instanceof Cat) {
                System.out.println(a.name + " เป็น Cat");
            }
        }
    }
}

/*
 * ผลลัพธ์:
 * บัดดี้: โฮ่ง โฮ่ง! | มิกกี้: เมี้ยว~
 * โกลเด้น: โฮ่ง โฮ่ง! | แมวส้ม: เมี้ยว~ | ชิบะ: โฮ่ง โฮ่ง!
 * โกลเด้น เป็น Dog → ไปเก็บลูกบอล! ...
 *
 * หมายเหตุ:
 * - Upcasting ปลอดภัยเสมอ (ลูกมีทุกอย่างที่แม่มี)
 * - Downcasting ต้องระวัง → ตรวจด้วย instanceof ก่อน
 * - ถ้า downcast ผิดชนิด → ClassCastException
 */
