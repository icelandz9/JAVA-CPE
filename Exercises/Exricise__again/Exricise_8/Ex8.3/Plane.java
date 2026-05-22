public class Plane implements Flyable {  // สร้าง class Plane และรับสัญญาจาก Flyable

    @Override
    public void fly() {                  // เขียน fly() จริงๆ สำหรับ Plane
        System.out.println("I am a plane. I am flying with wings.");
    }

    @Override
    public void swim() {                 // เขียน swim() จริงๆ สำหรับ Plane
        System.out.println("I am a plane. I can't swim.");  // Plane ทำไม่ได้ แต่ต้องมีไว้
    }
}