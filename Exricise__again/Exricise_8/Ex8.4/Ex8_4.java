public class Ex8_4 {
    public static void main(String[] args) { // จุดเริ่มต้นโปรแกรม

        Eatable pork = new Pork(); // สร้าง Pork มองเป็น Eatable
        Eatable Pineapple = new Pineapple(); // สร้าง Pineapple มองเป็น Eatable

        pork.eat(); // เรียก eat() ของ Pork → "I am yummy. Cook me well!"
        Pineapple.eat(); // เรียก eat() ของ Pineapple → "I am yummy. Eat me fresh."
    }
}