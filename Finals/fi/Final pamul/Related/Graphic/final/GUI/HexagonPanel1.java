import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;
import javax.swing.JPanel;

public class HexagonPanel1 extends JPanel {
    private int xCenter, yCenter;
    public int plusX = 0;
    public int plusY = 0;

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        int x1 = getWidth() / 8;
        int y1 = getHeight() / 8;
        int x2 = getWidth() / 4;
        int y2 = getHeight() / 4;
        int x3 = getWidth() / 2;
        int y3 = getHeight() / 2;
        int radius = (int) (Math.min(getWidth(), getHeight()) * 0.4);

        xCenter = x3 + plusX;
        yCenter = y3 + plusY;

        g.setColor(Color.GREEN);
        Polygon polygon = new Polygon();
        for (int i = 0; i < 6; i++) {
            polygon.addPoint((int) (xCenter + radius * Math.cos(i * 2 * Math.PI / 6)),
                    (int) (yCenter - radius * Math.sin(i * 2 * Math.PI / 6)));
        }
        g.drawPolygon(polygon);
    }
}