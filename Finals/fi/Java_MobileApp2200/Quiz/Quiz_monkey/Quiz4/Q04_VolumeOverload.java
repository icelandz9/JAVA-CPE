package Quiz.Quiz_monkey.Quiz4;

/**
 * Quiz 4 - Item 1: Method Overloading for Volumes
 * เขียนโปรแกรมเพื่อคำนวณหาปริมาตรของรูปทรงต่างๆ (ทรงกลม, ทรงกระบอก, ปริซึมสามเหลี่ยม)
 * โดยใช้ Method Overloading ที่ชื่อว่า calVolume()
 */
public class Q04_VolumeOverload {
    public static void main(String[] args) {
        // 1. เรียกใช้ Method Overloading 3 รูปแบบ
        double sphereVol = calVolume(5.0);           // ปริมาตรทรงกลม (รับรัศมี)
        double cylinderVol = calVolume(3.0, 7.0);    // ปริมาตรทรงกระบอก (รับรัศมี, ความสูง)
        double prismVol = calVolume(4.0, 5.0, 10.0); // ปริมาตรปริซึมสามเหลี่ยม (รับฐาน, สูงของสามเหลี่ยม, ความยาวปริซึม)
        
        System.out.printf("Sphere volume is %.2f\n", sphereVol);
        System.out.printf("Cylinder volume is %.2f\n", cylinderVol);
        System.out.printf("Triangle prism volume is %.2f\n", prismVol);
    }

    /**
     * Method Overloading: รูปแบบที่ 1 รับพารามิเตอร์ 1 ตัว (สำหรับทรงกลม)
     * สูตร: (4/3) * PI * r^3
     */
    public static double calVolume(double r) {
        return (4.0 / 3.0) * Math.PI * Math.pow(r, 3);
    }

    /**
     * Method Overloading: รูปแบบที่ 2 รับพารามิเตอร์ 2 ตัว (สำหรับทรงกระบอก)
     * สูตร: PI * r^2 * h
     */
    public static double calVolume(double r, double h) {
        return Math.PI * Math.pow(r, 2) * h;
    }

    /**
     * Method Overloading: รูปแบบที่ 3 รับพารามิเตอร์ 3 ตัว (สำหรับปริซึมสามเหลี่ยม)
     * สูตร: พื้นที่ฐาน(สามเหลี่ยม) * ความยาว = (1/2 * b * hTriangle) * length
     */
    public static double calVolume(double b, double hTriangle, double length) {
        double baseArea = 0.5 * b * hTriangle;
        return baseArea * length;
    }
}
