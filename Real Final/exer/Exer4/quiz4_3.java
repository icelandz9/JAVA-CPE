public class quiz4_3{
  public static void main(String[] args){
    double sphere = calSurface(9.0,2.0,6.0),circularcone = calSurface(3.0),rectanglebox = calSurface(5.0,4.0);
    System.out.print("Sphere is "+sphere+"\nCircular cone is "+circularcone+"\nRectangle box is "+rectanglebox); 
  }
  public static double calSurface(double w,double h,double l)
  {
    return (2*l*w)+(2*w*h)+(2*h*l);
  }
  public static double calSurface(double r)
  {
    return 4*Math.PI*Math.pow(r,2);
  }
  public static double calSurface(double r, double h)
  {
    return Math.pow((Math.pow(r,2)*Math.pow(h,2)),0.5);
  }
  
}