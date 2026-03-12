import java.util.Scanner;

public class cpe222_442_01 {
  public static void main(String[] args) {
    Scanner sn = new Scanner(System.in);

    Square s1 = new Square();
    s1.printSquare();

    Square s2 = new Square(5.0, 6.0);
    s2.printSquare();

    Square s3 = new Square(5.0, 3.0, 2.0);
    s3.printSquare();

    sn.close();
  }
}