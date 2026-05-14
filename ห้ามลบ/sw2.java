import java.util.*;
public class sw2{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("name");
    int num = input.nextInt();
    
    switch (num){
      case 33 :System.out.println("33 is divisble by both 3 and 11"); break;
      case 18 :System.out.println("18 is divisible by both 3 or 11,but not both"); break;
      case 5  :System.out.println("5 is not divisble by either 3 or 11"); break;
      default :System.out.println("not divisble by either 3 or 11"); break;
    }
  }
}  