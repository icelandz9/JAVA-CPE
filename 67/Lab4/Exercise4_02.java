import java.util.Scanner;
public class Exercise4_02 {
  public static void main(String[] agrs) {
    Scanner sn = new Scanner(System.in);
    System.out.print("Enter Number ");
    int n = sn.nextInt();
    double side = sn.nextDouble();
    double Area = area(n,side);
    System.out.print("Area = "+Area);
    sn.close();
  }
  
  public static double area(int n, double side) {
    final double Pi = Math.PI;
    double Area = (n*(side*side))/4*(Math.tan(Pi/n));
    return Area;
  }
} 