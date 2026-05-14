public class Sumeven{
  public static void main(String[] args){
    int i;
    double cal=0, sum=0, top, bot;
    top = 1;
    bot = 3;
    for(i=0;i<=48;i++)
    {
      cal = top/bot;
      sum = sum+cal;
      top = top+2;
      bot = bot+2;
    }
    System.out.println("sum is "+sum);
  }
}