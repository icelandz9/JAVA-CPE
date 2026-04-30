import java.util.Scanner;
public class Exercise4_01 {
  public static void main(String[] agrs) {
    Scanner sn = new Scanner(System.in);
    System.out.print("Enter 3 number ");
    int a = sn.nextInt();
    int b = sn.nextInt();
    int c = sn.nextInt();
    Check(a,b,c);
    sn.close();
  }
  
  public static void Check(int a, int b, int c) {
    if ((a>b && a>c) && (c<a && c<b)) {
      System.out.print("False");
    } else if (a>b && a>c) {
      System.out.print("True");
    } else if (c<a && c<b) {
      System.out.print("True");
    } else {
      System.out.print("False");
    }
  }
} 