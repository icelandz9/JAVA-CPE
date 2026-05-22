import java.util.Scanner;
public class quiz4_2
{
  public static void main(String[] args)
  {
    double cel=25;
    double kel=273;
    double ro=80;
    double fe=108;
    calTemp(kel);
    calTemp(kel,fe);
    calTemp(kel,ro,fe);
  }
  
 public static void calTemp(double k)
  {
   double f = (k*1.8)-459.67;
   double c = (f-32.0)*(5.0/9.0);
   double r = c*0.8;
   System.out.println(f+" Fahrenheilt "+c+" Celsius ,"+r+" Romer");
  }
 public static void calTemp(double k,double f)
  {
   double c = k-273.15;
   double c1 = (f-32.0)*(5.0/9.0);
   double r = (k-273.15)*0.8;
   double r1 = (f-32.0)*(5.0/9.0)*0.8;
   System.out.println(c+" Celsius ,"+r+" Romer"+c1+" Celsius ,"+r1+" Romer");
  }
 public static void calTemp(double k,double r,double f)
  {
   double c = (f-32.0)*(5.0/9.0);
   double c1 = r/0.8;
   double c2 = ((f-32)/3.4286)+7.5;
   System.out.println(c+" Celsius"+c1+" Celsius"+c2+" Celsius");
  }
}