import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class cpe222_391_2 extends JFrame{
  private JButton b1 = new JButton("Right");
  private JButton b2 = new JButton("Left");
  private JButton b3 = new JButton("Down");
  private JButton b4 = new JButton("Up");
  private JButton b5 = new JButton("Shrink");
  private JButton b6 = new JButton("Enlarge");
  private Drawpic pic = new Drawpic();
  
  public cpe222_391_2 (){
    JPanel p = new JPanel();
    
    p.add(b1);
    p.add(b2);
    p.add(b3);
    p.add(b4);
    p.add(b5);
    p.add(b6);
    
    this.add(pic,BorderLayout.CENTER);
    this.add(p,BorderLayout.SOUTH);
    
    b1.addActionListener(new ActionListener(){
      
      @Override
      public void actionPerformed(ActionEvent e){
        pic.right();
        pic.requestFocusInWindow();
      }
    });
    
    b2.addActionListener(new ActionListener(){
      
      @Override
      public void actionPerformed(ActionEvent e){
        pic.left();
        pic.requestFocusInWindow();
      }
    });
    
     b3.addActionListener(new ActionListener(){
      
      @Override
      public void actionPerformed(ActionEvent e){
        pic.down();
        pic.requestFocusInWindow();
      }
    });
     
     b4.addActionListener(new ActionListener(){
      
      @Override
      public void actionPerformed(ActionEvent e){
        pic.up();
        pic.requestFocusInWindow();
      }
    });
     
     b5.addActionListener(new ActionListener(){
      
      @Override
      public void actionPerformed(ActionEvent e){
        pic.shrink();
        pic.requestFocusInWindow();
      }
    });
     
     b6.addActionListener(new ActionListener(){
      
      @Override
      public void actionPerformed(ActionEvent e){
        pic.enlarge();
        pic.requestFocusInWindow();
      }
    });
     
     pic.setFocusable(true);
     pic.addKeyListener(new KeyAdapter(){
       
       @Override
       public void keyPressed(KeyEvent e){
         if(e.getKeyCode() == KeyEvent.VK_K){
           pic.up();
         }
         else if(e.getKeyCode() == KeyEvent.VK_I){
           pic.down();
         }
         else if(e.getKeyCode() == KeyEvent.VK_J){
           pic.left();
         }
         else if(e.getKeyCode() == KeyEvent.VK_L){
           pic.right();
         }
//         else if(e.getKeyCode() == KeyEvent.VK_A){
//           pic.shrink();
//         }
//         else if(e.getKeyCode() == KeyEvent.VK_D){
//           pic.enlarge();
//         }
       }
     });
    
  }
  
  public static void main(String[] args){
      JFrame frame = new cpe222_391_2();
      frame.setTitle("ControlCircleSqure");
      frame.setLocationRelativeTo(null);
      frame.setSize(600,600);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setVisible(true);
    }
  
   class Drawpic extends JPanel{
     private int x = 4;
     private int y = 2;
     private int xx = 2;
     private int yy = 4;
     private int xl = 6;
     private int yl = 4;
     private int xxl = 4;
     private int yyl = 6;
     
     public void up(){
      if(y>=1){
        y--;
        yy--;
        yl--;
        yyl--;
      }
      repaint();
    }
    
    public void down(){
      if(y < 4){
        y++;
        yy++;
        yl++;
        yyl++;
      }
      repaint();
    }
    
    public void left(){
      if(x>=3){
        x--;
        xx--;
        xl--;
        xxl--;
      }
      repaint();
    }
    
    public void right(){
      if(x <6){
        x++;
        xx++;
        xl++;
        xxl++;
      }
      repaint();
    }
    
    public void shrink(){
      if(true){
        
      }
      repaint();
    }
    
    public void enlarge(){
      if(true){
       
      }
      repaint();
    }
     
     @Override
    protected void paintComponent(Graphics g){
      super.paintComponent(g);
      
      g.setColor(Color.GREEN);
      g.fillOval(getWidth()*x/8,getHeight()*y/8,getWidth()*2/8,getHeight()*2/8);
      g.setColor(Color.BLACK);
      g.drawOval(getWidth()*x/8,getHeight()*y/8,getWidth()*2/8,getHeight()*2/8);
      
      g.setColor(Color.WHITE);
      g.fillOval(getWidth()*xx/8,getHeight()*yy/8,getWidth()*2/8,getHeight()*2/8);
      g.setColor(Color.BLACK);
      g.drawOval( getWidth()*xx/8,getHeight()*yy/8,getWidth()*2/8,getHeight()*2/8);
      
      g.setColor(Color.RED);
      g.drawLine(getWidth()*xx/8,getHeight()*yy/8,getWidth()*xl/8,getHeight()*yl/8);
      g.drawLine(getWidth()*x/8,getHeight()*y/8,getWidth()*xxl/8,getHeight()*yyl/8);
      
     
   }
}
}
     
  