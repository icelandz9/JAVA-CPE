package Final_Exam.Final_CODE.Final_6;

public class Motorcycle extends MotorVehicle {
    // ─── ส่วนที่ 1: คุณลักษณะเฉพาะของรถจักรยานยนต์ ───────────────────────
    private String engineType; // ประเภทของเครื่องยนต์

    /**
     * คอนสตรัคเตอร์สำหรับรถจักรยานยนต์
     */
    public Motorcycle(String model, String make, int year, int seat, String engineType) {
        super(model, make, year, seat);
        this.engineType = engineType;
    }

    public String getEngineType() {
        return engineType;
    }

    // ─── ส่วนที่ 2: การแสดงผลข้อมูล ──────────────────────────────────
    @Override
    public String toString() {
        return getMake() + ", " + getModel() + ", seating: " + getSeat() + ", engine type: " + getEngineType() + ".";
    }
}

/*
 * การใส่ @Override เป็นสิ่งที่ "แนะนำให้ทำอย่างยิ่ง" (แต่ถ้าไม่ใส่
 * โค้ดก็ยังทำงานได้) ด้วยเหตุผลสำคัญ 2 ประการดังนี้ครับ:
 * 
 * 1. เพื่อบอกว่าเรากำลัง "เขียนทับ" เมธอดที่มีอยู่แล้ว
 * ใน Java ทุกๆ คลาสที่เราสร้างขึ้น จะสืบทอดมาจากคลาสแม่สูงสุดที่ชื่อว่า Object
 * โดยอัตโนมัติ ซึ่งในคลาส Object นั้นมีเมธอด public String toString()
 * เตรียมไว้ให้แล้ว
 * (แต่ของเดิมมันจะแสดงผลเป็นชื่อคลาสตามด้วยเลขฐานสิบหกที่อ่านไม่รู้เรื่อง เช่น
 * Motorcycle@15db9742)
 * 
 * การที่เราเขียน toString() ใหม่ในคลาส Motorcycle คือการบอกว่า
 * "ไม่ต้องไปใช้ของเดิมนะ ให้ใช้เวอร์ชันที่เราเขียนใหม่นี้แทน"
 * 
 * 2. เพื่อให้ Compiler ช่วยตรวจสอบความถูกต้อง (ป้องกันการพิมพ์ผิด)
 * นี่คือประโยชน์ที่สำคัญที่สุดสำหรับการสอบครับ ลองดูตัวอย่างนี้:
 * 
 * ถ้าไม่ใส่ @Override: สมมติคุณพิมพ์ชื่อเมธอดผิดเป็น public String tostring()
 * (ตัว s เล็ก) Java จะนึกว่าคุณสร้างเมธอดใหม่ขึ้นมาเอง ไม่เกี่ยวข้องกับ
 * toString() ของเดิม ผลคือเวลาคุณสั่ง System.out.println(myMotor);
 * มันจะไม่ยอมใช้โค้ดที่คุณเขียน แต่มันจะไปใช้ของเดิมที่อ่านไม่รู้เรื่องแทน
 * และคุณจะหาที่ผิดยากมาก
 * 
 * ถ้าใส่ @Override: หากคุณพิมพ์ผิดเป็น tostring() ตัว Compiler
 * จะดีดข้อความฟ้องทันทีว่า:
 * "Error: Method does not override or implement a method from a supertype"
 * มันจะช่วยเตือนสติเราว่า "เฮ้ย! คุณพิมพ์ชื่อผิดนะ" หรือ
 * "คุณใส่ Parameter ผิดนะ"
 * 
 * สรุปสั้นๆ: @Override คือเครื่องหมายยืนยันว่า
 * "เมธอดนี้มีอยู่จริงในคลาสแม่ และฉันตั้งใจจะเขียนทับมัน" เพื่อให้ Compiler
 * ช่วยเช็กว่าเราไม่ได้พิมพ์ชื่อเมธอดสะกดผิดครับ
 */