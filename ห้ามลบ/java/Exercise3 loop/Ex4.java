import java.util.Scanner;
import javax.swing.JOptionPane;
public class Ex4
{
  public static void main(String[] args)
  {
    Scanner sn = new Scanner(System.in);
    System.out.print("Enter a,x,n : ");
    double a = sn.nextDouble();
    double x = sn.nextDouble();
    int n = sn.nextInt();
    double sum = 0;
    switch(n)
    {
      case 0:
        sum = a;
      JOptionPane.showMessageDialog(null, "ax^n where a = " +a+",x = "+x+",n = "+n+" is "+sum);
      break;
      case 1:
        sum = a*x;
      JOptionPane.showMessageDialog(null, "ax^n where a = " +a+",x = "+x+",n = "+n+" is "+sum);
      break;
      case 2:
        sum = a*x*x;
      JOptionPane.showMessageDialog(null, "ax^n where a = " +a+",x = "+x+",n = "+n+" is "+sum);
      break;
      case 3:
        sum = a*x*x*x;
      JOptionPane.showMessageDialog(null, "ax^n where a = " +a+",x = "+x+",n = "+n+" is "+sum);
      break;
      case 4:
        sum = a*x*x*x*x;
      JOptionPane.showMessageDialog(null, "ax^n where a = " +a+",x = "+x+",n = "+n+" is "+sum);
      break;
      case 5:
        sum = a*x*x*x*x*x;
      JOptionPane.showMessageDialog(null, "ax^n where a = " +a+",x = "+x+",n = "+n+" is "+sum);
      break;
      default:
      JOptionPane.showMessageDialog(null, "Error","Error", JOptionPane.ERROR_MESSAGE);
      break;
    }
    sn.close();
  }
}