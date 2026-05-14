import java.awt.*;
import javax.swing.*;

public class a_GUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Polygon Drawing Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 800);

        JPanel shapesPanel = new JPanel();
        shapesPanel.setLayout(new GridLayout(3, 1));
        shapesPanel.add(new StarPanel1());
        shapesPanel.add(new StarPanel2());
        shapesPanel.add(new HexagonPanel1());

        frame.add(shapesPanel);
        frame.setVisible(true);
    }
}