package Quiz.Quiz_monkey.Quiz5;

public class CircularCone {
  // ค่าคงที่ Pi
  private static final double Pi = 3.14;
  
  // คุณสมบัติของทรงกรวย
  private double radius;
  private double height;
  private double side;

  /**
   * Default Constructor: กำหนดค่าเริ่มต้น รัศมี=1, สูง=3, สูงเอียง=1
   */
  public CircularCone() {
    this.radius = 1;
    this.height = 3;
    this.side = 1;
  }

  /**
   * Constructor แบบรับ 1 พารามิเตอร์: รับค่ารัศมี กำหนดสูง=3, สูงเอียง=1
   */
  public CircularCone(double r) {
    this.radius = r;
    this.height = 3;
    this.side = 1;
  }

  /**
   * Constructor แบบรับ 2 พารามิเตอร์: รับค่ารัศมีและความสูง กำหนดสูงเอียง=1
   */
  public CircularCone(double r, double h) {
    this.radius = r;
    this.height = h;
    this.side = 1;
  }

  /**
   * คำนวณพื้นที่ผิวทั้งหมดของกรวย
   * สูตร: Pi * r * (r + sqrt(h^2 + r^2))
   */
  public double getCircularConeSurfaceArea() {
    double circularconesurfacearea = Pi * radius * (radius + Math.sqrt((height * height) + (radius * radius)));
    return circularconesurfacearea;
  }

  /**
   * คำนวณพื้นที่ฐานของกรวย
   * สูตร: Pi * r^2
   */
  public double getCircularConeBaseArea() {
    double circularconebasearea = Pi * radius * radius;
    return circularconebasearea;
  }

  /**
   * คำนวณความยาวรอบฐานของกรวย
   * สูตร: 2 * Pi * r
   */
  public double getCircularConeBaseCircumference() {
    double circularconebasecircumference = 2 * Pi * radius;
    return circularconebasecircumference;
  }

  /**
   * คำนวณปริมาตรของกรวย
   * สูตร: (1/3) * Pi * r^2 * h
   */
  public double getCircularConeVolume() {
    double circularconevolume = (Pi * radius * radius * height) / 3;
    return circularconevolume;
  }

  /**
   * แสดงรายละเอียดทั้งหมดของกรวย
   */
  public void printCircularCone() {
    System.out.println("\nAll parameters of this Circular Cone");
    System.out.println("Circular Cone Base Area = " + getCircularConeBaseArea() + " cm2");
    System.out.println("Circular Cone Base Circumference = " + getCircularConeBaseCircumference() + " cm");
    System.out.println("Circular Cone Surface Area = " + getCircularConeSurfaceArea() + " cm2");
    System.out.println("Circular Cone Volume = " + getCircularConeVolume() + " cm3");
  }
}
