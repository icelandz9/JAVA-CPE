package Final_Exam.Final_CODE.Final_1.code1;

public class Circle implements Drawable, CalVolume, CalPerimeter {

    // ─── ส่วนที่ 1: การวาดรูปวงกลม ───────────────────────────────
    /**
     * คืนค่ารายละเอียดวิธีการวาดรูปวงกลม
     * 
     * @return ข้อความอธิบายรัศมีและค่า PI
     */
    public String draw() {
        return "radius and PI value";
    }

    // ─── ส่วนที่ 2: การคำนวณปริมาตร ───────────────────────────────
    /**
     * คืนค่าปริมาตรของวงกลม
     * 
     * @return ค่าปริมาตร (Double)
     */
    public Double volume() {
        return 9.99;
    }

    // ─── ส่วนที่ 3: การคำนวณเส้นรอบรูป ─────────────────────────────
    /**
     * คืนค่าเส้นรอบรูปของวงกลม
     * 
     * @return ค่าเส้นรอบรูป (Double)
     */
    public Double perimeter() {
        return 0.99;
        // ถ้าไม่รู้จะ return อะไรให้ return ตามที่ตัวแปรต้องการก่อน เช่น double = 0.000
        // หรือ String = ""
    }

}