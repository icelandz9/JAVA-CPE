import java.util.Scanner;
public class Exercise6_01 {
  public static void main(String[] agrs) {
    Scanner sn = new Scanner(System.in);
    System.out.print("Enter the number of array size: ");
    int n = sn.nextInt();
    int[] Ar = new int[n];
    for (int i=0;i<Ar.length;i++) {
      int RanDom = (int)(Math.random()*99);
      Ar[i] = RanDom;
    }
    System.out.print("Your array : ");
    for (int i=0;i<Ar.length;i++) {
      System.out.print(Ar[i]+" ");
    }
    System.out.println();
    array(Ar);
    sn.close();
  }
  
  public static void array(int[] Ar) {
    int Sum=0,Scores=0;
    for (int i=0;i<Ar.length;i++) {
      Sum += Ar[i];
    }
    
    if (Sum%10 == 4 || Sum%10 == 9) {
      Scores = 1;
      if (Sum%7 == 0) {
      Scores = 2;
      }
    } else {
      Scores = 0;
    }
    System.out.println("Your array scores: "+Scores);
  }
} 