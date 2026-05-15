import javax.swing.*;
import java.awt.*;
public class Ex1_D extends JFrame
{
  public Ex1_D()
  {
    JPanel p = new JPanel();
    JPanel p1 = new JPanel();
    JPanel p2 = new JPanel();
    p.setLayout(new GridLayout(8,8));
    for(int i= 1;i<=8;i++)
    { 
     /*if row is even black bt first*/ 
      if(i%2!=0)//even row
      {
        for(int j = 1;j<=8;j++)
        {
          JButton button = new JButton(""); 
          if(j%2==0)
          {
            button.setBackground(Color.BLACK);
            p.add(button);
          }
          else
          {
            button.setBackground(Color.WHITE);
            p.add(button);
          }
          
        }
      }
      else//odd row
      {
        for(int j = 1;j<=8;j++)
        {
          JButton button = new JButton(""); 
          if(j%2==0)
          {
            button.setBackground(Color.WHITE);
            p.add(button);
          }
          
          else
          {
            button.setBackground(Color.BLACK);
            p.add(button);
          }
        }
      }
    }
    add(p);
  }
   public static void main(String[] args)
  {
    JFrame frame = new Ex1_D();
    frame.setSize(400,400);
    frame.setLocationRelativeTo(null);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }
}