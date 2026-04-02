package quiz7;

public class quiz71 {
    public static void sumEvenDigits(String str, String choice) {
        int count = 0, sum = 0;
        if (choice.equalsIgnoreCase("even")) {
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                if (Character.isDigit(c)) {
                    count++;
                    int digit = c - '0';
                    if (digit % 2 == 0)
                        sum += digit;
                }
            }
            System.out.println("Total digits are: " + count);
            System.out.println("The summation of even digits in this message is: " + sum);
        } else {
            System.out.println("0");
        }
    }

}
