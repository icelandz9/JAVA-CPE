//import

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


//JFrame
public class Q11_296_01 extends JFrame {

    // create rect
    drawRect rect = new drawRect();
    int click = 0;

    public Q11_296_01() {
        JPanel page = new JPanel(new GridLayout(1, 1));
        page.add(rect);
        add(page);

        // on click
        rect.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (click != 1) {
                    rect.getColor(3);
                    rect.getRadius(0);
                    int c = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter radius of Polygon: "));
                    rect.getRadius(c);
                    click = 1;
                } else {
                    int c2 = Integer.parseInt(JOptionPane.showInputDialog(null,
                            "Please enter 0 for Black or 1 for Green or 2 for Blue. It will the Red otherwise."));
                    rect.getColor(c2);
                    click = 0;
                }
            }
        });
    }


    // main
    public static void main(String[] args) {
        JFrame frame = new Q11_296_01();
        frame.setTitle("CPE 222 : Quiz 11");
        frame.setSize(800, 800);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

//rect class
class drawRect extends JButton {

    //rect var
    int radius = 0;
    int color = 3;

    public void getRadius(int Radius) {
        radius = Radius;
        repaint();
    }

    public void getColor(int Color) {
        color = Color;
        repaint();
    }

    // set color
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        //switch case
        switch (color) {
            case 0: g.setColor(Color.BLACK);
                break;
            case 1: g.setColor(Color.GREEN);
                break;
            case 2: g.setColor(Color.BLUE);
                break;
            case 3: g.setColor(Color.RED);
                break;
            default: g.setColor(Color.RED);
                break;
        }

        // set poly variable
        int widhth = getWidth() / 2;
        int height = getHeight() / 2;

        // radian of polygon = rcircle + 20
        int r = radius - 20;
        int x = widhth - r / 2;
        int y = height - r / 2;

        // create poly
        Polygon drawpol = new Polygon();

        // Draw Poly
        // top-bottom line
        drawpol.addPoint(widhth + radius, height);
        // add point for poly
        drawpol.addPoint((int) (widhth + radius * Math.cos(2 * Math.PI / 6)),
                (int) (height - radius * Math.sin(2 * Math.PI / 6)));
        drawpol.addPoint((int) (widhth + radius * Math.cos(2 * 2 * Math.PI / 6)),
                (int) (height - radius * Math.sin(2 * 2 * Math.PI / 6)));
        drawpol.addPoint((int) (widhth + radius * Math.cos(3 * 2 * Math.PI / 6)),
                (int) (height - radius * Math.sin(3 * 2 * Math.PI / 6)));
        drawpol.addPoint((int) (widhth + radius * Math.cos(4 * 2 * Math.PI / 6)),
                (int) (height - radius * Math.sin(4 * 2 * Math.PI / 6)));
        drawpol.addPoint((int) (widhth + radius * Math.cos(5 * 2 * Math.PI / 6)),
                (int) (height - radius * Math.sin(5 * 2 * Math.PI / 6)));

        // graphic poly
        g.drawPolygon(drawpol);

        // graphic rect
        g.setColor(Color.WHITE);
        g.fillRect(x, y, r, r);
        g.setColor(Color.BLACK);
        g.drawRect(x, y, r, r);

    }
}