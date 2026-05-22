public class Ex3
{
  public static void main(String[] args)
  {
    int x=1;
    System.out.println("i\t\tm(i)");
    for(int i = 1;i<10;i++)
    {
    double an = calPI.m(x);
    System.out.println(x+"\t\t"+an+"\t");
    x+=100;
    }
  }
}