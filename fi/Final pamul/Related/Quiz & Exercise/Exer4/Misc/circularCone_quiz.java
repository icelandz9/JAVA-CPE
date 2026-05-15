import java.util.Scanner;
public class circularCone_quiz {
  public static void main(String[] args) { 
   double radiusIn,radiusOut,heighOut,heighIn;
   double diff,height;
   Scanner sn = new Scanner(System.in);
   System.out.println("Enter inner radius :");
   radiusIn = sn.nextDouble();
   System.out.println("Enter outer radius :");
   radiusOut = sn.nextDouble();
   System.out.println("Enter inner height :");
   heighIn = sn.nextDouble();
   System.out.println("Enter outer height :");
   heighOut = sn.nextDouble();
   diff = circularConeVolumeDif(radiusIn,radiusOut,heighOut,heighIn);
   System.out.println("The different value of 2 Circular Cones is:"+diff);
  }

  public static double circularConeVolumeDif(double radiusIn,double radiusOut,double heighOut,double heighIn)
  { 
    double diff;
    double heigh;
    diff = radiusOut *radiusIn;
    heigh = heighOut - heighIn;
    return (1.0/3.0)*Math.PI*diff*heigh ;
 }
}