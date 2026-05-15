public class e{
  public static void main(String[] args){
    int n=10000;
    double result,e,i,j,k;
    for(k=1;k<=10;k++)
    {
      e = 1;
      for(j=1;j<=n;j++)
      {
        result = 1;
        for(i=1;i<=j;i++)
        {
          result = result*i;
        }
        e = e+(1/result);
      }
      System.out.println("The e is "+e+" for i = "+n);
      n = n+10000;
    }
  }
}