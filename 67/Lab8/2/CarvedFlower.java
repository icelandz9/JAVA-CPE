public class CarvedFlower extends Flower {
  private double price;
  private String material;
  public CarvedFlower(String instruction, String Material, double perUnitPrice) {
    super(instruction);
    material = Material;
    price = perUnitPrice;
  }
  public String toString() {
    return "Carved flower : price = "+price+" $US. Material = "+material+". "+getInstruction();
  }
}