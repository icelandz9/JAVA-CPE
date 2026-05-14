import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.border.TitledBorder;

public class Quiz11_453 extends JFrame{
  drawArc d = new drawArc();
  public int a = 0;
  
  public Quiz11_453() {
    JPanel p = new JPanel(new GridLayout(1,1));
    p.add(d);
    add(p);
    d.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        if(a!=1) {
          d.getColor(3); //สีเริ่มต้น
          d.getRadius(0); //เรเดียนเริ่มต้น
          int n = Integer.parseInt 
            (JOptionPane.showInputDialog(null,"Please enter radius of circle"));
          d.getRadius(n);
          a = 1;
        }
        else {
          int c = Integer.parseInt
            (JOptionPane.showInputDialog(null,"Please enter 0 for Yellow or 1 for Green or 2 for Red. It will the Blue otherwise"));
          d.getColor(c);
          a = 0;
        }
      }
    });
  }
  
  public static void main(String[] args) {
    JFrame frame = new Quiz11_453();
    frame.setTitle("CPE 222 : Qiuz 11");
    frame.setSize(400,400);
    frame.setLocationRelativeTo(null);//center the frame
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }
}

class drawArc extends JButton {
  private int radius = 0;
  private int color = 3;
  
  public void getRadius(int Radius) {
    radius = Radius;
    repaint();
  }
  
  public void getColor(int Color) {
    color = Color;
    repaint();
  }
  
  protected void paintComponent(Graphics g){
    super.paintComponent(g);
    switch(color){
      case 0:
        g.setColor(Color.YELLOW);
        break;
      case 1:
        g.setColor(Color.GREEN);
        break;
      case 2:
        g.setColor(Color.RED);
        break;
      default:
        g.setColor(Color.BLUE);
        break;       
    }
    int xCenter = getWidth()/2;
    int yCenter = getHeight()/2;
    int x = xCenter - radius;
    int y = yCenter - radius;
    g.fillArc(x, y, 2 * radius, 2 * radius, 5, 50);
    g.fillArc(x, y, 2 * radius, 2 * radius, 125, 50);
    g.fillArc(x, y, 2 * radius, 2 * radius, 245, 50);   
  }
}