/*
 * ชื่อไฟล์: ConstructorOverloading.java
 * หัวข้อ: การโอเวอร์โหลดคอนสตรัคเตอร์ (Constructor Overloading)
 * คำอธิบาย: การมี Constructor หลายรูปแบบในคลาสเดียว เพื่อรองรับการสร้าง Object ได้หลายวิธี
 * ตัวอย่างการใช้งาน: new User() [guest], new User("Admin"), new User("Tom", 25)
 */

class User {
    String username;
    String role;

    // แบบที่ 1: ไม่รับค่าอะไรเลย (Default)
    public User() {
        this.username = "Guest";
        this.role = "Visitor";
        System.out.println("สร้าง User แบบ Default");
    }

    // แบบที่ 2: รับแค่ชื่อ
    public User(String username) {
        this.username = username;
        this.role = "Member"; // กำหนด Default Role
        System.out.println("สร้าง User แบบระบุชื่อ");
    }

    // แบบที่ 3: รับทั้งชื่อและบทบาท
    public User(String username, String role) {
        this.username = username;
        this.role = role;
        System.out.println("สร้าง User แบบระบุรายละเอียดครบ");
    }

    public void showProfile() {
        System.out.println("User: " + username + " | Role: " + role);
    }
}

public class ConstructorOverloading {
    public static void main(String[] args) {
        System.out.println("=== Constructor Overloading ===");

        User u1 = new User();
        u1.showProfile();

        System.out.println("--------------------");

        User u2 = new User("Somsri");
        u2.showProfile();

        System.out.println("--------------------");

        User u3 = new User("Somchai", "Admin");
        u3.showProfile();
    }
}

/*
 * ผลลัพธ์ที่ได้:
 * === Constructor Overloading ===
 * สร้าง User แบบ Default
 * User: Guest | Role: Visitor
 * --------------------
 * สร้าง User แบบระบุชื่อ
 * User: Somsri | Role: Member
 * --------------------
 * สร้าง User แบบระบุรายละเอียดครบ
 * User: Somchai | Role: Admin
 * 
 * หมายเหตุ:
 * - ช่วยเพิ่มความยืดหยุ่นให้ผู้ใช้งาน Class เลือกวิธีสร้าง Object
 * ได้ตามความเหมาะสม
 */
