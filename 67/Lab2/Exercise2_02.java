import java.util.Scanner;
public class Exercise2_02 {
  public static void main(String[] agrs) {
    Scanner sn = new Scanner(System.in);
    System.out.print("Enter the first digits of an integer  : ");
    int integer = sn.nextInt();
    
    int d1 = integer /100000000;
    int d2 = (integer /10000000) % 10;
    int d3 = (integer /1000000) % 10;
    int d4 = (integer /100000) % 10;
    int d5 = (integer /10000) % 10;
    int d6 = (integer /1000) % 10;
    int d7 = (integer /100) % 10;
    int d8 = (integer /10) % 10;
    int d9 = (integer /1) % 10;
    int Sum = ((d1*1)+(d2*2)+(d3*3)+(d4*4)+(d5*5)+(d6*6)+(d7*7)+(d8*8)+(d9*9))%11;
    if (Sum != 10) {
      System.out.printf("The ISBN-10 number is %d%d%d%d%d%d%d%d%d%d",d1,d2,d3,d4,d5,d6,d7,d8,d9,Sum);
    } else {
      System.out.printf("The ISBN-10 number is %d%d%d%d%d%d%d%d%dx",d1,d2,d3,d4,d5,d6,d7,d8,d9);
    }
    sn.close();
  }
} 