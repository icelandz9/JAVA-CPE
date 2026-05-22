import java.util.Scanner;
public class test1 
{
  public static void main (String[] args){
  Scanner sn = new Scanner(System.in);
  System.out.print("Please enter a decimal value(0000-9999)");
  String t = sn.nextLine();
  int a = Integer.parseInt(t);
  int c15 = a/2;  //291/2
  int b15 = a % 2 ; //1
  int c14 = c15/2; //145/2
  int b14 = c15 % 2 ; //1
  int c13 = c14/2; //
  int b13 = c14 % 2 ;
  int c12 = c13/2;
  int b12 = c13 % 2 ;
  int c11 = c12/2;
  int b11 = c12 % 2 ;
  int c10 = c11/2;
  int b10 = c11 % 2 ;
  int c9 = c10/2;
  int b9 = c10 % 2 ;
  int c8 = c9/2;
  int b8 = c9 % 2 ;
  int c7 = c8/2;
  int b7 = c8 % 2 ;
  int c6 = c7/2;
  int b6 = c7 % 2 ;
  int c5 = c6/2;
  int b5 = c6 % 2 ;
  int c4 = c5/2;
  int b4 = c5 % 2 ;
  int c3 = c4/2;
  int b3 = c4 % 2 ;
  int c2 = c3/2;
  int b2 = c3 % 2 ;
  int c1 = c2/2;
  int b1 = c2 % 2 ;
  int c0 = c1/2;
  int b0 = c1 % 2 ;
  System.out.print("Binary value in each digit = " +b15+b14+b13+b12+b11+b10+b9+b8+b7+b6+b5+b4+b3+b2+b1+b0);
  }
}