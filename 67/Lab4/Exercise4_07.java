import java.util.Scanner;
public class Exercise4_07 {
  public static void main(String[] agrs) {
    Scanner sn = new Scanner(System.in);
    System.out.print("Select data type of all numbers 1.int 2.double : ");
    int number = sn.nextInt();
    if (number == 1) {
      System.out.print("Enter five number : ");
      int n1 = sn.nextInt();
      int n2 = sn.nextInt();
      int n3 = sn.nextInt();
      int n4 = sn.nextInt();
      int n5 = sn.nextInt();
      System.out.print("Average value: "+average(n1,n2,n3,n4,n5));
    } else {
      System.out.print("Enter five number : ");
      double n1 = sn.nextDouble();
      double n2 = sn.nextDouble();
      double n3 = sn.nextDouble();
      double n4 = sn.nextDouble();
      double n5 = sn.nextDouble();
      System.out.print("Average value: "+average(n1,n2,n3,n4,n5));
    }
    sn.close();
  }
  
  public static int average(int i1, int i2, int i3, int i4, int i5) {
    int Average= (i1+i2+i3+i4+i5)/5;
    return Average;
  }
  
  public static double average(double i1, double i2, double i3, double i4, double i5) {
    double Average= (i1+i2+i3+i4+i5)/5;
    return Average;
  }
} 