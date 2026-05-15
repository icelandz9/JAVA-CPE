import java.util.Scanner;
public class Changeto2bit {
     public static void main(String[] args) { 
          Scanner scanner = new Scanner(System.in);
          System.out.print("Please enter decimal value (0000-9999) : ");
          int decimal = scanner.nextInt();
          
          int i4 = decimal%10;
          decimal = decimal/10;
          int i3 = decimal%10;
          decimal = decimal/10;
          int i2 = decimal%10;
          decimal = decimal/10;
          int i1 = decimal;
          
          int b15,b14,b13,b12,b11,b10,b9,b8,b7,b6,b5,b4,b3,b2,b1,b0;
          b15 = i4%2;
          i4 = i4/2;
          b14 = i4%2;
          i4 = i4/2;
          b13 = i4%2;
          i4 = i4/2;
          b12 = i4%2;
          
          b11 = i3%2;
          i3 = i3/2;
          b10 = i3%2;
          i3 = i3/2;
          b9 = i3%2;
          i3 = i3/2;
          b8 = i3%2;
          
          b7 = i2%2;
          i2 = i2/2;
          b6 = i2%2;
          i2 = i2/2;
          b5 = i2%2;
          i2 = i2/2;
          b4 = i2%2;
          
          b3 = i1%2;
          i1 = i1/2;
          b2 = i1%2;
          i1 = i1/2;
          b1 = i1%2;
          i1 = i1/2;
          b0 = i1%2;
          System.out.printf("Binary in each digid is %d%d%d%d %d%d%d%d %d%d%d%d %d%d%d%d \n",b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15);
     }
}     