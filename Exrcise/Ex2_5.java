import java.util.Scanner;

public class Ex2_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int com = (int) (Math.random() * 3);

        System.out.print("scissor (0), rock(1), paper(2) : ");
        int player = sc.nextInt();

        if (player < 0 || player > 2) {
            System.out.println("Enter choice number between 0-2");
        } else {

            String[] choices = { "Scissor", "Rock", "Paper" };
            String playerSt = choices[player];
            String comSt = choices[com];
            String result;

            switch (player) {
                case 0:
                    switch (com) {
                        case 0:
                            result = "You win";
                            break;
                        case 1:
                            result = "It is draw";
                            break;
                        case 2:
                            result = "You lost";
                            break;
                        default:
                            result = "Error!";
                            break;

                    }
                    break;
                case 1:
                    switch (com) {
                        case 0:
                            result = "You win";
                            break;
                        case 1:
                            result = "It is draw";
                            break;
                        case 2:
                            result = "You lost";
                            break;
                        default:
                            result = "Error!";
                            break;

                    }
                    break;
                case 2:
                    switch (com) {
                        case 0:
                            result = "You win";
                            break;
                        case 1:
                            result = "It is draw";
                            break;
                        case 2:
                            result = "You lost";
                            break;
                        default:
                            result = "Error!";
                            break;

                    }
                    break;

                default:
                    result = "Invalid choice!";
                    break;
            }
            System.out.println("Computer : " + comSt);
            System.out.println("Player : " + playerSt);
            System.out.println("Result : " + result);
        }
        sc.close();
    }
}
