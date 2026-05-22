public class Circle {
  public static final double CirclePi = 3.14;
  private double r;
  //contructor
  public Circle(double radius){
    this.r = radius;
  }
  public double getArea(){
    double area = CirclePi*r*r;
    return area;
  }
  public double getVolume(){
    double volume = CirclePi*r*r*r*(4/3);
    return volume;
  }
  public double getCircumference(){
    double circumference = CirclePi*r*2;
    return circumference;
  }
}