package Quiz.Quiz_Graymatter.Exam7;

import java.util.Scanner;

public class Exam7_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        countCPE(str);

        scanner.close();
    }

    public static int countCPE(String str) {
        int countC = 0, countP = 0, countE = 0;

        for (char ch : str.toCharArray()) {
            if (ch == 'C')
                countC++;
            else if (ch == 'P')
                countP++;
            else if (ch == 'E')
                countE++;
        }

        System.out.println("Total 'C' alphabets are: " + countC);
        System.out.println("Total 'P' alphabets are: " + countP);
        System.out.println("Total 'E' alphabets are: " + countE);
        int totalCPE = countC + countP + countE;
        System.out.println("The number of CPE alphabets is: " + totalCPE);

        return totalCPE;
    }
}
