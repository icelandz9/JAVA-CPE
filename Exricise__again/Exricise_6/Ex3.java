import java.util.Scanner;
public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your messge: ");
        String msg = sc.nextLine();

        String upmsg;

        if(msg.length() >= 3){
            int len = msg.length();
            // len - 3 = ตัดออก 3 ตัวสุดท้าย
            upmsg = msg.substring(0, len - 3) + msg.substring(len - 3).toUpperCase(); 
        }else{
            upmsg = msg.toLowerCase();
        }

        System.out.println("Your is message is : " + upmsg);
    }
}
