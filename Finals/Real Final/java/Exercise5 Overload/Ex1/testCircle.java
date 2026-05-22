public class testCircle
{
  public static void main(String[] args)
  {
    double r1=4;
    System.out.println("First Circle (C1)");
    System.out.println("---------");
    Circle c1 = new Circle(r1);
    System.out.println("Circle's Area is :"+c1.getArea());
    System.out.println("Circle's Volume is :"+c1.getVolume());
    System.out.println("Circle's Circumference is :"+c1.getCircumference());
    double r2=1.5;
    System.out.println("Second Circle (C2)");
    System.out.println("---------");
    Circle c2 = new Circle(r2);
    System.out.println("Circle's Area is :"+c2.getArea());
    System.out.println("Circle's Volume is :"+c2.getVolume());
    System.out.println("Circle's Circumference is :"+c2.getCircumference());
  }
}