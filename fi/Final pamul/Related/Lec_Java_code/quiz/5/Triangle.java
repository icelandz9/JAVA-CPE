public class Triangle
{
  private static double length = 5; 
  private double side1;
  private double side2;
  private double side3;
  public Triangle()
  {
    side1=2;//base
    side2=2;
    side3=2;
  }
  public Triangle(double s1)
  {
    this.side1=s1;
    this.side2=2;
    this.side3=2;
  }
  public Triangle(double s1,double s2)
  {
    this.side1=s1;
    this.side2=s2;
    this.side3=2;
  }
  public Triangle(double s1,double s2,double s3)
  {
    this.side1=s1;
    this.side2=s2;
    this.side3=s3;
  }
  public double getTrianglePerimeter()
  {
    return side1+side2+side3;
  }
  public double getTriangleVolume()
  {
    double s=(side1+side2+side3)/2.0;
    return (Math.sqrt(s*(s-side1)*(s-side2)*(s-side3)))*length;
  }
   public double getTriangleSurfaceArea()
  {
    return 2*getTriangleArea()+((side1+side2+side3)*length);
  }
  public double getTriangleArea()
  {
    double heigth = Math.sqrt((Math.pow(side3,2))-(Math.pow(((side1)/2.0),2)));
    return (1.0/2.0)*side1*heigth;
  }
  public void printTriangle()
  {
    System.out.println("All perameter of This Triangle");
    System.out.print("Triangle Area = "+getTriangleArea()+" cm2\t");
    System.out.println("Triangle Surface Area = "+getTriangleSurfaceArea()+" cm2");
    System.out.print("Triangle Volume = "+getTriangleVolume()+" cm3\t");
    System.out.println("Triangle Perimeter = "+getTrianglePerimeter()+" cm");
  }
 
  
}