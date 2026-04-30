import java.util.Scanner;
public class Exercise2_08 {
  public static void main(String[] agrs) {
    Scanner sn = new Scanner(System.in);
    System.out.print("Enter a point with two coordinates :");
    double X = sn.nextDouble();
    double Y = sn.nextDouble();

    if (X <= 10/2 && Y <= 5/2) {
      System.out.print("Point ("+X+","+Y+") is rectangle");
    } else {
      System.out.print("Point ("+X+","+Y+") is not rectangle");
    }
    sn.close();
  }
} 