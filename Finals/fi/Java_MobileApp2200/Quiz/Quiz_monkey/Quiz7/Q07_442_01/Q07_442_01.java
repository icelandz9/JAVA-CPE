package Quiz.Quiz_monkey.Quiz7.Q07_442_01;

public class Q07_442_01 {
  public static void main(String[] args) {
    // 1. สร้างอ็อบเจกต์จากคลาสแม่และคลาสลูกต่างๆ
    SuperHero sh = new SuperHero();
    Superman sm = new Superman(); // ใช้ Default Constructor ของ Superman
    Batman bm1 = new Batman(); // ใช้ Default Constructor ของ Batman
    Batman bm2 = new Batman("Batman", "I am Rich."); // ใช้ Parameterized Constructor ของ Batman
    Spiderman sd = new Spiderman("Spiderman", 20, "I can shoot spider web");

    // 2. แสดงผลโดยจะเรียกใช้เมธอด toString() ของแต่ละคลาสโดยอัตโนมัติ
    System.out.println(sh);
    System.out.println(sm);
    System.out.println(bm1);
    System.out.println(bm2);
    System.out.println(sd);
  }
}
