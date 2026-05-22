import java.util.Scanner;

public class Number_000_999{
  public static void main(String[] args){
    int num, num1, num2, num3, result;
    
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Input Number 000-999: ");
    num = sc.nextInt();
    
    num1 = num % 10;;
    num2 = (num/10) % 10;
    num3 = (num/100) % 10;
    result = num1 * num2 * num3;
    
    System.out.println("Integer between 000 and 999: " + result);
  }
}