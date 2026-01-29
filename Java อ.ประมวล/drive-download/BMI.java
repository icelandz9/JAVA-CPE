import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {

        int height, weight;
        double bmi;

        Scanner sc = new Scanner(System.in);

        System.out.print("Input Weight (kg): ");
        weight = sc.nextInt();

        System.out.print("Input Height (cm): ");
        height = sc.nextInt();

        double CHheight = height / 100.0;

        bmi = weight / (CHheight * CHheight);

        System.out.printf("Weight: %d kg%nHeight: %d cm%nBMI: %.2f%n", weight, height, bmi);
    }
}
