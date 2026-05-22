package Quiz.Quiz_monkey.Quiz2;

import java.util.Scanner;

public class Q02_442_01 {
  public static void main(String args[]) {
    // 1. สุ่มตัวเลข 0.0 - 0.999...
    Double rnd = Math.random();
    // 2. แปลงให้เป็นช่วง 21 ถึง 80 (ตามโค้ดเดิม แม้โจทย์จะระบุ 15-60)
    int r = (int) ((rnd * 60) + 21);
    
    // 3. หาเลขท้าย (หลักหน่วย)
    int a1 = r % 10;
    // 4. หารเอาเศษด้วย 7 เพื่อตรวจสอบว่าหาร 7 ลงตัวหรือไม่
    int a2 = r % 7;
    
    Scanner sn = new Scanner(System.in);
    System.out.println("Please enter gess score(1-3) : ");
    int x = sn.nextInt(); // รับค่าที่ผู้ใช้ทาย

    // เงื่อนไขที่ 1: ถ้าเลขท้ายเป็น 4 หรือ 9 (ได้ 2 คะแนน)
    if (a1 == 4 || a1 == 9) {
      if (x == 2) {
        System.out.println("Random number is " + r + " => lucky number = 2");
        System.out.println("The lucky is 2 Your lucky number is 2. You correct");
      } else if (x != 2) {
        System.out.println("Random number is " + r + " => lucky number = 2");
        System.out.println("The lucky is 2 Your lucky number is " + x + " Sorry you wrong");
      }
    }
    // เงื่อนไขที่ 2: ถ้าหาร 7 ลงตัว (ได้ 3 คะแนน)
    else if (a2 == 0) {
      if (x == 3) {
        System.out.println("Random number is " + r + " => lucky number = 3");
        System.out.println("The lucky is 3 Your lucky number is 3. You correct");
      } else if (x != 3) {
        System.out.println("Random number is " + r + " => lucky number = 3");
        System.out.println("The lucky is 3 Your lucky number is " + x + " Sorry you wrong");
      }
    }
    // เงื่อนไขที่ 3: กรณีอื่นๆ ได้ 1 คะแนน
    else if (x == 1) {
      System.out.println("Random number is " + r + " => lucky number = 1");
      System.out.println("The lucky is 1 Your lucky number is " + x + " You correct");
    } else if (x != 1) {
      System.out.println("Random number is " + r + " => lucky number = 1");
      System.out.println("The lucky is 1 Your lucky number is " + x + " Sorry you wrong");
    }
  }

}