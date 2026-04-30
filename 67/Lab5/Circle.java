public class Circle {
  final double Pi = Math.PI;
  private double r; 
  
  public Circle(double radius) {
    this.r = radius;
  }
  
  public double getArea() {
    
    return Pi*r*r;
  }
  
  public double getVolume() {
    return (4.0/3.0)*Pi*Math.pow(r,3);

  }
  
  public double getCircumference() {
    return 2.0*Pi*r;

  }
}