import java.util.Scanner;
public class quiz8_1 {
  public static void main(String[] args) {
    try {
      System.out.println("Program for computing the equation of a straight-line results.");
      Scanner sn = new Scanner(System.in);
      System.out.print("Enter c value : ");
      int c = sn.nextInt();
      System.out.print("Enter m value : ");
      int m = sn.nextInt();
      System.out.print("Enter the total number of Y : ");
      int y = sn.nextInt();
      sn.close();
    }
    catch(OutOfRangeException e1) {
      System.out.println("Program has some problem with : "+e1);
    }
  }
}