package Final_Exam.Exercise_All.Misc;

import java.util.Scanner;

public class QuizException {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter c value:");
            int c = scanner.nextInt();
            System.out.println("Enter m value:");
            int m = scanner.nextInt();
            System.out.println("Enter the total numbers of Y:");
            int n_y = scanner.nextInt();
            System.out.println("The Results of X values =\n");
            int s[] = new int[23];
            for (int i = 20; i <= n_y + 19 && i <= 42; i++) {
                int y = i;
                double x = (y - c) / m;
                System.out.println(x);
            }
            for (int i = 1; i <= n_y; i++) {
                s[i] = i;
            }
            scanner.close();
        } catch (ArrayIndexOutOfBoundsException e1) {
            System.out.println("Program has some problem with :" + e1);
        } catch (ArithmeticException e2) {
            System.out.println("Program has some problem with :" + e2);
        } catch (java.util.InputMismatchException e3) {
            System.out.println("Program has some problem with :" + e3);
        } catch (Exception e4) {
            System.out.println("Program has some problem with :" + e4);
        }

    }
}
