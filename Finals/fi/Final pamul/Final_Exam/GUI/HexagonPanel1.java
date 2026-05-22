package Final_Exam.GUI;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;
import javax.swing.JPanel;

public class HexagonPanel1 extends JPanel {
    // ─── ส่วนที่ 1: การกำหนดตัวแปรพิกัด ───────────────────────────────
    private int xCenter, yCenter; // พิกัดจุดศูนย์กลาง
    public int plusX = 0;         // ค่าสำหรับเลื่อนตำแหน่งแกน X
    public int plusY = 0;         // ค่าสำหรับเลื่อนตำแหน่งแกน Y

    /**
     * เมธอดสำหรับวาดรูปหกเหลี่ยม
     * @param g วัตถุ Graphics ที่ใช้ในการวาด
     */
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // ─── ส่วนที่ 2: คำนวณขนาดและจุดศูนย์กลาง ──────────────────────────
        int x3 = getWidth() / 2;
        int y3 = getHeight() / 2;
        // คำนวณรัศมีให้เหมาะสมกับขนาดพื้นที่ (40% ของด้านที่สั้นที่สุด)
        int radius = (int) (Math.min(getWidth(), getHeight()) * 0.4);

        xCenter = x3 + plusX;
        yCenter = y3 + plusY;

        // ─── ส่วนที่ 3: การวาดรูปหกเหลี่ยม (Hexagon) ───────────────────────
        g.setColor(Color.GREEN); // กำหนดสีเขียว
        Polygon polygon = new Polygon();
        
        // วนลูปเพื่อหาพิกัดทั้ง 6 จุดของรูปหกเหลี่ยมโดยใช้ตรีโกณมิติ
        for (int i = 0; i < 6; i++) {
            polygon.addPoint((int) (xCenter + radius * Math.cos(i * 2 * Math.PI / 6)),
                    (int) (yCenter - radius * Math.sin(i * 2 * Math.PI / 6)));
        }
        g.drawPolygon(polygon); // วาดเส้นขอบของหกเหลี่ยม
    }
}