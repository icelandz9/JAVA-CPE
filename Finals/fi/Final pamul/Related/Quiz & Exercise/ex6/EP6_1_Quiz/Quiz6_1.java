import java.util.Scanner;
public class Quiz6_1{
  public static void main(String[] args){
    int a =0;
    Scanner sn = new Scanner(System.in);
    System.out.print("Enter a binary number string : ");
    String binaryString = sn.nextLine();
    int sum = binaryToDecimal(binaryString);
    
    System.out.println("The decimal value is : "+sum);
  }
  
  public static int binaryToDecimal(String binaryString){
   int decimal,  a=0;
   int a7,a7_1,a6,a6_1,a5,a5_1,a4,a4_1,a3,a3_1,a2,a2_1,a1,a1_1,a0,a0_1;
   a = Integer.parseInt(binaryString);
   a7 = a/10000000 ;        a7_1 = a%10000000 ;
   a6 = a7_1/1000000 ;      a6_1 = a7_1%1000000 ;
   a5 = a6_1/100000 ;       a5_1 = a6_1%100000 ;
   a4 = a5_1/10000 ;        a4_1 = a5_1%10000 ;
   a3 = a4_1/1000 ;         a3_1 = a4_1%1000 ;
   a2 = a3_1/100 ;          a2_1 = a3_1%100 ;
   a1 = a2_1/10 ;           a1_1 = a2_1%10 ;
   a0 = a1_1/1 ;            a0_1= a1_1%1 ;
   decimal = (((a7)*128)+((a6)*64)+((a5)*32)+((a4)*16)+((a3)*8)+((a2)*4)+((a1)*2)+((a0)*1));
    
    return decimal;
  }}