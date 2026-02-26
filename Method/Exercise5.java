import java.util.Scanner;
public class Exercise5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Numver Before Reverse : ");
        int num = sc.nextInt();
        
        int rev = reverse(num);
        System.out.println("Number After Reverese : " + rev);

        sc.close();
    }

    public static int reverse(int number){
        int rev = 0;
        while (number > 0) {
            // สูตรการ Reverse
            int sum = number % 10;
            rev = rev * 10 + sum;
            number /= 10;
        }
        return rev;
    }
}
