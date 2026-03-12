import javax.swing.JOptionPane;

public class Ex1_7 {
    public static void main(String[] args) {
        String pounds_srt = JOptionPane.showInputDialog(null, "Input Radiuse: "); // รับค่าเข้ามา
        double pound = Double.parseDouble(pounds_srt); // แปลงค่าจากsrt => Double
        
        double result = pound * 0.454;

        JOptionPane.showMessageDialog(null, "It is " + result + " kilograms"); // Output

    }
}
