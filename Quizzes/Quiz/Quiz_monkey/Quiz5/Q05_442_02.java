package Quiz.Quiz_monkey.Quiz5;

import java.util.Scanner;

public class Q05_442_02 {
  public static void main(String[] args) {
    Scanner sn = new Scanner(System.in);

    CircularCone Cc1 = new CircularCone();
    Cc1.printCircularCone();
    CircularCone Cc2 = new CircularCone(2);
    Cc2.printCircularCone();
    CircularCone Cc3 = new CircularCone(3, 7);
    Cc3.printCircularCone();
  }
}
