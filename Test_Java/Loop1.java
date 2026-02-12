import java.util.Scanner;

public class Loop1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num, sum = 0;

        System.out.print("Enter your number : ");
        num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            sum += i;
            if (i % 2 == 0) {
                System.out.print("\t"+ i);
            }
        }

        System.out.println("\n Output : " + sum);

        sc.close();
    }
}
