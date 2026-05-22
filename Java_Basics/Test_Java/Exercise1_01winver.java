import javax.swing.JOptionPane;
public class Exercise1_01winver {
  public static void main(String[] args) {
    
    String numberInput = JOptionPane.showInputDialog("Enter inches as an integer: " );
    Double number = Double.parseDouble(numberInput);
    JOptionPane.showMessageDialog(null ,"The value int centimaters is : " + (number / 0.3937));
  }
}

