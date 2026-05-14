import java.util.Scanner;
import java.util.Random;
public class Ex1
{
   public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in); 
    Random rand = new Random();
    int sum=0;
    System.out.print("Enter array size :");
    int n = input.nextInt();
    int[] x = new int [n];
    for(int i=0;i<n;i++)
    {
      int num = rand.nextInt(99);
      x[i]=num;
      sum+=num;
  }
    System.out.println("Your array:");
    System.out.print("{");
    for(int i=0;i<n;i++)
    {
      System.out.print(x[i]+" ");
    }
    System.out.println("}");
    System.out.println("Your array score is : "+calScore(sum));
}
public static int calScore(int no)
{
  int score;
  if(no%4==0 || no%9 ==0)
      {
        score = 1;
      }
      else if(no%7==0)
      {
        score = 2;
      }
      else
      {
        score = 0;
      }
      return score;
    }
}