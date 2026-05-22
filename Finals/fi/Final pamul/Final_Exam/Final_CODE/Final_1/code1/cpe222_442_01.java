package Final_Exam.Final_CODE.Final_1.code1;

public class cpe222_442_01 {
    /**
     * จุดเริ่มต้นของโปรแกรม — สาธิตการใช้งาน Interface และการสืบทอด
     *
     * @param args อาร์กิวเมนต์จาก command line
     */
    public static void main(String[] args) {

        // ─── ส่วนที่ 1: การสร้าง Instance ของรูปทรง ─────────────────────────────
        Rectangel rec = new Rectangel(); // สร้างออบเจ็กต์สี่เหลี่ยม
        Circle cir = new Circle(); // สร้างออบเจ็กต์วงกลม

        // ─── ส่วนที่ 2: การแสดงผลข้อมูลของสี่เหลี่ยม ─────────────────────────────
        System.out.println("I am recangle. I have " + rec.draw() + ". My volume is " + rec.volume() + ".");

        // ─── ส่วนที่ 3: การแสดงผลข้อมูลของวงกลม ───────────────────────────────
        System.out.println("I am circle. I have " + cir.draw() + ". My volume is " + cir.volume() + ". My perimeter is "
                + cir.perimeter() + ".");

    }
}
