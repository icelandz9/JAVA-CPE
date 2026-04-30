import java.util.Scanner;

public class Exercise6_03 {
  public static void main(String[] agrs) {
    Scanner sn = new Scanner(System.in);
    double[] Ar = new double[10];

    System.out.print("Enter ten numbers: ");
    for (int i=0;i<10;i++) {
      double number = sn.nextInt();
      Ar[i] = number;
    }
    int index = indexOfSmallestElement(Ar);
    System.out.print("The index of the min is "+index);
    sn.close();
  }
  
  public static int indexOfSmallestElement(double[] array) {
    double N=10;
    int idx=0;
    for (int i=0;i<array.length;i++) {
      if (array[i]<N)
        N = array[i];
    }
    
    for (int i=0;i<array.length;i++) {
      if (array[i] == N)
        idx = i;
    }
    return idx;
  }
} 