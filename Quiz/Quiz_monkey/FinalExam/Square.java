
public class Square {
  private double width;
  private double length;
  private double height;

  public Square() {
    this.width = 1;
    this.length = 1;
    this.height = 1;
  }

  public Square(double w, double l) {
    this.width = w * 2.54;
    this.length = l * 2.54;
    this.height = 1;
  }

  public Square(double w, double l, double h) {
    this.width = w * 2.54;
    this.length = l * 2.54;
    this.height = h * 2.54;
  }

  public double getSquareArea() {
    double squarearea = getWidth() * getLength();
    return squarearea;
  }

  public double getBorderLength() {
    double borderlength = (getWidth() * 2) + (getLength() * 2);
    return borderlength;
  }

  public double getSurfaceAreaAllSides() {
    double surfaceareaallsides = ((getWidth() * getLength()) * 2) + ((getWidth() * getHeight()) * 2)
        + ((getLength() * getHeight()) * 2);
    return surfaceareaallsides;
  }

  public double getLength() {
    return length;
  }

  public double getWidth() {
    return width;
  }

  public double getHeight() {
    return height;
  }

  public void printSquare() {
    System.out.println("\nAll parameters of this Square");
    System.out.println("Width = " + getWidth() + " cm Length = " + getLength() + " cm Height = " + getHeight() + "cm");
    System.out.println("Square Area = " + getSquareArea() + " cm2");
    System.out.println("Border Length of Square = " + getBorderLength() + " cm2");
    System.out.println("Surface Area of All Sides = " + getSurfaceAreaAllSides() + " cm2");
  }
}
