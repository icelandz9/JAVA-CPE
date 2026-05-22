package Quiz.Quiz_monkey.Quiz8.Q08_ClosedFigure;

/**
 * คลาสลูก (Subclass) สืบทอดจาก ClosedFigure
 */
public class Rectangle extends ClosedFigure {
    private double width;
    private double length;

    /**
     * Default Constructor
     */
    public Rectangle() {
        super();
        this.width = 1.0;
        this.length = 1.0;
    }

    /**
     * Constructor รับ 2 พารามิเตอร์ (กว้าง, ยาว)
     */
    public Rectangle(double width, double length) {
        super();
        this.width = width;
        this.length = length;
    }

    /**
     * Constructor รับ 3 พารามิเตอร์ (กว้าง, ยาว, สี)
     */
    public Rectangle(double width, double length, String color) {
        super(color);
        this.width = width;
        this.length = length;
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
        // (width, length, area, perimeter, color)
        return String.format("(%.1f, %.1f, %.1f, %.1f, %s)", 
            width, length, getArea(), getPerimeter(), getColor());
    }
}
