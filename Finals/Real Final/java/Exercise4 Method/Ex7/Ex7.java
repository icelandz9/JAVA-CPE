import java.util.Scanner;
public class Ex7
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    System.out.print("Select data type of all number int = 1 double = 2 : ");
    int data = input.nextInt();
    switch(data)
    {
      case 1:
        System.out.print("Enter five number : ");
        int x1=input.nextInt();
        int x2=input.nextInt();
        int x3=input.nextInt();
        int x4=input.nextInt();
        int x5=input.nextInt();
        int av=calAverage.average(x1,x2,x3,x4,x5);
        System.out.println("Average value is : "+av);
        break;
      case 2:
        System.out.print("Enter five number : ");
        double x11=input.nextDouble();
        double x21=input.nextDouble();
        double x31=input.nextDouble();
        double x41=input.nextDouble();
        double x51=input.nextDouble();
        double av1=calAverage.average(x11,x21,x31,x41,x51);
        System.out.println("Average value is : "+av1);
         break;
      default:
        System.out.print("Error");
        break;
    }
    input.close();
    }
  }