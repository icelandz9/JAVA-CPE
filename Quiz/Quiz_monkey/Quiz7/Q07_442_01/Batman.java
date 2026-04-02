public class Batman extends SuperHero {
  private String power;

  public Batman() {
    this.power = "I am rich.";
  }

  public Batman(String n, String power) {
    super(n);
    this.power = power;
  }

  public String toString() {
    return super.getHeroName() + ". " + this.power;
  }
}