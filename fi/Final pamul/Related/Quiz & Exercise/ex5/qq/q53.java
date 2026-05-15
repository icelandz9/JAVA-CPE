import java.util.Scanner;
public class q53{
  public static void main(String[] args){
    Scanner sn = new Scanner(System.in);
    
    CircleRing cr1 = new CircleRing();
    cr1.printCircleRing();
    
    CircleRing cr2 = new CircleRing(7.0,15.0);
    cr2.printCircleRing();

  }
}