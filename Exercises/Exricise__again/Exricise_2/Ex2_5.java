import java.util.Scanner;

public class Ex2_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int diceRoll = (int) (Math.random() * 3);
        System.out.print("scissor (0), rock (1) , paper (2) : ");
        int player = sc.nextInt();

        if (player < 0 || player > 2) {
            System.out.println("Enter choice number between 0-2");
        }

        String[] choice = { "Scissor", "Rock", "Paper" };
        String play = choice[player];
        String com = choice[diceRoll];

        String result = "";

        switch (player) {
            case 0:
                switch (diceRoll) {
                    case 0:
                        result = "It is a draw!";
                        break;
                    case 1:
                        result = "You lose!";
                        break;
                    case 2:
                        result = "You win!";
                        break;
                    default:
                        result = "Error!";
                        break;
                }
                break;

            case 1:
                switch (diceRoll) {
                    case 0:
                        result = "You win!";
                        break;
                    case 1:
                        result = "It is a draw!";
                        break;
                    case 2:
                        result = "You lose!";
                        break;
                    default:
                        result = "Error!";
                        break;
                }
                break;

            case 2:
                switch (diceRoll) {
                    case 0:
                        result = "You lose!";
                        break;
                    case 1:
                        result = "You win!";
                        break;
                    case 2:
                        result = "It is a draw!";
                        break;
                    default:
                        result = "Error!";
                        break;
                }
            default:
                break;
        }
        System.out.println("The computer is " +com+ ". You are " +play+"." +result);
        sc.close();
    }
}
