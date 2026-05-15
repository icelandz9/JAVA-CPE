import javax.swing.JOptionPane;
public class Standard_deviation{
  public static void main(String[] args){
    int i=0;
    double[] score = new double[9999999];
    double xbar=0, x=0, xi=0, xpow=0, sd=0;
    String number = JOptionPane.showInputDialog(null, "Enter the number of total students :");
    int num = Integer.parseInt(number);
    for(i=1;i<=num;i++)
    {
      String b = JOptionPane.showInputDialog(null, "Enter scores of student No "+i);
      double a = new Double(b);
      score[i] = a;
      x = x+score[i];
    }
    xbar = x/num;
    for(i=1;i<=num;i++)
    {
      xi = Math.pow((score[i]-xbar),2);
      xpow = xpow+xi;
    }
    sd = Math.sqrt((xpow/num)*(xpow/num));
    JOptionPane.showMessageDialog(null, "Mean value of student score : "+xbar, "Information Message",JOptionPane.INFORMATION_MESSAGE);
    JOptionPane.showMessageDialog(null, "S.D. value of student score : "+sd, "Information Message",JOptionPane.INFORMATION_MESSAGE);
  }
}