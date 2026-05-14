import java.util.Scanner;
public class Sphere_quiz {
  public static void main(String[] args) { 
   double radiusOut,radiusIn;
   double diff;
   Scanner sn = new Scanner(System.in);
   System.out.println("Enter inner radius :");
   radiusIn = sn.nextDouble();
   System.out.println("Enter outer radius:");
   radiusOut = sn.nextDouble();
   diff = sphereVolumeDif(radiusOut,radiusIn);
   System.out.println("The different value of 2 cylinder volume is:"+diff);
  }

  public static double sphereVolumeDif(double radiusOut,double radiusIn)
  { 
    double diff;
    diff = radiusOut-radiusIn;
    return (4/3)*Math.PI*Math.pow(diff,3);
 }
}