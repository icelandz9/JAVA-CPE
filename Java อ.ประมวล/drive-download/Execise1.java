//import javax.swing.JOptionPane;
import java.util.Scanner;
public class Execise1{
  public static void main(String[] args){
    double num_ln, num_cm, sum;
    // 1 cm == 2.54
    Scanner sc = new Scanner(System.in);
      
    System.out.print("Input Num_ln: ");
    num_ln = sc.nextDouble();
    sum = num_ln * (1 / 0.3937);
    
//    String s1 = String.valueOf(sum);

    System.out.println("Num_in = " + num_ln +  " = " + "cm = " + sum);

  }
}