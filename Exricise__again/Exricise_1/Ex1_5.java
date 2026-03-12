import java.util.Scanner;

public class Ex1_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a degree in Fahrenheit: ");
        double fahren = sc.nextDouble();

        double celsius = (5.0/9) * (fahren - 32);

        System.out.printf("%.2f Fahrenheit is %.2f Celsius " , fahren , celsius);

        sc.close();
    }
}
