public class Ex3v1 {
    public static void main(String[] args) {
        int x = 1;
        System.out.println("i\t\tm(i)");
        for (int i = 1; i <= 10; i++) {
            double an = calPI.m(x);
            System.out.println(x + "\t\t" + an + "\t");
            x += 100;
        }
    }
    
    static class calPI {
    public static double m(int i) {
        double cal = 0;
        for (int j = 1; j <= i; j++) {
            cal += Math.pow(-1, j + 1) / (2 * j - 1);
        }
        return 4 * cal;
    }
}
}

