public abstract class ClosedFigure
{
  private String color;
  public ClosedFigure(String color){
    this.color=color;
  }
  public ClosedFigure(){
    this.color="White";
  }
  public abstract double getArea();
  public abstract double getPerimeter();
  public String getColor(){
    return color;
  }
  public void setColor(String color){
    this.color = color;
  }
}
class Circle extends ClosedFigure
{
  private double radius;
  public Circle(double radius,String color){
    super(color);
    this.radius=radius;
  }
  public Circle(double radius) {
    this.radius = radius;
  }
  public Circle() {
    this.radius = 1;
  }
  public double getArea(){
    return Math.PI*Math.pow(this.radius,2);
  }
  public double getPerimeter(){
    return 2*Math.PI*this.radius;
  }
  public double getRadius(){
    return this.radius;
  }
  public double getDiameter(){
    return 2*this.radius;
  }
  public String toString(){
   return "(radius,diameter,area,perameter,color)=("+getRadius()+","
     +getDiameter()+","+getArea()+","+getPerimeter()+","+super.getColor()+")"; 
  }
}
class Rectangle extends ClosedFigure
{
  private double width;
  private double length;
  public Rectangle(double width,double length){
    this.width=width;
    this.length=length;
  }
  public Rectangle(double width,double length,String color){
    super(color);
    this.width=width;
    this.length=length;
  }
  public Rectangle(){
     super();
     this.width=1;
     this.length=1;
  }
  public double getWidth(){
    return this.width;
  }
  public double getLength(){
    return this.length;
  }
  public double getArea(){
    return this.width*this.length;
  }
  public double getPerimeter(){
    return (2*this.length)+(2*this.width);
  }
  public String toString(){
    return "(width,length,area,perimeter,color)=("+getWidth()+","+getLength()+","
      +getArea()+","+getPerimeter()+","+super.getColor()+")";
  }
}