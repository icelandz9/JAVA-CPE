import java.util.Scanner;
public class RPS {
  public static void main(String[] args){
    Scanner hand = new Scanner(System.in);
    int user,ans,com;
    System.out.println("scissor (0), rock (1), paper (2) :");
    user = hand.nextInt();
    com = (int)(Math.random()*3);
    ans = user-com;
    switch(com){
      case 0: System.out.print("The computer is scissor. ");
            break;
      case 1: System.out.print("The computer is rock. ");
            break;
      case 2: System.out.print("The computer is paper. ");
            break;
    }
    switch(user){
      case 0: System.out.print("You are scissor");
            break;
      case 1: System.out.print("You are rock");
            break;
      case 2: System.out.print("You are paper");
            break;
    }
    switch(ans){
      case  0: System.out.print(" too. It is a draw");
            break;
      case  1: System.out.print(". You won");
            break;
      case  -2: System.out.print(". You won");
            break;
      case  -1: System.out.print(". You lose");
            break;
      case  2: System.out.print(". You lose");
            break;
   }
  }
}