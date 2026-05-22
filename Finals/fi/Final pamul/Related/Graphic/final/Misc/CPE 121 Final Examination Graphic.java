import java.awt.Polygon;
//
class StarPanel1 extends JPanel { 
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
--------------------------------------------------------------------
import java.awt.Polygon;
//
class StarPanel2 extends JPanel { 
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
      g.setColor(Color.BLUE);
      Polygon polygon1 = new Polygon();
      polygon1.addPoint(xCenter, yCenter - y2 - y1);
      polygon1.addPoint(xCenter - x2, yCenter + y2 );
      polygon1.addPoint(xCenter + x2, yCenter + y2 );
      g.drawPolygon(polygon1);
        // Draw the polygon2
      Polygon polygon2 = new Polygon();
      polygon2.addPoint(xCenter, yCenter + y2 + y1);
      polygon2.addPoint(xCenter - x2, yCenter - y2 ); 
      polygon2.addPoint(xCenter + x2, yCenter - y2 ); 
      g.drawPolygon(polygon2);
    }
  }   
--------------------------------------------------------------------
import java.awt.Polygon;
//
class HexagonPanel1 extends JPanel { 
   private int x, y, xCenter, yCenter;       // x, y coordinate   
    public int plusX = 0;    public int plusY = 0;
    @Override
    protected void paintComponent(Graphics g) {
      super.paintComponent(g);    
      int x1 = getWidth() / 8;      int y1 = getHeight() / 8; 
      int x2 = getWidth() / 4;      int y2 = getHeight() / 4; 
      int x3 = getWidth() / 2;      int y3 = getHeight() / 2;
      int radius = (int)(Math.min(getWidth(), getHeight()) * 0.4);


      // Add points to the polygon
      xCenter = x3 + plusX;        yCenter = y3 + plusY;
      
    // Create a Polygon object
    g.setColor(Color.GREEN);
    Polygon polygon = new Polygon();  
    polygon.addPoint(xCenter + radius, yCenter);
    polygon.addPoint((int)(xCenter + radius *
              Math.cos(2 * Math.PI / 6)), (int)(yCenter - radius *
              Math.sin(2 * Math.PI / 6)));
    polygon.addPoint((int)(xCenter + radius *
           Math.cos(2 * 2 * Math.PI / 6)), (int)(yCenter - radius *
              Math.sin(2 * 2 * Math.PI / 6)));
    polygon.addPoint((int)(xCenter + radius *
              Math.cos(3 * 2 * Math.PI / 6)), (int)(yCenter - radius *
              Math.sin(3 * 2 * Math.PI / 6)));
    polygon.addPoint((int)(xCenter + radius *
              Math.cos(4 * 2 * Math.PI / 6)), (int)(yCenter - radius *
              Math.sin(4 * 2 * Math.PI / 6)));
    polygon.addPoint((int)(xCenter + radius *
              Math.cos(5 * 2 * Math.PI / 6)), (int)(yCenter - radius *
              Math.sin(5 * 2 * Math.PI / 6)));
    g.drawPolygon(polygon);
    }
  }   
--------------------------------------------------------------------