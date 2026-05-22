public class Ex4p3{
  public static void main(String[] args){
    double mi;
    int i;
    System.out.println("i\t\t\t\tm(i)");
    System.out.println("_____________________________________");
    for(i=1;i<=901;i=i+100)
    {
      mi = m(i);
      System.out.printf("%d\t\t\t\t%.4f\n",i,mi);
    }
  }
  
  public static double m(int i){
    int j;
    double cal=0;
    for(j=1;j<=i;j++)
    {
      cal = cal+(Math.pow(-1,(j+1))/((2*j)-1));
    }
    return 4*cal;
  }
}