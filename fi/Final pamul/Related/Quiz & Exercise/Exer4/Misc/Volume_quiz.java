import java.util.Scanner;
public class Volume_quiz {
  public static void main(String[] args) { 
  Scanner sn = new Scanner(System.in);
  double cone,sphere,square;
  double a,w,l,rad,h,radius;
  System.out.print("Select volume from all 1.cone 2.sphere 3.square : ");
  a = sn.nextDouble();
  if(a == 1) 
  {
    System.out.print("Enter radius of cone:");
    rad = sn.nextDouble();
    System.out.print("Enter heigh of cone:");
    h = sn.nextDouble();
    cone = calVolume(rad,h);
    System.out.println("Volume of cone is:"+cone);
  }
  if(a == 2)
  {
    System.out.print("Enter radius of sphere:");
    rad = sn.nextDouble();
    sphere = calVolume(rad);
    System.out.println("Volume of sphere is:"+sphere);
  } 
  if(a==3)
  {
    System.out.print("Enter width of square:" );
    w = sn.nextInt();
    System.out.print("Enter leght of square:" );
    l = sn.nextInt();
    System.out.print("Enter high of square:" );
    h = sn.nextInt();
    square = calVolume(w,l,h);
    System.out.println("Volume of square is:" +square);
  }
  }
  public static double calVolume(double rad,double h)
  {
    return (3.14*Math.pow(rad,2)*h)/3;
  }
  
  public static double calVolume(double rad)
  {
   return  4/3*Math.PI*Math.pow(rad,(3));
  }
  
   public static double calVolume(double w,double l,double h)
  {
   return w*l*h;
  }
}
 
  
  