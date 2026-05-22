import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;

/**
 * หัวใจของ Final_4:
 * 1. MouseListener & MouseMotionListener
 * 2. การเก็บพิกัดหลายจุดใน ArrayList<Point>
 * 3. การวาดรูปทรงตามตำแหน่งที่คลิกเมาส์
 */
public class MouseDrawApp extends JFrame {
    
    public MouseDrawApp() {
        add(new DrawPanel());
    }

    class DrawPanel extends JPanel {
        // เก็บรายชื่อจุดที่ผู้ใช้คลิก
        private ArrayList<Point> points = new ArrayList<>();

        public DrawPanel() {
            setBackground(Color.WHITE);

            // เมื่อคลิกเมาส์ ให้เพิ่มจุดและวาดใหม่
            addMouseListener(new MouseAdapter() {
                @Override
                public void mousePressed(MouseEvent e) {
                    points.add(e.getPoint()); // เก็บพิกัด (x, y)
                    repaint();
                }
            });
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.setColor(Color.BLUE);
            
            // วนลูปวาดวงกลมในทุกจุดที่เคยคลิก
            for (Point p : points) {
                g.fillOval(p.x - 10, p.y - 10, 20, 20);
                g.drawString("(" + p.x + "," + p.y + ")", p.x + 12, p.y);
            }
            
            g.setColor(Color.RED);
            g.drawString("Total points: " + points.size(), 10, 20);
            g.drawString("Click anywhere to draw!", 10, 40);
        }
    }

    public static void main(String[] args) {
        MouseDrawApp f = new MouseDrawApp();
        f.setTitle("Mouse Event Remix - Click to Draw");
        f.setSize(500, 400);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
