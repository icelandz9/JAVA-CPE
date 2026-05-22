public class ThrowsExceptionTest
{
  public static void main (String[] args)
  {
    ThrowsExceptionTest t = new ThrowsExceptionTest();
    t.method1(6,3);
    t.method1(6,0);
    t.method1(6,2.5); }
  public void method1(double num1, double num2){
   try{
    System.out.println(method2(num1,num2));
    }
    catch(ArithmeticException e){
      System.out.println(e+" Divide by zero not allowed");
  }
  }
  public String method2(double a, double b) throws ArithmeticException{
    if(b==0){
      System.out.println(a+ "/" +b+" ===> ");
      throw new ArithmeticException();
    }
    else{
      return a+"/"+b+" = " +(a/b);
    }
  }
}