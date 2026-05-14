import java.util.Scanner;
public class q52{
  public static void main(String[] args){
    Scanner sn = new Scanner(System.in);
    
    CircularCone Cc1 = new CircularCone();
    Cc1.printCircularCone();
    CircularCone Cc2 = new CircularCone(2);
    Cc2.printCircularCone();
    CircularCone Cc3 = new CircularCone(3,7);
    Cc3.printCircularCone();
  }
}
