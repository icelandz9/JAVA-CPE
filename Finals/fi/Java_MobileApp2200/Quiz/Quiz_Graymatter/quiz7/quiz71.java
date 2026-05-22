import java.util.Scanner;

public class quiz71 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter your choice: ");
        String choice = sc.nextLine();
        System.out.print("Enter your message: ");
        String str = sc.nextLine();
        
        int count = 0, sum = 0;
        if (choice.equalsIgnoreCase("even")) {
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                if (Character.isDigit(c)) {
                    count++;
                    int digit = c - '0';
                    if (digit % 2 == 0) sum += digit;
                }
            }
            System.out.println("Total digits are: " + count);
            System.out.println("The summation of even digits in this message is: " + sum);
        } else {
            System.out.println("0");
        }
    }
}
