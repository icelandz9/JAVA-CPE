import java.util.Scanner;

public class Quiz_1 {
  public static void main(String[] args) {
    Scanner sn = new Scanner(System.in);
    System.out.println(": ");
    int M = sn.nextInt();
    int y = M/525600;;
    int d = (M%525600)/1440;
    int m = (M%525600)%1440;
    System.out.println(+y+"Y"+d+"D"+m+"M");
    sn.close();
  }
}