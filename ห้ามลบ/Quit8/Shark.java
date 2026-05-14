class Shark extends Fish{
  public Shark(double weight){
    super(weight);
  }
  public String toString(){
    return ("I am a " + super.getWeight() + " kg shark.");
  }
}

class MechanicalFish extends Fish{
  public MechanicalFish(double weight){
    super(weight);
  }
  public void swim(){
    System.out.println("I float in water.");
  }
  public String toString(){
    return ("I am a " + super.getWeight() + "kg mechanical fish.");
  }
}
class SaltedDriedFish extends Fish{
  public SaltedDriedFish(double weight){
    super(weight);
  }
  public void swim(){
    System.out.println("I am dead and I no longer swim.");
  }
  public String toString(){
    return ("I am a " + super.getWeight() + "kg salted dried fish.");
  }
}
