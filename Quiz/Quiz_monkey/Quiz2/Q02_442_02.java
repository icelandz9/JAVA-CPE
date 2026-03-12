package Quiz.Quiz_monkey.Quiz2;

import java.util.Scanner;

public class Q02_442_02 {
  public static void main(String args[]) {
    Scanner y = new Scanner(System.in);
    System.out.print("Enter a year:");
    int a = y.nextInt();
    int b = a % 12;
    int c = a % 4;

    switch (b) {
      case 4:
        System.out.print("The Chinese zodiac of " + a + " is Rat");
        break;
      case 5:
        System.out.print("The Chinese zodiac of " + a + " is Ox");
        break;
      case 6:
        System.out.print("The Chinese zodiac of " + a + " is Tiger");
        break;
      case 7:
        System.out.print("The Chinese zodiac of " + a + " is Rabbit");
        break;
      case 8:
        System.out.print("The Chinese zodiac of " + a + " is Dragon");
        break;
      case 9:
        System.out.print("The Chinese zodiac of " + a + " is Snake");
        break;
      case 10:
        System.out.print("The Chinese zodiac of " + a + " is Horse");
        break;
      case 11:
        System.out.print("The Chinese zodiac of " + a + " is Goat");
        break;
      case 0:
        System.out.print("The Chinese zodiac of " + a + " is Monkey");
        break;
      case 1:
        System.out.print("The Chinese zodiac of " + a + " is Rooster");
        break;
      case 2:
        System.out.print("The Chinese zodiac of " + a + " is Dog");
        break;
      case 3:
        System.out.print("The Chinese zodiac of " + a + " is Pig");
        break;
    }
    switch (c) {
      case 0:
        System.out.print(" and the Olympic Games was held in " + a + ".");
        break;
      case 1:
        System.out.print(" and the Olympic Games was not held in " + a + ".");
        break;
      case 2:
        System.out.print(" and the Olympic Games was not held in " + a + ".");
        break;
      case 3:
        System.out.print(" and the Olympic Games was not held in " + a + ".");
        break;
    }
  }
}
