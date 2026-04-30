import java.util.Scanner;
public class Exercise4_03 {
  public static void main(String[] agrs) {
    Scanner sn = new Scanner(System.in);
    double Sum = 0 ;
    System.out.println("i\tm(i)");
    for (int i=1;i<1000;i+=100) {
      double M = m(i);
      Sum += M;
      System.out.println(i+"\t"+Sum);
    }
    sn.close();
  }
  
  public static double m(int i) {
    double M=0;
    M = ((4*(Math.pow(-1,i+1)))/((2*i)-1));
    return M;
  }
} 