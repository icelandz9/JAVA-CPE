package Quiz.Quiz_Graymatter.Final.Final63.Final63_5;

public class OffRoad extends Car {
    public OffRoad(String model, String make, int year, int seat, int door) {
        super(model, make, year, seat, door);
    }

    @Override
    public String toString() {
        return make + ", " + model + ", " + year + ", seating: " + seats + ", " + getDoors() + " doors.";
    }
}
