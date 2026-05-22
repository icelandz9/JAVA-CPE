public class Triangle
{
  private double s1;
  private double s2;
  private double s3;
  public Triangle()
  {
    s1=0;
    s2=0;
    s3=0;
  }
  public Triangle(double a,double b,double c)
  {
    s1=a;
    s2=b;
    s3=c;
  }
  public double getS1()
  {
    return s1;
  }
  public double getS2()
  {
    return s2;
  }
  public double getS3()
  {
    return s3;
  }
  public double getArea()
  {
    double s=(s1+s2+s3)/2.0;
    return Math.sqrt(s*(s-s1)*(s-s2)*(s-s3));
    //return Math.sqrt(3)/4*Math.pow(s1,2);
  }
  public double getPerimeter()
  {
    return s1+s2+s3;
  }
}