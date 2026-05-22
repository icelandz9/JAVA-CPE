import javax.swing.JOptionPane;
import java.util.Scanner;
public class polynomial{
  public static void main(String[] args){
    Scanner sn = new Scanner(System.in);
    double a,x,y=0,sum; 
    int n;
    System.out.println("Enter a,x,n:");
    a = sn.nextDouble();
    x = sn.nextDouble();
    n = sn.nextInt();
    switch(n){
      case 0 : y = 1;
      break;
      case 1 : y = x*1;
      break;
      case 2 : y = x*x;
      break;
      case 3 : y = x*x*x;
      break;
      case 4 : y = x*x*x*x;
      break;
      case 5 : y = x*x*x*x*x;
      break;
    }
    sum = a*y;
    JOptionPane.showMessageDialog(null, "ax^n where a = "+a+", x = "+x+", n = "+n+" is "+sum);
  }
}