package Quiz.Quiz_Graymatter.Final.Final63.Final63_5;

public class Car extends MotorVehicle {
    private int doors;

    public Car(String model, String make, int year, int seat, int door) {
        super(model, make, year, seat);
        this.doors = door;
    }

    public int getDoors() {
        return doors;
    }

    @Override
    public String toString() {
        return make + ", " + model + ", " + year + ", seating: " + seats + ", " + doors + " doors.";
    }
}
