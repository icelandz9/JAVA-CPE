import java.util.Scanner;
import java.util.Arrays;

public class Exercise6_02 {
  public static void main(String[] agrs) {
    Scanner sn = new Scanner(System.in);
    System.out.print("Enter the number of array size: ");
    int n = sn.nextInt();
    int[] Ar = new int[n];
    int[] ArN = new int[4];
    
    for (int i=0;i<Ar.length;i++) {
      int RanDom = (int)(Math.random()*9);
      Ar[i] = RanDom;
    }
    
    for (int i=0;i<4;i++) {
      int N=0;
      System.out.print("Your number "+(i+1)+":");
      int number = sn.nextInt();
      for (int j=0;j<Ar.length;j++) {
        if (number == Ar[j]) {
          N += 1;
        }
      }
      ArN[i] = N;
    }
    Arrays.sort(ArN);
    
    System.out.print("Your array ");
    for (int i=0;i<Ar.length;i++) {
      System.out.print(Ar[i]+" ");
    }
    System.out.println();
    
    System.out.print("MaxFrequency "+ArN[3]);
    sn.close();
  }
} 