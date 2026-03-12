package Quiz.Quiz_Graymatter.Exam5;

import javax.swing.JOptionPane;

public class Exam5 {
    public static void main(String[] args) {
        int sum1 = 0;

        for (int row = 1; row <= 5; row++) {
            for (int col = 1; col <= 5; col++) {
                int RandomNum1 = (int) (Math.random() * 2001) - 1500; // -1500 �֧ 500
                System.out.printf("%10d ", RandomNum1);

                if (RandomNum1 % 2 != 0) {
                    sum1 += RandomNum1;
                }
            }
            System.out.print("\n");
        }

        JOptionPane.showMessageDialog(null, String.format("The sum of all odd numbers in the 5x5 matrix is: %d", sum1));
    }
}
