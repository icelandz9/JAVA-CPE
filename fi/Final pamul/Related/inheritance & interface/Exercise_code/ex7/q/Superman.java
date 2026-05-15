public class Superman extends SuperHero{
  private String power;
  
  public Superman(){
    super("Super Hero");
    this.power = "I can fly";
  }
  public Superman(String n, String power){
    super(n);
    this.power = power;
  }
  public String toString(){
    return super.toString()+". "+this.power+".";
  }
}