package Quiz.Quiz_monkey.Quiz7.Q07_442_01;

public class SuperHero {
  // 1. คุณสมบัติของคลาสแม่ (Superclass)
  private String heroName;

  /**
   * 2. Default Constructor
   * กำหนดชื่อเริ่มต้นให้ฮีโร่
   */
  public SuperHero() {
    this.heroName = "I am Super Hero";
  }

  /**
   * 3. Parameterized Constructor
   * กำหนดชื่อฮีโร่ตามที่ส่งเข้ามา
   */
  public SuperHero(String n) {
    this.heroName = "I am " + n;
  }

  // 4. Getter method สำหรับชื่อฮีโร่
  public String getHeroName() {
    return heroName;
  }

  // 5. Method toString() ใช้ส่งคืนค่าเป็น String เพื่อแสดงผล
  public String toString() {
    return heroName + ". I have special power .";
  }
}