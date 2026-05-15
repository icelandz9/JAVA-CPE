public class PIE
{
  public static void main(String[] args){
    double i, j, pi, sum, cal;
    for(i=100;i<=2500;i=i+100)
    {
      cal = 0;
      sum = 0;
      pi = 4;
      for(j=1;j<=i;j++)
      {
        cal = Math.pow(-1,(j+1))/((2*j)-1);
        sum = sum+cal;
      }
      pi = pi*sum;
      System.out.println("PI is "+pi+" for i = "+i);
    }
  }
}