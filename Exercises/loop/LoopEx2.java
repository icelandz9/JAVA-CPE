import java.util.Scanner;

public class LoopEx2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double kilo;
        double mile;
        String ch;

        do {
            System.out.print("\nConvert Kilometers or Miles (K or M) [Enter Q to quit]: ");
            ch = sc.next(); 

            if (ch.equalsIgnoreCase("k")) {
                // ch.equalsIgnoreCase("k") ถ้าใช้ == ใช้กับ scanner มันจะพัง 
                // .equals("k") รับได้แค่ตัวพิมพ์เล็ก 'k' อย่างเดียวรับได้แค่ตัวพิมพ์เล็ก 
                // .equalsIgnoreCase("k"): จะรับทั้ง 'k' และ 'K' 
                System.out.print("Enter Kilometers : ");
                kilo = sc.nextDouble();
                mile = kilo * 0.612;
                System.out.println("Kilometers : " + kilo + " -> Miles : " + mile);

            } else if (ch.equalsIgnoreCase("m")) {
                System.out.print("Enter Miles : ");
                mile = sc.nextDouble();
                kilo = mile / 0.612;
                System.out.println("Miles : " + mile + " -> Kilometers : " + kilo);
                
            } else if (!ch.equalsIgnoreCase("q")) {
                System.out.println("Invalid input!");
            }
        } while (!ch.equalsIgnoreCase("q"));

        System.out.println("Goodbye!");
        sc.close();
    }   
}