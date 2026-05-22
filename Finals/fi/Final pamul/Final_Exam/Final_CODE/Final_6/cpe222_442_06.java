package Final_Exam.Final_CODE.Final_6;

public class cpe222_442_06 {
    /**
     * จุดเริ่มต้นของโปรแกรม — สาธิตการใช้งาน Polymorphism และการสืบทอดของยานพาหนะ
     *
     * @param args อาร์กิวเมนต์จาก command line
     */
    public static void main(String[] args) {

        // ─── ส่วนที่ 1: การสร้าง Instance ของยานพาหนะต่าง ๆ ──────────────────────
        Motorcycle wave = new Motorcycle("Wave110i", "honda", 2020, 2, "Single Cylinder and 110cc");
        OffRoad raptor = new OffRoad("Raptor", "Ford", 2019, 4, 4);
        Car almerra = new Car("almera", "Nissan", 2018, 4, 4);

        // ─── ส่วนที่ 2: แสดงข้อมูลของยานพาหนะ ───────────────────────────────
        System.out.println(raptor); // แสดงรายละเอียดรถ OffRoad
        System.out.println(almerra); // แสดงรายละเอียดรถเก๋ง
        System.out.println(wave); // แสดงรายละเอียดรถจักรยานยนต์
    }
}