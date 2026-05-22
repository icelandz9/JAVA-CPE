import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ControlStar extends JFrame {
  private StarPanel1 starPanel = new StarPanel1(); 
  //KeyboardPanel keyboardPanel = new KeyboardPanel();
    
    public ControlStar() {
        //add(starPanel);
        //add(keyboardPanel);
      this.add(starPanel, BorderLayout.CENTER);
    
        starPanel.setFocusable(true); 
        

        
//    static class StarPanel1 extends JPanel {
//      
//      private int x, y, xCenter, yCenter;
//      public int plusX = 0;    public int plusY = 0;
//      @Override
//      protected void paintComponent(Graphics g) {
//      super.paintComponent(g);    
//      int x1 = getWidth() / 8;      int y1 = getHeight() / 8; 
//      int x2 = getWidth() / 4;      int y2 = getHeight() / 4; 
//      int x3 = getWidth() / 2;      int y3 = getHeight() / 2;
//
//      // Add points to the polygon
//      xCenter = x3 + plusX;        yCenter = y3 + plusY;
//      
//      // Draw the polygon1
//      g.setColor(Color.RED);
//      Polygon polygon1 = new Polygon();
//      polygon1.addPoint((int)(xCenter - x2 - x1), (int)(yCenter));
//      polygon1.addPoint(xCenter + x2, yCenter - y2);
//      polygon1.addPoint(xCenter + x2, yCenter + y2);
//      g.drawPolygon(polygon1);
//       // Draw the polygon2
//      Polygon polygon2 = new Polygon();
//      polygon2.addPoint(xCenter + x2 + x1, yCenter);
//      polygon2.addPoint(xCenter - x2, yCenter - y2);
//      polygon2.addPoint(xCenter - x2, yCenter + y2);      
//      g.drawPolygon(polygon2);                       }
      
      
          //class keyboardPanel() {
            starPanel.addKeyListener(new KeyAdapter() {
              @Override
              public void keyPressed(KeyEvent e) {
                switch (e.getKeyCode()) {
                  case KeyEvent.VK_DOWN: starPanel.plusY += 100; break;
                  case KeyEvent.VK_UP: starPanel.plusY -= 100; break;
                  case KeyEvent.VK_LEFT: starPanel.plusX -= 100; break;
                  case KeyEvent.VK_RIGHT: starPanel.plusX += 100; break;
                  default: System.out.print("");
                }
                starPanel.repaint();
              }
            });
          //}
//        @Override
//        protected void paintComponent(Graphics g) {
//          Polygon polygon2 = new Polygon();
//          super.paintComponent(g);
//          g.drawPolygon(polygon2);
//        }
         
        }
    
        public static void main(String[] args) 
    {
      ControlStar frame = new ControlStar();
      frame.setTitle("Star");
      frame.setLocationRelativeTo(null); // Center the frame
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setSize(500,500);
      frame.setVisible(true);
    }
}