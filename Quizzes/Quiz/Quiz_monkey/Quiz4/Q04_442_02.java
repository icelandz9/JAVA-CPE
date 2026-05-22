package Quiz.Quiz_monkey.Quiz4;

import java.util.Scanner;

public class Q04_442_02 {
  public static void main(String[] args) {
    double length, width, deptOut, deptln;
    double diff;
    Scanner sn = new Scanner(System.in);
    System.out.println("Enter value of width:");
    width = sn.nextDouble();
    System.out.println("Enter value of length:");
    length = sn.nextDouble();
    System.out.println("Enter inner depth:");
    deptln = sn.nextDouble();
    System.out.println("Enter outer depth:");
    deptOut = sn.nextDouble();
    diff = rectangleBoxVolumeDif(length, width, deptOut, deptln);
    System.out.println("The different volume of 2 Rectangle Boxes is:" + diff);
  }

  public static double rectangleBoxVolumeDif(double length, double width, double deptOut, double deptln) {
    double diff;
    diff = deptOut - deptln;
    return length * width * diff;
  }
}