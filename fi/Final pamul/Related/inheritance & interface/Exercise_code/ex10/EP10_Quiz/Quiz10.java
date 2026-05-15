import javax.swing.*;
import java.awt.*;

public class Quiz10 extends JFrame {
  public Quiz10() {
    add(new circle_quiz10());
  }
  public static void main(String[] args) {
    Quiz10 f = new Quiz10();
    f.setTitle("Quiz10");
    f.setLocationRelativeTo(null);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setSize(350,350);
    f.setVisible(true);
  }

class circle_quiz10 extends JPanel {
  protected void paintComponent(Graphics g){
    super.paintComponent(g);
    int radiusC1 = (int)(Math.min(getWidth(),getHeight())*0.3*0.5);
    int radiusC2 = radiusC1*2;
    int radiusC3 = radiusC1*3;
    int width = getWidth();
    int height = getHeight();
    
    //draw circle
    if(width > height) {
    g.setColor(Color.ORANGE);
    g.fillOval((height/2)-radiusC3,(height/2)-radiusC3,2*radiusC3,2*radiusC3);
    
    g.setColor(Color.WHITE);
    g.fillOval((height/2)-radiusC2,(height/2)-radiusC2,2*radiusC2,2*radiusC2);
  
    g.setColor(Color.BLUE);
    g.fillOval((height/2)-radiusC1,(height/2)-radiusC1,2*radiusC1,2*radiusC1);
    }
    else if (width < height) {
    g.setColor(Color.GREEN);
    g.fillOval((width/2)-radiusC3,(width/2) - radiusC3,2*radiusC3,2*radiusC3);
        
    g.setColor(Color.PINK);
    g.fillOval((width/2)-radiusC2,(width/2) - radiusC2,2*radiusC2,2*radiusC2);
        
    g.setColor(Color.CYAN);
    g.fillOval((width/2)-radiusC1,(width/2) - radiusC1,2*radiusC1,2*radiusC1);
    }
    else {
    g.setColor(Color.BLACK);
    g.fillOval((width/2)-radiusC3,(height/2)- radiusC3,2*radiusC3,2*radiusC3);
        
    g.setColor(Color.RED);
    g.fillOval((width/2)-radiusC2,(height/2)- radiusC2,2*radiusC2,2*radiusC2);
        
    g.setColor(Color.YELLOW);
    g.fillOval((width/2)-radiusC1,(height/2)- radiusC1,2*radiusC1,2*radiusC1);
    }
    
      
  }
}
}