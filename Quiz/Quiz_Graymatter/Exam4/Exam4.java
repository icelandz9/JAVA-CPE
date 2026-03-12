package Quiz.Quiz_Graymatter.Exam4;

import java.util.Scanner;

public class Exam4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter House price (e.g. 4500000): ");
        double housePrice = scanner.nextDouble();

        System.out.print("Enter number of years: ");
        int years = scanner.nextInt();

        double interestRate;

        switch (years) {
            case 10:
                interestRate = 3.5;
                break;
            case 15:
                interestRate = 3.9;
                break;
            case 20:
                interestRate = 4.1;
                break;
            case 25:
                interestRate = 4.3;
                break;
            case 30:
                interestRate = 4.5;
                break;
            default:
                System.out.println("Invalid number of years! Please enter 10, 15, 20, 25, or 30.");
                scanner.close();
                return;
        }

        double totalInterest = housePrice * (interestRate / 100) * years;

        System.out.println("Total interest over " + years + " years = " + totalInterest + " Baht");

        scanner.close();
    }
}
