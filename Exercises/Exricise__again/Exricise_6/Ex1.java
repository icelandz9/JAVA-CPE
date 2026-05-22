import java.util.Scanner;
public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your messge: ");
        String msg = sc.nextLine();

        if (msg.length() >= 3) {
            if (msg.charAt(1) == 'e' || msg.charAt(2) == 'e') {
                System.out.println("Your messge is : true");
            }else{
                System.out.println("Your messge is : false");
            }
        }
    }
}
