public class Pork implements Eatable { // class Pork รับสัญญาจาก Eatable
                                       // (ต้องเขียน eat() ให้ครบ)
    @Override // บอกว่า eat() นี้มาจาก interface
    public void eat() { // เขียน eat() จริงๆ สำหรับหมู
        System.out.println("I am yummy. Cook me well!"); // หมูต้องปรุงสุกก่อนกิน
    }
}