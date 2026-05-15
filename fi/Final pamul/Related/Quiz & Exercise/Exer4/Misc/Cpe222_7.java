import java.util.Scanner;
public class Cpe222_7{
  public static void main(String[] args){
   Scanner sn = new Scanner(System.in);
    double i1, i2, i3, i4, i5, avdou, avint;
    int input;
    System.out.print("Select data type of all numbers 1.int 2.double");
     input = sn.nextInt();
    if(input==1)
    {
      System.out.print("Enter five numbers : ");
      i1 = sn.nextInt();
      i2 = sn.nextInt();
      i3 = sn.nextInt();
      i4 = sn.nextInt();
      i5 = sn.nextInt();
      avint = average(i1, i2, i3, i4, i5);
      System.out.println("Average value : "+(int)avint);
    }
    else if(input==2)
    {
      System.out.print("Enter five numbers : ");
      i1 = sn.nextDouble();
      i2 = sn.nextDouble();
      i3 = sn.nextDouble();
      i4 = sn.nextDouble();
      i5 = sn.nextDouble();
      avdou = average(i1, i2, i3, i4, i5);
      System.out.println("Average value : "+avdou);
    }
    sn.close();
  }
  
  public static int average(int i1, int i2, int i3, int i4, int i5){
    int sumint;
    sumint = (i1+i2+i3+i4+i5)/5;
    return sumint;
  }
  
  public static double average(double i1, double i2, double i3, double i4, double i5){
    double sumdou;
    sumdou = (i1+i2+i3+i4+i5)/5;
    return sumdou;
  }
}
