public class Fish
{
  private double weight;
  public Fish(double weight){
    this.weight = weight;
  }
  public void swim(){
    System.out.println("All fish swim");
  }
  public double getWeight(){
    return weight;
  }
  public String toString(){
    return "I am "+getWeight()+" kg shark.";
  }
}
class Shark extends Fish
{
  public Shark(double weight){
    super(weight);
  }
  public String toString(){
    return "I am "+super.getWeight()+" kg fish.";
  }
}
class SaltedDriedFish extends Fish
{
  public SaltedDriedFish(double weight){
   super(weight); 
  }
  public void swim(){
    System.out.println("I'm dead and no longer to swim.");
  }
    public String toString(){
    return "I am "+super.getWeight()+" kg salted dried fish.";
  }
}
class MechanicalFish extends Fish{
  public MechanicalFish (double weight){
    super(weight);
  }
    public void swim(){
    System.out.println("I float in the water.");
  }
    public String toString(){
    return "I am "+super.getWeight()+" kg mechanical fish.";
  }
}