import java.util.Scanner;
public class Ex5
{ 
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter degree in fahrenheilt : ");
    double f = input.nextDouble();
    //end input
    double c = (5.0/9.0)*(f-32.0);
    System.out.println(f +" Fahrenheilt is " + c +" Celsius");
  }
}  