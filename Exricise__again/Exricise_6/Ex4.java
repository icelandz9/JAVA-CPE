import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your message : ");
        String msg = sc.nextLine();

        int result = sumNumbers(msg);
        System.out.println("The summation of number is: " + result);
    }

    public static int sumNumbers(String str) {
        int sum = 0;
        String num = "";

        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)) { // check = int
                num += c;
            } else {
                if (!num.isEmpty()) {
                    sum += Integer.parseInt(num);
                    num = "";
                }
            }
        }
        if (!num.isEmpty()) {
            sum += Integer.parseInt(num);
        }

        return sum;
    }
}