import javax.swing.JOptionPane;

public class Popup {
    public static void main(String[] args) {
        
        int num1, num2, num3;

        String data = JOptionPane.showInputDialog(null, "Input ur Name");
        JOptionPane.showMessageDialog(null,"Your name is "+ data); 
        // สามารถใส่ตัวเลขได้

        String num_srt = JOptionPane.showInputDialog(null, "Input UR Number");
        num1 = Integer.parseInt(num_srt);
        // ถ้าใใส่ตัวอักษรจะ error แล้วหายไปเลย

        JOptionPane.showMessageDialog(null,"Your number is " +  num1);
    }
}
