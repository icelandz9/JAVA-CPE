package Quiz.Quiz_Graymatter.Exam7;

import java.util.Scanner;

public class Exam7_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter value of height: ");
        double height = scanner.nextDouble();
        System.out.print("Enter value of base: ");
        double base = scanner.nextDouble();
        System.out.print("Enter inner length: ");
        double innerLength = scanner.nextDouble();
        System.out.print("Enter outer length: ");
        double outerLength = scanner.nextDouble();
        double volumeDifference = trianglePrismVolumeDif(base, height, innerLength, outerLength);
        System.out.printf("The different volume of 2 Triangle Prism is %.2f\n", volumeDifference);
        scanner.close();
    }

    public static double calculateVolume(double base, double height, double length) {
        return base * height * length / 2.0;
    }

    public static double trianglePrismVolumeDif(double base, double height, double innerLength, double outerLength) {
        double volume1 = calculateVolume(base, height, innerLength);
        double volume2 = calculateVolume(base, height, outerLength);
        return Math.abs(volume2 - volume1);
    }
}
