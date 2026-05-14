import java.util.Scanner;
public class Cpe222_1{
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    System.out.println("Enter 3 numbers :");
    int a, b, c;
    a = in.nextInt();
    b = in.nextInt();
    c = in.nextInt();
    System.out.println(numbers(a,b,c));
  }
  public static boolean numbers(int a, int b, int c){
    int aa; int cc;
    aa = Math.max(Math.max(a,b),c);
    cc = Math.min(Math.min(a,b),c);   
    if ((aa==a)&&(cc==c))
        return false;
    else if ((aa==a)||(cc==c))
        return true;
    else 
        return false;
  }
}