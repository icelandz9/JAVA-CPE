public class SaltedDriedFish extends Fish {
  public SaltedDriedFish(double weight) {
    super(weight);
  }
  
  public void swim() {
    System.out.println(" I am dead and I no longer swim.");
  }
  
  public String toString() {
    return "I am a "+getWeight()+" kg salted dried fish.";
  }
}