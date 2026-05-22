import java.util.Scanner;
public class Ex4p6{
  public static void main(String[] args){
    Scanner sn = new Scanner(System.in);
    double x1=3.0, y1=4.0, x2=7.0, y2=5.0, pint, pdou;
    pint = distance(x1, y1, x2, y2);
    pdou = distance(x1, y1, x2, y2);
    System.out.println("The distance value of point ("+(int)x1+","+(int)y1+") and point ("+(int)x2+","+(int)y2+") is "+(int)pint);
    System.out.println("The distance value of point ("+x1+","+y1+") and point ("+x2+","+y2+") is "+pdou);
    sn.close();
  }
  
  public static int distance(int x1, int y1, int x2, int y2){
    int sumint;
    sumint = (int)Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
    return sumint;
  }
  
  public static double distance(double x1, double y1, double x2, double y2){
    double sumdou;
    sumdou = Math.sqrt((Math.pow((x2-x1),2))+(Math.pow((y2-y1),2)));
    return sumdou;
  }
}