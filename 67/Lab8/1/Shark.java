public class Shark extends Fish {
  public Shark(double weight) {
    super(weight);
  }
  
  public String toString() {
    return "I am a "+getWeight()+" kg shark.";
  }
}