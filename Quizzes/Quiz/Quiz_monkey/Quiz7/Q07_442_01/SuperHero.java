package Quiz.Quiz_monkey.Quiz7.Q07_442_01;

public class SuperHero {
  private String heroName;

  public SuperHero() {
    this.heroName = "I am Super Hero";
  }

  public SuperHero(String n) {
    this.heroName = "I am " + n;
  }

  public String getHeroName() {
    return heroName;
  }

  public String toString() {
    return heroName + ". I have special power .";
  }
}