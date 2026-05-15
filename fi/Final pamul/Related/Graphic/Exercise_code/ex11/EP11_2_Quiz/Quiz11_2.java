import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.border.TitledBorder;
public class Quiz11_2 extends JFrame{  
  drawArc pic = new drawArc();
  public int click = 0;
    
  public Quiz11_2(){
    JPanel p = new JPanel(new GridLayout(1,1));
    p.add(pic);
    add(p);
    pic.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
        if(click!=1){
          pic.getColor('B');
          pic.getRadius(0);
          int r = Integer.parseInt
            (JOptionPane.showInputDialog
               (null,"Please enter radius of circle"));
          pic.getRadius(r);
          click = 1;
        }
        else{
          int c = Integer.parseInt
            (JOptionPane.showInputDialog
               (null,"Please enter 0 for Yellow or 1 for Blue or 2 for Red. It will the GREEN otherwise"));
          pic.getColor(c);
          click = 0;
          pic.timeToSwitchColor(click);
        }
      }
    }
    );
  } 
  public static void main(String[] args) {
    JFrame frame = new Quiz11_2();
    frame.setTitle("CPE222 : Quiz11");
    frame.setSize(600,600);
    frame.setLocationRelativeTo(null);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }
}

class drawArc extends JButton{
  private int radius = 0;
  private int color = 'B';
  private int click = 1;
  public void timeToSwitchColor(int click){
    this.click = click;
    repaint();//วาดใหม่
  }
  public void getRadius(int Radius){
    this.radius = Radius;
  }
  public void getColor(int Color){
    color = Color;
    repaint();
  }
  protected void paintComponent(Graphics g){
    super.paintComponent(g);
    g.setColor(Color.GREEN);
    if(click==0){
      switch(color){
        case 0:  g.setColor(Color.YELLOW); break;
        case 1:  g.setColor(Color.BLUE);   break;
        case 2:  g.setColor(Color.RED);    break;
        default: g.setColor(Color.GREEN);  break;       
      }  
    }
    int xCenter = getWidth()/2;
    int yCenter = getHeight()/2;
    int x = xCenter - radius;
    int y = yCenter - radius;
    //ใบพัดขวา
    g.fillArc(x, y, 2 * radius, 2 * radius, 15, 30);
    //ใบพัดซ้าย
    g.fillArc(x, y, 2 * radius, 2 * radius, 140, 30);
    //ใบพัดล่าง
    g.fillArc(x, y, 2 * radius, 2 * radius, 255,30);
        
  }
}