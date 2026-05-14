public class Circular_Ring{
  public static void main(String[] args){
    double AreaCylinder = calArea(9.0,2.0),AreaCirclering = calArea(3,7),AreaCircle = calArea(4.0);
    System.out.print("Area Cylinder is "+AreaCylinder+"\nArea Circle ring is "+AreaCirclering+"\nArea Circle is "+AreaCircle); 
  }
  public static double calArea(double r,double h)
  {
    return (2*Math.PI*r)*(r+h);
  }
  public static double calArea(double R,int r)
  {
    return Math.PI*(Math.pow(R,2)-Math.pow(r,2));
  }
  public static double calArea(double r)
  {
    return (Math.PI*Math.pow(r,2));
  }
  
}