import java.util.Scanner;
public class Q4_1_1 {
  public static void main(String[] args) {
    Scanner sn = new Scanner(System.in);
    System.out.print("Enter radius of cylinder 1 :");
    double cld_1 = sn.nextDouble();
    System.out.print("Enter radius of cylinder 2 :");
    double cld_2 = sn.nextDouble();
    System.out.print("Enter height of cylinder :");
    double height = sn.nextDouble();
                                  
    double Volume = cylinderVolumeDif(cld_1,cld_2,height);
    System.out.printf("The value of Cylinder volume is %.5f",Volume);
    sn.close();
  }                              
  public static double cylinderVolumeDif(double radiusOut, double radiusln, double height){
    double Cylinder_1 = (Math.PI*(radiusln*radiusln)*height);
    double Cylinder_2 = (Math.PI*(radiusOut*radiusOut)*height);
    return Cylinder_2-Cylinder_1;
  }
}
