package Quiz.Quiz_Graymatter.Exam9;

public class circle extends CloseFigure {
    private double radius;

    public circle(double radius, String color) {
        super(color); // ���¡ constructor �ҡ�������
        this.radius = radius;
    }

    public circle(double radius) {
        super();
        this.radius = radius;
    }

    public circle() {
        super();
        this.radius = 1;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getDiameter() {
        return 2 * radius;
    }

    public String toString() {
        return String.format("(radius,diameter,area,perimeter,color)=(%.1f,%.1f,%.3f,%.3f,%s)",
                getRadius(), getDiameter(), getArea(), getPerimeter(), getColor());
    }

}
