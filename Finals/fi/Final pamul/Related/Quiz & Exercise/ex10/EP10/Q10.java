import java.awt.*;
import javax.swing.*;

public class Q10 extends JPanel {
  public void paint(Graphics g) {
    
    int x1 = getWidth()/8; 
    int y1 = getHeight()/8;
    
    int x2 = getWidth()*2/8; 
    int y2 = getHeight()*2/8;
    
    int x3 = getWidth()*3/8; 
    int y3 = getHeight()*3/8;
    
    int x4 = getWidth()*4/8; 
    int y4 = getHeight()*4/8;
    
    int x5 = getWidth()*5/8; 
    int y5 = getHeight()*5/8;
    
    int x6 = getWidth()*6/8; 
    int y6 = getHeight()*6/8;
    
    
    g.setColor(Color.WHITE);
    g.fillOval(x1,y1,x4,y4);
    
    g.setColor(Color.BLACK);
    g.drawOval(x1,y1,x4,y4);
    
    g.setColor(Color.WHITE);
    g.fillOval(x3,y1,x4,y4);
    
    g.setColor(Color.WHITE);
    g.fillOval(x1,y3,x4,y4);
    
    g.setColor(Color.BLACK);
    g.drawOval(x3,y1,x4,y4);
    
    g.setColor(Color.BLACK);
    g.drawOval(x1,y3,x4,y4);
    
    g.setColor(Color.RED);
    g.drawLine(x4,0,  x4,getWidth());
    g.drawLine(0,y4,  getWidth(), y4);
    
     g.setColor(Color.BLUE);
     g.drawLine(x6,   0,    x6, y4);
     g.drawLine(x2,   y2,   getWidth(), y2);
     g.drawLine(x2,   y2,   x2, getHeight());
     g.drawLine(0,   y6,    x4, y6);
     
    g.setColor(Color.GREEN);
    g.drawLine(x3,   y3,   x3, y6);
    g.drawLine(x5,   y2,   x5, y4);
    g.drawLine(x3,   y3,   x6, y3);
    g.drawLine(x2,   y5,   x4, y5);
  }


public static void main(String[] args) {
    JFrame frame = new JFrame();
    frame.setTitle("DrawCircle");
    frame.add(new Q10());
    frame.setLocationRelativeTo(null);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(400,400);
    frame.setVisible(true);
  }
}