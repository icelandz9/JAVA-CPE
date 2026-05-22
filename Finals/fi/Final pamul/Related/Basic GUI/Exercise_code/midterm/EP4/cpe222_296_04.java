import javax.swing.JOptionPane;
import java.util.Scanner;

public class cpe222_296_04 {

    //main
    public static void main(String args[]){

        //input a b c
        Scanner sc = new Scanner(System.in);
        System.out.printf("Please enter a,b,c: ");
        double a = sc.nextDouble(); double b = sc.nextDouble(); double c = sc.nextDouble();
        calroot(a,b,c);
    }





    //method
    public static void calroot(double a, double b, double c){
        
        //cal check
        double judge = (b * b) - (4 * a * c);
        double totalj = Math.sqrt(judge);

        //cal r1 r2
        double r1 = (-b - totalj) / (2*a);
        double r2 = (-b + totalj) / (2*a);

        //check and diplay
        if(judge>0){
            JOptionPane.showMessageDialog(null, "The roots are "+r1+" and "+r2);
        }
        else if(judge==0){
            JOptionPane.showMessageDialog(null, "The roots are "+r1);
        }
        else{
            JOptionPane.showMessageDialog(null, "The equation have no real roots");
        }


    }
}