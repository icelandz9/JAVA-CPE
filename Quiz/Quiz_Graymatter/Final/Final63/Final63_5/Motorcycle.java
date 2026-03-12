package Quiz.Quiz_Graymatter.Final.Final63.Final63_5;

public class Motorcycle extends MotorVehicle {
    private String engineType;

    public Motorcycle(String model, String make, int year, int seat, String engineType) {
        super(model, make, year, seat);
        this.engineType = engineType;
    }

    public String getEngineType() {
        return engineType;
    }

    @Override
    public String toString() {
        return make + ", " + model + ", seating: " + seats +
                ", engine type: " + engineType + ".";
    }
}
