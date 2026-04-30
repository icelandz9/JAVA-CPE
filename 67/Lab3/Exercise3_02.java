import java.util.Scanner;
public class Exercise3_02 {
  public static void main(String[] agrs) {
    Scanner sn = new Scanner(System.in);
    System.out.println("Milse\t Kilometers  |  Kilometers\t Milse");
    for (int i=1;i<=10;i++) {
      System.out.printf("%d\t %.3f \t|  %d    \t %.3f",i,i*1.621,((4+i)-1)*5,(((4+i)-1)*5)*0.621);
      System.out.println();
    }
    sn.close();
  }
} 