public class Triangle {
  private double s1;
  private double s2;
  private double s3;
  public Triangle() {
    this.s1 = this.s2 = this.s3 = 1d;
  }
  public Triangle(double a, double b, double c){
    s1 = a;
    s2 = b;
    s3 = c;
  }
  public double getS1(double s1){
    return this.s1;
  }
  public double getS2(double s2){
    return this.s2;
  }
  public double getS3(double s3){
    return this.s3;
  }
  public double getArea(){
    double s = (this.s1+this.s2+this.s3)/2;
    return Math.sqrt(s*(s-this.s1)*(s-this.s2)*(s-this.s3));
  }
  public double getPerimeter(){
    double perimeter = (this.s1+this.s2+this.s3);
    return perimeter;
  }
}
      
      
  
  