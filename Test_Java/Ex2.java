import javax.swing.JOptionPane;
import java.util.Scanner;
public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float ITemp_f, FTemp_f, mass_f;

        System.out.print("Input Mass : ");
        mass_f = sc.nextFloat();

        System.out.print("Input ITemp : ");
        ITemp_f = sc.nextFloat();
        System.out.print("Input FTemp : ");
        FTemp_f = sc.nextFloat();

        double ITemp = (double)ITemp_f;
        double FTemp = (double)FTemp_f;
        double mass = (double)mass_f;

        double sumTemp = FTemp - ITemp;

        double energy = sumTemp * mass * 4184;

        JOptionPane.showMessageDialog(null, "The energy needed is " + energy);

        sc.close();
    }
}
