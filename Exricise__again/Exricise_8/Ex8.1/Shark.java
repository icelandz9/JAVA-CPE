public class Shark extends Fish { // Shark สืบทอดจาก Fish (ได้ทุกอย่างจาก Fish)

    public Shark(double weight) {
        super(weight); // เรียก constructor ของ Fish เพื่อเก็บน้ำหนัก
    }

    @Override
    public String toString() { // override แค่ข้อความ
        return "I am a " + getWeight() + " kg shark. "; // บอกว่าเป็นฉลาม
    }
    // ไม่ override swim() → ใช้ swim() ของ Fish แทน
}