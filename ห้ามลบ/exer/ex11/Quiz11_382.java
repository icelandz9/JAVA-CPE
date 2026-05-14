import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Quiz11_382 extends JFrame{
  drawArc A = new drawArc();
  int click = 0;
  //วงกลมในห้าเหลี่ยม
  public Quiz11_382(){
    JPanel p = new JPanel(new GridLayout(1,1));
    p.add(A);
    add(p);
    
    A.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
        if(click!=1){
          A.getColor(3);
          A.getRadius(0);
          int c = Integer.parseInt
          (JOptionPane.showInputDialog(null,"Please enter radius of Polygon"));
          A.getRadius(c);
          click = 1;
        }
        else{
          int c2 = Integer.parseInt
          (JOptionPane.showInputDialog(null,"Please enter 0 for Black or 1 for Green or 2 for Blue. It will the Red otherwise"));
          A.getColor(c2);
          click = 0;
        }
      }
    });
  }
   public static void main(String[] args) {
    JFrame frame = new Quiz11_382 ();
    frame.setTitle("CPE 222 : Quiz 11");
    frame.setSize(800,800);
    frame.setLocationRelativeTo(null);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }
}

class drawArc extends JButton{
  int radius = 0;
  int color = 3;
  
  public void getRadius(int Radius){
    radius = Radius;
    repaint();// วาดใหม่
  }
  public void getColor(int Color){
    color = Color;
    repaint();
  }
  protected void paintComponent(Graphics g){
    super.paintComponent(g);
    switch(color){
      case 0: g.setColor(Color.BLACK); break;
      case 1: g.setColor(Color.GREEN); break;
      case 2: g.setColor(Color.BLUE); break;
      case 3: g.setColor(Color.RED); break;
      default: g.setColor(Color.RED); break;       
    }
    
    int w = getWidth()/2;
    int h = getHeight()/2;
    
    int r = radius -15;
    int x = w - r/2;
    int y = h - r/2;
    
    Polygon pol = new Polygon();
    pol.addPoint((int)(w + radius * Math.cos( Math.PI / 6)),(int)(h - radius * Math.sin( Math.PI / 6)));    
    pol.addPoint((int)(w + radius * Math.cos( Math.PI / 2)),(int)(h - radius * Math.sin( Math.PI / 2)));
    pol.addPoint((int)(w + radius * Math.cos( 5 * Math.PI / 6)),(int)(h - radius * Math.sin( 5 * Math.PI / 6)));
    pol.addPoint((int)(w + radius * Math.cos( 5 * Math.PI / 4)),(int)(h - radius * Math.sin( 5 * Math.PI / 4)));
    pol.addPoint((int)(w + radius * Math.cos( 7 * Math.PI / 4)),(int)(h + radius * Math.cos( 7 * Math.PI / 4)));
    g.drawPolygon(pol);
    g.setColor(Color.WHITE);
    g.fillOval(x, y, r, r);
    g.setColor(Color.BLACK);
    g.drawOval(x, y, r, r);
  }
}