import java.awt.*;
import javax.swing.*;

public class Quiz10_453 extends JPanel {
  public void paint(Graphics g) {
    
    //วงหนึ่ง
    int x1 = getWidth()/8; 
    int y1 = getHeight()/4;
    int h = x1*4; 
    int w = getHeight()/2; 
    g.drawOval(x1,y1,h,w);
    //วงสอง
    int x2 = x1*3; 
    int y2 = y1*1; 
    g.drawOval(x2,y2,h,w);
    
    //เส้น
    int x3 = getWidth()/2;
    int y3 = getHeight()/2;
    g.drawLine(0,y3,getWidth(),y3);
    g.drawLine(x3,0,x3,getHeight());
    
    g.setColor(Color.BLUE);
    g.drawLine((x3/2)*3,0,(x3/2)*3,(y3/2)*2);
    g.drawLine((x3/2)*2,(y3/2),(x3/2)*4,(y3/2));
    g.drawLine((x3/2),(y3/2)*2,(x3/2),(y3/2)*4);
    g.drawLine(0,(y3/2)*3,(x3/2)*2,(y3/2)*3);
    
    g.setColor(Color.RED);
    g.drawLine((getWidth()/8)*5,(getHeight()/8)*2,(getWidth()/8)*5,(getHeight()/8)*4);
    g.drawLine((getWidth()/8)*4,(getHeight()/8)*3,(getWidth()/8)*6,(getHeight()/8)*3);
    g.drawLine((getWidth()/8)*2,(getHeight()/8)*5,(getWidth()/8)*4,(getHeight()/8)*5);
    g.drawLine((getWidth()/8)*3,(getHeight()/8)*4,(getWidth()/8)*3,(getHeight()/8)*6);
  }
  
  public static void main(String[] args) {
    JFrame frame = new JFrame();
    frame.setTitle("DrawCircle");
    frame.add(new Quiz10_453());
    frame.setLocationRelativeTo(null);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(350,350);
    frame.setVisible(true);
  }
}