import java.util.Scanner;
public class Exercise2_04 {
  public static void main(String[] agrs) {
    Scanner sn = new Scanner(System.in);
    //?????? Random (int)((Math.random()*(2000-999+1))+999); 999-2000
    int RanDom = (int)((Math.random()*(6))+1);
    
    System.out.print("Guess the roll [1-6] : ");
    int Number = sn.nextInt();
    
    if (RanDom == Number) {
      System.out.print("True");
    } else {
      System.out.print("False");
    }
    sn.close();
  }
} 