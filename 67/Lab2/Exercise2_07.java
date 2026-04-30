import java.util.Scanner;
public class Exercise2_07 {
  public static void main(String[] agrs) {
    Scanner sn = new Scanner(System.in);
    System.out.print("Enter a point with two coordinates :");
    double X = sn.nextDouble();
    double Y = sn.nextDouble();
    double Distance = Math.sqrt((((X-0)*(X-0)))+((Y-0)*(Y-0)));
    if (Distance <= 10) {
      System.out.print("Point ("+X+","+Y+") is circle");
    } else {
      System.out.print("Point ("+X+","+Y+") is not circle");
    }
    sn.close();
  }
} 