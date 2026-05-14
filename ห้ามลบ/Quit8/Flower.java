public class Flower{
  public static void main(String[] args){
    Flower cauly = new CauliFlower("Boil before stir fry.Cook me well.",30);
    System.out.println(cauly);
    Flower soapFlower = new CarvedFlower("For room decoration","soap",4);
    System.out.println(soapFlower);
    Flower carrie = new WallFlower();
    System.out.println(carrie);
  }
  private String useInstruction;
  public Flower(String instruction){
    this.useInstruction = instruction;
  }
  public String getInstruction(){
    return useInstruction;
  }
}