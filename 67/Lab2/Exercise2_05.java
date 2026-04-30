import java.util.Scanner;
public class Exercise2_05 {
  public static void main(String[] agrs) {
    Scanner sn = new Scanner(System.in);
    
    int RanDom = (int)(Math.random()*2);
    System.out.print("scissor(0), rock(1), paper(2)");
    int Number = sn.nextInt();
    switch(Number) {
      case 0:
        switch(RanDom) {
        case 0:
          System.out.print("The computer scissor. You are scissor. It is a draw");
          break;
        case 1:
          System.out.print("The computer rock. You are scissor. It is a Won");
          break;
        case 2:
          System.out.print("The computer paper. You are scissor. It is a Lost");
          break;
        default:
          System.out.print("Error");
          break;
      }
        break;
      case 1:
        switch(RanDom) {
        case 0:
          System.out.print("The computer scissor. You are rock. It is a Won");
          break;
        case 1:
          System.out.print("The computer rock. You are rock. It is a draw");
          break;
        case 2:
          System.out.print("The computer paper. You are rock. It is a Lost");
          break;
        default:
            System.out.print("Error");
          break;
      }
        break;
      case 2:
        switch(RanDom) {
        case 0:
          System.out.print("The computer scissor. You are paper. It is a Lost");
          break;
        case 1:
          System.out.print("The computer rock. You are paper. It is a Won");
          break;
        case 2:
          System.out.print("The computer paper. You are paper. It is a draw");
          break;
        default:
          System.out.print("Error");
          break;
      }
        break;
      default:
        System.out.print("Error");
        break;
    }
    sn.close();
  }
} 