public class SuperHero{
  private String heroName;
  
  public Superhero(){
     this.heroName = "I am Super Hero";
  }
  public Superhero(String n){
     this.heroName = "I am "+n;
  }
  public String setHeroName(){
    return this.heroName;
  }
  public String toString(){
    return this.heroName+ ". I have special power .";
  }
}