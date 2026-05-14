class Fish{
  public static void main(String[] args){
    Fish fish = new Fish(0.3);
    System.out.print(fish);
    fish.swim();
    Fish shark = new Fish(200);
    System.out.print(shark);
    shark.swim();
    Fish mfish = new Fish(1.2);
    System.out.print(mfish);
    mfish.swim();
    Fish sdfish = new Fish(2.5);
    System.out.print(sdfish);
    sdfish.swim();
    
  }
  private double weight;
  public Fish(double weight){
    this.weight = weight;
  }
  public void swim(){
    System.out.println("All fish swim.");
  }
  public double getWeight(){
    return weight;
  }
  public String toString(){
    return ("I am a " + getWeight() + " kg fish.");
  }
}