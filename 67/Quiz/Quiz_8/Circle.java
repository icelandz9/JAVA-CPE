public class Circle extends ClosedFigure{
  private double radius;
  public Circle(double radius) {
    this.radius = radius;
  }
  public Circle() {
  }
  public Circle(double radius, String color) {
    super(color);
    this.radius = radius;
  }
  public double getDiameter() {
    return radius*radius;
  }
  public double getParameter() {
    final double PI = Math.PI;
    return 2*PI*radius;
  }
  public double getArea() {
    final double PI = Math.PI;
    return PI*radius*radius;
  }
  public String toString() {
    return "(radius,diameter,area,perimeter, color) = ("+getRadius()+","+getDiameter()+","+getArea()+","+getParameter()+","+getColor()+")";
  }
  public double getRadius() {
    return radius;
  }
}