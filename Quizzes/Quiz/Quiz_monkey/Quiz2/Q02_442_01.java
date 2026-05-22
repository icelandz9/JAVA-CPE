package Quiz.Quiz_monkey.Quiz2;

import java.util.Scanner;

public class Q02_442_01 {
  public static void main(String args[]) {
    Double rnd = Math.random();
    int r = (int) ((rnd * 60) + 21);
    int a1 = r % 10;
    int a2 = r % 7;
    Scanner sn = new Scanner(System.in);
    System.out.println("Please enter gess score(1-3) : ");
    int x = sn.nextInt();

    if (a1 == 4 || a1 == 9) {
      if (x == 2) {
        System.out.println("Random number is " + r + " => lucky number = 2");
        System.out.println("The lucky is 2 Your lucky number is 2. You correct");
      } else if (x != 2) {
        System.out.println("Random number is " + r + " => lucky number = 2");
        System.out.println("The lucky is 2 Your lucky number is " + x + " Sorry you wrong");
      }
    }

    else if (a2 == 0) {
      if (x == 3) {
        System.out.println("Random number is " + r + " => lucky number = 3");
        System.out.println("The lucky is 3 Your lucky number is 3. You correct");
      } else if (x != 3) {
        System.out.println("Random number is " + r + " => lucky number = 3");
        System.out.println("The lucky is 3 Your lucky number is " + x + " Sorry you wrong");
      }
    }

    else if (x == 1) {
      System.out.println("Random number is " + r + " => lucky number = 1");
      System.out.println("The lucky is 1 Your lucky number is " + x + " You correct");
    } else if (x != 1) {
      System.out.println("Random number is " + r + " => lucky number = 1");
      System.out.println("The lucky is 1 Your lucky number is " + x + " Sorry you wrong");
    }
  }

}