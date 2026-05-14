public interface Eatable{
  public void eat();
}
class Pork implements Eatable
{
  public void eat(){
    System.out.println("I am yummy.Cook me well!");
  }
}
class Pineapple implements Eatable
{
  public void eat(){
  System.out.println("I am yummy.Eat me fresh!");
  }
}
