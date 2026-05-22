public interface Flyable{
  public void fly();
}
class Duck implements Flyable
{
  public void fly(){
    System.out.println("I am duck. I am flying with wings");
  }
}
class Plane implements Flyable
{
  public void fly(){
  System.out.println("I am plane. I am flying with fuel");
  }
}