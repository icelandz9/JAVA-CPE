import java.util.Scanner;

public class Ex1_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("> Enter inches as an integer: ");
        double num = sc.nextDouble();

        double sum = num / 0.3937;

        System.out.println("The value in centimeters is " + sum);

        sc.close();
    }
}
