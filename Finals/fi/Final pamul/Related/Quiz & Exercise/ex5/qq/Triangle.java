public class Triangle {
  private static final double lenght = 5;
  private double side1;
  private double side2;
  private double side3;
  
  public Triangle(){
    this.side1 = 2;
    this.side2 = 2;
    this.side3 = 2;
  }
  public Triangle(double s1){
    this.side1 = s1;
    this.side2 = 2;
    this.side3 = 2;
  }
  public Triangle(double s1, double s2){
    this.side1 = s1;
    this.side2 = s2;
    this.side3 = 2;
  }
  public Triangle(double s1, double s2, double s3){
    this.side1 = s1;
    this.side2 = s2;
    this.side3 = s3;
  }
   public double getPerimeter(){
    double perimeter = side1+side2+side3;
    return perimeter;
  }
  public double getTriangleVolume(){
    double volume = getTriangleArea()*lenght;
    return volume;
  }
  public double getTriangleSurfaceArea(){
    double surfacearea = ((side1+side2+side3)/side1)*lenght;
    return surfacearea;
  }
  public double getTriangleArea(){
    double s = (side1 + side2 + side3)/2;
    return Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
  }
  public void printTriangle(){
    System.out.println("All parameter of this triangle");
    System.out.println("Triangle Area = "+getTriangleArea());
    System.out.println("Triangle Surface = "+getTriangleSurfaceArea());
    System.out.println("Triangle volume =  "+getTriangleVolume());
    System.out.println("Triangle Perimeter =  "+getPerimeter()+"\n");
   }
}
    
    
  
  