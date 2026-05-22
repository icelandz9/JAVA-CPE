import javax.swing.JOptionPane;

public class Ex5gpt {
    public static void main(String[] args) {
        double sum = 0.0, mean = 0.0, sd = 0.0, xf = 0.0;
        String n = JOptionPane.showInputDialog(null, "Enter the number of total of student");
        int nt = Integer.parseInt(n);
        double[] x = new double[nt];
        for (int i = 0; i < nt; i++) {
            int no = i + 1;
            String b = JOptionPane.showInputDialog(null, "Enter score Student No." + no);
            double y = Double.parseDouble(b);
            x[i] = y;
            sum += y;
        }
        mean = sum / nt;
        for (int j = 0; j < nt; j++) {
            xf += Math.pow((x[j] - mean), 2);
        }
        sd = Math.sqrt(xf / nt);
        JOptionPane.showMessageDialog(null, "mean value is " + mean);
        JOptionPane.showMessageDialog(null, "S.D. value is " + sd);
    }
}
