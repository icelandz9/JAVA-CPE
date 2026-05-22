import java.util.Scanner;

public class cpe222_442_03 {
    public static void main(String[] args) {
        System.out.println("Type 1 : 1 input(THB) 3 output(USD,GBP,JPY) ");
        System.out.println("Type 2 : 2 input(USD,JPY) 2 output(THB) ");
        System.out.println("Type 3 : 3 input(USD,GBP,JPY) 3 output(THB) ");
        System.out.print("Enter Exchange tyoe (1,2,3) : ");
        Scanner scan = new Scanner(System.in);
        int bank = scan.nextInt();
        switch (bank) {
            case 1:
                System.out.print("Input the price of THB ");
                Double thb = scan.nextDouble();
                calMoney(thb);
                break;

            case 2:
                System.out.print("Input the price of USD and JPY ");
                Double usd = scan.nextDouble();
                Double jpy = scan.nextDouble();
                calMoney(usd, jpy);
                break;

            case 3:
                System.out.print("Input the price of USD , GBP and JPY ");
                Double usd1 = scan.nextDouble();
                Double gbp = scan.nextDouble();
                Double jpy1 = scan.nextDouble();
                calMoney(usd1, gbp, jpy1);
                break;
        }
    }

    public static void calMoney(Double thb) {
        System.out.println("USD = " + thb / 31.85 + " GBP = " + thb / 42.54 + " JPY = " + thb / 0.2878);
    }

    public static void calMoney(Double usd1, Double jpy) {
        System.out.println(usd1 + "USD to THB = " + (usd1 * 31.85) + " and " + jpy + " JPY to THB = " + jpy * 0.2878);
    }

    public static void calMoney(Double usd, Double gbp, Double jpy1) {
        System.out.println(
                "USD to THB = " + usd * 31.85 + " / GBP to THB = " + gbp * 42.54 + " / JPY to THB = " + jpy1 * 0.2878);
    }

}