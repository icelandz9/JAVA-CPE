public class M{
  public static void main(String[] args){
    double i, j, m, sum, cal;
    for(i=1000;i<=30000;i=i+1000)
    {
      cal = 0;
      sum = 0;
      m = 1;
      for(j=1;j<=i;j++)
      {
        cal = i/(i+1);
        sum = sum+cal;
      }
      m = m+sum;
      System.out.println("M is "+m+" for i = "+i);
    }
  }
}