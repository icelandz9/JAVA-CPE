public class testquiz09
{
  public static void main(String[] agrs)
  {
    Banana b = new Banana();
    Orange o = new Orange();
    Coconut c = new Coconut();
    Frog f = new Frog();
    Penguin p = new Penguin();
    Pig pig = new Pig();
    Fruit fr = new Fruit();
    System.out.println(b.howToEat());
    System.out.println(o.howToEat());
    System.out.println(c.howToEat());
    System.out.println(f.howToSleep());
    System.out.println(p.howToSleep());
    System.out.println(pig.howToSleep());
    System.out.println(f.howToSwim());
    System.out.println(p.howToSwim());
    System.out.println(pig.howToEat());
    System.out.println(fr.howToEat());
    System.out.println(p.sound());
    System.out.println(f.sound());
    System.out.println(pig.sound());
    
  }
}