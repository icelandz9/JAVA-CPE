public class ex4_3 {

    public static void main(String[] args) {
        System.out.println("i\tm(i)");
        System.out.println("--------------");
        for (int i = 1; i <= 901; i += 100) {
            System.out.printf("%d\t%.4f\n", i, m(i));
        }
    }

    public static double m(int i) {
        double sum = 0;
        for (int j = 1; j <= i; j++) {
            sum += Math.pow(-1, j + 1) / (2 * j - 1);
        }
        return 4 * sum;
    }
}
