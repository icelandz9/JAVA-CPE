public class Quiz08_1{
  public static void main(String[] args){
    Tiger T = new Tiger();
    Chicken c = new Chicken();
    Fruit f = new Fruit();
    Orange o = new Orange();
    
    System.out.println(T.sound());
    System.out.println(c.howToEat());
    System.out.println(f.howToEat());
    System.out.println(o.howToEat());
  }
}