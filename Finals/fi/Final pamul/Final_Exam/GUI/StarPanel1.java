package Final_Exam.GUI;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;
import javax.swing.JPanel;

public class StarPanel1 extends JPanel {
    // ─── ส่วนที่ 1: การกำหนดตัวแปรพิกัด ───────────────────────────────
    private int x, y, xCenter, yCenter; // ตัวแปรพิกัด x, y
    public int plusX = 0;              // ค่าสำหรับเลื่อนตำแหน่งแกน X
    public int plusY = 0;              // ค่าสำหรับเลื่อนตำแหน่งแกน Y

    /**
     * เมธอดสำหรับวาดส่วนประกอบของรูปดาว
     * @param g วัตถุ Graphics ที่ใช้ในการวาด
     */
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // ─── ส่วนที่ 2: คำนวณขนาดและจุดศูนย์กลาง ──────────────────────────
        int x1 = getWidth() / 8;
        int y1 = getHeight() / 8;
        int x2 = getWidth() / 4;
        int y2 = getHeight() / 4;
        int x3 = getWidth() / 2;
        int y3 = getHeight() / 2;

        xCenter = x3 + plusX;
        yCenter = y3 + plusY;

        // ─── ส่วนที่ 3: การวาด Polygon รูปที่ 1 (สามเหลี่ยมด้านซ้าย) ────────────
        g.setColor(Color.RED); // กำหนดสีแดง
        Polygon polygon1 = new Polygon();
        polygon1.addPoint((int) (xCenter - x2 - x1), (int) (yCenter));
        polygon1.addPoint(xCenter + x2, yCenter - y2);
        polygon1.addPoint(xCenter + x2, yCenter + y2);
        g.drawPolygon(polygon1);

        // ─── ส่วนที่ 4: การวาด Polygon รูปที่ 2 (สามเหลี่ยมด้านขวา) ────────────
        Polygon polygon2 = new Polygon();
        polygon2.addPoint(xCenter + x2 + x1, yCenter);
        polygon2.addPoint(xCenter - x2, yCenter - y2);
        polygon2.addPoint(xCenter - x2, yCenter + y2);
        g.drawPolygon(polygon2);
    }
}