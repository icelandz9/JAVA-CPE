import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Exchange Type");
        System.out.println("Input THB change to USD, GBP and JPY");
        System.out.println("Input USD and JPY change to THB");
        System.out.println("Input USD, GBP and JPY change to THB");

        System.out.print("select Type 1, 2, 3: ");
        int num = sc.nextInt();

        switch (num) {
            case 1:
                System.out.print("Input THB: ");
                double thb = sc.nextDouble();
                calMoney(thb);
                break;

            case 2:
                System.out.print("Input USD and JPY: ");
                double usd = sc.nextDouble();
                double jpy = sc.nextDouble();
                calMoney(usd, jpy);
                break;

            case 3:
                System.out.print("Input USD, GBP and JPY: ");
                double usd3 = sc.nextDouble();
                double gbp3 = sc.nextDouble();
                double jpy3 = sc.nextDouble();
                calMoney(usd3, gbp3, jpy3);
                break;

            default:
                break;
        }

        sc.close();
    }

    public static void calMoney(double thb){
        double usd = thb / 31.85;
        double gbp = thb / 42.54;
        double jpy = thb / 0.2878;

        System.out.printf("THB: %.2f Change to USD: %.2f GBP: %.2f JPY: %.2f", thb, usd, gbp, jpy);
        System.err.println(" ");
    }

    public static void calMoney(double usd, double jpy){
        double thb1 = usd * 31.85;
        double thb2 = jpy * 0.2878;

        System.out.println("USD " + usd + " and JPY " +jpy+ " Change to THB");
        System.out.printf("USD to THB: %.2f \n", thb1);
        System.out.printf("JPY to THB: %.2f \n", thb2);
        System.out.println(" ");

    }

    public static void calMoney(double usd3, double gbp3, double jpy3){
        double th1 = usd3 * 31.85;
        double th2 = usd3 * 42.54;
        double th3 = jpy3 * 0.2878;

        System.out.println("USD: " + usd3 + " GBP: " + gbp3 + " and JPY: " + jpy3 + " Change to THB");
        System.out.printf("USD to THB: %.2f \n", th1);
        System.out.printf("GBP to THB: %.2f \n", th2);
        System.out.printf("JPY to THB: %.2f \n", th2);
    }
}