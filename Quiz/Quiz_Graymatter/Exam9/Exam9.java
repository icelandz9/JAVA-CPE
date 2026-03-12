package Quiz.Quiz_Graymatter.Exam9;

public class Exam9 {
    public static void main(String[] args) {
        Penguin p = new Penguin();
        Frog f = new Frog();
        Pig pig = new Pig();
        Fruit F = new Fruit();
        Coconut c = new Coconut();
        Banana b = new Banana();
        Orange o = new Orange();

        System.out.println(pig.sound());
        System.out.println(p.sound());
        System.out.println(f.sound());

        System.out.println(p.howToSwim());
        System.out.println(f.howToSwim());

        System.out.println(p.howToSleep());
        System.out.println(f.howToSleep());
        System.out.println(pig.howToSleep());

        System.out.println(pig.howToEat());
        System.out.println(F.howToEat());
        System.out.println(c.howToEat());
        System.out.println(o.howToEat());
        System.out.println(b.howToEat());
    }
}
