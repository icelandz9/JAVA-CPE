public class WallFlower extends Flower{
    public WallFlower(){
        super("Talk to me for some interesting information.");
    }

    @Override
    public String toString(){
        return "WallFlowr: " + getInstruction();
    }
}
