import javax.swing.JOptionPane;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double c, f;
        double cToF, cToK, fToC, fToK;

        System.out.print("Enter the temperature in Celsius unit: ");
        c = sc.nextDouble();

        System.out.print("Enter the temperature in Fahrenheit unit: ");
        f = sc.nextDouble();

        // Celsius → Fahrenheit
        cToF = (c * 9 / 5) + 32;

        // Celsius → Kelvin
        cToK = c + 273.15;

        // Fahrenheit → Celsius
        fToC = (f - 32) * 5 / 9;

        // Fahrenheit → Kelvin
        fToK = (f - 32) * 5 / 9 + 273.15;

        JOptionPane.showMessageDialog(null,"the temperature in Fahrenheit from Celsius unit is " + cToF);

        JOptionPane.showMessageDialog(null,"the temperature in Kelvin from Celsius unit is " + cToK);

        JOptionPane.showMessageDialog(null,"the temperature in Celsius from Fahrenheit unit is " + fToC);

        JOptionPane.showMessageDialog(null,"the temperature in Kelvin from Fahrenheit unit is " + fToK);

        sc.close();
    }
}
