package Quiz.Quiz_monkey.Quiz3;

import javax.swing.JOptionPane;

public class Q03_442_02 {
  public static void main(String[] args) {
    int i, ran = 0, sum = 0;
    for (i = 1; i <= 25; i++) {
      ran = (int) ((Math.random() * 2499) - 999);
      if (ran >= 0) {
        System.out.print(" ");
      }
      if (ran > -10 && ran < 10) {
        System.out.print(" ");
      }
      if (ran > -100 && ran < 100) {
        System.out.print(" ");
      }
      System.out.print("  " + ran);
      if (i % 5 == 0)
        System.out.print("\n");
      if (ran < 0)
        sum = sum + ran;
    }
    JOptionPane.showMessageDialog(null, "The sum of all positive numbers in the 5x5 matrix is " + sum, "Result",
        JOptionPane.INFORMATION_MESSAGE);
  }
}