import java.util.Scanner;
public class Exercise5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("> Enter an integer: ");
        int num = sc.nextInt();

        int rev = reverse(num);
        System.out.println("Number Reverse is: " + rev);

        sc.close();
    }

    public static int reverse(int number){
        int rev = 0;
        while(number > 0){
            // สูตรการ reverse
            int sum = number % 10; // เอาค่าสุดท้าย
            rev = rev * 10 + sum; // เหมือนเป็นการเลือนตำแหน่ง
            number /= 10; // ตัดเลขตัวสุดท้ายออก
        }
        return rev;
    }
}
