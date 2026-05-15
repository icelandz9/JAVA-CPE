package Quiz.Quiz_monkey.Quiz7.Q07_442_01;

public class Spiderman extends SuperHero {
  private int age;
  private String power;

  public Spiderman(String n, int age, String power) {
    super(n);
    this.age = age;
    this.power = power;
  }

  public String toString() {
    return super.getHeroName() + ". I am " + this.age + " years old. " + this.power + ".";
  }
}