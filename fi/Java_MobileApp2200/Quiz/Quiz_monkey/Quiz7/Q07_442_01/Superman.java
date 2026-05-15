package Quiz.Quiz_monkey.Quiz7.Q07_442_01;

public class Superman extends SuperHero {
  private String power;

  public Superman() {
    this.power = "I can fly.";
  }

  public Superman(String n, String power) {
    super(n);
    this.power = power;
  }

  public String toString() {
    return super.getHeroName() + ". " + this.power;
  }
}