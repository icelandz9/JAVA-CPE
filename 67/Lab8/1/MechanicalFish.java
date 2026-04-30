public class MechanicalFish extends Fish {
  public MechanicalFish(double weight) {
    super(weight);
  }
  
  public void swim() {
    System.out.println(" I float in water.");
  }
  
  public String toString() {
    return "I am a "+getWeight()+" kg mechanical fish.";
  }
}