package Quiz.Quiz_Graymatter.Exam8;

import java.util.Scanner;

public class ExamQ8_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Program for computing the equation of a straight-line results.");

            System.out.print("Enter m value: ");
            double m = scanner.nextDouble();

            if (m == 0) {
                throw new ArithmeticException("Slope (m) cannot be zero.");
            }

            System.out.print("Enter c value: ");
            double c = scanner.nextDouble();

            System.out.print("Enter the total numbers of Y (max 23): ");
            int Y = scanner.nextInt();

            if (Y <= 0 || Y > 23) {
                throw new ArrayIndexOutOfBoundsException("Total numbers of Y must be between 1 and 23.");
            }

            double[] xValues = new double[Y];

            for (int i = 0; i < Y; i++) {
                xValues[i] = Math.round(((i + 1 - c) / m) * 100.0) / 100.0;
            }

            System.out.println("The Results of X values:");
            for (double x : xValues) {
                System.out.print(x + " ");
            }
            System.out.println();

        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e);
        } finally {
            scanner.close();
        }
    }
}
