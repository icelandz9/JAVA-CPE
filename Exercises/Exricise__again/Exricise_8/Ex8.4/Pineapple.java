public class Pineapple implements Eatable { // class Pineapple รับสัญญาจาก Eatable
    @Override
    public void eat() { // เขียน eat() จริงๆ สำหรับสับปะรด
        System.out.println("I am yummy. Eat me fresh."); // สับปะรดกินสดได้เลย
    }
}