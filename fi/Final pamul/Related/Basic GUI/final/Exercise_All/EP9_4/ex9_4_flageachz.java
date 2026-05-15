import javax.swing.*;
import java.awt.*;

public class ex9_4_flageachz {
    private static ImageIcon scaleImage(ImageIcon icon, int width, int height) {
        Image image = icon.getImage();
        Image scaledImage = image.getScaledInstance(width, height, Image.SCALE_SMOOTH);
        return new ImageIcon(scaledImage);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Exercise_v3.0");
        ImageIcon ukFlag = scaleImage(new ImageIcon("C:\\Users\\Admin\\Downloads\\england.png"), 20, 20);
        ImageIcon gerFlag = scaleImage(new ImageIcon("C:\\Users\\Admin\\Downloads\\german.png"), 20, 20);
        ImageIcon chFlag = scaleImage(new ImageIcon("C:\\Users\\Admin\\Downloads\\jean.png"), 20, 20);
        ImageIcon canFlag = scaleImage(new ImageIcon("C:\\Users\\Admin\\Downloads\\can.png"), 20, 20);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.X_AXIS));

        addCountry(mainPanel, gerFlag, "GER");
        addCountry(mainPanel, ukFlag, "UK");
        addCountry(mainPanel, chFlag, "CHN");
        addCountry(mainPanel, canFlag, "CAN");

        mainPanel.setBorder(BorderFactory.createEmptyBorder(0, 25, 0, 0));
        
        frame.add(mainPanel);
        frame.setTitle("Exercise_v3.0");
        frame.setSize(400, 200);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    private static void addCountry(JPanel panel, ImageIcon icon, String countryName) {
        JLabel label = new JLabel(countryName);
        label.setAlignmentY(Component.BOTTOM_ALIGNMENT);

        JLabel imageLabel = new JLabel(icon);
        imageLabel.setAlignmentY(Component.TOP_ALIGNMENT);

        JPanel countryPanel = new JPanel();
        countryPanel.setLayout(new BoxLayout(countryPanel, BoxLayout.Y_AXIS));
        countryPanel.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 75)); // ปรับระยะห่างระหว่าง Label และ ImageIcon เป็น 75 พิกเซล
        countryPanel.add(imageLabel);
        countryPanel.add(label);

        panel.add(countryPanel);
    }
}
