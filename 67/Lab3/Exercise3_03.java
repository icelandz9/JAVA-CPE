import java.util.Scanner;
public class Exercise3_03 {
  public static void main(String[] agrs) {
    Scanner sn = new Scanner(System.in);
    int k=9,p=1,Sum=1;
    for (int i=1;i<10;i++) {
      System.out.println();
      for (int j=1;j<k;j++) {
        System.out.print("\t");
      }
      k -= 1;
      for (int h=1;h<=p;h++){
        System.out.print("\t "+Sum);
        Sum += 1;
      }
      p += 2;
    }
    sn.close();
  }
} 