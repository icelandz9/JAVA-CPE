import java.util.Scanner;
public class Cpe222_2{
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    System.out.println("Enter n, side :");
    int n; 
    double side;
    n = in.nextInt();
    side = in.nextDouble();
    System.out.println("The area is" +area(n, side));
  }
  public static double area(int n, double side){
    return (n*(side*side)/4*Math.tan((Math.PI/n)));
  }
}