package Quiz.Quiz_monkey.Quiz3;

public class Q03_442_01 {
  public static void main(String[] args) {
    int n, nmod, total = 0;
    for (int i = 0; i <= 10000; i++) {
      n = 15000 + (int) (Math.random() * 61000);
      nmod = n % 100;
      switch (nmod) {
        case 55:
          System.out.print(n + " ");
          ++total;
          break;
        case 555:
          System.out.print(n + " ");
          ++total;
          break;
        case 5555:
          System.out.print(n + " ");
          ++total;
          break;
        case 55555:
          System.out.print(n + " ");
          ++total;
          break;
        case 505:
          System.out.print(n + " ");
          ++total;
          break;
        case 5505:
          System.out.print(n + " ");
          ++total;
          break;
        case 55005:
          System.out.print(n + " ");
          ++total;
          break;
        case 50005:
          System.out.print(n + " ");
          ++total;
          break;
      }
    }
    System.out.print("\nThe count is " + total + " ");
  }
}
