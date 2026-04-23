import java.util.Scanner;
public class Ex2_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a point with two coordinates : ");
        double x = sc.nextDouble();
        double y = sc.nextDouble();

        if(x >= -5 && x <= 5 && y >= -2.5 && y <= 2.5){
            System.out.println("Point" + "(" + x + "," + y + ")" + "is in the circle");
        }else{
            System.out.println("Point" + "(" + x + "," + y + ")" + "is not in the circle");
        }
        sc.close();
    }
}
