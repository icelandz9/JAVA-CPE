import java.util.Scanner;

public class Exercise6_05 {
  public static void main(String[] agrs) {
    double[] Ar = new double[5];
    double[] Ars = new double[5];
    
    Scanner sn = new Scanner(System.in);
    for (int i=0;i<5;i++) {
      double number = sn.nextDouble();
      Ar[i] = number;
    }
    
    Ars[0] = Ar[4];
    Ars[1] = Ar[2];
    Ars[2] = Ar[1];
    Ars[3] = Ar[0];
    Ars[4] = Ar[3];
    
    for (int i=0;i<Ars.length;i++) {
      System.out.println(Ars[i]);
    }
    sn.close();
  }
} 