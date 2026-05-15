package Final_Exam.Final_CODE.Final_2;

/**
 * คลาส Tax สำหรับคำนวณภาษีเงินได้
 * (ดัดแปลงโครงสร้างมาจาก loan.java)
 */
public class Tax {
    private double annualIncome; // เงินได้ต่อปี
    private double taxRate;      // อัตราภาษี (เช่น 0.05, 0.10)
    private double deduction;    // ค่าลดหย่อน

    /** Default Constructor */
    public Tax() {
        this(300000.0, 0.05, 60000.0);
    }

    /** Constructor พร้อมรับค่า */
    public Tax(double annualIncome, double taxRate, double deduction) {
        this.annualIncome = annualIncome;
        this.taxRate = taxRate;
        this.deduction = deduction;
    }

    // --- Getter / Setter ---
    public double getAnnualIncome() { return annualIncome; }
    public void setAnnualIncome(double annualIncome) { this.annualIncome = annualIncome; }

    public double getTaxRate() { return taxRate; }
    public void setTaxRate(double taxRate) { this.taxRate = taxRate; }

    public double getDeduction() { return deduction; }
    public void setDeduction(double deduction) { this.deduction = deduction; }

    /** เมธอดคำนวณรายได้สุทธิหลังหักค่าลดหย่อน */
    public double getNetIncome() {
        double net = annualIncome - deduction;
        return (net > 0) ? net : 0;
    }

    /** เมธอดคำนวณภาษีที่ต้องจ่าย (รายได้สุทธิ * อัตราภาษี) */
    public double getTaxToPay() {
        return getNetIncome() * taxRate;
    }
}
