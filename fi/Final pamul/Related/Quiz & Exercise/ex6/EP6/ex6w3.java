import java.util.Scanner;
import java.util.Arrays;
public class ex6w3{
  public static void main(String[] args){
    Scanner sn = new Scanner(System.in);
    double[] array = new double[10];//??????
    int i;
    System.out.print("Enter ten numbers : ");
    for(i=0;i<10;i++)
    {
      array[i] = sn.nextDouble();
    }
    int idx = indexOfSmallestElement(array);//
    System.out.println("The index of the min is "+idx);
    sn.close();
  }
  
  public static int indexOfSmallestElement(double[] array){
    double[] num = new double[10];
    int j=0, k=0, index=0;
    for(j=0;j<10;j++)
    {
      num[j] = array[j];
    }
    Arrays.sort(array);//sort
    double min = array[0];
    for(k=0;k<10;k++)
    {
      if(num[k] == min)
      {
        index = k;
      }
    }
    return index;
  }
}