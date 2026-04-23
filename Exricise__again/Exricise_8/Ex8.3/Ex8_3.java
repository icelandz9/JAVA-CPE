public class Ex8_3 {
    public static void main(String[] args) {   // จุดเริ่มต้นโปรแกรม

        Flyable duck = new Duck();    // สร้าง Duck แต่มองเป็นแค่ Flyable
                                      // (รู้แค่ว่ามี fly() กับ swim() ไม่สนว่าเป็น Duck)

        Flyable plane = new Plane();  // สร้าง Plane แต่มองเป็นแค่ Flyable

        duck.fly();    // เรียก fly() ของ Duck  → พิมพ์ "I am a duck. I am flying with wings."
        duck.swim();   // เรียก swim() ของ Duck → พิมพ์ "I am a duck. I am swimming."
        plane.fly();   // เรียก fly() ของ Plane → พิมพ์ "I am a plane. I am flying with wings."
        plane.swim();  // เรียก swim() ของ Plane→ พิมพ์ "I am a plane. I can't swim."
    }
}