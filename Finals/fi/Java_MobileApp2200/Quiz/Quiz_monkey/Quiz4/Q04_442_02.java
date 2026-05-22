package Quiz.Quiz_monkey.Quiz4;

import java.util.Scanner;

public class Q04_442_02 {
  public static void main(String[] args) {
    double length, width, deptOut, deptln;
    double diff;
    Scanner sn = new Scanner(System.in);
    
    // 1. รับค่าต่างๆ ของกล่องสี่เหลี่ยม
    System.out.println("Enter value of width:");
    width = sn.nextDouble();
    System.out.println("Enter value of length:");
    length = sn.nextDouble();
    System.out.println("Enter inner depth:");
    deptln = sn.nextDouble();
    System.out.println("Enter outer depth:");
    deptOut = sn.nextDouble();
    
    // 2. เรียกใช้ Method เพื่อหาผลต่างของปริมาตร
    diff = rectangleBoxVolumeDif(length, width, deptOut, deptln);
    System.out.println("The different volume of 2 Rectangle Boxes is:" + diff);
  }

  /**
   * Method คำนวณหาผลต่างของปริมาตรกล่องสี่เหลี่ยม 2 ใบที่มีความกว้างและความยาวเท่ากัน
   * (Volume = length * width * depth)
   */
  public static double rectangleBoxVolumeDif(double length, double width, double deptOut, double deptln) {
    double diff;
    // หาผลต่างความลึกก่อน แล้วจึงนำไปคูณกับความกว้างและความยาว
    diff = deptOut - deptln;
    return length * width * diff;
  }
}