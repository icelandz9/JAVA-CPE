import javax.swing.*;
import java.awt.*;
public class ex1_1 extends JFrame{
  public ex1_1(){
    setLayout(new FlowLayout(FlowLayout.LEFT,10,20));
    add(new JLabel("Name"));
    add(new JTextField(10));
    add(new JButton("OK"));
    add(new JButton("Cancle"));
    add(new JButton("Exit"));
  }
  public static void main(String[] args){
    ex1_1 frame = new ex1_1();
    frame.setTitle("Handle Event");
    frame.setSize(460,110);
    frame.setLocationRelativeTo(null);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }
}