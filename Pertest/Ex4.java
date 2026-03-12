import java.util.Scanner;

import javax.swing.JOptionPane;
public class Ex4 {
    public static void main(String[] args) {    
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your number a b c: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        root(a, b, c);

    }

    public static void root(double a, double b, double c){
        double d = (b * b) - (4 * a * c);
        double sum = Math.sqrt(d);

        double r1 = (-b + sum) / (2 * a);
        double r2 = (-b - sum) / (2 * a);

        if(d > 0){
            JOptionPane.showMessageDialog(null, "root1 " + r1 + " root2 " + r2); 
        }else if(d == 0){
            JOptionPane.showMessageDialog(null, "root1" + r1); 
        }else{
            JOptionPane.showMessageDialog(null, "No root"); 
        }
    }
}
