import java.util.Scanner;

public class Ex1_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter weight in kg and height cm: ");
        double weight = sc.nextDouble();
        double height = sc.nextDouble();

        double Height = height / 100;
        double bmi = weight / (Height * Height);

        System.out.println("BMI is : " + bmi);

        sc.close();
    }
}