import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your number : ");
        int num = sc.nextInt();
        int number = sumDigits(num);
        System.out.println("Sum of digits = " + number);
        sc.close();
    }

    public static int sumDigits(int n) {
        int sum = 0;
        while(n != 0){
            sum += n % 10; // เอาหลักสุดท้าย
            n /= 10; // ตัดหลักสุดท้าย
        }
        return sum;
    }
}
