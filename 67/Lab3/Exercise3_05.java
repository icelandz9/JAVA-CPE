import javax.swing.JOptionPane;

public class Exercise3_05 {
  public static void main(String[] agrs) {
    String students = JOptionPane.showInputDialog(null, "Enter the number of total students :");
    int Students = Integer.parseInt(students);
    double Sum=0,Sum_1=0;
    for (int i=1;i<=Students;i++) {
      String scores = JOptionPane.showInputDialog(null, "Enter scores of students No "+i+"");
      double Scores = Double.parseDouble(scores);
      Sum += Scores;
    }
    Sum /= Students;
    JOptionPane.showMessageDialog(null, "Mean value of student scores "+Sum);
    
    for (int i=1;i<=Students;i++) {
      String scores = JOptionPane.showInputDialog(null, "Enter scores of students No "+i+"");
      double Scores = Double.parseDouble(scores);
      double Sum_2 = (Scores - Sum)*(Scores - Sum);
      Sum_1 += Sum_2;
    }
    Sum_1 = Math.sqrt(Sum_1 /= Students);
    JOptionPane.showMessageDialog(null, "Mean value of student scores "+Sum_1);
  }
} 