// package quiz7;

public class quiz72 {
    public static int countCPE(String str) {
        int c = 0, p = 0, e = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'C' || ch == 'c')
                c++;
            else if (ch == 'P' || ch == 'p')
                p++;
            else if (ch == 'E' || ch == 'e')
                e++;
        }
        System.out.println("Total 'C' alphabets are: " + c);
        System.out.println("Total 'P' alphabets are: " + p);
        System.out.println("Total 'E' alphabets are: " + e);
        System.out.println("The number of CPE alphabets is " + (c + p + e));
        return c + p + e;
    }

}
