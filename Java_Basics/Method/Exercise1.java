import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your number: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        boolean result = checkCondition(num1, num2, num3);
        System.out.println(result);
        sc.close();
    }

    public static boolean checkCondition(int a ,int b, int c){
        boolean chack1 = a > b && a > c;
        boolean chack2 = c < b && c < a;
        if (chack1 && chack2) {
            return false;
        }
        return chack1 || chack2;
    }

}
