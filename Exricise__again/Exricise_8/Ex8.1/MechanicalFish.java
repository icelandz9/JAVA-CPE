public class MechanicalFish extends Fish { // สืบทอดจาก Fish

    public MechanicalFish(double weight) {
        super(weight); // เรียก constructor ของ Fish
    }

    @Override
    public void swim() { // override swim() ใหม่
        System.out.println("I float in water."); // ปลากล ลอยน้ำได้ ไม่ได้ว่ายจริงๆ
    }

    @Override
    public String toString() {
        return "I am a " + getWeight() + " kg mechanical fish. "; // บอกว่าเป็นปลากล
    }
}