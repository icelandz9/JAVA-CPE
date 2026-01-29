import javax.swing.JOptionPane; //inputทำให้มีpopupขึ้นมา

public class Area_Volume {
  public static void main(String[] args) {

    double area, radius, volume, length;

    String radius_srt = JOptionPane.showInputDialog(null, "Input Radiuse: "); //รับค่าเข้ามา
    radius = Double.parseDouble(radius_srt); //แปลงค่าจากsrt => Double
    String lang_srt = JOptionPane.showInputDialog(null, "Input Langth: ");
    length = Double.parseDouble(lang_srt);

    area = (radius * radius) * Math.PI;
    volume = area * length;

    JOptionPane.showMessageDialog(null, "The area is " + area); //Output
    JOptionPane.showMessageDialog(null, "The Volume of the cylinder is " + volume);

  }
}
