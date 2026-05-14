class ClosedFigure{
  public static void main(String[] args){
    ClosedFigure c1 = new Circle(2.0);
    System.out.println(c1);
    ClosedFigure c2 = new Circle();
    System.out.println(c2);
    ClosedFigure c3 = new Circle(3.0,"red");
    System.out.println(c3);
    ClosedFigure r1 = new Rectangle(3.0,3.3,"blue");
    System.out.println(r1);
    ClosedFigure r2 = new Rectangle(2.0,2.2);
    System.out.println(r2);
    ClosedFigure r3 = new Rectangle();
    System.out.println(r3);
  }
  private String color;
  public ClosedFigure(String color){
    this.color = color;
  }
  public ClosedFigure(){
    color = "white";
  }
  public double getArea(){ //Don't have attributes in class
    return 0.0;
  }
  public double getPerimeter(){
    return 0.0;
  }
  public String getColor(){
    return color;
  }
  public void setColor(String color){
    this.color = color;
  }
}

