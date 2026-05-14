import java.util.Scanner;
public class Cylinder_quiz {
  public static void main(String[] args) { 
   double radius1,radius2,heigh;
   double diff;
   Scanner sn = new Scanner(System.in);
   System.out.println("Enter radius of volume 1:");
   radius1 = sn.nextDouble();
   System.out.println("Enter radius of volume 2:");
   radius2 = sn.nextDouble();
   System.out.println("Enter height of cylinder:");
   heigh = sn.nextDouble();
   diff = cylinderVolumeDif(radius1,radius2,heigh);
   System.out.println("The different value of 2 cylinder volume is:"+diff);
  }

  public static double cylinderVolumeDif(double radius1,double radius2,double heigh)
  { 
    double diff;
    diff = radius2-radius1;
    return Math.PI*Math.pow(diff,2)*heigh ;
 }
}