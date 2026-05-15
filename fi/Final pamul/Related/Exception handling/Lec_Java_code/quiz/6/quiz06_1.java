import java.util.Scanner;
public class quiz06_1
{
  public static void main(String[] args)
  {
    double x=0;
    try{
    Scanner input= new Scanner(System.in);
    System.out.println("Programs for computing the equation of straight-line result");
    System.out.print("Enter c value: ");
    int c = input.nextInt();
    System.out.print("Enter m value: ");
    int m = input.nextInt();
    System.out.print("Enter total number of Y: ");
    double index = input.nextDouble();
    double[] y = {20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42};
     for(int i=0;i<index;i++)
     {
      System.out.print(y[i]+c/m);
     }
    }
    catch(ArithmeticException e1){
      System.out.print("Problem has some problem with "+e1);
    }
    catch(ArrayIndexOutOfBoundsException e2){
      System.out.print("Problem has some problem with "+e2);
    }
//    catch(InputMismatchException e3){
//      System.out.print("Problem has some problem with "+e3);
//    }
    catch(Exception e4){
      System.out.print("Problem has some problem with "+e4);
    }
  }
}