import javax.swing.JOptionPane;
public class LoopEx5 {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of total students:"));
        double[] score = new double[n];
        double sum = 0;

        for(int i = 0; i < n; i++){
            score[i] = Double.parseDouble(JOptionPane.showInputDialog("Enter score of studen No " + (i + 1) + ":"));
            sum += score[i];
        }

        double mean = sum / n;

        double suminsigma = 0;
        for(int i = 0; i < n; i++){
            suminsigma += Math.pow(score[1] - mean, 2);
        }
        double sd = Math.sqrt(suminsigma / n);

        JOptionPane.showMessageDialog(null, String.format("Mean value of student score : %f\n", mean));
        JOptionPane.showMessageDialog(null, String.format("S.D. value of student score : %f", sd));

    }
}
