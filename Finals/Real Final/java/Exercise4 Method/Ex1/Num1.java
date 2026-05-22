public class Num1
{
  public boolean diff(int a1,int b1,int c1)
{
  if((a1>b1) && (a1>c1)||(c1<b1) && (c1<a1))
  {
    return true;
  }
  else
  {
    return false;
  }
}
}