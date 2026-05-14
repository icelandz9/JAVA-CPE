import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Ex2 extends JFrame {

    // --- Radio buttons สี ---
    private JRadioButton rbRed    = new JRadioButton("Red");
    private JRadioButton rbYellow = new JRadioButton("Yellow");
    private JRadioButton rbWhite  = new JRadioButton("White");
    private JRadioButton rbGray   = new JRadioButton("Gray");
    private JRadioButton rbGreen  = new JRadioButton("Green");

    // --- Radio buttons รูปทรง ---
    private JRadioButton rbRectangle = new JRadioButton("Rectangle");
    private JRadioButton rbOval      = new JRadioButton("Oval");

    // --- FigurePanel ---
    private FigurePanel figurePanel = new FigurePanel();

    public Ex2() {
        setTitle("Exercise10_03");
        setSize(420, 280);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // ========== Panel สีด้านบน ==========
        JPanel colorPanel = new JPanel();
        ButtonGroup colorGroup = new ButtonGroup();
        colorGroup.add(rbRed);
        colorGroup.add(rbYellow);
        colorGroup.add(rbWhite);
        colorGroup.add(rbGray);
        colorGroup.add(rbGreen);

        colorPanel.add(rbRed);
        colorPanel.add(rbYellow);
        colorPanel.add(rbWhite);
        colorPanel.add(rbGray);
        colorPanel.add(rbGreen);

        rbYellow.setSelected(true); // ค่าเริ่มต้น

        // ========== Panel รูปทรงด้านล่าง ==========
        JPanel shapePanel = new JPanel();
        ButtonGroup shapeGroup = new ButtonGroup();
        shapeGroup.add(rbRectangle);
        shapeGroup.add(rbOval);

        shapePanel.add(rbRectangle);
        shapePanel.add(rbOval);

        rbRectangle.setSelected(true); // ค่าเริ่มต้น

        // ========== เพิ่ม Component ==========
        add(colorPanel,   BorderLayout.NORTH);
        add(figurePanel,  BorderLayout.CENTER);
        add(shapePanel,   BorderLayout.SOUTH);

        // ========== Listener สี ==========
        ActionListener colorListener = e -> {
            if      (rbRed.isSelected())    figurePanel.setBackground(Color.RED);
            else if (rbYellow.isSelected()) figurePanel.setBackground(Color.YELLOW);
            else if (rbWhite.isSelected())  figurePanel.setBackground(Color.WHITE);
            else if (rbGray.isSelected())   figurePanel.setBackground(Color.GRAY);
            else if (rbGreen.isSelected())  figurePanel.setBackground(Color.GREEN);
            figurePanel.repaint();
        };

        rbRed.addActionListener(colorListener);
        rbYellow.addActionListener(colorListener);
        rbWhite.addActionListener(colorListener);
        rbGray.addActionListener(colorListener);
        rbGreen.addActionListener(colorListener);

        // ========== Listener รูปทรง ==========
        ActionListener shapeListener = e -> {
            figurePanel.setShape(rbRectangle.isSelected() ? "Rectangle" : "Oval");
        };

        rbRectangle.addActionListener(shapeListener);
        rbOval.addActionListener(shapeListener);

        setVisible(true);
    }

    // ========== FigurePanel ==========
    static class FigurePanel extends JPanel {
        private String shape = "Rectangle"; // ค่าเริ่มต้น

        public FigurePanel() {
            setBackground(Color.YELLOW);
        }

        public void setShape(String shape) {
            this.shape = shape;
            repaint();
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2 = (Graphics2D) g;
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                                RenderingHints.VALUE_ANTIALIAS_ON);

            int margin = 20;
            int w = getWidth()  - margin * 2;
            int h = getHeight() - margin * 2;

            g2.setColor(Color.BLACK);
            g2.setStroke(new BasicStroke(2));

            if (shape.equals("Rectangle")) {
                g2.drawRect(margin, margin, w, h);
            } else {
                g2.drawOval(margin, margin, w, h);
            }
        }
    }

    public static void main(String[] args) {
        new Ex2();
    }
}