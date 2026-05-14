public class ex6w4{
  public static void main(String[] args){
    int[] numint = {1, 2, 3, 4, 5, 6};
    double[] numdou = {6.0, 4.4, 1.9, 2.9, 3.4, 3.5};
    int avint;
    double avdou;
    avint = average(numint);
    avdou = average(numdou);
    System.out.println("The average value as integer is "+avint);
    System.out.println("The average value as double is "+avdou);
  }
  
  public static int average(int[] array){
    int i, sumint=0;
    for(i=0;i<6;i++)
    {
      sumint = sumint+array[i];
    }
    return sumint/6;
  }
  
  public static double average(double[] array){
    int i;
    double sumdou=0;
    for(i=0;i<6;i++)
    {
      sumdou = sumdou+array[i];
    }
    return sumdou/6;
  }
}