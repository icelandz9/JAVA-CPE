import java.util.Scanner;
import javax.swing.JOptionPane;
public class LoopEx4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a, x, n : ");
        double a = sc.nextDouble(); 
        double x = sc.nextDouble();
        int n = sc.nextInt();

        double powresult = 1.0;
        for(int i = 1; i <= n; i++){
            powresult *= x;
            // x=2, n=3
            // 1*2 = 2
            // 2*2 = 4
            // 4*2 = 8
        }
        double result = a * powresult;

        // System.out.printf("ax^n where a = %.1f, x = %.1f, n = %d, is %.1f", a,x,n,result);
        JOptionPane.showMessageDialog(null,"ax^n where a = " + a + " x = "+ x + " n = " + n + " is " + result);

        sc.close();
    }
}
