import javax.swing.*;
import java.awt.*;
public class Quiz10_2
{
  public static void main(String[] args){
    JFrame f = new JFrame("DrawCircle");
    
    f.add(new drawcircle());
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setSize(800,800);
    f.setVisible(true);
    
  }
}

  class drawcircle extends JPanel{
    protected void paintComponent(Graphics g){
      super.paintComponent(g);
      
      int width = getWidth();
      int height = getHeight();
      
      //กลมขวา
      g.setColor(Color.WHITE);
      g.fillOval((width/2)-(width/8),(height/4),(width/2),(height/2));
      
      //ขอบกลมขวา
      g.setColor(Color.BLACK);
      g.drawOval((width/2)-(width/8),(height/4),(width/2),(height/2));
      
      g.setColor(Color.WHITE);
      //กลมซ้าย
      g.fillOval((width/8),(height/4),(width/2),(height/2));
      
      
      g.setColor(Color.BLACK);
      //ขอบกลมซ้าย 
      g.drawOval((width/8),(height/4),(width/2),(height/2));
     
      //เส้นกลาง
      g.setColor(Color.RED);
      //เเนวตั้ง
      g.drawLine(width/2,0,width/2,height);
      //แนวนอน     
      g.drawLine(0,height/2,width,height/2);
      
      g.setColor(Color.BLUE);
      //เส้นแนวตั้งวงกลมซ้าย
      g.drawLine(width/4,0,width/4,height/2);
      //เส้นแนวนอนซ้ายไปขวา
      g.drawLine(0,height/4,width/2,height/4);
      //เส้นแนวนอนขวาล่าง
      g.drawLine(width/2,height-(height/4),width,height-(height/4));
      //เเนวตั้งขวาล่าง
      g.drawLine(width-(width/4),height/2,width-(width/4),height);
   
      g.setColor(Color.GREEN);
      //เส้นแนวนอนซ้ายไปขวา
      g.drawLine(width/4,(height/4)+(height/8),(width/2)+(width/8),(height/4)+(height/8));
      //เส้นเเนวตั้งบนข้างขวาลงล่าง
      g.drawLine((width/2)+(width/8),(height/4)+(height/8),(width/2)+(width/8),(height/2)+(height/4));
     //เส้นเเนวตั้งวงกลมซ้าย
      g.drawLine((width/4)+(width/8),(height/4),(width/4)+(width/8),(height/2)+(height/8));
     //เส้นวงกลมล่างขวาไปซ้าย 
      g.drawLine((width/2)-(width/8),(height/2)+(height/8),(width/2)+(width/4),(height/2)+(height/8));
    }
  }