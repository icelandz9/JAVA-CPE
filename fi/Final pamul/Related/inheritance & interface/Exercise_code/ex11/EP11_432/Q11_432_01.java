import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Q11_432_01 extends JFrame{
  drawArc A = new drawArc();
  int click = 0;
  
  public Q11_432_01(){
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
    JFrame frame = new Q11_432_01 ();
    frame.setTitle("CPE 222 : Quiz 11");
    frame.setSize(800,800);
    frame.setLocationRelativeTo(null);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }
}

class drawArc extends JButton{
  int radius = 0;
  int color;
  
  public void getRadius(int Radius){
    radius = Radius;
    repaint();
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
      default: g.setColor(Color.RED); break;
    }
    int xCenter = getWidth()/2;
    int yCenter = getHeight()/2;
    
    int r = radius - 20 ;
    int x = xCenter - r/2;
    int y = yCenter - r/2;
    
    
    Polygon pol = new Polygon();
    pol.addPoint(xCenter + radius, yCenter);
    pol.addPoint((int)(xCenter + radius * Math.cos(2 * Math.PI / 6)),(int)(yCenter - radius * Math.sin(2 * Math.PI / 6)));    
    pol.addPoint((int)(xCenter + radius * Math.cos(2 * 2 * Math.PI / 6)),(int)(yCenter - radius * Math.sin(2 * 2 * Math.PI / 6)));
    pol.addPoint((int)(xCenter + radius * Math.cos(3 * 2 * Math.PI / 6)),(int)(yCenter - radius * Math.sin(3 * 2 * Math.PI / 6)));
    pol.addPoint((int)(xCenter + radius * Math.cos(4 * 2 * Math.PI / 6)),(int)(yCenter - radius * Math.sin(4 * 2 * Math.PI / 6)));
    pol.addPoint((int)(xCenter + radius * Math.cos(5 * 2 * Math.PI / 6)),(int)(yCenter - radius * Math.sin(5 * 2 * Math.PI / 6)));
    g.drawPolygon(pol);
    g.setColor(Color.WHITE);
    g.fillRect(x, y, r, r);
    g.setColor(Color.BLACK);
    g.drawRect(x, y, r, r);
  }
}