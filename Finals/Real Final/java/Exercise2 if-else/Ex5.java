import java.util.Scanner;
import java.util.Random;
  public class Ex5
{
  public static void main(String[] args)
  {
    Scanner sn = new Scanner(System.in);
    Random rand = new Random();
    int num = rand.nextInt(3);
    System.out.print("scissor(0) , rock (1) , paper (2) : ");
    int a = sn.nextInt();
    switch (num)
    {
      case 0: 
        switch (a)
      {
        case 0:
          System.out.println("Computer is scissor, You are scissor too ");
          System.out.println("It's Draw");
          break;
        case 1:
         System.out.println("Computer is Scissor, You are rock ");
         System.out.println("You Win");
         break;
        case 2:
          System.out.println("Computer is Scissor, You are paper ");
          System.out.println("You Lost");
          break;
        default:
          System.out.println("Error");
          break;
      }
        break;
      case 1 :
       switch (a)
      {
        case 0:
          System.out.println("Computer is rock, You are scissor ");
          System.out.println("You Lost");
          break;
        case 1:
          System.out.println("Computer is rock, You are rock too");
          System.out.println("Draw");
          break;
        case 2:
          System.out.println("Computer is rock, You are paper");
          System.out.println("You Win");
          break;
        default:
          System.out.println("Error");
          break;
      }
        break;
      case 2 :
        switch (a)
      {
        case 0:
         System.out.println("Computer is paper , You are scissor ");
         System.out.println("You Win");
         break;
        case 1:
          System.out.println("Computer is paper , You are rock ");
          System.out.println("You Lost");
          break;
        case 2:
          System.out.println("Computer is paper , You are paper too ");
          System.out.println("Draw");
          break;
        default:
          System.out.println("Error");
          break;
      }
        break;
      default :
        System.out.println("Try again");
        break;
    }

    sn.close();
  }
}