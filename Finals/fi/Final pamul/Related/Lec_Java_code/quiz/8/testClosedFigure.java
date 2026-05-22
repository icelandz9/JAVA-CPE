public class testClosedFigure
{
   public static void main(String[] args)
  {
     ClosedFigure c1 = new Circle(2.0);
     ClosedFigure c2 = new Circle();
     ClosedFigure c3 = new Circle(3.0,"red");
     ClosedFigure r1 = new Rectangle(3.0,3.3,"blue");
     ClosedFigure r2 = new Rectangle(2.0,2.2);
     ClosedFigure r3 = new Rectangle();
     System.out.println(r3);
     System.out.println(r1);
     System.out.println(r2);
     System.out.println(c2);
     System.out.println(c3);
     System.out.println(c1);
     
   }
}
