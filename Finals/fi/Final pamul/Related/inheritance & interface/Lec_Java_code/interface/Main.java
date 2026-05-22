interface flyable {
    void fly();
}

class Duck implements flyable {
    @Override
    public void fly() {
        System.out.println("I am a duck. I am flying with wings.");
    }
}

class Plane implements flyable {
    @Override
    public void fly() {
        System.out.println("I am a plane. I am flying with fuels.");
    }
}

public class Main {
    public static void main(String[] args) {
        Duck duck = new Duck();
        Plane plane = new Plane();

        duck.fly();
        plane.fly();
    }
}
