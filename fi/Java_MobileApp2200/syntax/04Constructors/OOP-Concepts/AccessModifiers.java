/*
 * ชื่อไฟล์: AccessModifiers.java
 * หัวข้อ: ระดับการเข้าถึง (Access Modifiers)
 * คำอธิบาย: ตัวกำหนดสิทธิ์การเข้าถึงตัวแปรและเมธอด
 *           1. public: เข้าถึงได้จากทุกที่
 *           2. protected: เข้าถึงได้ใน package เดียวกัน และ subclass
 *           3. default (ไม่ระบุ): เข้าถึงได้ใน package เดียวกันเท่านั้น
 *           4. private: เข้าถึงได้เฉพาะใน class ตัวเองเท่านั้น
 * ตัวอย่างการใช้งาน: ซ่อนข้อมูลสำคัญ (private), เปิดให้ใช้ทั่วไป (public)
 */

class BankAccount {
    // public: ใครๆ ก็รู้ชื่อบัญชีได้
    public String accountName;

    // private: ยอดเงินเป็นความลับ ห้ามแก้ตรงๆ
    private double balance;

    // protected: ให้ลูกหลาน (เช่น บัญชีฝากประจำ) เข้าถึงได้
    protected String accountType;

    public BankAccount(String name, double initialBalance) {
        this.accountName = name;
        this.balance = initialBalance;
        this.accountType = "Savings";
    }

    // public method: ช่องทางสำหรับฝากเงิน (ใครก็ฝากได้)
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("ฝากเงิน: " + amount);
        }
    }

    // private method: ใช้ภายใน class เท่านั้น (เช่น คำนวณดอกเบี้ยภายใน)
    private void calculateInterest() {
        balance += balance * 0.01;
    }

    // getter: อนุญาตให้ดูยอดเงินได้ (แต่แก้ไขไม่ได้)
    public double getBalance() {
        return balance;
    }
}

public class AccessModifiers {
    public static void main(String[] args) {
        System.out.println("=== Access Modifiers ===");

        BankAccount myAccount = new BankAccount("Somchai", 1000.0);

        // เข้าถึง public -> ได้
        System.out.println("ชื่อบัญชี: " + myAccount.accountName);
        myAccount.accountName = "Somchai Jaidee"; // แก้ไขได้

        // เข้าถึง private -> Error!
        // System.out.println(myAccount.balance); // มองไม่เห็น
        // myAccount.balance = 1000000; // แก้ไขไม่ได้ (ปลอดภัย)

        // ต้องผ่าน Public Method ที่เตรียมไว้ให้
        myAccount.deposit(500);
        System.out.println("ยอดเงินคงเหลือ: " + myAccount.getBalance());

        // เรียก private method -> Error!
        // myAccount.calculateInterest();
    }
}

/*
 * ผลลัพธ์ที่ได้:
 * === Access Modifiers ===
 * ชื่อบัญชี: Somchai
 * ฝากเงิน: 500.0
 * ยอดเงินคงเหลือ: 1500.0
 * 
 * หมายเหตุ:
 * - หลักการ Encapsulation คือพยายามซ่อนข้อมูล (Variable) เป็น private
 * - และเปิดให้เข้าถึงผ่าน Method (Getter/Setter) ที่เป็น public แทน
 */
