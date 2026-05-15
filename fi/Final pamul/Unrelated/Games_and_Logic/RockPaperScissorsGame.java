import java.util.Scanner;

public class RockPaperScissorsGame {

    public static void main(String[] args) {
        // สร้าง Scanner object เพื่อรับข้อมูลจากผู้เล่น
        Scanner scanner = new Scanner(System.in);

        // สุ่มตัวเลขระหว่าง 0-2 แทน scissor (0), rock (1), และ paper (2)
        int computerChoice = (int) (Math.random() * 3);

        // แสดงข้อความให้ผู้เล่นทราบถึงกติกาเกม
        System.out.println("Welcome to Rock, Paper, Scissors Game!");
        System.out.println("Enter 0 for Scissor, 1 for Rock, or 2 for Paper:");

        // รับค่าจากผู้เล่น
        int playerChoice = scanner.nextInt();

        // ตรวจสอบผลลัพธ์และแสดงผล
        switch (checkWinner(playerChoice, computerChoice)) {
            case 0:
                System.out.println("It's a tie!");
                break;
            case 1:
                System.out.println("You win! Congratulations!");
                break;
            case -1:
                System.out.println("You lose! Better luck next time.");
                break;
            default:
                System.out.println("Invalid input. Please enter 0, 1, or 2.");
        }

        // ปิด Scanner
        scanner.close();
    }

    // เป็นเมธอดที่ใช้ในการตรวจสอบผู้ชนะ
    private static int checkWinner(int player, int computer) {
        // 0 = การเสมอ, 1 = ชนะ, -1 = แพ้
        if (player == computer) {
            return 0; // เสมอ
        } else if ((player == 0 && computer == 2) || (player == 1 && computer == 0) || (player == 2 && computer == 1)) {
            return 1; // ชนะ
        } else {
            return -1; // แพ้
        }
   }
}
