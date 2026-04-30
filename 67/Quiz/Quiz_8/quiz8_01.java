public class quiz8_01 {
  public static void main(String[] args) {
    ClosedFigure rec3 = new Rectangle(4.0,6.2);
    ClosedFigure rec1 = new Rectangle();
    ClosedFigure rec2 = new Rectangle(5.0,4.8,"Blue");
    ClosedFigure cir1 = new Circle(6.0);
    ClosedFigure cir3 = new Circle(5.0,"Pink");
    ClosedFigure cir2 = new Circle();
    System.out.println(rec3);
    System.out.println(rec1);
    System.out.println(rec2);
    System.out.println(cir2);
    System.out.println(cir3);
    System.out.println(cir1);
  }
}