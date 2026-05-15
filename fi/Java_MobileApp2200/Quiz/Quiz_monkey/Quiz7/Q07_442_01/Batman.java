package Quiz.Quiz_monkey.Quiz7.Q07_442_01;

// 1. สืบทอดคุณสมบัติจากคลาสแม่ SuperHero
public class Batman extends SuperHero {
  private String power;

  /**
   * 2. Default Constructor ของ Batman
   */
  public Batman() {
    // จะมีการเรียก super() เพื่อเรียก Default Constructor ของ SuperHero อัตโนมัติ
    this.power = "I am rich.";
  }

  /**
   * 3. Parameterized Constructor ของ Batman
   */
  public Batman(String n, String power) {
    super(n); // เรียกใช้ Constructor ของ SuperHero ที่รับพารามิเตอร์ 1 ตัว
    this.power = power;
  }

  // 4. Override method toString() ของคลาสแม่
  public String toString() {
    // ใช้ super.getHeroName() เพื่อดึงค่าชื่อจากคลาสแม่มาใช้
    return super.getHeroName() + ". " + this.power;
  }
}