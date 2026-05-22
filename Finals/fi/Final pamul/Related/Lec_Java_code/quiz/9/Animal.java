public abstract class Animal
{
  public abstract String sound();
  public String howToSleep()
  {
    return "sleep";
  }
}
class Frog extends Animal implements Swimmable
{
  public String sound()
  {
    return "Frog: Ribbit-Ribbit";
  }
  public String howToSleep()
  {
    return "Frog: Swim with their powerful hind legs, and flattened,streamlined body";
  }
  public String howToSwim()
  {
    return "Frog: May rest more throughout the day when the sun is hot";
  }
}
class Penguin extends Animal implements Swimmable
{
    public String sound()
  {
    return "Penguin: Honk-Honk";
  }
    public String howToSleep()
  {
    return "Penguin: Can sleep while floating in the water and standing up on the rocks ";
  }
  public String howToSwim()
  {
    return "Penguin: Swim by using them wings that paddle-like flippers";
  }
}
class Pig extends Animal implements Edible
{
  public String sound()
  {
    return "Pig: Oink-Oink";
  }
   public String howToSleep()
  {
    return "Pig: Like to sleep snuggled up together in their nest";
  }
  public String howToEat()
  {
    return "Grill or Fry it";
  }
}