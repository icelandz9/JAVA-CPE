import java.util.Scanner;
public class quiz3_2
{
  public static void main(String[] args)
  {
     double k=350.0;
    double f=0.0, k1=20.0,f1=-24.0;
    System.out.println("Kelvin\tFahrenheit\t\t|\tFahrenheit\tKelvin");
   for (int i = 1;i<=20;i++)
   {
     f = (k*1.8)-459.67;
     k1 = (f1+459.67)/1.8;
     System.out.println(+k+"\t"+f+"\t|\t"+f1+"\t\t"+k1);
     k+=5;
     f1+=4;
   }
  }
}