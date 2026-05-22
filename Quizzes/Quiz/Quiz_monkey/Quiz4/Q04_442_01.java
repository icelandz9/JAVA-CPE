package Quiz.Quiz_monkey.Quiz4;

import java.util.Scanner;

public class Q04_442_01 {
  public static void main(String[] args) {
    double Area1 = calArea(5, 6), Area2 = calArea(1), Area3 = calArea(2, 3, 4);
    System.out.print("Triangle area is " + Area1 + "\nCircle area is " + Area2 + "\nTrapezoidal area is " + Area3);
  }

  public static double calArea(double a, double b, double h) {
    double area;
    area = ((a + b) / 2) * h;
    return area;
  }

  public static double calArea(double r) {
    double area, h;
    h = r * r;
    area = 3.14 * h;
    return area;
  }

  public static double calArea(double b, double h) {
    double area;
    area = (b * h) / 2;
    return area;
  }
}