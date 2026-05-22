package Quiz.Quiz_Graymatter.Exam3;

import java.util.Scanner;

public class Exam3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your guess number [1-3]: ");
        int userGuess = scanner.nextInt();
        int randomNumber = (int) (Math.random() * 46) + 15;

        // �� Ternary Operator �ӹǳ��ṹ
        int score = (randomNumber % 7 == 0) ? 3 : ((randomNumber % 10 == 9 || randomNumber % 10 == 4) ? 2 : 1);

        System.out.println("Random number: " + randomNumber);
        System.out.println("Score of Random number is: " + score);

        String result = (userGuess == score) ? "Congratulations! You correct" : "Sorry, you wrong";
        System.out.println(result);

        scanner.close();
    }
}
