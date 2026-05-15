package Final_Exam.Final_CODE.Final_1.code2;

/**
 * Abstract Class: เก็บคุณสมบัติร่วมของทุกรูปทรง (ชื่อ)
 * และบังคับให้ลูกๆ ต้องมีเมธอดแสดงชื่อตัวเอง
 */
public abstract class Shape {
    protected String name;

    public Shape(String name) {
        this.name = name;
    }

    public abstract String getDescription();
    
    public String getName() {
        return name;
    }
}
