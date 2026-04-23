//Fish
//Shark , MechanicalFish , SaltedDriedFish

public class Ex8_1{
    public static void main(String[] args) {
        Fish fish = new Fish(0.3);
        System.out.println(fish);
        fish.swim();

        Fish shark = new Shark(200);
        System.out.println(shark);
        shark.swim();

        Fish mFish = new MechanicalFish(1.2);
        System.out.println(mFish);
        mFish.swim();

        Fish sdFish = new SaltedDriedFish(2.5);
        System.out.println(sdFish);
        sdFish.swim();
    }    
}
