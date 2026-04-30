import java.util.Scanner;

public class Q4_2_1 {

  public static void main(String[] args) {
    Scanner sn = new Scanner(System.in);
    System.out.print("Enter Value of base : ");
    double base = sn.nextDouble();
    System.out.print("Enter Value of height : ");
    double height = sn.nextDouble();
    System.out.print("Enter Value of length : ");
    double length = sn.nextDouble();
    System.out.print("Enter Value of radius : ");
    double radius = sn.nextDouble();
    
    double Cone = calVolume(height,radius);
    double Qube = calVolume(radius);
    double Sphere = calVolume(base,height,length);
    System.out.println("Cone : "+Cone);
    System.out.println("Qube : "+Qube);
    System.out.println("Sphere : "+Sphere);
    sn.close();
  }
  
  public static double calVolume(double h,double r){
    final double Pi = Math.PI;
    double volume = (Pi*(r*r)*h)/3.0;
    return volume; 
  }
  public static double calVolume(double r){
    final double Pi = Math.PI;
    double volume = (4.0/3.0)*Pi*(r*r*r);
    return volume; 
  }
  public static double calVolume(double b, double h, double l){
    double volume = b*l*h;
    return volume; 
  }
}