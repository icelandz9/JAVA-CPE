import java.util.Random;
import javax.swing.JOptionPane;
public class quiz3_1
{
  public static void main(String[] args)
  {
        Random rand = new Random();
        double[][] x = new double[5][5];
        double sum=0.0;
        for(int i=0;i<5;i++)
        {
          for(int j=0;j<5;j++)
          {
          int num = rand.nextInt(2000);
          int num1 = num-1500;
          x[i][j]=num1;
          System.out.print(x[i][j]+"\t\t");
          if(x[i][j]%2==1)
          {
            sum += x[i][j];
          }
          }
          System.out.println("");
        }
       JOptionPane.showMessageDialog(null,"The sum of all odd in the 5x5 martrix is :"+sum);
   }
  }