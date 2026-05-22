import javax.swing.*;
import java.awt.*;
public class PPIEBYMINT{
  public static void main(String[] args){
    JFrame f = new JFrame("DrawCircle");
    
    f.add(new drawcircle());
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setSize(600,600);
    f.setVisible(true);
  }
}
  
  class drawcircle extends JPanel{
    protected void paintComponent(Graphics g){
      super.paintComponent(g);
      int width = getWidth();
      int height = getHeight();
    
    g.setColor(Color.WHITE);
    g.fillOval(width/8,(int)(height/2.66),width/2,height/2);
    g.fillOval((int)(width/2.66),height/8,width/2,height/2);
    g.setColor(Color.BLACK);
    g.drawOval(width/8,(int)(height/2.66),width/2,height/2);
    g.drawOval((int)(width/2.66),height/8,width/2,height/2);
    g.drawLine(width/2,0,width/2,height);
    g.drawLine(0,height/2,width,height/2);
    g.setColor(Color.BLUE);
    g.drawLine(width/2,height/4,width,height/4);
    g.drawLine((int)(width/1.33),0,(int)(width/1.33),height/2);
    g.drawLine(width/4,height/2,width/4,height);
    g.drawLine(0,(int)(height/1.33),width/2,(int)(height/1.33));
    g.setColor(Color.RED);
    g.drawLine(width/4,(int)(height/1.6),width/2,(int)(height/1.6));
    g.drawLine((int)(width/2.66),height/2,(int)(width/2.66),(int)(height/1.33));
    g.drawLine(width/2,(int)(height/2.66),(int)(width/1.33),(int)(height/2.66));
    g.drawLine((int)(width/1.6),height/4,(int)(width/1.6),height/2); 
  }
}