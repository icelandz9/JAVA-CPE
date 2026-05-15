package Final_Exam.Final_CODE.Final_6;

public class MotorVehicle {
    // ─── ส่วนที่ 1: การประกาศตัวแปรคุณลักษณะ (Attributes) ───────────────────
    protected String model; // ชื่อรุ่น
    protected String make; // ยี่ห้อ
    protected int year; // ปีที่ผลิต
    protected int seat; // จำนวนที่นั่ง

    /**
     * คอนสตรัคเตอร์สำหรับกำหนดค่าเริ่มต้นให้กับยานพาหนะ
     * 
     * @param model ชื่อรุ่น
     * @param make  ยี่ห้อ
     * @param year  ปีที่ผลิต
     * @param seat  จำนวนที่นั่ง
     */
    public MotorVehicle(String model, String make, int year, int seat) {
        this.model = model;
        this.make = make;
        this.year = year;
        this.seat = seat;

        /*
         * สาเหตุที่ต้องระบุ this ในบรรทัดนั้นเป็นเพราะเรื่อง "ชื่อซ้ำกัน" (Shadowing)
         * ครับ
         * 
         * ลองสังเกตดูนะครับ:
         * 
         * Field ของคลาส (ตัวแปรข้างบน): ชื่อ model, make, year, seat (บรรทัดที่ 5-8)
         * Parameter ของ Constructor (ตัวแปรในวงเล็บ): ก็ชื่อ model, make, year, seat
         * เหมือนกันเป๊ะ! (บรรทัดที่ 17)
         * 
         * ในกรณีนี้ Java จะให้ความสำคัญกับ ตัวแปรที่อยู่ใกล้ที่สุด (นั่นคือ Parameter
         * ในวงเล็บ) ทำให้ค่าที่ส่งมาไม่ถูกเก็บเข้าไปในตัวแปรของคลาส (Field) จริงๆ
         * 
         * เมื่อใส่ this เข้าไป:
         * this.model หมายถึง "ตัวแปร model ที่เป็นของคุณสมบัติคลาส"
         * (ตัวที่อยู่บรรทัดที่ 5)
         * model (เฉยๆ) หมายถึง "ค่าที่ส่งมาจากในวงเล็บ" (บรรทัดที่ 17)
         * สรุปสั้นๆ: เราใช้ this เพื่อ "แยกแยะ" ระหว่าง ตัวแปรของคลาส กับ
         * ตัวแปรที่รับเข้ามา ในกรณีที่ตั้งชื่อเหมือนกันครับ
         * 
         * TIP
         * 
         * ในการสอบ ถ้าคุณตั้งชื่อ Parameter ไม่ให้เหมือนกับ Field (เช่น public
         * MotorVehicle(String m, String mk...)) คุณก็ไม่จำเป็นต้องใส่ this ก็ได้
         * (เขียนเป็น model = m;)
         * แต่ตามมาตรฐานสากลและในข้อสอบมักนิยมตั้งชื่อให้เหมือนกันและใช้ this
         * เพื่อความชัดเจนครับ
         */
    }

    // ─── ส่วนที่ 2: เมธอด Getter สำหรับเข้าถึงข้อมูล ──────────────────────────
    public String getModel() {
        return this.model;
    }

    public String getMake() {
        return this.make;
    }

    public int getYear() {
        return this.year;
    }

    public int getSeat() {
        return this.seat;
    }
}