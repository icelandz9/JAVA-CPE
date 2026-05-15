public class Quiz3_1_1{
  public static void main(String[] args){
    int i,j,num,n=0;
    for(i=6;i>=0;i--)
    {
      num = 10;
      for(j=1;j<=i;j++)
      {
        System.out.print(num+" ");
        num++;
      }
      System.out.print("\n");
      n++;
    }
  }
}