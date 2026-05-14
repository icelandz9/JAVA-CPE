import java.util.Scanner;

public class QuizString02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter choice: ");
        String choice = scanner.nextLine();

        System.out.print("Enter Text: ");
        String str = scanner.nextLine();

        int result = sumOddEvendigits(str,choice);

        System.out.print(" : " + result);

        scanner.close();
    }
    public static int sumOddEvendigits(String str,String choice) {
        int sum = 0;
        String number = "";
        int i;
        int j=0;
        if (choice.equals("Even")) {
            for ( i = 0; i < str.length(); i++) {
                char currentChar = str.charAt(i);
                if (Character.isAlphabetic(currentChar)){
                    j++;
                }
                if (Character.isDigit(currentChar)) {
                    if (currentChar%2 ==0) {
                        number += currentChar;
                    }
                } else {
                    if (!number.equals("")) {
                        sum += Integer.parseInt(number);
                        number = "";
                    }
                }
            }
            int total_digit = i - j;
            System.out.println("Total digits are: " + total_digit);
            System.out.print("The Summation of Even digits is ");
        }
        if (choice.equals("Odd")) {
            for ( i = 0; i < str.length(); i++) {
                char currentChar = str.charAt(i);
                if (Character.isAlphabetic(currentChar)){
                    j++;
                }
                if (Character.isDigit(currentChar)) {
                    if (currentChar%2 == 1 ) {
                        number += currentChar;
                    }
                } else {
                    if (!number.equals("")) {
                        sum += Integer.parseInt(number);
                        number = "";
                    }
                }
            }
            int total_digit = i - j;
            System.out.println("Total digits are: " + total_digit);
            System.out.print("The Summation of Odd digits is ");
        }
        else{
            System.out.println("Error");
        }
        if (!number.equals("")) {
            sum += Integer.parseInt(number);
        }

        return sum;
    }
}