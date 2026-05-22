package Quiz.Quiz_monkey.Quiz5;

public class CircularCone {
  private static final double Pi = 3.14;
  private double radius;
  private double height;
  private double side;

  public CircularCone() {
    this.radius = 1;
    this.height = 3;
    this.side = 1;
  }

  public CircularCone(double r) {
    this.radius = r;
    this.height = 3;
    this.side = 1;
  }

  public CircularCone(double r, double h) {
    this.radius = r;
    this.height = h;
    this.side = 1;
  }

  public double getCircularConeSurfaceArea() {
    double circularconesurfacearea = Pi * radius * (radius + Math.sqrt((height * height) + (radius * radius)));
    return circularconesurfacearea;
  }

  public double getCircularConeBaseArea() {
    double circularconebasearea = Pi * radius * radius;
    return circularconebasearea;
  }

  public double getCircularConeBaseCircumference() {
    double circularconebasecircumference = 2 * Pi * radius;
    return circularconebasecircumference;
  }

  public double getCircularConeVolume() {
    double circularconevolume = (Pi * radius * radius * height) / 3;
    return circularconevolume;
  }

  public void printCircularCone() {
    System.out.println("\nAll parameters of this Circular Cone");
    System.out.println("Circular Cone Base Area = " + getCircularConeBaseArea() + " cm2");
    System.out.println("Circular Cone Base Circumference= " + getCircularConeBaseCircumference() + " cm");
    System.out.println("Circular Cone Surface Area = " + getCircularConeSurfaceArea() + " cm2");
    System.out.println("Circular Cone Volume = " + getCircularConeVolume() + " cm3");
  }
}
