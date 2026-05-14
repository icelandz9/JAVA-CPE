import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter five integers:");
        int i1 = scanner.nextInt();
        int i2 = scanner.nextInt();
        int i3 = scanner.nextInt();
        int i4 = scanner.nextInt();
        int i5 = scanner.nextInt();

        System.out.println("The average is: " + average(i1, i2, i3, i4, i5));

        System.out.println("Enter five doubles:");
        double d1 = scanner.nextDouble();
        double d2 = scanner.nextDouble();
        double d3 = scanner.nextDouble();
        double d4 = scanner.nextDouble();
        double d5 = scanner.nextDouble();

        System.out.println("The average is: " + average(d1, d2, d3, d4, d5));

        scanner.close();
    }

    public static int average(int i1, int i2, int i3, int i4, int i5) {
        return (i1 + i2 + i3 + i4 + i5) / 5;
    }

    public static double average(double i1, double i2, double i3, double i4, double i5) {
        return (i1 + i2 + i3 + i4 + i5) / 5.0;
    }
}
