import java.util.Scanner;
import java.util.Arrays;
public class ex6w2{
  public static void main(String[] args){
    Scanner sn = new Scanner(System.in);
    int ran=0, max=0, i, size;
    int n1, n2, n3, n4;
    int[] nmax = new int[4];
    System.out.print("Enter the number of array size : ");
    size = sn.nextInt();
    System.out.print("Your number 1 : ");
    n1 = sn.nextInt();
    System.out.print("Your number 2 : ");
    n2 = sn.nextInt();
    System.out.print("Your number 3 : ");
    n3 = sn.nextInt();
    System.out.print("Your number 4 : ");
    n4 = sn.nextInt();
    int[] num = new int[size];
    for(i=0;i<size;i++)
    {
      ran = (int)(Math.random()*10);
      num[i] = ran;
      if(num[i] == n1)
      {
        nmax[0]++;
      }
      if(num[i] == n2)
      {
        nmax[1]++;
      }
      if(num[i] == n3)
      {
        nmax[2]++;
      }
      if(num[i] == n4)
      {
        nmax[3]++;
      }
    }
    Arrays.sort(nmax);
    max = nmax[nmax.length-1];
    System.out.print("Your array : { ");
    for(i=0;i<size;i++)
    {
      System.out.print(num[i]+" ");
    }
    System.out.println("}");
    System.out.println("MaxFrequency : "+max);
    sn.close();
  }
}