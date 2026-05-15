import javax.swing.JOptionPane;
public class box1{
  public static void main(String[] args){
    double weight = Double.parseDouble(JOptionPaen.showInputDiaLog("Enter the amount of water in kilograms:"));
    double temp1 = Double.parseDouble(JOptionPane.showInputDiaLog("Enter the initial temperature: "));
    double temp2 = Double.parseDouble(JOptionPane.showInputDiaLog("Enter the finaltemperature: "));
    
    Double Q = weight * (temp2 - temp1) *4184;
    JOptionPane.showMessageDiaLog(null,"The energy needed is" +Q);
  }
}