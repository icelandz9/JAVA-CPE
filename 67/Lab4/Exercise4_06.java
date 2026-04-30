import java.util.Scanner;
public class Exercise4_06 {
  public static void main(String[] agrs) {
    Scanner sn = new Scanner(System.in);
    System.out.print("Enter Int x1,y1,x2,y2 : ");
    int nx1 = sn.nextInt();
    int ny1 = sn.nextInt();
    int nx2 = sn.nextInt();
    int ny2 = sn.nextInt();
    int nD = distance(nx1, ny1, nx2, ny2);
    System.out.print("Enter Double x1,y1,x2,y2 : ");
    double dx1 = sn.nextDouble();
    double dy1 = sn.nextDouble();
    double dx2 = sn.nextDouble();
    double dy2 = sn.nextDouble();
    double dD = distance(dx1, dy1, dx2, dy2);
    System.out.println("The distance value of point ("+nx1+","+ny1+") and point ("+nx2+","+ny2+") is " +nD);
    System.out.println("The distance value of point ("+nx1+","+ny1+") and point ("+nx2+","+ny2+") is " +dD);
    sn.close();
  }
  
  public static int distance(int x1, int y1, int x2, int y2) {
    int D = (int)Math.sqrt(((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1)));
    return D;
  }
  
  public static double distance(double x1, double y1, double x2, double y2) {
    double D = (double)Math.sqrt(((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1)));
    return D;
  }
} 