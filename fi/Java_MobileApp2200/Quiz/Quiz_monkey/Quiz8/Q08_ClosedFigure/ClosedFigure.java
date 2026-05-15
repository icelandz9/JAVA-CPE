package Quiz.Quiz_monkey.Quiz8.Q08_ClosedFigure;

/**
 * Superclass (คลาสแม่) ของรูปทรงปิด
 */
public class ClosedFigure {
    private String color;

    /**
     * Default Constructor
     */
    public ClosedFigure() {
        this.color = "White";
    }

    /**
     * Parameterized Constructor
     */
    public ClosedFigure(String color) {
        this.color = color;
    }

    // getters / setters
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Method ที่ถูก Override ในคลาสลูก
     */
    public double getArea() {
        return 0.0;
    }

    public double getPerimeter() {
        return 0.0;
    }
}
