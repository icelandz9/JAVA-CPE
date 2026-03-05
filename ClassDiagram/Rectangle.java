public class Rectangle {
    public static void main(String[] args) {
        
    }
    public double length;
    public double width;

    public Rectangle(double l, double w) {
        this.length = l;
        this.width = w;
    }

    public double getArea() {
        return length * width;
    }

    public void display() {
        System.out.println("Length of this rectangle is " + length);
        System.out.println("Width of this rectangle is " + width);
        System.out.println("Area of this rectangle is " + getArea());
    }
}