import javax.swing.JOptionPane;
  public class quiz1
{
  public static void main(String[] args)
  {
    String min0 = JOptionPane.showInputDialog(null,"Enter the number of minutes");
    int min = Integer.parseInt(min0);
    int year = min/525600;
    int min2 = min-(year*525600);
    int day = min2/1440;
    int min3 = min2-(day*1440);
    JOptionPane.showMessageDialog(null,min+" minutes is approximately "+year+" years"+day+" days and "+min3+"minutes");
    
  }
}