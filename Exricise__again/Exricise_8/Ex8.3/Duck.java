public class Duck implements Flyable { // สร้าง class Duck และรับสัญญาจาก Flyable
                                       // (ต้องมี fly() และ swim() ครบ)

    @Override // บอกว่า method นี้มาจาก interface
    public void fly() { // เขียน fly() จริงๆ สำหรับ Duck
        System.out.println("I am a duck. I am flying with wings."); // พิมพ์ข้อความ
    }

    @Override // บอกว่า method นี้มาจาก interface
    public void swim() { // เขียน swim() จริงๆ สำหรับ Duck
        System.out.println("I am a duck. I am swimming."); // พิมพ์ข้อความ
    }
}