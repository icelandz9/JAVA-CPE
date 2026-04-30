public class WallFlower extends Flower{
  public WallFlower(){
    super("Talk to me for some for some interesting information.");
  }
  
  public String toString(){
    return "Wallflower: "+getInstruction();
  }
}