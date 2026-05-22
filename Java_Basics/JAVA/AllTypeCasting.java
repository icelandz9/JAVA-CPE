public class AllTypeCasting {
    public static void main(String[] args) {

        // แปลง Data Type

        String s = "50";
        int i = Integer.parseInt(s);
        double d = Double.parseDouble("");

        int x = 10;
        double y = x;

        double z = 9.9;
        int n = (int) z;

        char c = 'A';
        int ascii = c;

        String str = String.valueOf(i); //int to String

        System.out.println(s);
        System.out.println(i);
        System.out.println(d);
        System.out.println(y);
        System.out.println(n);
        System.out.println(ascii);
        System.out.println(str);
    }
}
