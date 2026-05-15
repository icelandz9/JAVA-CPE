public class pyramid_number{
  public static void main(String[] args){
    int tap=9, round=1, num=1, i=0, j=0, t=0;
    for(i=1;i<=9;i++)
    {
      for(t=0;t<=tap;t++)
      {
        System.out.printf("    ");
      }
      for(j=1;j<=round;j++)
      {
        System.out.printf(" %d ",num);
   if(num<10)
        {
          System.out.printf(" ");
        }
        num++;
      }
      round = round+2;
      tap--;
      System.out.printf("\n");
    }
  }
}