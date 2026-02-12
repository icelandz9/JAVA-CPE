import java.util.Scanner;
public class Ex2_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a point with two coordinates : ");
        double x = sc.nextDouble();
        double y = sc.nextDouble();

        // ถ้าจุดศูนย์กลางที่x1 y1 ไม่ใช่ 0 ต้องกำหนดให้มันแล้วเข้าสูตร
        double sum = Math.sqrt(x*x + y*y);

        if(sum <= 10){
            System.out.println("Point" + "(" + x + "," + y + ")" + "is in the circle");
        }else{
            System.out.println("Point" + "(" + x + "," + y + ")" + "is not in the circle");
        }
        sc.close();
    }
}
