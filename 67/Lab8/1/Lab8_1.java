public class Lab8_1 {
  public static void main(String[] args) {
    Fish fish = new Fish(0.3);
    System.out.print(fish);
    fish.swim();
    
    Fish shark = new Shark(200);
    System.out.print(shark);
    shark.swim();
    
    Fish mFish = new MechanicalFish(1.2);
    System.out.print(mFish);
    mFish.swim();
    
    Fish sdFish = new SaltedDriedFish(2.5);
    System.out.print(sdFish);
    sdFish.swim();
  }
}