import java.util.Scanner;

public class Assignment {
    public static void main(String[] args) {
        
        Scanner kb = new Scanner(System.in);

        System.out.println("คำนวน พศ. to ค.ศ");
        System.out.print("Input Year: ");
        int year = kb.nextInt();

        year -= 543;

        System.out.println("A.C. : "+ year);
        System.out.println("-----------------------------");
        
        System.out.print("แลกเงิน: ");
        int money = kb.nextInt();
        
        if (money >= 1000) {
            // money / 1000;
            System.out.println("1000 : "+ (money / 1000) + " ใบ");
            money %= 1000;
        }if (money >= 500) {
            System.out.println("500 : " + (money / 500) + " ใบ");
            money %= 500;
        }if (money >= 100) {
            System.out.println("100 : "+ (money / 100) + " ใบ");
            money %= 100;            
        }if (money >= 50) {
            System.out.println("50 : "+ (money / 50) + " ใบ");
            money %= 50;
        }if (money >= 20) {
            System.out.println("20 : "+ (money / 20) + " ใบ");
            money %= 20;
        }if (money >= 10){
            System.err.println("10 : "+ (money / 10)+ " ใบ");
            money %= 10;
        }if (money >= 5){
            System.err.println("5 : "+ (money / 5)+ " ใบ");
            money %= 5;
        }if (money >= 1){
            System.err.println("1 : "+ (money / 1)+ " ใบ");
            money %= 1;
        }
        System.out.println("แลกเงินเสร็จแล้ว");
        System.out.println("-----------------------------");

        System.out.print("แปลงอุณหภมิ ฟาเลยไฮน์ = ");
        float fahren = kb.nextFloat();

        float cel = (fahren-32)*5/9;
        System.out.printf("ฟาเรนไฮต์ = %.2f เซลเซียส = %.2f", fahren, cel);
        // ถ้ามี float ให้printf 
        // ที่เหลือใช้println

        kb.close();

    }
}
