public class Quiz_8 {
    public static void main(String[] args) {
        Edible[] eatlist = { new Banana(), new Orange(), new Coconut(), new Pig() };
        Animal[] animals = { new Frog(), new Penguin(), new Pig() };
        Swimmable[] swimmables = { new Frog(), new Penguin() };

        for (Edible e : eatlist) {
            System.out.println(e.howToEat());
        }

        for (Animal a : animals) {
            System.out.println(a.sound());
            System.out.println(a.howToSleep());
        }

        for (Swimmable s : swimmables) {
            System.out.println(s.howToSwim());
        }
    }
}