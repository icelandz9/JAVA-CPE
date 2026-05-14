import javax.swing.JOptionPane;

public class ex3_5_population{
    public static void main(String[] args){
        String populationInput = JOptionPane.showInputDialog("Enter the number of total students:");
        int population = Integer.parseInt(populationInput);

        double[] array = new double[population];
        int count_pop = 1;

        for(int i = 0; i < array.length; i++){
            String scoreInput = JOptionPane.showInputDialog("Enter scores of student " + count_pop);
            double input_dig = Double.parseDouble(scoreInput);
            array[i] = input_dig;
            count_pop++;
        }

        double sum = 0;

        for(int i = 0; i < array.length; i++){
            sum += array[i];
        }

        double x_bar = sum / population;
        double sumSquareDiff = 0;

        for(int i = 0; i < array.length; i++){
            double diff = array[i] - x_bar;
            double squareDiff = Math.pow(diff, 2);
            sumSquareDiff += squareDiff;
        }

        double variance = sumSquareDiff / (population - 1);
        double standardDeviation = Math.sqrt(variance);

        JOptionPane.showMessageDialog(null, "Mean value of student score: " + x_bar);
        JOptionPane.showMessageDialog(null, "Standard Deviation value of student score: " + standardDeviation);
    }
}