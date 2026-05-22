import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;
import javax.swing.JPanel;

public class StarPanel1 extends JPanel { 
    private int x, y, xCenter, yCenter;       // x, y coordinate   
    public int plusX = 0;    public int plusY = 0;
    @Override
    protected void paintComponent(Graphics g) {
       super.paintComponent(g);    
       int x1 = getWidth() / 8;      int y1 = getHeight() / 8; 
       int x2 = getWidth() / 4;      int y2 = getHeight() / 4; 
       int x3 = getWidth() / 2;      int y3 = getHeight() / 2;
 
       // Add points to the polygon
       xCenter = x3 + plusX;        yCenter = y3 + plusY;
       
       // Draw the polygon1
       g.setColor(Color.RED);
       Polygon polygon1 = new Polygon();
       polygon1.addPoint((int)(xCenter - x2 - x1), (int)(yCenter));
       polygon1.addPoint(xCenter + x2, yCenter - y2);
       polygon1.addPoint(xCenter + x2, yCenter + y2);
       g.drawPolygon(polygon1);
        // Draw the polygon2
       Polygon polygon2 = new Polygon();
       polygon2.addPoint(xCenter + x2 + x1, yCenter);
       polygon2.addPoint(xCenter - x2, yCenter - y2);
       polygon2.addPoint(xCenter - x2, yCenter + y2);      
       g.drawPolygon(polygon2);  
     }
   }