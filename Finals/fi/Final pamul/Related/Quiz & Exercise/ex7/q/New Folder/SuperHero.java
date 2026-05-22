public class SuperHero{
  private String heroName;
  
  public SuperHero(){
    this.heroName = "I am Super Hero";
  }
  public SuperHero(String n){
    this.heroName = "I am "+n;
  }
  public String getHeroName(){
    return heroName;
  }
  public String toString(){
    return heroName+ ". I have special power .";
  }
}