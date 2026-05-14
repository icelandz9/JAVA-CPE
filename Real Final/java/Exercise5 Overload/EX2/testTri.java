public class testTri
{
  public static void main(String[] args)
  {
    double a1=5.0,b1=5.0,c1=5.0;
    System.out.println("First triangle (C1)");
    System.out.println("---------");
    Triangle t1 = new Triangle(a1,b1,c1);
    System.out.println("Triangel's Area is :"+t1.getArea());
    System.out.println("Circle's Circumference is :"+t1.getPerimeter());
    double a2=2.5,b2=2.5,c2=2.5;
    System.out.println("Second tringle (C2)");
    System.out.println("---------");
    Triangle t2 = new Triangle(a2,b2,c2);
    System.out.println("Circle's Area is :"+t2.getArea());
    System.out.println("Circle's perimeter is :"+t2.getPerimeter());
  }
}