// ══════════════════════════════════════════════════════════════
//  PracticeV2_Shape.java  —  Final_1 ดัดแปลง
//
//  ต้นแบบ:  Exercise 7 (SuperHero), Final_1 code1 (Drawable/CalVolume/Circle/Rectangel)
//
//  แนวคิดหลักที่ต้องทำได้ในสอบ:
//    1. สร้าง Interface หลายตัว (Describable, Measurable)
//    2. สร้างคลาสที่ implement หลาย Interface พร้อมกัน
//    3. Override toString() เพื่อแสดงผลด้วย System.out.println
//    4. ใช้ super() เรียก constructor ของ parent
//
//  คำชี้แจง (จำลองโจทย์สอบ):
//    ระบบจัดการข้อมูลสัตว์เลี้ยง
//    - Interface Describable: String describe()
//    - Interface Measurable:  double getWeight()
//    - คลาส Pet (abstract-style): มี String name, String species
//    - คลาส Dog extends Pet implements Describable, Measurable
//    - คลาส Cat extends Pet implements Describable, Measurable
//    - main: สร้าง Dog และ Cat แล้ว println ข้อมูล
// ══════════════════════════════════════════════════════════════

// ─── Interface 1: กำหนดพฤติกรรมการอธิบาย ─────────────────────
//  เทียบเท่า Drawable ใน Final_1 code1
interface Describable {
    public String describe();   // เหมือน draw() ใน Drawable
}

// ─── Interface 2: กำหนดพฤติกรรมการวัด ───────────────────────
//  เทียบเท่า CalVolume ใน Final_1 code1
interface Measurable {
    public double getWeight();  // เหมือน volume() ใน CalVolume
}

// ─── คลาสแม่ (เทียบเท่า Rectangel/Circle ที่ไม่มี parent จริงๆ) ─
//  ในโจทย์สอบบางข้อจะให้มี parent class ก่อน แล้วค่อย implement interface
class Pet {
    protected String name;     // ชื่อสัตว์เลี้ยง
    protected String species;  // ชนิดพันธุ์

    public Pet(String name, String species) {
        this.name = name;
        this.species = species;
    }

    // Getter สำหรับ name — มักออกสอบให้เรียกใน subclass
    public String getName()    { return name; }
    public String getSpecies() { return species; }
}

// ─── คลาส Dog: สืบทอด Pet + implement 2 interface ──────────
//  เทียบเท่า Circle ที่ implements Drawable, CalVolume, CalPerimeter
class Dog extends Pet implements Describable, Measurable {
    private String breed;      // พันธุ์สุนัข  (เทียบ engineType ของ Motorcycle)
    private double weight;     // น้ำหนัก

    public Dog(String name, String breed, double weight) {
        super(name, "Dog");    // ส่งชื่อและชนิดไปให้ Pet
        this.breed = breed;
        this.weight = weight;
    }

    // ─── implement Describable ─────────────────────────────
    @Override
    public String describe() {
        // เทียบ draw() ของ Circle ที่ return "radius and PI value"
        return "I am a " + breed + " dog named " + name;
    }

    // ─── implement Measurable ─────────────────────────────
    @Override
    public double getWeight() {
        return weight;   // เทียบ volume() ที่ return 9.99
    }

    // toString ทำให้ System.out.println แสดงผลสวยงาม
    @Override
    public String toString() {
        return "I am " + getSpecies() + ". " + describe() + ". My weight is " + getWeight() + " kg.";
    }
}

// ─── คลาส Cat: สืบทอด Pet + implement 2 interface ──────────
//  เทียบเท่า Rectangel ที่ implements Drawable, CalVolume
class Cat extends Pet implements Describable, Measurable {
    private String color;      // สีขนแมว
    private double weight;

    public Cat(String name, String color, double weight) {
        super(name, "Cat");
        this.color = color;
        this.weight = weight;
    }

    @Override
    public String describe() {
        // เทียบ draw() ของ Rectangel ที่ return "4 straight lines..."
        return "I have " + color + " fur and my name is " + name;
    }

    @Override
    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "I am " + getSpecies() + ". " + describe() + ". My weight is " + getWeight() + " kg.";
    }
}

// ─── Main Class ───────────────────────────────────────────────
public class PracticeV2_Shape {
    /**
     * จุดเริ่มต้นของโปรแกรม
     *
     *  แพทเทิร์นที่ต้องจำ:
     *   1. สร้าง object จาก subclass
     *   2. เรียกเมธอดที่ implement มาจาก interface
     *   3. println ใช้ toString() อัตโนมัติ
     */
    public static void main(String[] args) {

        // ─── สร้าง instance — เทียบกับ Final_1 code1 ────────────
        Dog rex  = new Dog("Rex",   "German Shepherd", 30.5);
        Cat nala = new Cat("Nala",  "orange",          4.2);

        // ─── แสดงผล — pattern เดียวกับ cpe222_442_01 ─────────────
        // Final_1 บรรทัด 16: System.out.println("I am recangle. I have " + rec.draw() + ...)
        System.out.println(rex.toString());
        System.out.println(nala.toString());

        // ─── ทดสอบเรียก interface method โดยตรง ─────────────────
        System.out.println("Rex describe: " + rex.describe());
        System.out.println("Nala weight:  " + nala.getWeight() + " kg");
    }
}
