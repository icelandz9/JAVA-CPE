package Quiz.Quiz_Graymatter.Exam7;

import java.util.Scanner;

public class Exam7_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your choice: ");
        String choiceU = scanner.nextLine();
        String choice = choiceU.toUpperCase();

        System.out.print("Enter your message: ");
        String str = scanner.nextLine();

        sumEvenDigits(str, choice);

        scanner.close();
    }

    public static int sumEvenDigits(String str, String choice) {
        int totalDigits = 0;
        int sumEven = 0;
        int sumOdd = 0;

        if (choice.equals("EVEN")) {
            for (char ch : str.toCharArray()) {
                if (Character.isDigit(ch)) {
                    totalDigits++;
                    int num = Character.getNumericValue(ch);
                    if (num % 2 == 0) {
                        sumEven += num;
                    }
                }
            }
        }

        else if (choice.equals("ODD")) {
            for (char ch : str.toCharArray()) {
                if (Character.isDigit(ch)) {
                    totalDigits++;
                    int num = Character.getNumericValue(ch);
                    if (num % 2 != 0) {
                        sumOdd += num;
                    }
                }
            }
        }

        else {
            System.out.println("Wrong Choice");
            System.exit(0);
        }

        System.out.println("Total digits are: " + totalDigits);
        if (choice.equals("EVEN")) {
            System.out.println("The summation of even digits in this message is: " + sumEven);
        } else if (choice.equals("ODD")) {
            System.out.println("The summation of odd digits in this message is: " + sumOdd);
        }

        return (choice.equals("EVEN")) ? sumEven : sumOdd;
    }
}
