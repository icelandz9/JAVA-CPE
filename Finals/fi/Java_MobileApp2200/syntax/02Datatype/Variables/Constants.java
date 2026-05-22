/*
 * ชื่อไฟล์: Constants.java
 * หัวข้อ: ค่าคงที่ (Constants)
 * คำอธิบาย: การใช้คำสั่ง final เพื่อประกาศตัวแปรที่ไม่สามารถเปลี่ยนแปลงค่าได้
 * ตัวอย่างการใช้งาน: ค่า Pi, อัตราภาษี, ข้อความแจ้งเตือนที่ใช้บ่อย
 */

public class Constants {
    // นิยมประกาศค่าคงที่ไว้ระดับ Class (static final) และใช้ตัวพิมพ์ใหญ่ทั้งหมด (SNAKE_CASE)
    static final double PI = 3.14159;
    static final String APP_NAME = "JavaTutorial v1.0";
    
    public static void main(String[] args) {
        System.out.println("ยินดีต้อนรับสู่ " + APP_NAME);
        
        // การใช้งานค่าคงที่แบบ local variable
        final int DAYS_IN_WEEK = 7;
        // DAYS_IN_WEEK = 8; // Error: ไม่สามารถแก้ไขค่าตัวแปร final ได้
        
        System.out.println("1 สัปดาห์มี " + DAYS_IN_WEEK + " วัน");
        
        // คำนวณพื้นที่วงกลม
        double radius = 5.0;
        double area = PI * radius * radius;
        
        System.out.println("วงกลมรัศมี " + radius + " มีพื้นที่: " + area);
        
        // การใช้ค่าคงที่ช่วยให้อ่านโค้ดง่ายขึ้นและแก้ไขค่าได้สะดวก (แก้ที่เดียว)
        final int MAX_STUDENTS = 30;
        int currentStudents = 25;
        
        if (currentStudents < MAX_STUDENTS) {
            System.out.println("สามารถรับนักเรียนเพิ่มได้อีก " + (MAX_STUDENTS - currentStudents) + " คน");
        } else {
            System.out.println("ห้องเรียนเต็มแล้ว");
        }
    }
}

/*
 * ผลลัพธ์ที่ได้:
 * ยินดีต้อนรับสู่ JavaTutorial v1.0
 * 1 สัปดาห์มี 7 วัน
 * วงกลมรัศมี 5.0 มีพื้นที่: 78.53975
 * สามารถรับนักเรียนเพิ่มได้อีก 5 คน
 * 
 * หมายเหตุ:
 * - ควรใช้ตัวพิมพ์ใหญ่ทั้งหมดคั่นด้วย _ (SNAKE_CASE) สำหรับชื่อค่าคงที่
 * - การใช้ค่าคงที่ (Magic Numbers) แทนการเขียนตัวเลขลงไปตรงๆ ช่วยให้โค้ดอ่านง่ายและดูแลรักษาง่าย
 */
