import java.util.Scanner;
public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your messge: ");
        String msg = sc.nextLine();

        if(msg.length() >= 2){
            msg = msg.substring(2) + msg.substring(0, 2);
            System.out.println("Your messge is : " + msg);
        }
        
    }
}
