class Flower
{
  private String useInstruction;
  public Flower(String instruction){
    this.useInstruction = instruction;
  }
  public String getInstruction(){
    return useInstruction;
  }
}
class WallFlower extends Flower
{
  public WallFlower(){
    super("Talk to me for some intersting information");
  }
  public String toString(){
    return "Wallflower: "+super.getInstruction();
  }
}
class CauliFlower extends Flower
{
  private double price;
  public CauliFlower(String Instruction , double perKgPrice){
    super(Instruction);
    this.price = perKgPrice;
  }
    public String toString(){
    return "CauliFlower: Price: "+price+" bath/kg. "+super.getInstruction();
    }
}
class CarvedFlower extends Flower
{
  private double price;
  private String material;
  public CarvedFlower(String Instruction,String material,double perKgPrice){
  super(Instruction);
  this.price = perKgPrice;
  this.material = material;
  }
  public String toString(){
    return "CarvedFlower: Price: "+price+" bath/kg. "+super.getInstruction();
    }
}