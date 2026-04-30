import javax.swing.JOptionPane;
public class quiz2_1{
  public static void main(String[] args){
    String X = JOptionPane.showInputDialog(null,"Enter loan amount (Baht).e.g..100,000");
    int x = Integer.parseInt(X);
    String D = JOptionPane.showInputDialog(null,"Enter number of months");
    int d = Integer.parseInt(D);
    double K;
    switch(d){
      case 3:
        K = x*(4.0/100.0)*(3.0/12.0);
        JOptionPane.showMessageDialog(null,"Total paymeat of interest are" + K + "Baht.");
        break;
      case 6:
        K = x*(5.5/100.0)*(6.0/12.0);
        JOptionPane.showMessageDialog(null,"Total paymeat of interest are" + K + "Baht.");
        break;
      case 12:
        K = x*(6.0/100.0)*(12.0/12.0);
        JOptionPane.showMessageDialog(null,"Total paymeat of interest are" + K + "Baht.");
        break;
      case 15:
        K = x*(6.25/100.0)*(15.0/12.0);
        JOptionPane.showMessageDialog(null,"Total paymeat of interest are" + K + "Baht.");
        break;
      case 18:
        K = x*(6.5/100.0)*(18.0/12.0);
        JOptionPane.showMessageDialog(null,"Total paymeat of interest are" + K + "Baht.");
        break;
    }
  }
}