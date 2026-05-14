import java.util.*;
public class rado1{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("scissor (0) rock(1) paper(2): ");
    int num = input.nextInt();
    
    Random random = new Random();
    int a = random.nextInt(3);
    System.out.println(a);
    
    switch(num) {
      case 0:switch(a){
        case 0:System.out.println("Computer is scissor.You is scissor.Draw!"); break;
        case 1:System.out.println("Computer is rock.You is scissor.You win!"); break;
        case 2:System.out.println("Computer is paper.You is rock.You lose!"); break;
        default:break;
      }
      break;
      case 1:switch(a){
        case 0:System.out.println("Computer is scissor.You is rock.You win"); break;
        case 1:System.out.println("Computer is rock.You is rock.Draw!"); break;
        case 2:System.out.println("Computer is paper.You is rock.You lose!"); break;
        default:break;
      }
      break;
      case 2:switch(a){
        case 0:System.out.println("Computer is scissor.You is paper.You lose!"); break;
        case 1:System.out.println("Computer is rock.You is paper.You win"); break;
        case 2:System.out.println("Computer is paper.You is paper.Draw!"); break;
        default:break;
      }
      break;
    } 
    
    
  }
}