public class Sphere
{
  public double CirclePi=3.14;
  private double radius;
  public Sphere()
  {
    radius=5;
  }
  public Sphere(double r)
  {
    radius=r;
  }
  public double getSphereSurface()
  {
    return 4*CirclePi*Math.pow(radius,2);
  }
  public double getSphereVolume()
  {
    return (4/3)*CirclePi*Math.pow(radius,3);
  }
  public double getRadius()
  {
    return radius;
  }
  void printSphere()
  {
    System.out.println("All parameters of this Sphere");
    System.out.println("Radius = "+getRadius());
    System.out.println("Sphere Surface Area = "+getSphereSurface()+" cm2");
    System.out.println("Sphere Volume = "+getSphereVolume()+" cm3");
  }
}
