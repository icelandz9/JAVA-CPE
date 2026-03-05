public class Exercise1_circle {

    //static final = ค่าคงที่ของคลาส
    public static final double CirclePi = 3.14;
    private double r;

    public Exercise1_circle(double radius) {
        this.r = radius;
    }

    public double getArea() {
        return CirclePi * r * r;
    }

    public double getVolume() {
        return (4.0 / 3.0) * CirclePi * r * r * r;
    }

    public double getCircumference() {
        return 2 * CirclePi * r;
    }

    public static void main(String[] args) {

        // สร้างสร้าง object ชื่อ c1 รัศมี = 4 มันถูกส่งไปที่ radius
        Exercise1_circle c1 = new Exercise1_circle(4);
        // สร้างสร้าง object ชื่อ c1 รัศมี = 1.5
        Exercise1_circle c2 = new Exercise1_circle(1.5);

        System.out.println("First Circle (C1)");
        System.out.println("-----------");
        // เรียกใช้ method มาแสดง
        System.out.println("Circle's Area = " + c1.getArea());
        System.out.println("Circle's Volume = " + c1.getVolume());
        System.out.println("Circle's Circumference = " + c1.getCircumference());

        System.out.println();

        System.out.println("Second Circle (C2)");
        System.out.println("-----------");
        System.out.println("Circle's Area = " + c2.getArea());
        System.out.println("Circle's Volume = " + c2.getVolume());
        System.out.println("Circle's Circumference = " + c2.getCircumference());
    }
}