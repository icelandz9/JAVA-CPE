public class Exercise5_01 {
  public static void main(String[] agrs) {
    Circle Cc1 = new Circle(4);
    System.out.println("Circle's Area = "+Cc1.getArea());
    System.out.println("Circle's Volume = "+Cc1.getVolume());
    System.out.println("Circle's Circumference = "+Cc1.getCircumference());
    Circle Cc2 = new Circle(1.15);
    System.out.println("Circle's Area = "+Cc2.getArea());
    System.out.println("Circle's Volume = "+Cc2.getVolume());
    System.out.println("Circle's Circumference = "+Cc2.getCircumference());
  }
} 