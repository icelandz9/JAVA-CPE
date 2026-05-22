import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class cpe222_442_05 extends JFrame {
  JButton jbtUp = new JButton("Up");
  JButton jbtDown = new JButton("Down");
  JButton jbtLeft = new JButton("<<");
  JButton jbtRight = new JButton(">>");
  
  Circle cc = new Circle();
  
  public cpe222_442_05(){
    JPanel p1 = new JPanel();
    p1.setLayout(new BorderLayout());
    p1.add(cc ,BorderLayout.CENTER);
    
    JPanel p2 = new JPanel();
    p2.setLayout(new FlowLayout());
    p2.add(jbtLeft);
    p2.add(jbtRight);
    p2.add(jbtUp);
    p2.add(jbtDown);
    p1.add(p2 ,BorderLayout.SOUTH);
    
    add(p1);
    
    jbtUp.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
        cc.requestFocusInWindow();
        cc.up();
        repaint();
      }
    });
    jbtDown.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
        cc.requestFocusInWindow();
        cc.down();
        repaint();
      }
    });
    jbtLeft.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
        cc.requestFocusInWindow();
        cc.left();
        repaint();
      }
    });
    jbtRight.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
        cc.requestFocusInWindow();
        cc.right();
        repaint();
      }
    });
    
    cc.setFocusable(true);
    cc.addKeyListener(new KeyAdapter()
     {
     public void keyPressed(KeyEvent e)
      {
       switch(e.getKeyCode())
        {
          case KeyEvent.VK_UP:cc.up();
          repaint();
          break;
          case KeyEvent.VK_DOWN:cc.down();
          repaint();
          break;
          case KeyEvent.VK_LEFT:cc.left();
          repaint();
          break;
          case KeyEvent.VK_RIGHT:cc.right();
          repaint();
          break;
        }
       }
      });
  }
  
  class Circle extends JPanel{
    
    //ไว้เลื่อน
    private int x;
    private int y;
    
    public void up(){
      y--;
      repaint();
    }
    public void down(){
      y++;
      repaint();
    }
    public void left(){
      x--;
      repaint();
    }
    public void right(){
      x++;
      repaint();
    }
    
    protected void paintComponent(Graphics g){
     super.paintComponent(g);

     int width = getWidth();
     int height = getHeight();
     
      g.setColor(Color.WHITE);
      //กลมขวา
      g.fillOval(((getWidth()/2)-(getWidth()/8))+x,(getHeight()/8)+y,getWidth()/2,getHeight()/2);
      //กลมซ้าย
      g.fillOval((getWidth()/8)+x,(getHeight()/8)+y,getWidth()/2,getHeight()/2);
      //กลมล่าง
      g.fillOval(((getWidth()/2)-(getWidth()/4))+x,((getHeight()/4)+(getHeight()/8))+y,getWidth()/2,getHeight()/2);
      
      g.setColor(Color.BLACK);
      //ขอบกลมขวา
      g.drawOval(((getWidth()/2)-(getWidth()/8))+x,(getHeight()/8)+y,getWidth()/2,getHeight()/2);
      //ขอบกลมซ้าย 
      g.drawOval((getWidth()/8)+x,(getHeight()/8)+y,getWidth()/2,getHeight()/2);
      //ขอบกลมล่าง
      g.drawOval(((getWidth()/2)-(getWidth()/4))+x,((getHeight()/4)+(getHeight()/8))+y,getWidth()/2,getHeight()/2);
    }
  }
  
  //main
  public static void main(String[] args){
    JFrame frame = new cpe222_442_05();
    frame.setTitle("ControlCircle");
    frame.setSize(500,500);
    frame.setLocationRelativeTo(null);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }
}