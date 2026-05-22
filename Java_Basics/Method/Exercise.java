public class Exercise {

    public static void main(String[] args) {

        System.out.println("i\t \t m(i)");

        for (int i = 1; i <= 901; i += 100) {
            System.out.printf("%d\t \t %.4f%n", i, m(i));
        }
    }

    public static double m(int i) {
        double sum = 0.0;
        for (int k = 1; k <= i; k++) {
            double term = 1.0 / (2 * k - 1);
            // สลับเครื่องหมาย
            if (k % 2 == 0) {
                term = -term;
            }
            sum += term;
        }
        return 4 * sum;
    }
}
	