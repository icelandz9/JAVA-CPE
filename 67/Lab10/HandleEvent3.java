import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class HandleEvent3 extends JFrame {
  private JRadioButton Red = new JRadioButton("Red");
  private JRadioButton Yellow = new JRadioButton("Yellow");
  private JRadioButton White = new JRadioButton("White");
  private JRadioButton Gray = new JRadioButton("Gray");
  private JRadioButton Green = new JRadioButton("Green");
  private JRadioButton Rectangle = new JRadioButton("Rectangle");
  private JRadioButton Oval = new JRadioButton("Oval");
  private JPanel GpanelCenter = new JPanel(new BorderLayout());
  private DrawPanel drawpanel = new DrawPanel();
  private String currentShape = "";
  public HandleEvent3() {
    JPanel BpanelMain = new JPanel(new BorderLayout());
    JPanel BpanelTop = new JPanel(new BorderLayout());
    JPanel BpanelCenter = new JPanel(new BorderLayout());
    JPanel BpanelButtom = new JPanel(new BorderLayout());
    BpanelMain.add(BpanelTop, BorderLayout.NORTH);
    BpanelMain.add(BpanelCenter, BorderLayout.CENTER);
    BpanelMain.add(BpanelButtom, BorderLayout.SOUTH);
    
    JPanel GpanelTop = new JPanel(new GridLayout(1, 5));
    JPanel GpanelButtom = new JPanel(new FlowLayout(FlowLayout.CENTER));
    BpanelTop.add(GpanelTop);
    BpanelCenter.add(GpanelCenter);
    BpanelButtom.add(GpanelButtom);
    
    
    GpanelTop.add(Red);
    GpanelTop.add(Yellow);
    GpanelTop.add(White);
    GpanelTop.add(Gray);
    GpanelTop.add(Green);
    GpanelCenter.add(drawpanel);
    GpanelButtom.add(Rectangle);
    GpanelButtom.add(Oval);
    
    ButtonGroup Color__ = new ButtonGroup();
    Color__.add(Red);
    Color__.add(Yellow);
    Color__.add(White);
    Color__.add(Gray);
    Color__.add(Green);
    
    ButtonGroup O = new ButtonGroup();
    O.add(Rectangle);
    O.add(Oval);
    
    Red.addActionListener(drawpanel);
    Yellow.addActionListener(drawpanel);
    White.addActionListener(drawpanel);
    Gray.addActionListener(drawpanel);
    Green.addActionListener(drawpanel);
    
    Rectangle.addActionListener(drawpanel);
    Oval.addActionListener(drawpanel);
    
    add(BpanelMain);
    addComponentListener(new ComponentAdapter() {
      public void componentResized(ComponentEvent e) {
        int width = getWidth();
        int height = getHeight();
        System.out.println("Current size: " + width + " x " + height);
      }
    });
    setVisible(true);
  }
  private class DrawPanel extends JPanel implements ActionListener {
    public void actionPerformed(ActionEvent e) { 
      if(e.getSource() == Red){
        setBackground(Color.red);
      } else if (e.getSource() == Yellow) {
        setBackground(Color.yellow);
      } else if (e.getSource() == White) {
        setBackground(Color.white);
      } else if (e.getSource() == Gray) {
        setBackground(Color.gray);
      } else if (e.getSource() == Green) {
        setBackground(Color.green);
      } else if (e.getSource() == Rectangle) {
        currentShape = "Rectangle";
      } else if (e.getSource() == Oval) {
        currentShape = "Oval";
      }
      repaint();
    }
    
    
    
    protected void paintComponent(Graphics g) {
      super.paintComponent(g);
      if (currentShape.equals("Oval")) {
        g.drawOval(200, 50, 50, 50);
      } else if (currentShape.equals("Rectangle")) {
        g.drawRect(200, 50, 100, 50);
      }
    }
  }
}
