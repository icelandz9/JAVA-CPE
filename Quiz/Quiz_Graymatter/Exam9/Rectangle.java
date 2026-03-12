package Quiz.Quiz_Graymatter.Exam9;

public class Rectangle extends CloseFigure {
    private double width;
    private double length;

    public Rectangle(double width, double length) {
        super(); //
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color) {
        super(color);
        this.width = width;
        this.length = length;
    }

    public Rectangle() {
        super();
        this.width = 1;
        this.length = 1;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public double getArea() {
        return width * length;
    }

    public double getPerimeter() {
        return 2 * (width + length);
    }

    public String toString() {
        return String.format("(width,length,area,perimeter,color) = (%.1f,%.1f,%.3f,%.3f,%s)",
                getWidth(), getLength(), getArea(), getPerimeter(), getColor());
    }

}
