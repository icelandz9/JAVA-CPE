package Final_Exam.Final_CODE.Final_1.code1;

public class Rectangel implements Drawable, CalVolume {

    // ─── ส่วนที่ 1: การวาดรูปสี่เหลี่ยม ───────────────────────────────
    /**
     * คืนค่ารายละเอียดวิธีการวาดรูปสี่เหลี่ยม
     * 
     * @return ข้อความอธิบายเส้นและมุม
     */
    public String draw() {
        return "4 straight lines and 4 corners";
    }

    // ─── ส่วนที่ 2: การคำนวณปริมาตร ───────────────────────────────
    /**
     * คืนค่าปริมาตรของสี่เหลี่ยม
     * 
     * @return ค่าปริมาตร (Double)
     */
    public Double volume() {
        return 4.44;
    }

}