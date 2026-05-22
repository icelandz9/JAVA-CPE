public class calDistance
{
  static int dis1;
  static double dis2;
  public static int distance(int x1,int y1,int x2,int y2)
  {
    return (int)Math.sqrt(((Math.pow((x2-x1),2))+(Math.pow((y2-y1),2))));
  }
  public static double distance(double x1,double y1,double x2,double y2)
  {

    return Math.sqrt(((Math.pow((x2-x1),2))+(Math.pow((y2-y1),2))));
  }
}