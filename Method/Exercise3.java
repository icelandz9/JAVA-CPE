public class Exercise3 {
    public static void main(String[] args) {

        for(int i = 1 ; i < 1000; i += 100){
            double mathpi = m(i);
            System.out.printf("%d \t \t %.4f %n", i, mathpi);
        }
    }


    public static double m(int i) {
        double sum = 0.0;
        for(int n = 0; n < i; n++){
            sum += Math.pow(-1, n) / (2 * n + 1);
        }
        return 4 * sum;
    }
}
