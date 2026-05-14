import java.util.Scanner;
public class q51{
  public static void main(String[] args){
    Scanner sn = new Scanner(System.in);
    
    Triangle T1 = new Triangle();
    T1.printTriangle();
    Triangle T2 = new Triangle(3);
    T2.printTriangle();
    Triangle T3 = new Triangle(3,4);
    T3.printTriangle();
    Triangle T4 = new Triangle(5,4,4);
    T4.printTriangle();
  }
}


