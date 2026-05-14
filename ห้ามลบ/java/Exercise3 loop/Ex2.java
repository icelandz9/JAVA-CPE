public class Ex2
{
  public static void main(String[] args)
  {
    int mile=0;
    double kilo=0.0;
    System.out.println("Miles\tKilometer");
   for (int i = 1;i<=10;i++)
   {
     mile=i;
     kilo=mile/0.621;
     System.out.println(mile+"\t"+kilo);
   }
   System.out.println("Kilometer\tMiles");
   for(int i = 20;i<=65;i+=5)
   {
     kilo=i;
     double m = 0.0;
       m = ((int)(kilo)*0.621);
     System.out.println((int)kilo+"\t"+m);
   }
  }
}