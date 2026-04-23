public class CarvedFlower extends Flower {
    private double price;

    private String material;

    public CarvedFlower(String instruction, String material, double perUnitPrice){
        super(instruction);
        this.material = material; 
        this.price = perUnitPrice;
    }

    @Override
    public String toString(){
        return "CarvedFlower: Price = " + price + " Us.Material = " + material + ". " + getInstruction();
    }
}
