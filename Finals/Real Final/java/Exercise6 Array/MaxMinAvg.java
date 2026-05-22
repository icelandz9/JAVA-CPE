import java.util.Arrays;
class MaxMinAvg
{
   public double getmin(int[] s)
  {
    Arrays.sort(s);
    return s[0];
  }
   public double getmin(double[] s)
  {
    Arrays.sort(s);
    return s[0];
  }
    public double getmax(int[] s)
  {
    Arrays.sort(s);
    return s[s.length-1];
  }
     public double getmax(double[] s)
  {
    Arrays.sort(s);
    return s[s.length-1];
  }
      public double getavg(int[] s)
  {
    double sum=0.0,avg;
    for(int i=0;i<s.length;i++)
    {
      sum += s[i];
    }
    avg=sum/s.length;
    return (int)avg;
  }
      public double getavg(double[] s)
  {
    double sum=0.0,avg;
    for(int i=0;i<s.length;i++)
    {
      sum += s[i];
    }
    avg=sum/s.length;
    return avg;
  }
     
}