import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Final_1 extends JFrame {
  private JTextField Search = new JTextField(5);
  private JTextField Username = new JTextField(5);
  private JTextField Password = new JTextField(5);
  private JButton LogIn = new JButton("Log in");
  private JButton Cancel = new JButton("Cancel");
  private JButton q1 = new JButton("1");
  private JButton q2 = new JButton("2");
  private JButton q3 = new JButton("3");
  private JButton q4 = new JButton("4");
  private JButton q5 = new JButton("5");
  private JButton q6 = new JButton("6");
  private JButton q7 = new JButton("7");
  private JButton q8 = new JButton("8");
  private JButton q9 = new JButton("9");
  private JButton q10 = new JButton("0");
  private JButton q11 = new JButton(".");
  private JButton q12 = new JButton("EXP");
  
  public Final_1() {
    JPanel Main = new JPanel(new BorderLayout());
    JPanel MainTop = new JPanel(new BorderLayout());
    JPanel MainBoutom = new JPanel(new BorderLayout());
    Main.add(MainTop, BorderLayout.NORTH);
    Main.add(MainBoutom, BorderLayout.CENTER);
    
    MainTop.add(new JTextField());
    
    JPanel GMain = new JPanel(new GridLayout(1,2));
    MainBoutom.add(GMain);
    
    JPanel GMainBoutomLeft = new JPanel(new GridLayout(3,1));
    GMain.add(GMainBoutomLeft);
    JPanel GMainBoutomCenter = new JPanel(new GridLayout(4,3));
    GMain.add(GMainBoutomCenter);
    
    JPanel FMainBoutomLeftTop = new JPanel(new FlowLayout(FlowLayout.CENTER, 5, 5));
    GMainBoutomLeft.add(FMainBoutomLeftTop);
    FMainBoutomLeftTop.add(new JLabel("Name"));
    
    JPanel GMainBoutomLeftCenter = new JPanel(new GridLayout(2, 2));
    GMainBoutomLeft.add(GMainBoutomLeftCenter);
    GMainBoutomLeftCenter.add(new JLabel("Username"));
    GMainBoutomLeftCenter.add(Username);
    GMainBoutomLeftCenter.add(new JLabel("Password"));
    GMainBoutomLeftCenter.add(Password);
    
    JPanel FMainBoutomLeftBoutom = new JPanel(new FlowLayout(FlowLayout.CENTER, 5, 5));
    GMainBoutomLeft.add(FMainBoutomLeftBoutom);
    FMainBoutomLeftBoutom.add(LogIn);
    FMainBoutomLeftBoutom.add(Cancel);
    
    
    GMainBoutomCenter.add(q1);
    GMainBoutomCenter.add(q2);
    GMainBoutomCenter.add(q3);
    GMainBoutomCenter.add(q4);
    GMainBoutomCenter.add(q5);
    GMainBoutomCenter.add(q6);
    GMainBoutomCenter.add(q7);
    GMainBoutomCenter.add(q8);
    GMainBoutomCenter.add(q9);
    GMainBoutomCenter.add(q10);
    GMainBoutomCenter.add(q11);
    GMainBoutomCenter.add(q12);
    
    add(Main);
  }
  
  public static void main(String[] args) {
    Final_1 frame = new Final_1();
    frame.setTitle("CPE 121:Frame Layout");
    frame.setSize(400, 200 );
    frame.setLocationRelativeTo(null);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }
}