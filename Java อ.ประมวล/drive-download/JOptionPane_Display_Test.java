import javax.swing.JOptionPane;
import java.util.Scanner;
public class JOptionPane_Display_Test{
  public static void main(String[] args){
    int num1, num2, sum;
    Scanner sn = new Scanner(System.in);
    System.out.print("input number1: ");
    num1 = sn.nextInt();
    System.out.print("input number2: ");
    num2 = sn.nextInt();
    sum = num1 + num2;
    JOptionPane.showMessageDialog(null,"My Number is "+ sum);
    
   sn.close();
  }
}