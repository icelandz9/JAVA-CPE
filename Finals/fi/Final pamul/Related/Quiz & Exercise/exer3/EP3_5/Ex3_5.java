import java.util.Scanner;
import javax.swing.JOptionPane;
public class Ex3_5{
  public static void main(String[]args){
    int number;
    double mean,sum2 = 0,sum1 = 0,std;
    String choose = JOptionPane.showInputDialog(null, "Enter the number of total students: ");
    int total = Integer.parseInt(choose);
    for(int i=1;i<=total;i++){
      String score = JOptionPane.showInputDialog(null, "Enter score of students No "+i);
      double total2 = Double.parseDouble(score);
      sum1 += total2;
      sum2 += total2*total2;
    }
    mean = sum1/total;
    std = Math.sqrt((total * sum2 - sum1 * sum1)/(total * total));
    JOptionPane.showMessageDialog(null, "Mean value of student score : " + mean);
    JOptionPane.showMessageDialog(null, "S.D. value of student score : " + std);
  }
}