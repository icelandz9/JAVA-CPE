package Quiz.Quiz_Graymatter.Exam9;

public class CloseFigure {
    private String color;

    public CloseFigure(String color) {
        this.color = color;
    }

    public CloseFigure() {
        this.color = "white"; // ���������������բ��
    }

    public double getArea() {
        return 0.0; // ��������� �ѧ����� override
    }

    public double getPerimeter() {
        return 0.0; // ��������� �ѧ����� override
    }

    public String getColor() {
        return color; // ��ҹ�����
    }

    public void setColor(String color) {
        this.color = color; // ��˹����������
    }
}
