public class Fish{
  private double weight;
  
  public Fish(double weight) {
    this.weight = weight;
  }
  
  public void swim() {
    System.out.println(" All fish swim.");
  }
  
  public double getWeight() {
    return weight;
  }
  
  public String toString() {
    return "I am a "+getWeight()+" kg fish.";
  }
  
}