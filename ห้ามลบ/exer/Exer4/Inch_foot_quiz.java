public class Inch_foot_quiz{
  public static void main(String[] args) { 
  double foot,meter;
  double f=0,m=0;
  int i;
  System.out.println("Feet\t\tMeters\t|\tMeters\t\tFeet");
  System.out.println("----------------------------------------------------------------------");
  foot = 1.0;
  meter = 20.0;
  for(i=1;i<=10;i++)
  {
    f = footToMeter(foot);
    m = meterTofoot(meter);
    System.out.printf("%.1f\t\t%.3f\t|\t%.1f\t\t%.3f\n",foot,f,meter,m);
    foot = foot+1;
    meter = meter+5;
  }
  }
 public static double footToMeter(double foot)
 {
   return 0.305*foot; 
 }
 
  public static double meterTofoot(double meter)
 { 
   return 3.279*meter ;
 }
}
 
  

