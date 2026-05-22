import java.awt.*;
import javax.swing.*;

public class Quiz10_1 extends JPanel {
  
  public void paint(Graphics g) {
    int x1 = (getWidth()/8)*3;
   int y1 = (getHeight()/8); 
   int w = (getWidth()/8)*4; 
   int h = (getHeight()/8)*4; 
   g.drawOval(x1,y1,w,h);
   
   int x2 = (getWidth()/8);
   int y2 = (getHeight()/8*3);
   g.drawOval(x2,y2,w,h);
  }
  
  public static void main(String[] args) {
    JFrame frame = new JFrame();
    frame.setTitle("DrawCircle");
    frame.add(new Quiz10_1());
    frame.setLocationRelativeTo(null);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(250,250);
    frame.setVisible(true);
  }
}