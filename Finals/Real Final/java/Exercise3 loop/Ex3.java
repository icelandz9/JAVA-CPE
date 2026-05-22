public class Ex3
{
  public static void main(String[] args)
  {
    int row=1;
    for(int i=0;i<=81;i++)
    {
      System.out.print(i+1);
      row++;
        if(row%2!=0)
      {
        System.out.print("\n");
      }
        else
        {
          System.out.print("\t");
        }
        
    }
  }
}