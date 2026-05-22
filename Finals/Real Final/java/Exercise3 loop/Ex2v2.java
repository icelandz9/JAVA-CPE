public class Ex2v2
{
  public static void main(String[] args)
  {
    double mile=0.0;
    double kilo=0.0, kilo1=20.0,mile1=0.0;
    System.out.println("Miles\tKilometer\t\t\t\t\t|\tKilometer\tmiles");
   for (int i = 1;i<=10;i++)
   {
     mile=i;
     kilo=mile/0.621;
     mile1 = kilo1*0.621;
     System.out.println(+(int)mile+"\t"+kilo+"\t\t\t|\t"+(int)kilo1+"\t\t"+mile1);
     kilo1 +=5 ;
   }
  }
}