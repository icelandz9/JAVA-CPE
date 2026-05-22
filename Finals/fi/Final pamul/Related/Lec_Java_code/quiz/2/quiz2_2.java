import java.util.Scanner;
import java.util.Random;
import java.lang.Math;
  public class quiz2_2
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    Random rand = new Random();
    int com = rand.nextInt(100);
    System.out.print("Please enter guess score(1-3) : ");
    int user = input.nextInt();
    int score;
    if (com%10==4 || com%10==9)
    {
      if (com%7==0)
    {
      score = 3;
    }
      else
      {
        score = 2;
      }
    }
    else
    {
      score = 1;
    }
    System.out.println("Random number is : "+com+" Lucky number is : "+score);
    switch (score)
    {
    case 1 :
      switch (user)
    {
      case 1:
        System.out.println("The Lucky number is : "+score+" Your number is "+user+" You correct" );
        break;
      case 2:
        System.out.println("The Lucky number is : "+score+" Your number is "+user+" Sorry you wrong" );
        break;
      case 3:
        System.out.println("The Lucky number is : "+score+" Your number is "+user+" Sorry you wrong" );
        break;
      default:
        System.out.println("Error");
        break;
    }
      break;
    case 2 :
      switch (user)
    {
      case 1:
        System.out.println("The Lucky number is : "+score+" Your number is "+user+" Sorry you wrong" );
        break;
      case 2:
        System.out.println("The Lucky number is : "+score+" Your number is "+user+" You correct" );
        break;
      case 3:
        System.out.println("The Lucky number is : "+score+" Your number is "+user+" Sorry you wrong" );
        break;
      default:
        System.out.println("Error");
        break;
    }
      break;
  case 3:
      switch (user)
    {
      case 1:
        System.out.println("The Lucky number is : "+score+" Your number is "+user+" Sorry you wrong" );
        break;
      case 2:
        System.out.println("The Lucky number is : "+score+" Your number is "+user+" Sorry you wrong" );
        break;
      case 3:
        System.out.println("The Lucky number is : "+score+" Your number is "+user+" You correct" );
        break;
      default:
        System.out.println("Error");
        break;
    }
      break;
      default:
        System.out.println("Error");
  }
  }
  }
  
