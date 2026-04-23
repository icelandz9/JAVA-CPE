public class SaltedDriedFish extends Fish { // สืบทอดจาก Fish

    public SaltedDriedFish(double weight) {
        super(weight); // เรียก constructor ของ Fish
    }

    @Override
    public void swim() { // override swim() ใหม่
        System.out.println("I am dead and I no longer swim."); // ปลาเค็มตายแล้ว ว่ายไม่ได้
    }

    @Override
    public String toString() {
        return "I am a " + getWeight() + " kg salted dried fish. "; // บอกว่าเป็นปลาเค็ม
    }
}