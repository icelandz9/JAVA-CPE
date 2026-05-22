package Quiz.Quiz_Graymatter.Exam8;

/**
 * คลาส Exam8_1Cylinder สำหรับจัดการข้อมูลและการคำนวณที่เกี่ยวข้องกับทรงกระบอก
 * เช่น การหาพื้นที่ผิว ปริมาตร เป็นต้น
 */
public class Exam8_1Cylinder {
    // ค่าคงที่ของพาย (Pi) สำหรับใช้ในการคำนวณ
    public static final double PI = 3.14;
    
    // รัศมีของฐานทรงกระบอก
    private double radius;
    // ความสูงของทรงกระบอก
    private double height;

    /**
     * คอนสตรัคเตอร์ (Constructor) ที่รับค่ารัศมีและความสูง
     * @param r รัศมีของฐานทรงกระบอก
     * @param h ความสูงของทรงกระบอก
     */
    public Exam8_1Cylinder(double r, double h) {
        this.radius = r;
        this.height = h;
    }

    /**
     * คอนสตรัคเตอร์เริ่มต้น (Default Constructor) 
     * กำหนดค่าเริ่มต้นให้รัศมี = 4.0 และความสูง = 7.0
     */
    public Exam8_1Cylinder() {
        this.radius = 4.0;
        this.height = 7.0;
    }

    /**
     * คอนสตรัคเตอร์ที่รับเฉพาะค่ารัศมี 
     * โดยกำหนดความสูงคงที่ไว้ที่ 7.0
     * @param r รัศมีของฐานทรงกระบอก
     */
    public Exam8_1Cylinder(double r) {
        this.radius = r;
        this.height = 7.0;
    }

    /**
     * เมธอดสำหรับคำนวณพื้นที่ผิวทั้งหมดของทรงกระบอก 
     * สูตร: 2 * PI * r * (r + h)
     * @return พื้นที่ผิวทั้งหมดของทรงกระบอก
     */
    public double getCylinderArea() {
        return (2.0 * PI * radius) * (radius + height);
    }

    /**
     * เมธอดสำหรับดึงค่ารัศมี (Getter for radius)
     * @return รัศมีปัจจุบันของทรงกระบอก
     */
    public double getRadius() {
        return radius;
    }

    /**
     * เมธอดสำหรับคำนวณปริมาตรของทรงกระบอก
     * สูตร: PI * r^2 * h
     * @return ปริมาตรของทรงกระบอก
     */
    public double getCylinderVolume() {
        return PI * radius * radius * height;
    }

    /**
     * เมธอดสำหรับดึงค่าความสูง (Getter for height)
     * @return ความสูงปัจจุบันของทรงกระบอก
     */
    public double getHeight() {
        return height;
    }

    /**
     * เมธอดสำหรับคำนวณพื้นที่ผิวข้างของทรงกระบอก
     * สูตร: 2 * PI * r * h
     * @return พื้นที่ผิวข้างของทรงกระบอก
     */
    public double getSurfaceAreaAllSides() {
        return 2.0 * PI * radius * height;
    }

    /**
     * เมธอดสำหรับแสดงรายละเอียดทั้งหมดของทรงกระบอกออกทางหน้าจอ
     */
    public void printCylinder() {
        System.out.println("");
        System.out.println("All parameters of this Cylinder");
        // แสดงค่ารัศมีและความสูง
        System.out.println("Radius = " + getRadius() + " cm, Height = " + getHeight());
        // แสดงพื้นที่ผิวทั้งหมด (ในโค้ดเดิมเขียนเป็น Circle Area แต่อาจหมายถึง Total Area)
        System.out.println("Circle Area = " + getCylinderArea());
        // แสดงพื้นที่ผิวข้าง
        System.out.println("Surface Area of All Sides = " + getSurfaceAreaAllSides() + "cm2");
        // แสดงปริมาตรรวม
        System.out.println("Volume of Cylinder  = " + getCylinderVolume() + "cm3");
    }
}
