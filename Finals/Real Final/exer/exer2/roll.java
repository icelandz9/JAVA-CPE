import java.util.Scanner;
public class roll{
  public static void main(String[] args){
    Scanner roll = new Scanner(System.in);
   System.out.println("Guess the roll [1-6] :");
    int b = roll.nextInt();
    Double rnd = Math.random();
    int a = (int)((rnd*6)+1);
    if(b==a){
      System.out.print("You guess is correct");
    }
    else if (b!=a){
      System.out.print("You guess is incorect");
    }
  }
}