import java.util.Scanner;
public class Ex2_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a, b, c, d, e, f: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double d = sc.nextDouble();
        double e = sc.nextDouble();
        double f = sc.nextDouble();

        double x = (((e*d) - (b*f)) / ((a*d) - (b*c)));
        double y = (((a*f) - (e*c)) / ((a*d) - (b*c)));

        if(x == 0 || y == 0){
            System.out.println("The eqution has no solution");
        }else{
            System.out.println("X is " + x + " and Y is " + y);
        }

        sc.close();
        
    }
}
