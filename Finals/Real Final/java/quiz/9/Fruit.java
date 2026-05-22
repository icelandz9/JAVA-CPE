public class Fruit implements Edible
{
  public String howToEat()
  {
    return "Fruit is healthy food";
  }
}
class Coconut extends Fruit
{
  public String howToEat()
  {
    return "Coconut: Refreshing with ice coconut water";
  }
}
class Banana extends Fruit
{
  public String howToEat()
  {
    return "Banana: Make Healthy Banana Smoothie";
  }
}
class Orange extends Fruit
{
  public String howToEat()
  {
    return "Orange: Make Orange Juice";
  }
}