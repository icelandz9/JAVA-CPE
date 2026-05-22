import java.util.Scanner;
public class ex6w5{
  public static void main(String[] args){
    Scanner sn = new Scanner(System.in);
    int ran0=0, ran1=0, ran2=0, ran3=0, ran4=0;
    double[] num = new double[5];
    for(int i=0;i<num.length;i++)
    {
      System.out.print("Read a number : ");
      num[i] = sn.nextDouble();
    }
     ran0 = (int)(Math.random()*5);
     do
     {
       ran1 = (int)(Math.random()*5);
     }while(ran1 == ran0);
     do
     {
       ran2 = (int)(Math.random()*5);
     }while((ran2 == ran1) || (ran2 == ran0));
     do
     {
       ran3 = (int)(Math.random()*5);
     }while((ran3 == ran2) || (ran3 == ran1) || (ran3 == ran0));
     do
     {
       ran4 = (int)(Math.random()*5);
     }while((ran4 == ran3) || (ran4 == ran2) || (ran4 == ran1) || (ran4 == ran0));
    System.out.println(num[ran0]);
    System.out.println(num[ran1]);
    System.out.println(num[ran2]);
    System.out.println(num[ran3]);
    System.out.println(num[ran4]);
    sn.close();
  }
}