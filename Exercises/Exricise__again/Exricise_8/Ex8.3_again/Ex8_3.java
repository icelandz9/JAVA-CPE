public class Ex8_3 {
    public static void main(String[] args) {
        // ประกาศตัวแปรเป็นแบบแม่ แต่ใส่ object ลูกเข้าไปได้เลย
        Flyable duck = new Duck(); 
        Flyable plane = new Plane();

        duck.fly(); // เรียกใช้ตัวแปรที่ประกาศเพื่อดู output
        plane.fly();
    }
}
