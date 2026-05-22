import java.util.Scanner;
import java.util.Random;
  public class Ex5V2
{
  public static void main(String[] args)
  {
    Scanner sn = new Scanner(System.in);
    Random rand = new Random();
    int num = rand.nextInt(3);
    System.out.print("scissor(0) , rock (1) , paper (2) : ");
    int a = sn.nextInt();
    int b = num-a;
    String com = Integer.toString(a);
    String player = Integer.toString(num);
    switch (num)
    {
      case 0 : 
        com = "scissor";
        break;
      case 1 : 
        com = "rock";
        break;
      case 2 :
        com = "paper";
        break;
      default :
        System.out.println("Error");
        break;
    }
    switch (a)
    {
      case 0 : 
        player = "scissor";
        break;
      case 1 : 
        player = "rock";
        break;
      case 2 :
        player = "paper";
        break;
      default :
        System.out.println("Error");
        break;
    }
    
    switch (b)
    {
      case -2: 
        System.out.println("The computer is : "+com+" You are "+player+", You Lost");
        break;
      case -1 :
        System.out.println("The computer is : "+com+" You are "+player+", You Won");
        break;
      case 0 :
        System.out.println("The computer is : "+com+" You are "+player+", It's Draw");
        break;
      case 1 :
        System.out.println("The computer is : "+com+" You are "+player+", You Lost");
        break;
      case 2 :
         System.out.println("The computer is : "+com+" You are "+player+", You Won");
        break;
      default :
        System.out.println("Try again");
        break;
    }

    sn.close();
  }
}