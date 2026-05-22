import javax.swing.JOptionPane;
public class Ex6
{ 
  public static void main(String[] args)
  {
    String R = JOptionPane.showInputDialog(null,"Enter Redius of cylinder");
    String L = JOptionPane.showInputDialog(null,"Enter Length of cylinder");
    double r1 = Double.parseDouble(R);
    double L1 = Double.parseDouble(L);
    double a = r1*r1*Math.PI;
    double v = a*L1;
    JOptionPane.showMessageDialog(null, "The area is " +a);
    JOptionPane.showMessageDialog(null, "The volume is " +v);
  }
}  