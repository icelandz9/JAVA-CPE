import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Select data type of all numbers 1.int 2.double: ");
        int chack_type = sc.nextInt();

        if (chack_type == 1) {
            System.out.print("Enter five numbers: ");
            int i1 = sc.nextInt();
            int i2 = sc.nextInt();
            int i3 = sc.nextInt();
            int i4 = sc.nextInt();
            int i5 = sc.nextInt();

            int avg = average(i1, i2, i3, i4, i5);
            System.out.println("Average value: " + avg);
        }else if (chack_type == 2) {
            System.out.print("Enter five numbers: ");
            double i1 = sc.nextDouble();
            double i2 = sc.nextDouble();
            double i3 = sc.nextDouble();
            double i4 = sc.nextDouble();
            double i5 = sc.nextDouble();

            double avg = average(i1, i2, i3, i4, i5);
            System.out.println("Average value: " + avg);
        }else{
            System.out.print("Please chooice your number 1 or 2 : ");
        }

        sc.close();
    }

    public static int average(int i1, int i2, int i3, int i4, int i5){
        return (i1 + i2 + i3 + i4 + i5) / 5;
    }

    public static double average(double i1, double i2, double i3, double i4, double i5){
        return (i1 + i2 + i3 + i4 + i5) / 5;
    }
}
