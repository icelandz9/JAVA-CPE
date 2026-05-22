package Quiz.Quiz_monkey.Quiz5;

/**
 * Quiz 5: Class & UML
 * เขียนคลาส CircleRing ตาม UML Diagram ที่กำหนด
 */
public class CircleRing {
    // 1. ค่าคงที่
    public static final double CirclePi = 3.14;
    
    // 2. คุณสมบัติ (Attributes)
    private double radius_in;
    private double radius_out;

    /**
     * 3. Default Constructor
     * กำหนดค่า radius_in = 5, radius_out = 8
     */
    public CircleRing() {
        this.radius_in = 5.0;
        this.radius_out = 8.0;
    }

    /**
     * 4. Constructor แบบรับ 1 พารามิเตอร์
     * กำหนดค่า radius_in = 5, radius_out = ro
     */
    public CircleRing(double ro) {
        this.radius_in = 5.0;
        this.radius_out = ro;
    }

    /**
     * 5. Constructor แบบรับ 2 พารามิเตอร์
     * กำหนดค่า radius_in = ri, radius_out = ro
     */
    public CircleRing(double ri, double ro) {
        this.radius_in = ri;
        this.radius_out = ro;
    }

    /**
     * คืนค่ารัศมีวงใน
     */
    public double getRadiusIn() {
        return this.radius_in;
    }

    /**
     * คืนค่ารัศมีวงนอก
     */
    public double getRadiusOut() {
        return this.radius_out;
    }

    /**
     * คำนวณพื้นที่วงกลมด้านใน
     */
    public double getCircleAreaIn() {
        return CirclePi * this.radius_in * this.radius_in;
    }

    /**
     * คำนวณพื้นที่วงกลมด้านนอก
     */
    public double getCircleAreaOut() {
        return CirclePi * this.radius_out * this.radius_out;
    }

    /**
     * คำนวณพื้นที่วงแหวน (พื้นที่วงนอก - พื้นที่วงใน)
     */
    public double getCircleRingArea() {
        return CirclePi * ((this.radius_out * this.radius_out) - (this.radius_in * this.radius_in));
    }

    /**
     * แสดงรายละเอียดของวงแหวน
     */
    public void printCircleRing() {
        System.out.println("All parameters of this Circle Ring");
        System.out.println("Radius In = " + getRadiusIn() + " cm, Radius Out = " + getRadiusOut() + " cm");
        System.out.println("Circle Area Inside = " + getCircleAreaIn() + " cm2 and Circle Area Outside = " + getCircleAreaOut() + " cm2");
        System.out.println("Circle Ring Area = " + getCircleRingArea() + " cm2");
    }
}
