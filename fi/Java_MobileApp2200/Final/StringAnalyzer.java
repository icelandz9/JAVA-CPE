package Final;

import java.util.Scanner;

/**
 * ตัวอย่างการนำโค้ดจาก Quiz 7 (Q07_StringOperations) มาดัดแปลง (Edit) สำหรับการสอบ
 * สมมติโจทย์สอบคือ: "จงนับจำนวนสระ (A, E, I, O, U) ทั้งพิมพ์เล็ก/ใหญ่ และหาผลรวมของ 'เลขคี่' จากข้อความ"
 * 
 * สิ่งที่เราดึงมาจากโค้ดเก่า (Template):
 * 1. โครงสร้างการรับค่าด้วย Scanner
 * 2. โครงสร้าง Loop อ่านทีละตัวอักษร: for (int i = 0; i < str.length(); i++)
 * 3. การแยกตัวอักษร: char ch = str.charAt(i);
 * 4. การเช็คตัวเลข: Character.isDigit(ch)
 */
public class StringAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your message to analyze: ");
        String message = scanner.nextLine();
        
        // --- ส่วนที่ดัดแปลง (Edit) มาจาก countCPE และ sumEvenDigits ---
        int vowelCount = 0;
        int oddSum = 0;
        
        for (int i = 0; i < message.length(); i++) {
            char ch = message.charAt(i);
            
            // 1. ดัดแปลงจากการนับ C, P, E เป็นการนับสระ A, E, I, O, U
            ch = Character.toUpperCase(ch); // เทคนิค: แปลงเป็นพิมพ์ใหญ่ก่อน จะได้ไม่ต้องเช็คพิมพ์เล็กให้เหนื่อย
            if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                vowelCount++;
            }
            
            // 2. ดัดแปลงจากการหาผลรวมเลขคู่ เป็นผลรวมเลขคี่
            if (Character.isDigit(ch)) {
                int num = Character.getNumericValue(ch);
                if (num % 2 != 0) { // เลขคี่คือหาร 2 ไม่ลงตัว
                    oddSum += num;
                }
            }
        }
        
        System.out.println("Total vowels found: " + vowelCount);
        System.out.println("Sum of all odd digits: " + oddSum);
        
        scanner.close();
    }
}
