import javax.swing.JOptionPane;

public class Exercise1_07 {
  public static void main(String[] agrs) {
    String pound = JOptionPane.showInputDialog(null, "Enter a number in pound :");
    Double Pound = Double.parseDouble(pound);
    Pound *= 0.454;
    JOptionPane.showMessageDialog(null, "it is " +Pound+ " Kg");

  }
} 