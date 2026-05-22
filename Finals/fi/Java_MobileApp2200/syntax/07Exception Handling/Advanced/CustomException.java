/*
 * ชื่อไฟล์: CustomException.java
 * หัวข้อ: การสร้าง Exception เอง (User-Defined Exception)
 * คำอธิบาย: สร้าง Exception Class โดย extends จาก Exception หรือ RuntimeException
 * ตัวอย่างการใช้งาน: ตรวจสอบเงื่อนไขทางธุรกิจ เช่น คะแนนต้อง 0-100
 */

// Checked Exception (ต้อง handle)
class InvalidScoreException extends Exception {
    private int score;
    public InvalidScoreException(String msg, int score) {
        super(msg);
        this.score = score;
    }
    public int getScore() { return score; }
}

// Unchecked Exception (ไม่บังคับ handle)
class InsufficientBalanceException extends RuntimeException {
    private double deficit;
    public InsufficientBalanceException(double bal, double amt) {
        super("ยอดเงินไม่พอ: มี " + bal + " ต้องการ " + amt);
        this.deficit = amt - bal;
    }
    public double getDeficit() { return deficit; }
}

public class CustomException {
    public static void main(String[] args) {
        System.out.println("=== Custom Exception ===");

        // ทดสอบ Checked
        try {
            setScore(85);
            setScore(150); // Exception
        } catch (InvalidScoreException e) {
            System.out.println("Error: " + e.getMessage() + " (score=" + e.getScore() + ")");
        }

        // ทดสอบ Unchecked
        try {
            withdraw(5000, 3000);
        } catch (InsufficientBalanceException e) {
            System.out.println("Error: " + e.getMessage());
            System.out.println("ขาดอีก: " + e.getDeficit() + " บาท");
        }
    }

    static void setScore(int s) throws InvalidScoreException {
        if (s < 0 || s > 100) throw new InvalidScoreException("คะแนนต้อง 0-100", s);
        System.out.println("คะแนน: " + s + " OK");
    }

    static void withdraw(double amt, double bal) {
        if (amt > bal) throw new InsufficientBalanceException(bal, amt);
        System.out.println("ถอน " + amt + " สำเร็จ");
    }
}

/*
 * ผลลัพธ์: คะแนน: 85 OK → Error: คะแนนต้อง 0-100 (score=150)
 *          Error: ยอดเงินไม่พอ → ขาดอีก: 2000.0 บาท
 * หมายเหตุ:
 * - extends Exception → Checked | extends RuntimeException → Unchecked
 * - Custom Exception ควรมี constructor ที่รับ message + field เพิ่มเติม
 */
