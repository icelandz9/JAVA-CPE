class CauliFlower extends Flower{
  private double price;
  public CauliFlower(String instruction , double perKgPrice){
    super(instruction);
    this.price = perKgPrice;
  }
  public String toString(){
    return ("CauliFlower : Price = " + price + "baht/Kg" + getInstruction());
  }
}

class CarvedFlower extends Flower{
  private double price;
  private String material;
  public CarvedFlower(String instruction,String material,double perUnitPrice){
    super(instruction);
    this.price = perUnitPrice;
    this.material = material;
    
  }
  public String toString(){
    return ("Carved flower : Price = " + price + "$US. Meterial = " + material + "." + getInstruction());
  }
}

class WallFlower extends Flower{
  public WallFlower(){
    super("");
  }
  public String toString(){
    return ("Wallflower : Talk to me for some interesting information");
  }
}