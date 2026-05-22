import java.util.Scanner;

public class Ex_Bmi {
    public static void main(String[] args) {
        float bmi;
        double result;

        Scanner sc = new Scanner(System.in);

        System.out.print("Input Weitht (kg): ");
        float weitht = sc.nextFloat();
        System.out.print("Input High (cm): ");
        float high = sc.nextFloat();

        high /= 100;

        result = Math.pow(high, 2);
        bmi = (float) (weitht / result);

        System.out.printf("Your BIM is : %.2f ", bmi);

        sc.close();
    }
}
