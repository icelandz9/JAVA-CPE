public class calPI
{
  public static double m(int i)
  {
    double cal=0;
    for(int j=1;j<=i;j++)
    cal += (Math.pow(-1,j+1)/((2*j)-1));
    return 4*cal;
      
  }
}