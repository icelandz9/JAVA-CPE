package Final_Exam.Final_CODE.Final_3;

import java.util.ArrayList;
import javax.swing.*;
import java.awt.*;

/**
 * หัวใจของ Final_3: 
 * 1. การใช้ ArrayList เก็บออบเจ็กต์ (Product)
 * 2. การดักจับ Exception (NumberFormatException)
 * 3. การวนลูปเพื่อแสดงผลสรุปข้อมูลทั้งหมด
 */
public class InventoryApp extends JFrame {
    private JTextField tfName = new JTextField(10);
    private JTextField tfPrice = new JTextField(10);
    private JTextArea taDisplay = new JTextArea(10, 30);
    private JButton btnAdd = new JButton("Add Product");
    
    // ArrayList สำหรับเก็บข้อมูลสินค้า (ออกสอบบ่อยเรื่องการจัดการข้อมูลชุด)
    private ArrayList<Product> productList = new ArrayList<>();

    public InventoryApp() {
        JPanel pInput = new JPanel(new GridLayout(3, 2));
        pInput.add(new JLabel("Product Name:"));
        pInput.add(tfName);
        pInput.add(new JLabel("Price:"));
        pInput.add(tfPrice);
        pInput.add(new JLabel("Action:"));
        pInput.add(btnAdd);

        add(pInput, BorderLayout.NORTH);
        add(new JScrollPane(taDisplay), BorderLayout.CENTER);

        btnAdd.addActionListener(e -> {
            try {
                String name = tfName.getText();
                double price = Double.parseDouble(tfPrice.getText());

                // สร้างออบเจ็กต์ใหม่และเก็บเข้า List
                productList.add(new Product(name, price));
                
                updateDisplay(); // อัปเดตหน้าจอ
                tfName.setText("");
                tfPrice.setText("");
                tfName.requestFocus();
                
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "กรุณากรอกตัวเลขในช่องราคา!");
            }
        });
    }

    private void updateDisplay() {
        taDisplay.setText("--- Inventory List ---\n");
        double total = 0;
        for (Product p : productList) {
            taDisplay.append(p.toString() + "\n");
            total += p.getPrice();
        }
        taDisplay.append("----------------------\n");
        taDisplay.append(String.format("Total Value: %.2f", total));
    }

    public static void main(String[] args) {
        InventoryApp f = new InventoryApp();
        f.setTitle("Inventory Manager (Remix)");
        f.pack();
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}

class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double getPrice() { return price; }
    
    @Override
    public String toString() {
        return String.format("- %-15s : %,10.2f THB", name, price);
    }
}
