package quiz81;

public class Circle extends ClosedFigure {
    private double radius;

    public Circle(double radius, String color) {
        super(color);
        this.radius = radius;
    }

    public Circle(double radius) {
        super();
        this.radius = radius;
    }

    public Circle() {
        super();
        this.radius = 1.0;
    }

    public double getRadius() {
        return radius;
    }

    public double getDiameter() {
        return radius * 2;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return String.format(
                "(radius, diameter, area, perimeter, color) = (%.1f, %.1f, %.4f, %.3f, %s)",
                radius, getDiameter(), getArea(), getPerimeter(), getColor());
    }
}