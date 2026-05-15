package Quiz.Quiz_monkey.Quiz1;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Area {
  public static void main(String[] args) {
    double rad, height, area, volume, sum1;
    double P = 3.14;
    Scanner sn = new Scanner(System.in);
    System.out.print("Enter the radius and height of a cylender : ");
    rad = sn.nextDouble();
    height = sn.nextDouble();
    sum1 = rad + height;
    area = 2 * P * rad * sum1;
    volume = P * (rad * rad) * height;
    JOptionPane.showInputDialog(null, "The cylender area is ", area);
    JOptionPane.showInputDialog(null, "The volune of the cylinder is ", volume);
  }
}