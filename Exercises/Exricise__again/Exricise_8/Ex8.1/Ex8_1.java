public class Ex8_1 {
    public static void main(String[] args) {

        Fish fish = new Fish(0.3); // สร้างปลาทั่วไป น้ำหนัก 0.3 kg
        System.out.print(fish); // เรียก toString() → "I am a 0.3 kg fish."
        fish.swim(); // → "All fish swim."

        Fish shark = new Shark(200); // สร้างฉลาม น้ำหนัก 200 kg
        System.out.print(shark); // → "I am a 200.0 kg shark."
        shark.swim(); // ไม่มี swim() ของตัวเอง → ใช้ของ Fish → "All fish swim."

        Fish mFish = new MechanicalFish(1.2); // สร้างปลา น้ำหนัก 1.2 kg
        System.out.print(mFish); // → "I am a 1.2 kg mechanical fish."
        mFish.swim(); // → "I float in water."

        Fish sdFish = new SaltedDriedFish(2.5); // สร้างปลาเค็ม น้ำหนัก 2.5 kg
        System.out.print(sdFish); // → "I am a 2.5 kg salted dried fish."
        sdFish.swim(); // → "I am dead and I no longer swim."
    }
}