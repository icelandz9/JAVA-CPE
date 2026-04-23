public class CauliFlower extends Flower{
    private double price;

    public CauliFlower(String instruction, double perKgPrice){
        super(instruction);
        this.price = perKgPrice;
    }

    @Override
    public String toString(){
        return "CauliFlower: Price = " + price + " baht/kg. " + getInstruction();
    }
}
