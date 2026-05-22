import java.util.Scanner;
public class Ex1_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of seconds: ");
        int num = sc.nextInt();

        int hours = num / 3600;
        int minutes = (num % 3600) / 60;
        int second = num % 60;

        System.err.println(num + " second " + hours + " hours " + minutes + " minutes " + second + " second ");

        sc.close();
    }
}
