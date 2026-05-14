import java.util.Scanner ;
public class q42 {
  public static void main(String[] args){
    Scanner sn = new Scanner(System.in);
    
    System.out.println("Enter lenght : ");
    double l = sn.nextDouble();
    System.out.println("Enter width : ");
    double w = sn.nextDouble();
    System.out.println("Enter height : ");
    double h = sn.nextDouble();
    System.out.println("Enter radius : ");
    double r = sn.nextDouble();
    
    System.out.println("surface rec box is : "+surface.calsurface(l,w,h));
    
    
    System.out.println("surface sphere box is : "+surface.calsurface(r));
  
    
    System.out.println("surface circular box is : "+surface.calsurface(r,h));
   
    }
}


class surface{
  public static double calsurface(double l,double w,double h){
    double result = (2*l*w)+(2*w*h)+(2*h*l);
    return result;
  }
  
  public static double calsurface(double r){
    double result = 4*Math.PI*r*r;
    return result;
  }
  
  public static double calsurface(double r,double h){
    double result = (Math.pow((r*r*h*h),0.5));
    return result;
  }
}

    
    