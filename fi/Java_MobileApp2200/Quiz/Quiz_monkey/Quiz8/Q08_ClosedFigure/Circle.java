package Quiz.Quiz_monkey.Quiz8.Q08_ClosedFigure;

/**
 * คลาสลูก (Subclass) สืบทอดจาก ClosedFigure
 */
public class Circle extends ClosedFigure {
    private double radius;

    /**
     * Default Constructor
     */
    public Circle() {
        super();
        this.radius = 1.0;
    }

    /**
     * Constructor รับ 1 พารามิเตอร์ (รัศมี)
     */
    public Circle(double radius) {
        super();
        this.radius = radius;
    }

    /**
     * Constructor รับ 2 พารามิเตอร์ (รัศมี และ สี)
     */
    public Circle(double radius, String color) {
        super(color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getDiameter() {
        return 2 * radius;
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
        // (radius, diameter, area, perimeter, color)
        return String.format("(%.1f, %.1f, %.4f, %.3f, %s)", 
            radius, getDiameter(), getArea(), getPerimeter(), getColor());
    }
}
