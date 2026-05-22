public class CircleRing {
  public static final double Pi = 3.14;
  private double radius_in;
  private double radius_out;
  
  public CircleRing(){
    this.radius_in = 5;
    this.radius_out = 10;
  }
  public CircleRing(double ri, double ro){
    this.radius_in = ri;
    this.radius_out = ro;
  }
  public double getCircleAreaIn(){
    double circleareain = Pi*radius_in*radius_in;
    return circleareain;
  }
  public double getCircleAreaOut(){
    double circleareaout = Pi*radius_out*radius_out;
    return circleareaout;
  }
  public double getRadiusIn(){
    return radius_in;
  }
  public double getRadiusOut(){
    return radius_out;
  }
  public double getCircleRingArea(){
    double circlering = getCircleAreaOut()-getCircleAreaIn();
    return circlering;
  }
  public void printCircleRing(){
    System.out.println("All parameter of this Circle Ring");
    System.out.println("Radius In =" +getRadiusIn()+"cm, RadiusOut =" +getRadiusOut()+ "cm");
    System.out.println("Circle Area Inside = "+getCircleAreaIn()+" cm2 and Circle Area Outside = "+getCircleAreaOut()+ " cm2");
    System.out.println("Ciecle Ring Area =" +getCircleRingArea()+ " cm2");
   }
}
  
    
  