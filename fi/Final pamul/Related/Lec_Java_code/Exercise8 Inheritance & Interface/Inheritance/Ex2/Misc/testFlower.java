public class testFlower
{
  public static void main(String[] args)
  {
    Flower cauly = new CauliFlower("Boil before stir fly. cook me well",30);
    Flower soapFlower = new CarvedFlower("For room decoration","Soap",4);
    Flower carrie = new WallFlower();
    System.out.println(cauly);
    System.out.println(soapFlower);
    System.out.println(carrie);
  }
}