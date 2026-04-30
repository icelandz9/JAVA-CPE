public class Quiz9_1 {
  public static void main(String[] agrs) {
    Banana ba = new Banana();
    Coconut co = new Coconut();
    Orange or = new Orange();
    Frog fr = new Frog();
    Penguin pe = new Penguin();
    Pig pi = new Pig();
    Fruit frr = new Fruit();
    System.out.println(ba.howToEat());
    System.out.println(or.howToEat());
    System.out.println(co.howToEat());
    System.out.println(fr.howToSleep());
    System.out.println(pe.howToSleep());
    System.out.println(pi.howToSleep());
    System.out.println(pe.howToSwim());
    System.out.println(fr.howToSwim());
    System.out.println(pi.howToEat());
    System.out.println(frr.howToEat());
    System.out.println(pe.sound());
    System.out.println(fr.sound());
    System.out.println(pi.sound());
  }
}