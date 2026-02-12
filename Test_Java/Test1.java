// import javax.swing.JOptionPane;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        float num1;

        Scanner sc = new Scanner(System.in);

        System.out.print("Input your Number : ");
        num1 = sc.nextFloat();

        // Float => Double
        double num2 = (double) num1;

        double results = num2 * Math.PI;

        System.out.println(results);

        sc.close();
    }

}