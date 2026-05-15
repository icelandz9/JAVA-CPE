package Quiz.Quiz_monkey.Quiz2;

import javax.swing.JOptionPane;

/**
 * Quiz 2 - Item 2: House Interest Calculation
 * คำนวณหาค่าดอกเบี้ยรวมทั้งหมดที่จ่ายไปตลอดระยะเวลาในการผ่อนบ้านตามจำนวนปีที่เลือก
 * โดยใช้ switch-case ในการหาอัตราดอกเบี้ย
 */
public class Q02_HouseInterest {
    public static void main(String[] args) {
        // 1. รับค่าราคาบ้านผ่าน JOptionPane
        String priceStr = JOptionPane.showInputDialog("Enter House price(Baht),e.g., 4,500,000:");
        if (priceStr == null || priceStr.trim().isEmpty()) return;
        
        // ลบเครื่องหมายลูกน้ำออกหากผู้ใช้ใส่มา
        priceStr = priceStr.replace(",", "");
        double housePrice = Double.parseDouble(priceStr);

        // 2. รับค่าจำนวนปีผ่าน JOptionPane
        String yearsStr = JOptionPane.showInputDialog("Enter number Of Years:");
        if (yearsStr == null || yearsStr.trim().isEmpty()) return;
        
        int years = Integer.parseInt(yearsStr);
        double interestRate = 0.0;

        // 3. ใช้วิธี switch-case เพื่อกำหนดอัตราดอกเบี้ยตามจำนวนปี
        switch (years) {
            case 10:
                interestRate = 3.5 / 100.0; // 3.5%
                break;
            case 15:
                interestRate = 3.9 / 100.0; // 3.9%
                break;
            case 20:
                interestRate = 4.1 / 100.0; // 4.1%
                break;
            case 25:
                interestRate = 4.3 / 100.0; // 4.3%
                break;
            case 30:
                interestRate = 4.5 / 100.0; // 4.5%
                break;
            default:
                JOptionPane.showMessageDialog(null, "Invalid number of years. Please enter 10, 15, 20, 25, or 30.");
                return;
        }

        // 4. คำนวณดอกเบี้ยรวม: ราคารวม(บ้าน) x อัตราดอกเบี้ย(ต่อปี) x จำนวนปี
        double totalInterest = housePrice * interestRate * years;

        // 5. แสดงผลลัพธ์ผ่าน JOptionPane
        JOptionPane.showMessageDialog(null, "Total payment of interest are " + totalInterest + " Baht");
    }
}
