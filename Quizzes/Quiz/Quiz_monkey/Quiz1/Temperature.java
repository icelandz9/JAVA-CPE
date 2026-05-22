package Quiz.Quiz_monkey.Quiz1;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Temperature {
  public static void main(String[] args) {
    double F, C, K1, K2;
    String data = JOptionPane.showInputDialog(null, "Enter Temperature in Fahrenheit Unit");
    String data1 = JOptionPane.showInputDialog(null, "Enter Temperature in Celsius Unit");
    F = Integer.parseInt(data);
    C = Integer.parseInt(data1);
    K1 = (5.0 / 9.0) * (F - 32) + 273.15;
    K2 = C + 273;
    System.out.printf("The Temperature in Kelvin from Fahrenheit Unit is %.14f \n", K1);
    System.out.printf("The Temperature in Kelvin from Celsius Unit is %.2f", K2);
  }
}