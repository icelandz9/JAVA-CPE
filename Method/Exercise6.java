public class Exercise6 {
    public static void main(String[] args) {
        
        int d1 = distance(3, 4, 7, 5);
        System.out.println("The distance value of point (3,4) and point (7,5) is " + d1);

        double d2 = distance(3.0, 4.0, 7.0, 5.0);
        System.out.println("The distance value of point (3.0,4.0) and point (7.0,5.0) is " + d2);

    }

    public static int distance(int x1, int y1, int x2, int y2){
        double d = Math.sqrt(Math.pow(2, x2 - x1) + Math.pow(y2, y1));
        return (int)d;
    }

    public static double distance(double x1, double y1, double x2, double y2){
       return Math.sqrt(Math.pow(2, x2 - x1) + Math.pow(y2, y1));
    }
}
