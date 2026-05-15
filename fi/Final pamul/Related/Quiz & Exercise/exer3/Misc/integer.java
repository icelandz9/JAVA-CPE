import java.util.Scanner;
public class integer{
  public static void main(String[] args){
    Scanner sn = new Scanner(System.in);
    int i, x=0, np=0, ng=0;
    int[] num = new int[9999999];
    double av, sum=0;
    System.out.print("Enter an integer, the input ends if it is 0:");
    for(i=0;i<=9999999;i++)
    {
      num[i] = sn.nextInt();
      sum = sum+num[i];
      if(num[i] > 0)
      {
        np++;
        x++;
      }
      else if(num[i] < 0)
      {
        ng++;
        x++;
      }
      else if(num[i] == 0)
      {
        x++;
        break;
      }
    }
    av = sum/i;
    System.out.println("The number of positives is : "+np);
    System.out.println("The number of negatives is : "+ng);
    System.out.println("The total is : "+x);
    System.out.println("The average is : "+av);
    sn.close();
  }
}