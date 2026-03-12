import javax.swing.JOptionPane;
import java.util.Scanner;

public class cpe222_442_05 {

    public static void main(String args[]) {

        Scanner sn = new Scanner(System.in);
        System.out.print("Please enter a,b,c: ");
        double a = sn.nextDouble();
        double b = sn.nextDouble();
        double c = sn.nextDouble();
        root(a, b, c);
    }

    public static void root(double a, double b, double c) {

        double sum = Math.pow(b, 2) - (4 * a * c);
        double sum1 = Math.sqrt(sum);

        double r1 = (-b + sum1) / (2 * a);
        double r2 = (-b - sum1) / (2 * a);

        if (sum > 0) {
            JOptionPane.showMessageDialog(null, "The roots are " + r1 + " and " + r2);
        } else if (sum == 0) {
            JOptionPane.showMessageDialog(null, "The roots are " + r1);
        } else {
            JOptionPane.showMessageDialog(null, "The equation have no real roots");
        }

    }
}


