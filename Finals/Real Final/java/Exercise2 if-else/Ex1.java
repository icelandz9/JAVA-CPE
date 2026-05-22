import java.util.Scanner;
  public class Ex1
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a,b,c,d,e,f : ");
      double a = input.nextDouble();
     double b = input.nextDouble();
     double c = input.nextDouble();
     double d = input.nextDouble();
     double e = input.nextDouble();
     double f = input.nextDouble();
     double j =((a*d)-(b*c));
     double x = ((e*d)-(b*f))/j;
     double y = ((a*f)-(e*c))/j;
     if(j == 0 )
     {
       System.out.println("No answer");
       
     }
     else
     {
     System.out.println("X is : "+x+" Y is :"+y);
     }
  }
}