import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class cpe222_431_02 extends JFrame{
  private JButton up = new JButton("Up");
  private JButton down = new JButton("Down");
  private JButton left = new JButton("Left");
  private JButton right = new JButton("Right");
  square rect = new square();
  
  public cpe222_431_02(){
    JPanel p = new JPanel();
    p.setLayout(new BorderLayout());
    p.add(rect ,BorderLayout.CENTER);
    
    JPanel p1 = new JPanel();
    p1.setLayout(new FlowLayout());
    p1.add(up);
    p1.add(down);
    p1.add(left);
    p1.add(right);
    p.add(p1,BorderLayout.SOUTH);
    add(p);
    
    up.addActionListener(new ActionListener(){  
     public void actionPerformed(ActionEvent e){
       rect.requestFocusInWindow();
       rect.up();
       repaint();
     }
    });
    
    down.addActionListener(new ActionListener(){  
     public void actionPerformed(ActionEvent e){
       rect.requestFocusInWindow();
       rect.down();
       repaint();
     }
    });
    
    left.addActionListener(new ActionListener(){  
     public void actionPerformed(ActionEvent e){
       rect.requestFocusInWindow();
       rect.left();
       repaint();
     }
    });
    
    right.addActionListener(new ActionListener(){  
     public void actionPerformed(ActionEvent e){
       rect.requestFocusInWindow();
       rect.right();
       repaint();
     }
    });
    
    rect.setFocusable(true);
    rect.addKeyListener(new KeyAdapter(){
     public void keyPressed(KeyEvent e){
       switch(e.getKeyCode()){
         case KeyEvent.VK_UP:rect.up(); repaint();
         break;
         case KeyEvent.VK_DOWN:rect.down(); repaint();
         break;
         case KeyEvent.VK_LEFT:rect.left(); repaint();
         break;
         case KeyEvent.VK_RIGHT:rect.right(); repaint();
         break;
       }
     }
    });
  }

    public static void main(String[] args){
      JFrame frame = new cpe222_431_02();
      frame.setTitle("ControlCircle");
      frame.setLocationRelativeTo(null);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setSize(300,300);
      frame.setVisible(true);
    }
    
    class square extends JPanel{
      private int x=0;
      private int y=0;
    
      public void up(){
        y-=10;
        repaint();
      }
      public void down(){
        y+=10;
        repaint();
      }
      public void left(){
        x-=10;
        repaint();
      }
      public void right(){
        x+=10;
        repaint();
      }
      
     protected void paintComponent(Graphics g){
     super.paintComponent(g);

     int width = getWidth();
     int height = getHeight();
     
      g.setColor(Color.WHITE);
      //กลมขวา
      g.fillOval((width/2)-(width/8),height/8,width/2,height/2);
      //กลมซ้าย
      g.fillOval(width/8,height/8,width/2,height/2);
      //กลมล่าง
      g.fillOval((width/2)-(width/8),(height/4)+(height/8),width/2,height/2);
      
      g.setColor(Color.BLACK);
      //ขอบกลมขวา
      g.drawOval((width/2)-(width/8),height/8,width/2,height/2);
      //ขอบกลมซ้าย 
      g.drawOval(width/8,height/8,width/2,height/2);
      //ขอบกลมล่าง
      g.drawOval((width/2)-(width/8),(height/4)+(height/8),width/2,height/2);
    }
  }  
}