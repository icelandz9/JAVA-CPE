package Quiz.Quiz_monkey.Quiz7;

import java.util.Scanner;

/**
 * Quiz 7: String Operations
 * 1. หาผลรวมของตัวเลขคู่จากชุดข้อความ
 * 2. นับจำนวนตัวอักษร C, P, E จากชุดข้อความ
 */
public class Q07_StringOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("--- Item 1: Sum Even Digits ---");
        System.out.print("Enter your choice: ");
        String choice = scanner.nextLine();
        
        System.out.print("Enter your message: ");
        String message1 = scanner.nextLine();
        
        // เรียกใช้เมธอดข้อ 1
        sumEvenDigits(message1, choice);
        
        System.out.println("\n--- Item 2: Count CPE ---");
        System.out.print("Enter a string: ");
        String message2 = scanner.nextLine();
        
        // เรียกใช้เมธอดข้อ 2
        countCPE(message2);
        
        scanner.close();
    }

    /**
     * ข้อ 1: หาผลรวมของตัวเลขคู่จากชุดข้อความ
     * โดยเงื่อนไขคือ choice ต้องมีค่าเท่ากับ "even" (ไม่สนใจพิมพ์เล็กพิมพ์ใหญ่)
     */
    public static void sumEvenDigits(String str, String choice) {
        if (!choice.equalsIgnoreCase("even")) {
            System.out.println("Invalid choice. Must be 'even'.");
            return;
        }

        int totalDigits = 0;
        int sum = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            // ตรวจสอบว่าเป็นตัวเลขหรือไม่
            if (Character.isDigit(ch)) {
                int num = Character.getNumericValue(ch);
                // ตรวจสอบว่าเป็นเลขคู่หรือไม่
                if (num % 2 == 0) {
                    sum += num;
                    totalDigits++;
                }
            }
        }

        System.out.println("Total digits are: " + totalDigits);
        if (totalDigits == 0) {
            System.out.println("The summation of even digits in this message is: 0");
        } else {
            System.out.println("The summation of even digits in this message is: " + sum);
        }
    }

    /**
     * ข้อ 2: นับจำนวนตัวอักษร C, P, E
     */
    public static int countCPE(String str) {
        int countC = 0, countP = 0, countE = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'C' || ch == 'c') countC++;
            else if (ch == 'P' || ch == 'p') countP++;
            else if (ch == 'E' || ch == 'e') countE++;
        }

        int totalCPE = countC + countP + countE;

        System.out.println("Total 'C' alphabets are: " + countC);
        System.out.println("Total 'P' alphabets are: " + countP);
        System.out.println("Total 'E' alphabets are: " + countE);
        System.out.println("The number of CPE alphabets is " + totalCPE);

        return totalCPE;
    }
}
