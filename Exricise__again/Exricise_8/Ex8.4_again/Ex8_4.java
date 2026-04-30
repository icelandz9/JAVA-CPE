public class Ex8_4 {
    public static void main(String[] args) {
        Eatable pork = new Pork();
        Eatable pineapple = new Pineapple();
        Eatable pork_not_eat = new Pork();

        pork.eat();
        pineapple.eat();
        pork_not_eat.not_eat();

    }
}
