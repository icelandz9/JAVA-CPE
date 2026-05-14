class Circle extends ClosedFigure{
  private double radius;
  public Circle(double radius , String color){
    super(color);
    this.radius = radius;
  }
  public Circle(double radius){
    this.radius = radius;
  }
  public Circle(){
    super();
    radius = 1;
  }
  public double getArea(){
    return 3.14 * (radius * radius);
  }
  public double getPerimeter(){
    return 2 * 3.14 * radius;
  }
  public double getRadius(){
    return radius;
  }
  public double getDiameter(){
    return 2 * radius;
  }
  public String toString(){
    return ("(radius, diameter, area, perimeter, color) = ( " + getRadius() + "," + getDiameter() + "," + getArea() + "," + getPerimeter() + "," + getColor() + ")");
  }
}

class Rectangle extends ClosedFigure{
  private double width;
  private double length;
  public Rectangle(double width , double length){
    this.width = width;
    this.length = length;
  }
  public Rectangle(double width , double length ,String color){
    super(color);
    this.width = width;
    this.length = length;
  }
  public Rectangle(){
    this.width = 1;
    this.length = 1;
  }
  public double getWidth(){
    return width;
  }
  public double getLength(){
    return length;
  }
  public double getArea(){
    return (width*length);
  }
  public double getPerimeter(){
    return (width*2) + (length*2);
  }
  public String toString(){
    return ("(width, length, area, perimeter, color) = ( " + getWidth() + "," + getLength() + "," + getArea() + "," + getPerimeter() + "," + getColor() + ")");
  }
  
}