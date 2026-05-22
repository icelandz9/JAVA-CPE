package Final_Exam.Final_CODE.Final_1.code2;

public class Rectangle extends Shape implements Computable {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        super("Rectangle");
        this.width = width;
        this.height = height;
    }

    public String getDescription() {
        return "I am a rectangle with width " + width + " and height " + height;
    }

    public double getArea() {
        return width * height;
    }

    public double getVolume() {
        return 0; // 2D shapes have 0 volume
    }
}
