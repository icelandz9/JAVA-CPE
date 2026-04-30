public class CircularCone {
  private static final double Pi = 3.14;
  private double side;
  private double radius;
  private double height;
  
  public CircularCone(double r, double h) {
    this.radius = r;
    this.height = h;
  }
  
  public CircularCone() {
    this.radius = 3;
    this.height = 6;
    this.side = Math.sqrt((radius*radius)+(height*height));
  }
  
  public CircularCone(double r) {
    this.radius = r;
    this.height = 6;
  }
  
  public double getCircularConeBaseArea() {
    return Pi*radius*radius;
  }
  
  public double getCircularConeVolume() {
    return (1.0/3.0)*Pi*(radius*radius)*height;
  }
  
  public void printCircularCone() {
    System.out.println("\nAll parameters of this Circular Cone");
    System.out.println("Conr Base Area = "+getCircularConeBaseArea()+" cm2");
    System.out.println("Conr Base Circumference = "+getCircularConeBaseCircumference()+" cm2");
    System.out.println("Conr Base Surface Area = "+getCircularConeSurfaceArea()+" cm2");
    System.out.println("Conr Base Volume = "+getCircularConeVolume()+" cm2");
  }
  
  public double getCircularConeBaseCircumference() {
    return Math.sqrt((radius*radius)+(height*height));
  }
  
  public double getCircularConeSurfaceArea() {
    return Pi*(radius*radius)+(Pi*radius*side);
  }
  
}