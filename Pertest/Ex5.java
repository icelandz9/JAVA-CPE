public class Ex5 {

    public static void main(String[] args) {

        Square s1 = new Square();
        s1.printSquare();

        Square s2 = new Square(5,6);
        s2.printSquare();

        Square s3 = new Square(5,3,2);
        s3.printSquare();
    }
}

class Square {

    private double width;
    private double length;
    private double height;

    public Square(){
        this.width = 1;
        this.length = 1;
        this.height = 1;
    }

    public Square(double w, double l){
        this.width = w;
        this.length = l;
        this.height = 1;
    }

    public Square(double w, double l, double h){
        this.width = w;
        this.length = l;
        this.height = h;
    }

    public double getSquareArea(){
        return width * length;
    }

    public double getBorderLength(){
        return (width*2) + (length*2);
    }

    public double getSurfaceAreaAllSides(){
        return (width*length*2) + (width*height*2) + (length*height*2);
    }

    public double getWidth(){
        return width;
    }

    public double getLength(){
        return length;
    }

    public double getHeight(){
        return height;
    }

    public void printSquare(){
        System.out.println("\nAll parameters of this Square");
        System.out.println("Width = " + getWidth() + " Length = " + getLength() + " Height = " + getHeight());
        System.out.println("Square Area = " + getSquareArea());
        System.out.println("Border Length = " + getBorderLength());
        System.out.println("Surface Area = " + getSurfaceAreaAllSides());
    }
}