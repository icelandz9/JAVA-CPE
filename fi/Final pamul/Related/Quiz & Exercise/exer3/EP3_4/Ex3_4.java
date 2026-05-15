import javax.swing.JOptionPane;
import java.util.Scanner;
public class Ex3_4{
  public static void main(String[]args){
    int n;
    double a,x,result = 0;
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter a,x,n: ");
    a = scan.nextDouble();
    x = scan.nextDouble();
    n = scan.nextInt();
    switch(n){
      case 0 :
        result = a;
        break;
      case 1 :
        result = a * x;
        break;
      case 2 :
        result = a * x * x;
        break;
      case 3 :
        result = a * x * x * x;
        break;
      case 4 :
        result = a * x * x * x * x;
        break;
      case 5 :
        result = a * x * x * x * x * x;
        break;
  }
    JOptionPane.showMessageDialog(null, "ax^n where a = "+a+", x = "+x+", n = "+n+" is "+result);
}
}