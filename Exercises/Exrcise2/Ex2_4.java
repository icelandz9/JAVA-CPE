import java.util.Scanner;

public class Ex2_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // สูตรใช้ Math random (int)(Math.random() * (max - min + 1)) + min;
        int diceRoll = (int) (Math.random() * 6) + 1;
        System.out.print("Random Number 1 - 6 : ");
        int num = sc.nextInt();

        if (num < 1 || num > 6) {
            System.out.println("Enter Guess number between 1-6");
        } else if (num == diceRoll) {
            System.out.print("Your Guess is Correct.");
        } else {
            System.out.print("Your Guess is InCorrect.");
        }
        System.out.println("\ndiceRoll is : " + diceRoll);

        sc.close();
    }
}
