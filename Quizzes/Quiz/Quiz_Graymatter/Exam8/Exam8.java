package Quiz.Quiz_Graymatter.Exam8;

import java.util.Scanner;

public class Exam8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter radius of sphere: ");
        double sphereRadius = scanner.nextDouble();
        System.out.printf("Sphere Volume: %.2f\n", calculateVolume(sphereRadius));

        System.out.print("Enter radius of cylinder: ");
        double cylinderRadius = scanner.nextDouble();
        System.out.print("Enter height of cylinder: ");
        double cylinderHeight = scanner.nextDouble();
        System.out.printf("Cylinder Volume: %.2f\n", calculateVolume(cylinderRadius, cylinderHeight));

        System.out.print("Enter base of triangle prism: ");
        double base = scanner.nextDouble();
        System.out.print("Enter height of triangle prism: ");
        double triangleHeight = scanner.nextDouble();
        System.out.print("Enter length of triangle prism: ");
        double length = scanner.nextDouble();
        System.out.printf("Triangle Prism Volume: %.2f\n", calculateVolume(base, triangleHeight, length));

        scanner.close();
    }

    public static double calculateVolume(double radius) {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }

    public static double calculateVolume(double radius, double height) {
        return Math.PI * Math.pow(radius, 2) * height;
    }

    public static double calculateVolume(double base, double height, double length) {
        return (base * height * length) / 2;
    }
}
