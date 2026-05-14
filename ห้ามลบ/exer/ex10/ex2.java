import javax.swing.*;
import java.awt.*;
public class ex2{
  public static void main(String[] args){
    JFrame frame = new JFrame("Exercise09_02");
    frame.setLayout(new FlowLayout(FlowLayout.LEFT,120,10));
    
    frame.add(new Button1());
    frame.add(new Button2());
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(560,150);
    frame.setVisible(true);
  }
}
  
  class Button1 extends JButton{
    protected void paintComponent(Graphics g){
    super.paintComponent(g);
    setSize(150,50);
    setText("OK");
    g.drawOval(5,5,140,40);
    setHorizontalAlignment(AbstractButton.CENTER);
    }
  }
  
  class Button2 extends JButton{
    protected void paintComponent(Graphics g){
    super.paintComponent(g);
    setSize(150,50);
    setText("Cancele");
    g.drawOval(5,5,140,40);
    setHorizontalAlignment(AbstractButton.CENTER);
    }
  }