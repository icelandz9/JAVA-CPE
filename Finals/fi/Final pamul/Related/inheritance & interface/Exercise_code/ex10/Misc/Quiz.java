import java.awt.*;
import javax.swing.*;
public class Quiz extends JPanel{
  @Override
  protected void paintComponent(Graphics g){
    super.paintComponent(g); 
    g.setColor(Color.BLACK);
    int x1 = (getWidth()/8);
   int y1 = (getHeight()/8); 
   int w = (getWidth()/8)*4; 
   int h = (getHeight()/8)*4; 
   g.fillRect(x1,y1,w,h);
  
   g.setColor(Color.RED);
   int x2 = (getWidth()/8);
   int y2 = (getHeight()/8); 
   int w1 = (getWidth()/8)*4; 
   int h1 = (getHeight()/8)*4; 
   g.fillOval(x2,y2,w1,h1);
  
     }
  public static void main(String[] args){
    Quiz q = new Quiz();
    JFrame f = new JFrame("DrawShape");
    f.add(q);
    f.setSize(400,400);
    f.setLocationRelativeTo(null);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setVisible(true);
  }
}