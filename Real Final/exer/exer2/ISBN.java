import java.util.Scanner;
public class ISBN {
  public static void main(String[] args) {
    int d1, d2, d3, d4, d5, d6, d7, d8, d9, d10, y;
    Scanner sn = new Scanner(System.in);
    System.out.println("Enter the first 9 digits of an ISBN as integer: ");
    d1 = sn.nextInt();
    d2 = sn.nextInt();
    d3 = sn.nextInt();
    d4 = sn.nextInt();
    d5 = sn.nextInt();
    d6 = sn.nextInt();
    d7 = sn.nextInt();
    d8 = sn.nextInt();
    d9 = sn.nextInt();
    y = (d1*1)+(d2*2)+(d3*3)+(d4*4)+(d5*5)+(d6*6)+(d7*7)+(d8*8)+(d9*9);
    d10 = y%11;
    if(d10!=10){
    System.out.println("The ISBN-10 number is" +d1+d2+d3+d4+d5+d6+d7+d8+d9+d10);}
    else if(d10==10){
      System.out.println("Enter the first 9 digits of an ISBN as integer :"+d1+d2+d3+d4+d5+d6+d7+d8+d9);
      System.out.println("The ISBN-10 number is "+d1+d2+d3+d4+d5+d6+d7+d8+d9+"X");}
  }
}
  