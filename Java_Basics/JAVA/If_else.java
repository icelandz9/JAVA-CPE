import java.util.Scanner;

public class If_else {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input Num1: ");
        int num1 = sc.nextInt();
        System.out.print("Input Num2: ");
        int num2 = sc.nextInt();

        int sum = num1 + num2;

        if(sum%2 == 0){
            System.err.printf("Even: %d", sum);
        }else{
            System.out.printf("Old: %d", sum);
        }
    }
}
