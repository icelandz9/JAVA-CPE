package Final_Exam.Final_CODE.Final_1.code2;

public class Sphere extends Shape implements Computable {
    private double radius;

    public Sphere(double radius) {
        super("Sphere");
        this.radius = radius;
    }

    @Override
    public String getDescription() {
        return "I am a sphere with radius " + radius;
    }

    @Override
    public double getArea() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double getVolume() {
        return (4.0/3.0) * Math.PI * Math.pow(radius, 3);
    }
}
