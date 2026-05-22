import java.util.Scanner;
import javax.swing.JOptionPane;
public class Q03_298_01{
  public static void main(String[] args) {
    int i,num,mod,mod2,div,sum=0;
    for(i=0;i<=10000;i++)
    {
      num = (int)(Math.random()*61000)+15000;
      mod = num%10;
      if(mod==5)
      {
        System.out.print(num+" ");
        div = num/10;
        mod2 = div%10;
        if(mod2==5)
        {
        System.out.print(num+" ");
        sum++;
        }
      }
    }
  }
}