public class Rectangle1 {

    public double length;
    public double width;

    public Rectangle1(){
        length = 1;
        width = 1;
    }

    public Rectangle1(double l, double w){
        //this คือ การเรียก คอนสตรัคเตอร์ที่อยู่ภายในคลาสเดียวกันเป็น
        this.length = l; 
        this.width = w;
    }

    public double getArea(){
        return length * width;
    }

    public void display(){
        System.out.println("Length of this rectangle is " + length);
        System.out.println("Width of this rectangle is " + width);
        System.out.println("Area of this rectangle is " + getArea());
    }

    public static void main(String[] args) {
    }
}