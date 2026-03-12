import javax.swing.JOptionPane;

public class Ex1_6 {
    public static void main(String[] args) {

        String radius_srt = JOptionPane.showInputDialog(null, "Input Radiuse: "); // รับค่าเข้ามา
        double radius = Double.parseDouble(radius_srt); // แปลงค่าจากsrt => Double
        String lang_srt = JOptionPane.showInputDialog(null, "Input Langth: ");
        double length = Double.parseDouble(lang_srt);

        double area = (radius * radius) * Math.PI;
        double volume = area * length;

        JOptionPane.showMessageDialog(null, "The area is " + area); // Output
        JOptionPane.showMessageDialog(null, "The Volume of the cylinder is " + volume);

    }
}
