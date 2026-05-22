package quiz81;

public class ClosedFigure {
    private String color;

    public ClosedFigure(String color) {
        this.color = color;
    }

    public ClosedFigure() {
        this.color = "White";
    }

    public double getArea() {
        return 0;
    }

    public double getPerimeter() {
        return 0;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
