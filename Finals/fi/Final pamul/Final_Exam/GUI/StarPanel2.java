package Final_Exam.GUI;

import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Polygon;

class StarPanel2 extends JPanel {
    // ─── ส่วนที่ 1: การกำหนดตัวแปรพิกัด ───────────────────────────────
    private int x, y, xCenter, yCenter; // ตัวแปรพิกัด x, y
    public int plusX = 0;              // ค่าสำหรับเลื่อนตำแหน่งแกน X
    public int plusY = 0;              // ค่าสำหรับเลื่อนตำแหน่งแกน Y

    /**
     * เมธอดสำหรับวาดรูปดาวแบบที่ 2 (สามเหลี่ยมซ้อนกัน)
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

        // ─── ส่วนที่ 3: การวาด Polygon รูปที่ 1 (สามเหลี่ยมหงาย) ──────────────
        g.setColor(Color.BLUE); // กำหนดสีน้ำเงิน
        Polygon polygon1 = new Polygon();
        polygon1.addPoint(xCenter, yCenter - y2 - y1);
        polygon1.addPoint(xCenter - x2, yCenter + y2);
        polygon1.addPoint(xCenter + x2, yCenter + y2);
        g.drawPolygon(polygon1);

        // ─── ส่วนที่ 4: การวาด Polygon รูปที่ 2 (สามเหลี่ยมคว่ำ) ──────────────
        Polygon polygon2 = new Polygon();
        polygon2.addPoint(xCenter, yCenter + y2 + y1);
        polygon2.addPoint(xCenter - x2, yCenter - y2);
        polygon2.addPoint(xCenter + x2, yCenter - y2);
        g.drawPolygon(polygon2);
    }
}
