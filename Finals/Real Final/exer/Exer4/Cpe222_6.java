import java.util.Scanner;
public class Cpe222_6{
  public static void main(String[] args){
    int x1 = 3; int x2 = 7; int y1 = 4; int y2 = 5;
    System.out.println("The distance value of point ("+ x1 +","+ y1 +") and point ("+ x2 +","+ y2 +") is " + distance(x1, y1, x2, y2));
    double x11 = 3.0; double x22 = 7.0; double y11 = 4.0; double y22 = 5.0;
    System.out.println("The distance value of point ("+ x11 +","+ y11 +") and point ("+ x22 +","+ y22 +") is " + distance(x11, y11, x22, y22));
  }
  public static int distance(int x1, int y1, int x2, int y2){
    return (int)Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
  }
   public static double distance(double x1, double y1, double x2, double y2){
     return Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
}
}