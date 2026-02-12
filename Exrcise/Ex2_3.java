import java.util.Scanner;

public class Ex2_3 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int num;

        System.out.print("Input ur Number : ");
        num = sc.nextInt();

        if(num % 3 == 0 && num % 11 == 0){
            System.out.println(num + " is divisible by both 3 and 11");
        }else if(num % 3 == 0 || num % 11 == 0){
        if(num % 3 == 0){
            System.out.println(num + " is divisible by both 3 but not both");
        }else{
            System.out.println(num + " is divisible by both 11 but not both");
        }
    }else{
        System.out.println(num + " is not divisible by both 3 and 11");
        }

        sc.close();
    }
}
