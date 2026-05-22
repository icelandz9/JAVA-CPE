package Quiz.Quiz_monkey.Quiz9;

/**
 * Quiz 9: Interface (Edible)
 */
interface Edible {
    String howToEat();
}

/**
 * คลาส Animal (Abstract)
 */
abstract class Animal {
    public abstract String sound();
}

/**
 * คลาส Fruit สืบทอดจาก Edible
 */
abstract class Fruit implements Edible {
    // ผลไม้ทุกชนิดถือว่ากินได้
}

class Orange extends Fruit {
    @Override
    public String howToEat() {
        return "Orange: Make Orange juice";
    }
}

class Banana extends Fruit {
    @Override
    public String howToEat() {
        return "Banana: Make Healthy Banana Smoothie";
    }
}

class Coconut extends Fruit {
    @Override
    public String howToEat() {
        return "Coconut: Refreshing with ice coconut water";
    }
}

class Pig extends Animal implements Edible {
    @Override
    public String sound() {
        return "Pig: Oink Oink";
    }

    @Override
    public String howToEat() {
        return "Pig: Grill or Fry it";
    }
}

class Penguin extends Animal {
    @Override
    public String sound() {
        return "Penguin: Honk Honk";
    }
    // เพนกวินไม่ถูกระบุให้กินได้ในโจทย์นี้
}

class Frog extends Animal implements Edible {
    @Override
    public String sound() {
        return "Frog: Ribbit Ribbit";
    }

    @Override
    public String howToEat() {
        return "Frog: May rest more throughout the day when the sun is hot"; // ตามที่โจทย์ระบุ แม้จะไม่เกี่ยวกับการกิน
    }
}
