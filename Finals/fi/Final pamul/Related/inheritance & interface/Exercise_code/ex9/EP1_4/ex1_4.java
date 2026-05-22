import javax.swing.border.*;
import javax.swing.*;
import java.awt.*;

public class ex1_4 extends JFrame{
  public static void main(String[] args){
    Border lineBorder = new LineBorder(Color.BLACK,1);
    JFrame title = new JFrame("Exercise 7");
    JPanel p = new JPanel(); p.setLayout(new BorderLayout(0,6));
    p.setLayout(new GridLayout(8,8));
    
    for(int i=1 ; i<=64 ; i++){
      JButton b = new JButton(String.valueOf(""));
      if(i%2==0){
        JButton a = new JButton(String.valueOf(""));
        a.setBackground(Color.BLACK);
        a.setOpaque(true);
      }
      JButton a = new JButton(String.valueOf(""));
      p.add(new JButton(""+i));
    }
    
    title.add(p);
    title.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    title.setSize(850,700);
    title.setVisible(true);  
  }
}