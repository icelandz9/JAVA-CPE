import java.util.Scanner;

public class Ex2_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int diceRoll = (int) (Math.random() * 6) + 1;
        System.out.print("Guess  the roll [1-6] : ");
        int num = sc.nextInt();

        System.out.println("diceRoll: " + diceRoll);

        if (num == diceRoll) {
            System.out.println("Your Guess is incorrect.");
        }else{
            System.out.println("Your Guess is uncorrect.");
        }

        sc.close();
    }
}
