import java.util.Scanner;

public class Exerise2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Line and Number : ");
        double s = sc.nextDouble();
        int n = sc.nextInt();

        double area = area(n, s);
        System.out.println("Area = " + area);
        sc.close();
    }

    public static double area(int n, double side){
        return (n * (side * side)) / (4*Math.tan(Math.PI / n));
    }
}