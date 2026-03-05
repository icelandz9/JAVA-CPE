public class Exercise2_Triangle{
    private double s1;
    private double s2;
    private double s3;

    public Exercise2_Triangle(){
        s1 = 1;
        s2 = 1;
        s3 = 1;
    }

    public Exercise2_Triangle(double s1, double s2, double s3){
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
    }

    public double getS1(){
        return s1;
    }

    public double getS2(){
        return s2;
    }

    public double gatS3(){
        return s3;
    }

    public double getArea(){
        double p = getPerimeter() / 2;
        return Math.sqrt(p * (p - s1) * (p - s2) * (p - s3));
    }
    
    public double getPerimeter(){
        return s1 * s1 * s1;
    }

    public static void main(String[] args){

        Exercise2_Triangle t1 = new Exercise2_Triangle(5, 5, 5);
        Exercise2_Triangle t2 = new Exercise2_Triangle(2, 2.5, 3);

        System.out.println("First Triangle (T1)");
        System.out.println("-----------");
        System.out.println("Triangle's area = " + t1.getArea());
        System.out.println("Triangle's perimeter = " + t1.getPerimeter());

        System.out.println();

        System.out.println("Second Triangle (T2)");
        System.out.println("-----------");
        System.out.println("Triangle's area = " + t2.getArea());
        System.out.println("Triangle's perimeter = " + t2.getPerimeter());
    }
}