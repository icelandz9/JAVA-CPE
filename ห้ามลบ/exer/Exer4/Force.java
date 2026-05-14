import java.util.Scanner;
public class Force {
  public static void main(String[] args) { 
  Scanner sn = new Scanner(System.in);
  double m,a;
  double f,m1,m2,g,r,force;
  g = 6.673*Math.pow(10,(-11));
  System.out.print("Select force from all 1.Force with acceleration 2.Force with gravity : ");
  force = sn.nextDouble();
  if(force == 1) 
  {
    System.out.print("Enter value of  m:");
    m = sn.nextDouble(); 
    System.out.print("Enter value of a:");
    a = sn.nextDouble();
    f = calForce(m,a);
    System.out.println("Volume of cone is:"+force);
  }
  if (force == 2)
  {
    System.out.print("Enter value of m1 :"); 
    m1 = sn.nextDouble();
    System.out.print("Enter  value of m2:");
    m2 = sn.nextDouble();
    System.out.print("Enter value of r:");
    r = sn.nextDouble();
    f = calForce(g,m1,m2,r);
    System.out.print("Force is equal :"+f);  
  }
  }
  
   public static double calForce(double m,double a)
  {
   return  m*a;
  }
 public static double calForce(double g,double m1,double m2,double r)
  { 
    return (g*m1*m2)/Math.pow(r,(2));
  }
 }

    
 

