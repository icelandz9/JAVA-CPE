package quiz81;

public class Rectangle extends ClosedFigure {
    private double width;
    private double length;

    public Rectangle(double width, double length, String color) {
        super(color);
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length) {
        super();
        this.width = width;
        this.length = length;
    }

    public Rectangle() {
        super();
        this.width = 1.0;
        this.length = 1.0;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + length);
    }

    @Override
    public String toString() {
        return String.format(
                "(width, length, area, perimeter, color) = (%.1f, %.1f, %.1f, %.1f, %s)",
                width, length, getArea(), getPerimeter(), getColor());
    }
}