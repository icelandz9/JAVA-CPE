package Quiz.Quiz_monkey.Quiz9;

/**
 * Quiz 9: Interface (Passenger)
 */
interface Passenger {
    String howToPayMoney();
}

/**
 * คลาส Vehicle (Abstract)
 */
abstract class Vehicle {
    protected int speed;
    protected int gear;

    public Vehicle() {
        this.speed = 0;
        this.gear = 0;
    }

    public abstract void changeGear(int a);
    public abstract void speedUp(int a);
    public abstract void applyBrakes(int a);
}

class Bike extends Vehicle implements Passenger {
    @Override
    public void changeGear(int a) {
        this.gear = a;
    }

    @Override
    public void speedUp(int a) {
        this.speed += a;
    }

    @Override
    public void applyBrakes(int a) {
        this.speed -= a;
    }

    @Override
    public String howToPayMoney() {
        return "Bike: Pay by cash directly.";
    }

    public void printStates() {
        System.out.println("Bike speed: " + speed + " gear: " + gear);
    }
}

class Taxi extends Vehicle implements Passenger {
    @Override
    public void changeGear(int a) {
        this.gear = a;
    }

    @Override
    public void speedUp(int a) {
        this.speed += a;
    }

    @Override
    public void applyBrakes(int a) {
        this.speed -= a;
    }

    @Override
    public String howToPayMoney() {
        return "Taxi: Check the distance and cost from the meter, Pay money.";
    }

    public void printStates() {
        System.out.println("Taxi speed: " + speed + " gear: " + gear);
    }
}

public class Q09_VehicleTest {
    public static void main(String[] args) {
        Bike b = new Bike();
        b.changeGear(2);
        b.speedUp(3);
        b.applyBrakes(1);
        b.printStates();
        System.out.println(b.howToPayMoney());

        Taxi t = new Taxi();
        t.changeGear(1);
        t.speedUp(2);
        t.applyBrakes(3);
        t.printStates();
        System.out.println(t.howToPayMoney());
    }
}
