public class Ex6
{
  public static void main(String[] args)
  {
    int a=3,a1=7,b=4,b1=5;
    double c=3.0,c1=7.0,d=4.0,d1=5.0;
    int e1 = calDistance.distance(a,b,a1,b1);
    double e2 = calDistance.distance(c,d,c1,d1);
      System.out.println("Yhe distance value of point (3,4) and (7,5) : "+e1);
      System.out.println("Yhe distance value of point (3.0,4.0) and (7.0,5.0) : "+e2);
  }
 }