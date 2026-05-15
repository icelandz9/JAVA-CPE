package Quiz.Quiz_monkey.Quiz4;

import java.util.Scanner;

public class Q04_442_01 {
  public static void main(String[] args) {
    // 1. เรียกใช้ Method Overloading 3 รูปแบบ
    double Area1 = calArea(5, 6);       // พื้นที่สามเหลี่ยม
    double Area2 = calArea(1);          // พื้นที่วงกลม
    double Area3 = calArea(2, 3, 4);    // พื้นที่สี่เหลี่ยมคางหมู
    
    System.out.print("Triangle area is " + Area1 + "\nCircle area is " + Area2 + "\nTrapezoidal area is " + Area3);
  }

  /**
   * Method Overloading: รูปแบบที่ 1 รับพารามิเตอร์ 3 ตัว (สำหรับสี่เหลี่ยมคางหมู)
   */
  public static double calArea(double a, double b, double h) {
    double area;
    area = ((a + b) / 2) * h;
    return area;
  }

  /**
   * Method Overloading: รูปแบบที่ 2 รับพารามิเตอร์ 1 ตัว (สำหรับวงกลม)
   */
  public static double calArea(double r) {
    double area, h;
    h = r * r;
    area = 3.14 * h;
    return area;
  }

  /**
   * Method Overloading: รูปแบบที่ 3 รับพารามิเตอร์ 2 ตัว (สำหรับสามเหลี่ยม)
   */
  public static double calArea(double b, double h) {
    double area;
    area = (b * h) / 2;
    return area;
  }
}