import java.util.*;
import javax.swing.JOptionPane;
class us{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a,x,n :");
    double a = input.nextDouble();
    double x = input.nextDouble();
    int n = input.nextInt();
    double sum =1;
    switch(n){
      case 0 :
        sum *= a*1;
        break;
      case 1 :
        sum *= a*x;
        break;
      case 2 :
        sum *= a*x*x;
        break;
      case 3 :
        sum *= a*x*x*x;
        break;
      case 4 :
        sum *= a*x*x*x*x;
        break;
      case 5 :
        sum *= a*x*x*x*x*x;
        break;
    }
   
    JOptionPane.showMessageDialog(null,"ax^n a ="+a+",x = "+x+",n = "+n+",is"+sum);
  }
}