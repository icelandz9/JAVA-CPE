import java.util.Scanner;

public class Ex1_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("> Enter an integer between 000 and 999: ");
        int num = sc.nextInt();

        int hundat = num / 100;
        int ten = (num / 10) % 10;
        int unit = num % 10;

        int sum = hundat * ten * unit;

        System.out.println("The product of digits is " + sum);

        sc.close();
    }
}
